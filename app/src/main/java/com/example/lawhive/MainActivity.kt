package com.example.lawhive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homecard = findViewById<CardView>(R.id.btnhome)
        homecard.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity,
                    HomePage::class.java
                )
            )
        }

        val servicescard = findViewById<CardView>(R.id.btnservices)
        servicescard.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity,
                    ServicesPage::class.java
                )
            )
        }

        val confidentiality = findViewById<CardView>(R.id.btnconfidentiality)
        confidentiality.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity,
                    ConfidentialPage::class.java
                )
            )
        }

        val legal = findViewById<CardView>(R.id.btnlegalforms)
        legal.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity,
                    LegalFormPage::class.java
                )
            )
        }

        val referral = findViewById<CardView>(R.id.btnreferrals)
        referral.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity,
                    ReferralsPage::class.java
                )
            )
        }

        val  settbtn= findViewById<CardView>(R.id.btnsettings)
        settbtn.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity,
                    SettingsPage::class.java
                )
            )
        }




    }
}