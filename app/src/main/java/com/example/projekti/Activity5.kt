package com.example.projekti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Activity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_5)

        val actionBar = supportActionBar



        actionBar !!.title = "Kuha"
        actionBar.setDisplayHomeAsUpEnabled(true)

    }
}