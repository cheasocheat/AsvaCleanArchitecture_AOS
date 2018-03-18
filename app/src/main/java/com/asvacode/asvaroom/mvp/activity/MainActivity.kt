package com.asvacode.asvaroom.mvp.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.asvacode.asvaroom.R
import dagger.android.AndroidInjection

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AndroidInjection.inject(this)
    }
}
