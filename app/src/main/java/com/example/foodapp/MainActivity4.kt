package com.example.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.foodapp.MySharePreference.MySharePreference
import com.example.foodapp.data.Dataa
import kotlinx.android.synthetic.main.activity_main4.*

class MainActivity4 : AppCompatActivity() {
    var arrayList = ArrayList<Dataa>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        MySharePreference.init(this)
        arrayList = MySharePreference.dataList!!

        btn_saqlash.setOnClickListener {
            val nomi = edt_TaomNomi.text.toString().trim()
            val maxsulot = edt_TaomMaxsulot.text.toString().trim()
            val jarayon = edt_TaomJarayon.text.toString().trim()
            if (nomi.isNotEmpty() && maxsulot.isNotEmpty() && jarayon.isNotEmpty()) {
                edt_TaomNomi.text!!.clear()
                edt_TaomMaxsulot.text!!.clear()
                edt_TaomJarayon.text!!.clear()
                arrayList.add(Dataa(nomi , maxsulot , jarayon))
                MySharePreference.dataList = arrayList
                Toast.makeText(this, "Saqlandi", Toast.LENGTH_SHORT).show()
            }
        }

    }
}