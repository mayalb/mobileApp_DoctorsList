package com.example.exo4

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView


class Adapter(val context: Context, var data:List<Doctor>): RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.doctor, parent, false))

    }
    private fun isTwoPane():Boolean{
        val activity = context as Activity
        return activity.findViewById<View>(R.id.fragment2)!=null
    }

    override fun getItemCount()=data.size
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.nom.text=data[position].name
        holder.prenom.text=data[position].prenom
        holder.spec.text=data[position].specialite
        holder.num.text=data[position].phone
        holder.img.setImageResource(data[position].img)
       // holder.img


        holder.itemView.setOnClickListener { View->

            if(isTwoPane()) {
                val activity = context as Activity
                val img = activity.findViewById(R.id.image2) as ImageView
                img.setImageResource(data[position].img)
                val nom = activity.findViewById(R.id.nom2) as TextView
                nom.setText(data[position].name)
                val prenom = activity.findViewById(R.id.prenom2) as TextView
                prenom.setText(data[position].prenom)
                val phone = activity.findViewById(R.id.phone2) as TextView
                phone.setText(data[position].phone)
                val specialite = activity.findViewById(R.id.specialite2) as TextView
                specialite.setText(data[position].specialite)

            }
            else {
                holder.itemView.setOnClickListener {  View->
                    val intent= Intent(context,MainActivity2::class.java)
                    intent.putExtra("doctor",data[position])
                    context.startActivity(intent)
                }
             //   val intent = Intent(context,MainActivity2::class.java)
              //  intent.putExtra("doctor",data[position])
               // context.startActivity(intent)
            }




        }
        holder.num.setOnClickListener {View->
            val numero= data[position].phone
            val uri = Uri.parse("tel:$numero")
            val intent = Intent(Intent.ACTION_DIAL, uri)
            if (intent.resolveActivity(context.packageManager) != null) {
                context.startActivity(intent)
        }}



    }

}
class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val nom= view.findViewById<TextView>(R.id.textViewnom) as TextView
    val prenom= view.findViewById<TextView>(R.id.textViewprenom) as TextView
    val num= view.findViewById<TextView>(R.id.textViewphone) as TextView
    val spec= view.findViewById<TextView>(R.id.TextviewSpecialite) as TextView
    val img= view.findViewById<ImageView>(R.id.imageView) as ImageView
    val imageView2=view.findViewById<ImageView>(R.id.imageView2) as ImageView
   // val itemview=view.findViewById<MenuView.ItemView>(R.id.itemview) as MenuView.ItemView

}