package com.example.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    var alturaView: TextView = findViewById(R.id.altura)
    var pesoView: TextView = findViewById(R.id.peso)
    var imc: TextView = findViewById(R.id.resultado)
    var calcular: Button = findViewById(R.id.calcular)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calcular.setOnClickListener{
            var altura: Double = alturaView.text.toString().toDouble()
            var peso: Double = pesoView.text.toString().toDouble()

            var resultado: String = calcularIMC(altura, peso).toString()
            imc.setText(resultado)
        }

    }

    fun calcularIMC(altura: Double, peso: Double): Double{
        return peso/(altura/100)
    }
}