package com.e16din.topactivity


import android.app.Application

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initTopActivity()
    }
}
