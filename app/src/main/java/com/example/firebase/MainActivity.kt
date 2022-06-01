package com.example.firebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val database = Firebase.database
        val myRef = database.reference

        //myRef.child("Ejemplo").child("1").setValue(Card("1", "rojo", "corazones"))
        //myRef.child("Ejemplo").child("1").setValue(Card("2", "rojo", "corazones"))
        //myRef.child("Ejemplo").child("1").setValue(Card("3", "rojo", "corazones"))

    /*    myRef.child("Usuarios").child("1").setValue(User("001", "Alondra", "22"))
        myRef.child("Usuarios").child("2").setValue(User("002", "Orlando", "10"))
        myRef.child("Usuarios").child("3").setValue(User("003", "Emilio", "15"))
        myRef.child("Usuarios").child("4").setValue(User("004", "Antonio", "43"))
*/
       myRef.child("Usuarios").get().addOnSuccessListener { response->
            Log.d("firebaseResponse", response.value.toString())
        }.addOnFailureListener{
            Log.e("firebaseResponse", "Error getting data", it)
      }


        //myRef.child("Ejemplo").child("2").setValue("hola mundo2")
        //myRef.child("Ejemplo").child("3").setValue("hola mundo3")
    }
}