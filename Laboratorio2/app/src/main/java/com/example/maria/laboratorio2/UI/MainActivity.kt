package com.example.maria.laboratorio2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.EditText
import android.content.Intent
import android.widget.Button
import android.provider.AlarmClock.EXTRA_MESSAGE




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //boton que abre actividad de menu del restaurante
    fun abrirmenu(view: View) {
        val intent = Intent(this, MenuOrderActivity::class.java)
        startActivity(intent)
    }
    //boton que abre actividad de pedido
    fun abrirpedido (view: View){
        val intent = Intent(this, PedidoActivity::class.java)
        startActivity(intent)
    }

}
