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

        val login =findViewById<TextView>(R.id.textView8)
        login.setOnClickListener{
            val intent= Intent(this,LoginActivity::class.java)
            startActivity(intent)


        }

    }
}