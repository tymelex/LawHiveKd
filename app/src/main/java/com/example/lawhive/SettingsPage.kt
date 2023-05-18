package com.example.lawhive

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SettingsPage : AppCompatActivity() {

    private lateinit var smsbutton: Button
    private lateinit var email_button: Button
    private lateinit var logout_button: Button
    private lateinit var share_button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings_page)

        email_button = findViewById(R.id.emailbutton)
        logout_button = findViewById(R.id.logoutbutton)
        share_button = findViewById(R.id.sharebutton)
        smsbutton = findViewById(R.id.messagebutton)

        smsbutton.setOnClickListener {
            val uri: Uri = Uri.parse("smsto:0776695167")
            val intent = Intent(Intent.ACTION_SENDTO, uri)
            intent.putExtra("sms_body", "Hey there, Am...")
            startActivity(intent)

        }

        email_button.setOnClickListener {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "abdulrahmanabdulaziz628@gmail.com", null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "INQUIRIES FOR SERVICES")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Dear sir/madam, following....")
            startActivity(Intent.createChooser(emailIntent, "Send email..."))

        }

        share_button.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download lawhive app from https://www...!")
            startActivity(shareIntent)

        }

        logout_button.setOnClickListener {

            val gotosignin = Intent(this@SettingsPage, LoginActivity::class.java)
            startActivity(gotosignin)

        }




    }
}