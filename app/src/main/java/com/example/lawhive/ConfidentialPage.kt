package com.example.lawhive

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class ConfidentialPage : AppCompatActivity() {

    private lateinit var _btnconfidential: WebView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confidential_page)


        _btnconfidential = findViewById(R.id.btnconfidentialgood)

        val webSettings = _btnconfidential.settings
        webSettings.javaScriptEnabled = true
        _btnconfidential.loadUrl("https://www.americanbar.org/groups/professional_responsibility/publications/model_rules_of_professional_conduct/rule_1_6_confidentiality_of_information/comment_on_rule_1_6/")


    }
}