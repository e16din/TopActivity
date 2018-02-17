package com.e16din.topactivity.app


import android.app.Application
import android.util.Log
import com.e16din.topactivity.initTopActivity

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        initTopActivity { activity ->
            val message = if (activity != null) "activity: ${activity.javaClass.simpleName}" else "finished"
            Log.d("debug", message)
        }

        TestScheduler.start()
    }
}
