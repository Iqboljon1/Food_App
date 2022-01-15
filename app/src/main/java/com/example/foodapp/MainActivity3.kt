package com.example.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodapp.taom.Taom
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        tv_taomNomi.text = Taom.nomi
        tv_taomMaxsuloti.text = Taom.maxsulot
        tv_taomJarayon.text = Taom.jarayon
    }
}