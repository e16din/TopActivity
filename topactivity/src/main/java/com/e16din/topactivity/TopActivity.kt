package com.e16din.topactivity

import android.app.Activity
import android.app.Application
import android.content.Context
import java.lang.ref.WeakReference


object TopActivity {

    private var activityRef: WeakReference<Activity>? = null

    @JvmStatic
    fun set(activity: Activity?) {
        activityRef = if (activity == null) null else WeakReference(activity)
    }

    @JvmStatic
    fun get(): Activity? = if (activityRef == null) null else activityRef!!.get()

    @JvmStatic
    fun init(app: Application) {
        app.initTopActivity()
    }
}

fun Application.initTopActivity() {
    registerActivityLifecycleCallbacks(LifecycleHandler())
}

fun activity() = TopActivity.get()
fun context(): Context? = activity()
