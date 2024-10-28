package com.example.actividad09moviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Actividad09Moviles_02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad09_moviles02)

        val boton_cambio2 = findViewById<Button>(R.id.boton_cambio_act2)

        boton_cambio2.setOnClickListener(){
            val cambio_actividad2  = Intent(this, MainActivity::class.java)
            startActivity(cambio_actividad2)
        }
    }
}