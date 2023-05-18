package com.example.lawhive

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class FirmsArticle : AppCompatActivity() {

    private lateinit var btnknow_more: WebView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firms_article)

        btnknow_more = findViewById(R.id.btn_knowmore)

        val webSettings = btnknow_more.settings
        webSettings.javaScriptEnabled = true
        btnknow_more.loadUrl("https://suits.fandom.com/wiki/Pearson_Hardman")

    }
}