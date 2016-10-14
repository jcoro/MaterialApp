# MaterialApp
This App is Project 5 for the Udacity Android Developer Nanodegree. MaterialApp features an update to XYZ Reader to showcase Material Design principles including: Activity Transitions and Coordinator Layout.

![MaterialApp](http://www.coronite.net/assets/img/github/project5-1.png)
![MaterialApp](http://www.coronite.net/assets/img/github/project5-2.png)

## Android Features / Libraries Implemented:

- [Activity Transitions](https://developer.android.com/training/material/animations.html)
- [CoordinatorLayout](https://developer.android.com/reference/android/support/design/widget/CoordinatorLayout.html)
- [Custom View](https://developer.android.com/training/custom-views/index.html)

## Specifications
- `compileSdkVersion 24`
- `buildToolsVersion "24.0.1"`
- `minSdkVersion 21`
- `targetSdkVersion 24`

## Dependencies
```
ext {
    supportLibVersion = '24.1.1'
}

dependencies {
    compile "com.android.support:support-v4:${supportLibVersion}"
    compile "com.android.support:support-v13:${supportLibVersion}"
    compile "com.android.support:appcompat-v7:${supportLibVersion}"
    compile "com.android.support:palette-v7:${supportLibVersion}"
    compile "com.android.support:recyclerview-v7:${supportLibVersion}"
    compile "com.android.support:cardview-v7:${supportLibVersion}"
    compile "com.squareup.okhttp3:okhttp:3.1.2"
    compile files('libs/volley.jar')
    compile "com.android.support:design:${supportLibVersion}"
}
```


## Implementation

This sample uses the Gradle build system. To build this project, use the "gradlew build" command or use "Import Project" in Android Studio.

If you have any questions I'd be happy to try and help. Please contact me at: john@coronite.net.

# License
This is a public domain work under [CC0 1.0](https://creativecommons.org/publicdomain/zero/1.0/). Feel free to use it as you see fit.
