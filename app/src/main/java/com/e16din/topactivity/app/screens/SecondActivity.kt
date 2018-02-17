package com.e16din.topactivity.app.screens

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.e16din.topactivity.app.R
import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import java.util.concurrent.TimeUnit

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        launch(UI) {
            delay(3, TimeUnit.SECONDS)
            startActivity(Intent(this@SecondActivity, ThirdActivity::class.java))
        }
    }
}
