
//Pacote do projeto
package com.example.restaurante

//importação das bibliotecas que serão utilizadas
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.restaurante.databinding.ActivityLoginBinding

//criação da classe principal do arquivo
class LoginActivity : AppCompatActivity() {

    //criação de uma variável que será usada tardiamente
    private lateinit var binding:ActivityLoginBinding

    //função onde ocorre a parte do login
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    //atribuição ao layout
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

    //método de evento
        binding.buttonEntrar.setOnClickListener {

    //variáveis de senha e nome de usuário
            val username = binding.editUsername.text.toString().trim()
            val password = binding.editPassword.text.toString().trim()

            //verifcação das variáveis anteriores
            if (username.equals("abc") && password.equals("123")) {
            //caso a condição seja verdadeira
                val i = Intent(this, MainActivity::class.java)
                i.putExtra("username", username)
                startActivity(i)
                finish()
                //caso contrário
            } else {
                Toast.makeText(applicationContext, "Errou", Toast.LENGTH_LONG).show()
            }
        }

    }
}