package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.btn)
        val counter_text = findViewById<TextView>(R.id.counter_text)
        var count = 0
        button.setOnClickListener {
            count++
            counter_text.text = count.toString()
        }
    }
}