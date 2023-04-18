package com.example.empregaueu

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.empregaueu.databinding.ActivitySegundaTelaBinding

class SegundaTela : AppCompatActivity() {
    private lateinit var binding: ActivitySegundaTelaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_tela)

        binding = ActivitySegundaTelaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btParaTela3 = binding.button2
        btParaTela3.setOnClickListener {
            val intent = Intent(this, Tela3Activity::class.java)
            startActivity(intent)
        }
    }
}
