package br.com.stepsforfuture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TelaMinhaConta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_minhaconta)

        val btnMeusDados: Button = findViewById<Button>(R.id.btn_meusdados)

        btnMeusDados.setOnClickListener {
            val i = Intent(this, TelaMeusDados::class.java)
            startActivity(i)
        }

        val btnLogoHome: Button = findViewById<Button>(R.id.btn_logohome)

        btnLogoHome.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
    }
}