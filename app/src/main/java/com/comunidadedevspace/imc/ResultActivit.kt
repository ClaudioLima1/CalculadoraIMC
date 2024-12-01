package com.comunidadedevspace.imc

import android.app.PendingIntent.OnFinished
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultActivit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val result = intent.getFloatExtra("789", 0F)

        val tvResult = findViewById<TextView>(R.id.tv_result)
        val tvClassificacao = findViewById<TextView>(R.id.tv_classificacao)

        tvResult.text = result.toString()

        val classificacao: String = if (result <= 18.5f){
            "BAIXO PESO"
        } else if (result > 18.5f && result <= 24.9f){
            "PESO ADEQUADO"
        } else if (result > 25.0f && result <= 29.9f){
            "SOBREPESO"
        } else if (result > 30.0f && result <= 39.9f){
            "OBESIDADE"
        } else {
            "OBESIDADE EXTREMA"
        }

        tvClassificacao.text = classificacao


    }
}