
//Pacote do projeto
package com.example.restaurante

//importação das bibliotecas que serão utilizadas
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

//criação da classe principal do arquivo
class SplashActivity : AppCompatActivity() {
    //função onde ocorre a parte do Splash
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //colocação do layout desta parte
        setContentView(R.layout.activity_splash)

        //função que cria a variável i que foi usada na MainActivity
        Handler(Looper.getMainLooper()).postDelayed({
            //variável i
            val i = intent
            //variável j que ativa esta tela
            val j = Intent(this,PedidoActivity::class.java)
            j.putExtras(i)
            //inicialização desta tela
            startActivity(j)
        },2000)

    }
}