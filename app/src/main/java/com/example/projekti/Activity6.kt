package com.example.projekti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Activity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_6)

        val actionBar = supportActionBar



        actionBar !!.title = "Kuha"
        actionBar.setDisplayHomeAsUpEnabled(true)

    }
}