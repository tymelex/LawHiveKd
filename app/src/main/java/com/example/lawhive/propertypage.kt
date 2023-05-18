package com.example.lawhive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class propertypage : AppCompatActivity() {


    private lateinit var btnproperty_page: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_propertypage)

        btnproperty_page= findViewById(R.id.btn_propertypage)

        val webSettings = btnproperty_page.settings
        webSettings.javaScriptEnabled = true
        btnproperty_page.loadUrl("https://en.wikipedia.org/wiki/Property_law")

    }
}