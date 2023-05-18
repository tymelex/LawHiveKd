package com.example.lawhive

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class LegalFormPage : AppCompatActivity() {

    private lateinit var _btnlegalform: WebView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_legal_form_page)


        _btnlegalform = findViewById(R.id.btnlegalformgood)

        val webSettings = _btnlegalform.settings
        webSettings.javaScriptEnabled = true
        _btnlegalform.loadUrl("https://www.statelaw.go.ke/forms/")

    }
}