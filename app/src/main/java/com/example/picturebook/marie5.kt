package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class marie5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marie5)
        var image5 = findViewById<ImageView>(R.id.imageView5)
        var text5 = findViewById<TextView>(R.id.textView4)
        var back5 = findViewById<TextView>(R.id.button8)
        back5.setOnClickListener {
            var intent2 = Intent(baseContext, marie4::class.java)
            startActivity(intent2)
        }
    }
}