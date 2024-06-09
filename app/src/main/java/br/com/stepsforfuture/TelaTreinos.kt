package br.com.stepsforfuture

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class TelaTreinos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_treinos)

        val btnPerfil: ImageButton = findViewById(R.id.btn_perfil)

        btnPerfil.setOnClickListener {
            val i = Intent(this, TelaPerfil::class.java)
            startActivity(i)
        }


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