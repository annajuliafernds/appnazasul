package com.example.appnaza

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class activity_register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val nome = findViewById<EditText>(R.id.editNome)
        val email = findViewById<EditText>(R.id.editEmail)
        val senha = findViewById<EditText>(R.id.editSenha)
        val btnCadastrar = findViewById<Button>(R.id.btnCadastrar)
        val btnEntrar = findViewById<Button>(R.id.btnEntrar)

        btnCadastrar.setOnClickListener {
            val nomeTexto = nome.text.toString()
            val emailTexto = email.text.toString()
            val senhaTexto = senha.text.toString()

            if (nomeTexto.isEmpty() || emailTexto.isEmpty() || senhaTexto.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
            } else {
                // Aqui você pode salvar no Firebase, Banco local, etc.
                Toast.makeText(this, "Cadastro realizado com sucesso!", Toast.LENGTH_SHORT).show()

                // Simula login e redireciona
                val intent = Intent(this, activity_home::class.java)
                startActivity(intent)
                finish()
            }
        }

        btnEntrar.setOnClickListener {
            val intent = Intent(this, activity_login::class.java)
            startActivity(intent)
            finish()
        }
    }
}
