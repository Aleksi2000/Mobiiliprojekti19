package com.example.projekti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val selectHauki = findViewById<ImageButton>(R.id.select1)
        val selectAhven = findViewById<ImageButton>(R.id.select2)
        val selectLohi = findViewById<ImageButton>(R.id.select3)
        val selectKuha = findViewById<ImageButton>(R.id.select4)
        val selectTaimen = findViewById<ImageButton>(R.id.select5)
        val selectMade = findViewById<ImageButton>(R.id.select6)
        val selectSarki = findViewById<ImageButton>(R.id.select7)
        val selectSiika = findViewById<ImageButton>(R.id.select8)
        val selectMuikku = findViewById<ImageButton>(R.id.select9)
        val selectSayne = findViewById<ImageButton>(R.id.select10)

        selectHauki.setOnClickListener{
            val intent = Intent(this,Activity2::class.java)
            startActivity(intent)
        }

        selectAhven.setOnClickListener{
            val intent = Intent(this,Activity3::class.java)
            startActivity(intent)
        }

        selectLohi.setOnClickListener{
            val intent = Intent(this,Activity4::class.java)
            startActivity(intent)
        }

        selectKuha.setOnClickListener{
            val intent = Intent(this,Activity5::class.java)
            startActivity(intent)
        }

        selectTaimen.setOnClickListener{
            val intent = Intent(this,Activity6::class.java)
            startActivity(intent)
        }

        selectMade.setOnClickListener{
            val intent = Intent(this,Activity7::class.java)
            startActivity(intent)
        }

        selectSarki.setOnClickListener{
            val intent = Intent(this,Activity8::class.java)
            startActivity(intent)
        }

        selectSiika.setOnClickListener{
            val intent = Intent(this,Activity9::class.java)
            startActivity(intent)
        }

        selectMuikku.setOnClickListener{
            val intent = Intent(this,Activity10::class.java)
            startActivity(intent)
        }

        selectSayne.setOnClickListener{
            val intent = Intent(this,Activity11::class.java)
            startActivity(intent)
        }

    }
}