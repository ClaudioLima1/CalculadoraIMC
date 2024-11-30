package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //recuperar os componentes EdidText
        // Criar uma variavel e associar ( = ) o componente de UI <TextInputEditText>
        // Recuperar o botao da tela]

        //colocar aco no botao setOnClickListener
        //recuperar o texto digitado no edtPeso


        val edtPeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edt_altura)

        val btnCalcular = findViewById<Button>(R.id.btn_Calcular)

        btnCalcular.setOnClickListener {


            val pesoStr: String = edtPeso.text.toString()
            val alturaStr: String = edtAltura.text.toString()

            if (pesoStr == "" || alturaStr == "") {
                //mostrar mensagem para o usuario
                Snackbar.make(
                    edtPeso,
                    "PREENCHA TODOS OS CAMPOS",
                    Snackbar.LENGTH_LONG
                ).show()
            } else {
                val peso = edtPeso.text.toString().toFloat()
                val altura = edtAltura.text.toString().toFloat()

                val alturaQ2 = altura * altura
                val resultado = peso / alturaQ2

                println("Claudio acao do botao " + resultado)
            }
        }
    }
}



