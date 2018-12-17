# fibamlscan - Firebase ML Kit Barcode scanner Library and Example App

This library is based on the [Firebase for ML Kit quickstart](https://github.com/firebase/quickstart-android/tree/master/mlkit) tutorial. 

It allows you to easily integrate the Firebase ML Kit barcode scanning engine into your app. The Firebase ML Kit is better than ZXing for some bar codes, especially PDF417 used for driver's licenses.

## Using this library

The following steps enable you to use this library.

### generate the app/google-services.json file

General instructions are available [here](https://firebase.google.com/docs/android/setup). 
You can also generate it directly using the [firebase console](https://developer.android.com/studio/write/firebase).

Make sure the generated `google-services.json` file ends up in the `app/` directory.

### Add the Firebase SDK to your project

Documentation is available [here](https://firebase.google.com/docs/android/setup?authuser=0). 
If you're not using Firebase in any other way, you don't have to add the 
`implementation 'com.google.firebase:firebase-core:16.0.1'` instruction to your app/build.gradle 
file.

### Set up jitpack.io for your project

Refer to [jitpack's documentation](https://jitpack.io/) for instructions.

### Add the library to your project

Add the following lines to your `app/build.gradle` dependencies:

```groovy
// https://github.com/johnnylambada/fibamlscan
implementation "com.github.johnnylambada:fibamlscan:0.1.3"
```

### Review the sample app to see how to integrate the library.

1. Review the [PreviewActivity](https://github.com/johnnylambada/fibamlscan/blob/master/app/src/main/java/fibamlscan/app/PreviewActivity.java).
2. Review the [PreviewActivity's layout](https://github.com/johnnylambada/fibamlscan/blob/master/library/src/main/res/layout/activity_live_preview.xml).
