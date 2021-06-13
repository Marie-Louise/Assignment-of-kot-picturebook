package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var image1 = findViewById<ImageView>(R.id.imageView)
        var text1 = findViewById<TextView>(R.id.textView)
        var next1 = findViewById<Button>(R.id.button)
        next1.setOnClickListener {
            var intent = Intent(baseContext, marie2::class.java)
            startActivity(intent)
        }


    }
}