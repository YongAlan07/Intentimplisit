package com.app.intentimplisit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.net.Uri
import android.content.Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnWeb = findViewById<Button>(R.id.btnWeb)

        btnWeb.setOnClickListener {
            val link = "http://www.atmaluhur.ac.id"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(link)
            startActivity(i)
        }
    }
}