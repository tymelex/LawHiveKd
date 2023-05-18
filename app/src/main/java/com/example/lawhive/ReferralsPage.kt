package com.example.lawhive

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class ReferralsPage : AppCompatActivity() {

    private lateinit var call_criminal: Button
    private lateinit var call_financial: Button
    private lateinit var call_property: Button
    private lateinit var call_family: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_referrals_page)

        call_criminal = findViewById(R.id.crimecall)
        call_financial = findViewById(R.id.financecall)
        call_property = findViewById(R.id.propertycall)
        call_family = findViewById(R.id.familycall)

        call_criminal.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+254776695167"))
            if (ContextCompat.checkSelfPermission(this@ReferralsPage, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this@ReferralsPage, arrayOf<String>(android.Manifest.permission.CALL_PHONE), 1)
            } else {
                startActivity(intent)
            }
        }

        call_financial.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+254776695167"))
            if (ContextCompat.checkSelfPermission(this@ReferralsPage, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this@ReferralsPage, arrayOf<String>(android.Manifest.permission.CALL_PHONE), 1)
            } else {
                startActivity(intent)
            }
        }

        call_family.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+254776695167"))
            if (ContextCompat.checkSelfPermission(this@ReferralsPage, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this@ReferralsPage, arrayOf<String>(android.Manifest.permission.CALL_PHONE), 1)
            } else {
                startActivity(intent)
            }
        }

        call_property.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+254776695167"))
            if (ContextCompat.checkSelfPermission(this@ReferralsPage, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this@ReferralsPage, arrayOf<String>(android.Manifest.permission.CALL_PHONE), 1)
            } else {
                startActivity(intent)
            }
        }


    }
}