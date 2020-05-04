/*
 * Copyright 2020 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.multiplatform")
    id("dev.icerock.mobile.multiplatform-resources")
}

android {
    compileSdkVersion(Versions.Android.compileSdk)

    defaultConfig {
        minSdkVersion(Versions.Android.minSdk)
        targetSdkVersion(Versions.Android.targetSdk)
    }

    lintOptions {
        disable("ImpliedQuantity")
    }
}

kotlin {
    android()
    ios()
}

dependencies {
    commonMainImplementation("org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}")
    commonMainImplementation("dev.icerock.moko:resources:${Versions.Libs.MultiPlatform.mokoResources}")
}

multiplatformResources {
    multiplatformResourcesPackage = "com.icerockdev.library"
}