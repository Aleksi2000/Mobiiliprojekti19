package com.example.projekti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Activity11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_11)

        val actionBar = supportActionBar



        actionBar !!.title = "Säyne"
        actionBar.setDisplayHomeAsUpEnabled(true)

    }
}