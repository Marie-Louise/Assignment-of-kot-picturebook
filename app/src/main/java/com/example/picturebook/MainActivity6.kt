package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
        var image2=findViewById<ImageView>(R.id.imageView6)
        var text2=findViewById<TextView>(R.id.textView5)
        var next2=findViewById<TextView>(R.id.button8)
        var back2=findViewById<TextView>(R.id.button9)
        next2.setOnClickListener{
            var intent1= Intent(baseContext,MainActivity7::class.java)
            startActivity(intent1)
        }
        back2.setOnClickListener {
            var intent2= Intent(baseContext,MainActivity5::class.java)
            startActivity(intent2)
        }
    }
}