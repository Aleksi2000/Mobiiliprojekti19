package com.example.projekti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        val actionBar = supportActionBar



        actionBar !!.title = "Ahven"
        actionBar.setDisplayHomeAsUpEnabled(true)

    }
}