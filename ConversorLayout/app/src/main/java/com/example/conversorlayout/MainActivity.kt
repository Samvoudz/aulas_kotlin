package com.example.conversorlayout

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.conversorlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonDOL.setOnClickListener {
            val bitcoin = binding.editValor.text.toString().trim()
            val euro = binding.editValor.text.toString().trim()
            val gbp = binding.editValor.text.toString().trim()
            val dolares = binding.editValor.text.toString().trim()
            val taxa = binding.editTaxa.text.toString().trim()

            if(!dolares.isEmpty()&&!taxa.isEmpty()){
                val reais = String.format("%.2f", dolares.toDouble() * taxa.toDouble())
                binding.textResultado.text = "R$ " + reais
            }else{
                Toast.makeText(applicationContext,"Errou!!!",Toast.LENGTH_LONG).show()
            }
            if (!euro.isEmpty()&&!taxa.isEmpty()){
                val reais = String.format("%.2f", euro.toDouble() * taxa.toDouble())
                binding.textResultado.text = "R$" + reais
            }else{
                Toast.makeText(applicationContext, "Errou!!!", Toast.LENGTH_LONG).show()
            }
            if(!gbp.isEmpty()&&!taxa.isEmpty()){
                val reais = String.format("%.2f", gbp.toDouble() * taxa.toDouble())
                binding.textResultado.text = "R$ " + reais
            }else{
                Toast.makeText(applicationContext,"Errou!!!",Toast.LENGTH_LONG).show()
            }
            if(!bitcoin.isEmpty()&&!taxa.isEmpty()){
                val reais = String.format("%.2f", bitcoin.toDouble() * taxa.toDouble())
                binding.textResultado.text = "R$ " + reais
            }else{
                Toast.makeText(applicationContext,"Errou!!!",Toast.LENGTH_LONG).show()
            }
        }
    }
}