package com.example.medicare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the "Login" Button
        val loginButton = findViewById<Button>(R.id.login_button)

        // Set a click listener for "Login" Button
        loginButton.setOnClickListener {
            // Add your login functionality here
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

    }
}