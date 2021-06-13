package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class marie3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marie3)
       var image3 = findViewById<ImageView>(R.id.imageView3)
        var textView = findViewById<TextView>(R.id.textView5)
        var back3 = findViewById<TextView>(R.id.button5)
        var next3 = findViewById<TextView>(R.id.button4)
        next3.setOnClickListener {
            var intent = Intent(baseContext, marie4::class.java)
            startActivity(intent)
        }
        back3.setOnClickListener {
            var intent = Intent(baseContext, marie2::class.java)
            startActivity(intent)

        }
    }
}