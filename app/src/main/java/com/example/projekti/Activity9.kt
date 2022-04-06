package com.example.projekti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Activity9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_9)

        val actionBar = supportActionBar



        actionBar !!.title = "Siika"
        actionBar.setDisplayHomeAsUpEnabled(true)

    }
}