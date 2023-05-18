package com.example.lawhive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ServicesPage : AppCompatActivity() {

    private lateinit var criminal_btn: Button
    private lateinit var btn_family: Button
    private lateinit var financial_btn: Button
    private lateinit var property_btn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_services_page)


        criminal_btn = findViewById(R.id.crimebtn)

        criminal_btn.setOnClickListener {
            val webpage = Intent(this@ServicesPage, crimepage::class.java)
            startActivity(webpage)

        }

        financial_btn = findViewById(R.id.financebtn)

        financial_btn.setOnClickListener {
            val webpage = Intent(this@ServicesPage, financepage::class.java)
            startActivity(webpage)

        }


        property_btn = findViewById(R.id.propertybtn)

        property_btn.setOnClickListener {
            val webpage = Intent(this@ServicesPage, propertypage::class.java)
            startActivity(webpage)

        }

        btn_family = findViewById(R.id.familybtn)

        btn_family.setOnClickListener {
            val webpage = Intent(this@ServicesPage, familypage::class.java)
            startActivity(webpage)

        }

    }
}