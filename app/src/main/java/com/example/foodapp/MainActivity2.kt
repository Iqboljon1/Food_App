package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.print.PrintAttributes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.marginBottom
import com.example.foodapp.MySharePreference.MySharePreference
import com.example.foodapp.data.Dataa
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.dinamik_view.view.*
import androidx.cardview.widget.CardView
import android.view.ViewGroup.MarginLayoutParams
import androidx.core.view.marginEnd
import androidx.core.view.marginLeft
import com.example.foodapp.taom.Taom
import kotlinx.android.synthetic.main.dinamik_view.*


class MainActivity2 : AppCompatActivity() {
    var arrayList = ArrayList<Dataa>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        MySharePreference.init(this)
        arrayList = MySharePreference.dataList!!
        if (arrayList.isEmpty()){
            BirinchiMartaIshgaTushganada()
        }
        for (i in arrayList.indices) {
            BuildDinamikView(arrayList[i].stringNomi , arrayList[i].stringMaxsulot , arrayList[i].stringJarayon)
        }
    }
    fun BirinchiMartaIshgaTushganada() {
        arrayList.add(
            Dataa(
                "Palov",
                "6-7 dona kattaroq sabzi\n" +
                        "0,5 kg go’sht\n" +
                        "1 ta piyoz\n" +
                        "3 cho’mich yog’\n" +
                        "dumba\n" +
                        "700 gr guruch. ( oilada 4 kishimiz shiga mo’ljallab qildim)\n" +
                        "zira",
                "Avval ishni qizib turgan qozonga dumbani to'g'rab soldim , uni yog'i chiqgandan so'ng jizzalarini ovoldim . Ustiga 3 cho'mich yog ' soldim . Keyin piyozni kattaroq qilib yarim parrak qilib to'g'rab soldim . Ketidan go'shtni ham soldim . Go'sht tuzlangan bo'lsa yaxshi , agar tuzlanmagan bo'lsa yaxshilab tuz sepib keyin yog'ga solsak go'shtga maza kirib qovriladi . Buvim shunday der edilar . Man oshga go'shtni tuzlab qo'yaman , bir ikki kun avval . Palovimizni rangi piyozimizni qovirishimizga bog'liq . Oilamga qoraroq osh yoqadi , shuning uchun piyoz qizarguncha sabzilarni to'radim."
            )
        )
        MySharePreference.dataList = arrayList
    }
    private fun BuildDinamikView(stringNomi: String, stringMaxsulot: String, stringJarayon: String) {
        val view = layoutInflater.inflate(R.layout.dinamik_view , null)
        var nomi = view.findViewById<TextView>(R.id.tv_nomi)
        var btn_card = view.findViewById<CardView>(R.id.card_dinamik_view)
        nomi.text = stringNomi
        view.layoutParams
        btn_card.setOnClickListener {
            val intent = Intent(this , MainActivity3::class.java)
            startActivity(intent)
            Taom.nomi = stringNomi
            Taom.maxsulot = stringMaxsulot
            Taom.jarayon = stringJarayon
        }
        container.addView(view)
    }
}
