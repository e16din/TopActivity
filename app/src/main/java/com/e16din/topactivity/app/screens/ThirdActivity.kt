package com.e16din.topactivity.app.screens

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.e16din.topactivity.app.R
import com.e16din.topactivity.topActivity
import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import java.util.concurrent.TimeUnit

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        launch(UI) {
            delay(3, TimeUnit.SECONDS)

            val topActivityName = topActivity?.javaClass?.simpleName
            Log.i("debug", "$topActivityName.finish()")

            topActivity?.finish()
        }
    }
}
