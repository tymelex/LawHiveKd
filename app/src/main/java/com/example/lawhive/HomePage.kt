package com.example.lawhive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomePage : AppCompatActivity() {

    private lateinit var knowmore: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        knowmore = findViewById(R.id.btnknowmore)

        knowmore.setOnClickListener {
            val webpage = Intent(this@HomePage, FirmsArticle::class.java)
            startActivity(webpage)

        }


    }
}