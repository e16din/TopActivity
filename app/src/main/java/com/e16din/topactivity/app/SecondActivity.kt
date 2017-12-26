package com.e16din.topactivity.app

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        startActivity(Intent(this, ThirdActivity::class.java))
    }
}
