package com.ravankhidirov.doctorapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter1(private val context: Context, private val doctorList: ArrayList<One>):
    RecyclerView.Adapter<Adapter1.ItemHolder>() {

    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val image: ImageView = itemView.findViewById(R.id.image)
        private val name: TextView = itemView.findViewById(R.id.name)
        private val sector: TextView = itemView.findViewById(R.id.sector)
        private val hospital: TextView = itemView.findViewById(R.id.hospital)
        private val viewCount: TextView = itemView.findViewById(R.id.viewCount)

        fun setData(doctor:One,context: Context) {
            image.setImageResource(doctor.image)
            name.text = doctor.name
            sector.text = doctor.sector
            hospital.text = doctor.hospital
            viewCount.text = doctor.viewCount
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.rv_item, parent, false)
        return ItemHolder(view)
    }

    override fun getItemCount(): Int {
        return doctorList.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.setData(doctorList[position], context)
    }
}