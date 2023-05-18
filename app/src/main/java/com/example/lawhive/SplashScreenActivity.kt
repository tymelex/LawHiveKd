package com.example.lawhive

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView

class SplashScreenActivity : AppCompatActivity() {

    lateinit var splash_screenicon: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        splash_screenicon = findViewById(R.id.splashicon)

        splash_screenicon.alpha = 0f
        splash_screenicon.animate().setDuration(1500).alpha(1f).withEndAction{
            val gotofirst = Intent(this, CreateAccount::class.java)
            startActivity(gotofirst)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }

    }
}