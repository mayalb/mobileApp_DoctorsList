package com.example.exo4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var doctorsList=findViewById(R.id.doctorsList) as RecyclerView
        doctorsList.layoutManager=LinearLayoutManager(this)
        doctorsList.adapter = Adapter(this,loadData())



    }
    fun loadData():List<Doctor> {
        val data = mutableListOf<Doctor>()
        data.add(Doctor(R.drawable.doc1,"Maya","Larbi","083743829","cardiologue"))
        data.add(Doctor(R.drawable.doc2,"Safi","Rihani","083743829","generaliste"))
        data.add(Doctor(R.drawable.doc5,"fatima","bz","0886789","Dentiste"))
        data.add(Doctor(R.drawable.doc4,"Rayane","Larbi","083743829","Dentiste"))
        data.add(Doctor(R.drawable.doc3,"Massi","Larbi","92878","cardiologue"))
        data.add(Doctor(R.drawable.doct6,"Rima","Amirat","083743829","pediatre"))
        data.add(Doctor(R.drawable.doc7,"Youcef","larbi","083743829","pediatre"))
        data.add(Doctor(R.drawable.doc8,"Ghada","flissi","0837989","ophtalmologue"))
        data.add(Doctor(R.drawable.doct6,"Naima","larbi","083743829","pediatre"))
        data.add(Doctor(R.drawable.doct6,"Said","larbi","083743829","dentiste"))

        return data
    }
}