package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val button2: Button = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val intent = Intent(this@Signup, login::class.java)
            startActivity(intent)
        }

        val button: Button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this@Signup, home::class.java)
            startActivity(intent)
        }
    }
}