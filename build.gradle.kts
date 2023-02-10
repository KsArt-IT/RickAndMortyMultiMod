buildscript {
    dependencies {
        classpath(libs.hilt.plugin)
        classpath("com.android.tools.build:gradle:8.1.0-alpha04")
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application").version("8.1.0-alpha04") apply false
    id("com.android.library").version("8.1.0-alpha04") apply false
    id("org.jetbrains.kotlin.android").version("1.8.10") apply false
}

apply(from = "$rootDir/ktlint.gradle.kts")
