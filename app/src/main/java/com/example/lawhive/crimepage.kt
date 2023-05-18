package com.example.lawhive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class crimepage : AppCompatActivity() {


    private lateinit var btncrime_Page: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crimepage)


        btncrime_Page = findViewById(R.id.btn_crimepage)

        val webSettings = btncrime_Page.settings
        webSettings.javaScriptEnabled = true
        btncrime_Page.loadUrl("https://en.wikipedia.org/wiki/Criminal_law")

    }
}