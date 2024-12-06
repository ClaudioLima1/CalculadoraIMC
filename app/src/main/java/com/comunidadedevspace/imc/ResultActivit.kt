package com.comunidadedevspace.imc

import android.app.PendingIntent.OnFinished
import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
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

        val (classificacao, cor) = when {
            result < 18.5f -> "BAIXO PESO" to  R.color.azul
            result > 18.5f && result <= 24.9f -> "PESO ADEQUADO" to R.color.verde
            result > 25.9f && result <= 29.9f -> "SOBREPESO" to R.color.amarelo
            result > 30f && result <= 39.9f -> "OBESIDADE" to R.color.laranja
            else -> "OBESIDADE EXTREMA" to R.color.vermelho
        }

        tvClassificacao.text = classificacao
        tvClassificacao.setTextColor(ContextCompat.getColor(this, cor))


    }
}