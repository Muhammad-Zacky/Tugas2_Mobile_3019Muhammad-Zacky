package com.mobiletugas23019muhammadzacky

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondClass : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pageduah)

        val welcomeTextView = findViewById<TextView>(R.id.welcomeTextView)
        val username = intent.getStringExtra("USERNAME")
        welcomeTextView.text = "Selamat Datang, $username!"
    }
}