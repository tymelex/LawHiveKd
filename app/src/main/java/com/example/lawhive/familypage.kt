package com.example.lawhive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class familypage : AppCompatActivity() {


    private lateinit var btnfamily_page: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_familypage)


        btnfamily_page= findViewById(R.id.btn_familypage)

        val webSettings = btnfamily_page.settings
        webSettings.javaScriptEnabled = true
        btnfamily_page.loadUrl("https://www.britannica.com/topic/family-law")

    }
}