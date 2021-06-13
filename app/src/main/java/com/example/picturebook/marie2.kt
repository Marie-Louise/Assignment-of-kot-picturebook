package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class marie2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marie2)
        var next2=findViewById<TextView>(R.id.button2)
        var back2=findViewById<TextView>(R.id.button3)
        var image2=findViewById<ImageView>(R.id.imageView2)
        var text2=findViewById<TextView>(R.id.textView2)
        next2.setOnClickListener{
           var intent1= Intent(baseContext,marie3::class.java)
            startActivity(intent1)
        }
        back2.setOnClickListener {
              var intent2= Intent(baseContext,MainActivity::class.java)
            startActivity(intent2)
        }
    }
}