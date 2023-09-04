package br.com.stepsforfuture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TelaLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_login)

        val btnLogin: Button = findViewById<Button>(R.id.buttonlogin)

        btnLogin.setOnClickListener {
        val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

    }
}