package com.example.projekti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Activity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)

        val actionBar = supportActionBar



        actionBar !!.title = "Lohi"
        actionBar.setDisplayHomeAsUpEnabled(true)

    }
}