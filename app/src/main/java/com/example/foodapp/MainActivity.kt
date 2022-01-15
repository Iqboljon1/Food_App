package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_menu.setOnClickListener {
            val intent = Intent(this , MainActivity2::class.java)
            startActivity(intent)
        }
        btn_add.setOnClickListener {
            val intent = Intent(this , MainActivity4::class.java)
            startActivity(intent)
        }
    }
}