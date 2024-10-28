package com.example.actividad09moviles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val boton_cambio = findViewById<Button>(R.id.boton_cambio_act)

        boton_cambio.setOnClickListener(){
            val cambio_actividad = Intent(this, Actividad09Moviles_02::class.java)
            startActivity(cambio_actividad)
        }


    }
}