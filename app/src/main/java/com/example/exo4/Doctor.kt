package com.example.exo4

import java.io.Serializable

data class Doctor(val img:Int,val name:String,val prenom :String,val phone:String,
                  val specialite :String ) :Serializable