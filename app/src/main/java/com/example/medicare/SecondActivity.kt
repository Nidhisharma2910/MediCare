package com.example.medicare


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val detail =findViewById<TextView>(R.id.textView34)
        detail.setOnClickListener{
            val intent= Intent(this,DetailActivity::class.java)
            startActivity(intent)


        }

    }
}