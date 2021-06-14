package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        var image1 = findViewById<ImageView>(R.id.imageView7)
        var text1 = findViewById<TextView>(R.id.textView2)
        var Back2 = findViewById<Button>(R.id.button10)
        Back2.setOnClickListener {
            var intent = Intent(baseContext, MainActivity6::class.java)
            startActivity(intent)
        }
    }
}