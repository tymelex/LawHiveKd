package com.example.lawhive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class financepage : AppCompatActivity() {


    private lateinit var btnfinance_page: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_financepage)


        btnfinance_page= findViewById(R.id.btn_financepage)

        val webSettings = btnfinance_page.settings
        webSettings.javaScriptEnabled = true
        btnfinance_page.loadUrl("https://en.wikipedia.org/wiki/Category:Financial_law")

    }
}