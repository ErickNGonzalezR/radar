package com.example.radar

import RadarView
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Añadir lógica para habilitar Edge to Edge si es necesario
        // enableEdgeToEdge() // Asegúrate de que este método sea válido

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Obtener referencia al RadarView
        val radarView = findViewById<RadarView>(R.id.main)
        // Aquí puedes añadir lógica adicional para interactuar con el radar
    }
}
