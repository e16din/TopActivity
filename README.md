# TopActivity
Don't worry about context changed, just call a method activity() anywhere in your project, and you will retrieve actual activity.

Memory leaks protected.

[![Release](https://jitpack.io/v/e16din/TopActivity.svg)](https://jitpack.io/#e16din/TopActivity)

## Usage
```kotlin
activity()

context()
app()
```

```java
Activity activity = TopActivity.get();
```


## Init
```kotlin
class App : Application() {
    override fun onCreate() {
        super.onCreate()

        initTopActivity { activity ->
            val message = if (activity != null) "activity: ${activity.javaClass.simpleName}" else "exit!"
            Log.d("debug", message)
        }
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
        compile 'com.github.e16din:TopActivity:1.0.2'
    }
```