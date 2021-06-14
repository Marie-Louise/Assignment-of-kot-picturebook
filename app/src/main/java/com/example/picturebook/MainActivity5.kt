package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        var image2=findViewById<ImageView>(R.id.imageView5)
        var next2=findViewById<TextView>(R.id.button6)
        var text3=findViewById<TextView>(R.id.textView4)
        var back2=findViewById<TextView>(R.id.button7)
        next2.setOnClickListener{
            var intent1= Intent(baseContext,MainActivity6::class.java)
            startActivity(intent1)
        }
        back2.setOnClickListener {
            var intent2= Intent(baseContext,MainActivity4::class.java)
            startActivity(intent2)
        }


    }
}


