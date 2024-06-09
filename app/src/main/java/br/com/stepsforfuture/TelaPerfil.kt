package br.com.stepsforfuture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class TelaPerfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_perfil)


        val btnInicio: ImageButton = findViewById(R.id.btn_inicio)

        btnInicio.setOnClickListener {
            val i = Intent(this, TelaInicio::class.java)
            startActivity(i)
        }

        val btnTreinos: ImageButton = findViewById(R.id.btn_treinos)

        btnTreinos.setOnClickListener {
            val i = Intent(this, TelaTreinos::class.java)
            startActivity(i)
        }

        val btnPontos: ImageButton = findViewById(R.id.btn_pontos)

        btnPontos.setOnClickListener {
            val i = Intent(this, TelaPontos::class.java)
            startActivity(i)
        }

        val btnCampanhas: ImageButton = findViewById(R.id.btn_campanhas)

        btnCampanhas.setOnClickListener {
            val i = Intent(this, TelaCampanhas::class.java)
            startActivity(i)
        }


        val btnConsultas: ImageButton = findViewById(R.id.btn_consultas)

        btnConsultas.setOnClickListener {
            val i = Intent(this, TelaConsultas::class.java)
            startActivity(i)
        }


    }
}