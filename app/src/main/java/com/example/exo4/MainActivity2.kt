package com.example.exo4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.fragment_detail.*
import kotlinx.android.synthetic.main.fragment_main.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val doctor=intent.getSerializableExtra("doctor") as Doctor
            //val nom=findViewById<TextView>(R.id.nom2).toString()

        nom2.text=doctor.name
        prenom2.text=doctor.prenom
        phone2.text=doctor.phone
        specialite2.text=doctor.specialite
        image2.setImageResource(doctor.img)
    }
}