package com.ravankhidirov.doctorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ravankhidirov.doctorapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rV.setHasFixedSize(true)
        binding.rV.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)


        val doctorList = mutableListOf<One>(One(R.drawable.doctor_1,"dr. Gilang Segara Bening","Heart","Persahabatan Hospital","(1221)"),
            One(R.drawable.doctor_2,"dr. Shabil Chan","Dental","Columbia Asia Hospital","(964)"),
            One(R.drawable.doctor_3,"dr. Mustakim","Eye","Salemba Carolus Hospital","(762)")) as ArrayList<One>


        val adapter1:Adapter1 = Adapter1(this,doctorList)
        binding.rV.adapter = adapter1

    }
}