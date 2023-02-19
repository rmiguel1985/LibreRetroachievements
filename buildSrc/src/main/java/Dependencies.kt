object ApplicationId {
    const val id = "com.adictosalainformatica.libreretroachievements"
}

object AppVersion {
    const val versionCode = 1
    const val versionName = "0.0.1"
}

object Versions {
    const val compileSdk = 33
    const val buildTools = "30.0.3"
    const val minSdk = 24
    const val targetSdk = 33
    const val kotlinCompilerExtensionVersion = "1.4.2"

    // Android Libraries
    const val coreKtx = "1.9.0"
    const val activityCompose = "1.6.1"
    const val lifeCycleVersion = "2.5.1"

    // UI Libraries
    const val composeVersion = "1.3.3"
    const val composeMaterial = "1.3.1"

    // Test Libraries
    const val junitVersion = "4.13.2"
    const val junitExtVersion = "1.1.3"
    const val espressoCoreVersion = "3.5.1"

    // Third Party libraries
    const val leakCanaryVersion = "2.10"
    const val timberVersion = "5.0.1"
    const val startupRuntime = "1.1.1"
}

object Libraries {
    const val leakCanary = "com.squareup.leakcanary:leakcanary-android:${Versions.leakCanaryVersion}"
    const val timber = "com.jakewharton.timber:timber:${Versions.timberVersion}"
    const val startupRuntime = "androidx.startup:startup-runtime:${Versions.startupRuntime}"

}

object AndroidLibraries {
    // ANDROID
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val activityCompose = "androidx.activity:activity-compose:${Versions.activityCompose}"

    // UI
    const val composeUi = "androidx.compose.ui:ui:${Versions.composeVersion}"
    const val composeUiTooling = "androidx.compose.ui:ui-tooling-preview:${Versions.composeVersion}"
    const val composeMaterial = "androidx.compose.material:material:${Versions.composeMaterial}"

    // Lifecycle components
    const val lcRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifeCycleVersion}"
}

object TestLibraries {
    const val junitTest = "junit:junit:${Versions.junitVersion}"
    const val junitExt = "androidx.test.ext:junit:${Versions.junitExtVersion}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCoreVersion}"
    const val composeUiJunit4 = "androidx.compose.ui:ui-test-junit4:${Versions.composeVersion}"
    const val composeUiTooling = "androidx.compose.ui:ui-tooling:${Versions.composeVersion}"
    const val composeUiTestManifest =  "androidx.compose.ui:ui-test-manifest:${Versions.composeVersion}"
}
