package com.example.empregaueu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.empregaueu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val edNome = binding.edNome

        val btLogin = binding.btLogin

        btLogin.setOnClickListener {
            if(edNome.text.toString() == "User") {
                val intent = Intent(this, SegundaTela::class.java)
                intent.putExtra("chaveNomeUsuario", edNome.text.toString())
                startActivity(intent)
            }else{
                Toast.makeText(this, "Usuario inválido", Toast.LENGTH_SHORT).show()
            }
        }
    }
}