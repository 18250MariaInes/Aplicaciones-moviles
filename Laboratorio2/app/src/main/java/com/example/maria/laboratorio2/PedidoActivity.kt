package com.example.maria.laboratorio2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.sax.Element
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView

class PedidoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        /*val myapp:MyApplication = applicationContext as MyApplication
        val pedido = arrayListOf<String>()
        for (i in myapp.menuOrder){
            pedido.add(i)
        }*/
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedido)
/*
         fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val adapter = ArrayAdapter(this,
                R.layout.listview, pedido)

             val listView: ListView = findViewById(R.id.listview_1)
            listView.setAdapter(adapter)
        }*/

        //Log.e("PEDIDO",myapp.menuOrder.get(0))

    }
    fun regresarmenu (view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
