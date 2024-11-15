package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class home : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val imageView = findViewById<ImageView>(R.id.user)
        imageView.setOnClickListener {
            // Create an Intent to start the UserAccountActivity
            val intent = Intent(this, useraccount::class.java) // Ensure this class exists
            startActivity(intent)
        }

        val imageView1 = findViewById<ImageView>(R.id.cart)
        imageView1.setOnClickListener {
            // Create an Intent to start the UserAccountActivity
            val intent = Intent(this, cart::class.java) // Ensure this class exists
            startActivity(intent)
        }

        val imageView2 = findViewById<ImageView>(R.id.category_H)
        imageView2.setOnClickListener {
            // Create an Intent to start the UserAccountActivity
            val intent = Intent(this, Category::class.java) // Ensure this class exists
            startActivity(intent)
        }

    }
}