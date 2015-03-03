RealStoragePathLibrary is a powerful open source library with very minimal footprint which helps to find the real paths of the storage devices attached to the Android device. 
It is very light-weight so that the developers of Android Apps can integrate it very easily just by copying single class.
Developers do not need to worry about the Fragmentation issue in Android when they want to get the real paths of the storage devices. 
It is tested against various versions of Android and various manufacturers. 

Supported Versions: Android 2.3 to Android 5.0 
This library is targeted for Android Developers (Not for end users). 

Feel free to contribute to our awesome library.


****************** Constructor ****************************************

RealStoragePathLibrary

public RealStoragePathLibrary(Context context)


****************** METHODS ****************************************

getInbuiltStoragePath()

Get the Real In-Built Storage path of the device.

Returns:
Path of In-Built Storage.

***********

getMicroSDStoragePath()

Get the Real Removable Micro SD card Storage path of the device.

Returns:
Path of Micro SD card Storage.

***********

public java.lang.String getInbuiltStoragePath()

public java.lang.String getInbuiltStorageAppSpecificDirectoryPath()

Get the Real In-Built Storage App Specific Directory path of the device.

Returns:
Path of In-Built Storage App Specific Directory.

***********

public java.lang.String getMicroSDStorageAppSpecificDirectoryPath()

Get the Real Micro SD Storage App Specific Directory path of the device.

Returns:
Path of Micro SD card App Specific Directory.

***********

public long getInbuiltStorageTotalSpace()

Get the In-Built Storage Total Size in Bytes.

Returns:
Total Size in Bytes of In-Built Storage.

***********

public long getInbuiltStorageUsedSpace()

Get the In-Built Storage Used Size in Bytes.

Returns:
Used Size in Bytes of In-Built Storage.

***********

public long getInbuiltStorageAvailableSpace()

Get the In-Built Storage Available Size in Bytes.

Returns:
Available Size in Bytes of In-Built Storage.

***********

public long getMicroSDStorageTotalSpace()

Get the Micro SD Storage Total Size in Bytes.

Returns:
Total Size in Bytes of Micro SD Storage.

***********

public long getMicroSDStorageUsedSpace()

Get the Micro SD Storage Used Size in Bytes.

Returns:
Used Size in Bytes of Micro SD Storage.

***********

public long getMicroSDStorageUsedSpace()

Get the Micro SD Storage Available Size in Bytes.

Returns:
Available Size in Bytes of Micro SD Storage.

******************

