package com.e16din.topactivity


import android.app.Application
import android.util.Log

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        initTopActivity { activity ->
            val message = if (activity != null) "activity: ${activity.javaClass.simpleName}" else "exit!"
            Log.d("debug", message)
        }
    }
}
