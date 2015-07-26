/*
 *  RealStoragePathLibrary - Powerful open source library to find the Real Storage paths on all versions of Android
 *  
 *  Created by Sivaraj Velusamy on 02/12/14.
 *  Copyright (c) 2014 SanDisk.
 *  
 *  Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */


package com.sandisk.realstoragepathexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.sandisk.realstoragepath.RealStoragePathLibrary;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private Button getPathBtn;

    private TextView inbuiltStoragePathTV;
    private TextView inbuiltTotalSpaceTV;
    private TextView inbuiltUsedSpaceTV;
    private TextView inbuiltAvailableSpaceTV;

    private TextView microSDPathTV;
    private TextView microSDTotalSpaceTV;
    private TextView microSDUsedSpaceTV;
    private TextView microSDAvailableSpaceTV;

    private TextView phoneInfoTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getPathBtn = (Button) findViewById(R.id.getMemoryPathBtn);
        getPathBtn.setOnClickListener(this);

        phoneInfoTV = (TextView) findViewById(R.id.phoneInfo);

        inbuiltStoragePathTV = (TextView) findViewById(R.id.inbuiltStoragePath);
        inbuiltTotalSpaceTV = (TextView) findViewById(R.id.inbuiltTotalSpace);
        inbuiltUsedSpaceTV = (TextView) findViewById(R.id.inbuiltUsedSpace);
        inbuiltAvailableSpaceTV = (TextView) findViewById(R.id.inbuiltAvailableSpace);

        microSDPathTV = (TextView) findViewById(R.id.microSDPath);
        microSDTotalSpaceTV = (TextView) findViewById(R.id.microSDTotalSpace);
        microSDUsedSpaceTV = (TextView) findViewById(R.id.microSDUsedSpace);
        microSDAvailableSpaceTV = (TextView) findViewById(R.id.microSDAvailableSpace);

        inbuiltStoragePathTV.setText("Not Available");
        microSDPathTV.setText("Not Available");

        String OS_VERSION = android.os.Build.VERSION.RELEASE;
        String API_LEVEL = android.os.Build.VERSION.SDK_INT + "";
        String DEVICE = android.os.Build.DEVICE;
        String MODEL = android.os.Build.MODEL;
        String PRODUCT = android.os.Build.PRODUCT;
        String BRAND = android.os.Build.BRAND;
        String HARDWARE = android.os.Build.HARDWARE;
        String MANUFACTURER = android.os.Build.MANUFACTURER;

        String pnoneInfo = "OS_VERSION = " + OS_VERSION + "\n" +
                "API_LEVEL = " + API_LEVEL + "\n" +
                "DEVICE = " + DEVICE + "\n" +
                "MODEL = " + MODEL + "\n" +
                "PRODUCT = " + PRODUCT + "\n" +
                "BRAND = " + BRAND + "\n" +
                "HARDWARE = " + HARDWARE + "\n" +
                "MANUFACTURER = " + MANUFACTURER + "\n";

        phoneInfoTV.setText(pnoneInfo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        if (v == getPathBtn) {
            RealStoragePathLibrary realStoragePath = new RealStoragePathLibrary(this);

            //String internalPath = realStoragePath.getInbuiltStoragePath();
            String inbuiltStoragePath = realStoragePath.getInbuiltStoragePath();
            String inbuiltTotalSpace = "" + ((float) realStoragePath.getInbuiltStorageTotalSpace() / (1024 * 1024 * 1024));
            String inbuiltUsedSpace = "" + ((float) realStoragePath.getInbuiltStorageUsedSpace() / (1024 * 1024 * 1024));
            String inbuiltAvailableSpace = "" + ((float) realStoragePath.getInbuiltStorageAvailableSpace() / (1024 * 1024 * 1024));

            inbuiltStoragePathTV.setText(inbuiltStoragePath);
            inbuiltTotalSpaceTV.setText(inbuiltTotalSpace);
            inbuiltUsedSpaceTV.setText(inbuiltUsedSpace);
            inbuiltAvailableSpaceTV.setText(inbuiltAvailableSpace);

            String microSDStoragePath = realStoragePath.getMicroSDStoragePath();
            String microSDTotalSpace = "" + ((float) realStoragePath.getMicroSDStorageTotalSpace() / (1024 * 1024 * 1024));
            String microSDUsedSpace = "" + ((float) realStoragePath.getMicroSDStorageUsedSpace() / (1024 * 1024 * 1024));
            String microSDAvailableSpace = "" + ((float) realStoragePath.getMicroSDStorageAvailableSpace() / (1024 * 1024 * 1024));

            microSDPathTV.setText(microSDStoragePath);
            microSDTotalSpaceTV.setText(microSDTotalSpace);
            microSDUsedSpaceTV.setText(microSDUsedSpace);
            microSDAvailableSpaceTV.setText(microSDAvailableSpace);
        }
    }
}
