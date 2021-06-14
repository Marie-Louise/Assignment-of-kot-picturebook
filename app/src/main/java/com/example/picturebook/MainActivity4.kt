package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        var image3 = findViewById<ImageView>(R.id.imageView4)
        var textView = findViewById<TextView>(R.id.textView8)
        var back3 = findViewById<TextView>(R.id.button5)
        var next3 = findViewById<TextView>(R.id.button4)
        next3.setOnClickListener {
            var intent1 = Intent(baseContext, MainActivity5::class.java)
            startActivity(intent1)
        }
        back3.setOnClickListener {
            var intent2 = Intent(baseContext,MainActivity1::class.java)
            startActivity(intent2)
        }
    }
}

