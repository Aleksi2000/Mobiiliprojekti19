package com.example.projekti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Activity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_7)

        val actionBar = supportActionBar



        actionBar !!.title = "Särki"
        actionBar.setDisplayHomeAsUpEnabled(true)

    }
}