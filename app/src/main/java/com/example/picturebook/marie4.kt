package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class marie4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marie4)
        var image4 = findViewById<ImageView>(R.id.imageView4)
        var text4 = findViewById<TextView>(R.id.textView3)
        var next4 = findViewById<TextView>(R.id.button6)
        var back4 = findViewById<TextView>(R.id.button7)
        next4.setOnClickListener {
            var intent1 = Intent(baseContext, marie5::class.java)
            startActivity(intent1)
        }
        back4.setOnClickListener {
            var intent2 = Intent(baseContext, marie3::class.java)
            startActivity(intent2)
        }
    }
}