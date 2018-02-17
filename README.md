# TopActivity
Don't worry about context changed, just call a method TopActivity.get() anywhere in your project to retrieve current activity.

Memory leaks protected.

[![Release](https://jitpack.io/v/e16din/TopActivity.svg)](https://jitpack.io/#e16din/TopActivity)

## Usage
```kotlin
// Kotlin
val activity = topActivity
val application = app
```

```java
// Java
Activity activity = TopActivity.get();
Application application = TopActivity.getApplication();
```


## Init
```kotlin
class App : Application() {
    override fun onCreate() {
        super.onCreate()

        initTopActivity()
    }
}
```

## Download
Step 1. Add it in your root build.gradle at the end of repositories:
```groovy
    allprojects {
        repositories {
            ...
            maven { url "https://jitpack.io" }
        }
    }
```
Step 2. Add the dependency
```groovy
    dependencies {
        implementation 'com.github.e16din:TopActivity:1.0.5'
    }
```