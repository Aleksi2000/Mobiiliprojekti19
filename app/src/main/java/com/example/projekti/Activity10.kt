package com.example.projekti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Activity10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_10)

        val actionBar = supportActionBar



        actionBar !!.title = "Muikku"
        actionBar.setDisplayHomeAsUpEnabled(true)

    }
}