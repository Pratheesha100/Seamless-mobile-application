package com.example.myapplication

import android.content.Intent
import android.net.wifi.hotspot2.pps.HomeSp
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }

        val button5: Button = findViewById<Button>(R.id.button5)
        button5.setOnClickListener {
            val intent = Intent(this@login, Signup::class.java)
            startActivity(intent)
        }

        val button4: Button = findViewById(R.id.button4)
        button4.setOnClickListener {
            val intent = Intent(this@login, home::class.java)
            startActivity(intent)
        }
    }
}