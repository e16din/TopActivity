package com.e16din.topactivity.app

import android.util.Log
import com.e16din.topactivity.topActivity
import kotlinx.android.synthetic.main.layout_scheduler_label.*
import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import java.util.concurrent.TimeUnit


object TestScheduler {

    var counter = 0

    fun start() {
        launch(UI) {
            while (true) {
                updateTopActivity()
                counter += 1
                delay(1, TimeUnit.SECONDS)
            }
        }
    }

    private fun updateTopActivity() {
        val topActivityName = topActivity?.javaClass?.simpleName
        Log.i("test", "Top Activity: $topActivityName")

        topActivity?.vSchedulerLabel?.text = "$topActivityName : $counter"
    }
}