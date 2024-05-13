
//Pacote do projeto
package com.example.restaurante

//importação das bibliotecas que serão utilizadas
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//criação da classe principal do arquivo
class PedidoActivity : AppCompatActivity() {
    //funçao principal
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //colocação do layout desta tela
        setContentView(R.layout.activity_pedido)
    }
}