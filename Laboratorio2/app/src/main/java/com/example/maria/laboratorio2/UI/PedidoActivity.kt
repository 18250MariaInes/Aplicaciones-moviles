package com.example.maria.laboratorio2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.sax.Element
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_pedido.*
import kotlin.math.log

class PedidoActivity : AppCompatActivity() {
    //2.0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        val myapp: MyApplication = applicationContext as MyApplication
        val pedido = arrayListOf<String>()
        pedido.addAll(myapp.menuOrder)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedido)

        val adapter = ArrayAdapter(
            this,
            R.layout.listview, pedido
        )

        val listView: ListView = this.findViewById(R.id.listview_2)
        listView.setAdapter(adapter)

        //onclick
        listView.onItemLongClickListener = object : AdapterView.OnItemLongClickListener {

            override fun onItemLongClick(
                parent: AdapterView<*>, view: View,
                position: Int, id: Long
            ): Boolean {

                // value of item that is clicked
                val itemValue = listView.getItemAtPosition(position) as String
                //val position=pedido.indexOf(itemValue)
                val myapp: MyApplication = applicationContext as MyApplication
                //position
                myapp.del(position)
               // adapter.notifyDataSetChanged()
                listView.invalidateViews()
                // Toast the values
                Toast.makeText(
                    applicationContext,
                    "$itemValue fue eliminado", Toast.LENGTH_LONG
                )
                    .show()
                adapter.notifyDataSetChanged()
                listView.adapter=adapter
                return true
            }
            //adapter.notifyDataSetChanged()
        }
        /*listView.setOnItemLongClickListener{_,_,position,_->
            val itemValue = listView.getItemAtPosition(position) as String
            val myapp: MyApplication = applicationContext as MyApplication
            myapp.del(position)
            listView.invalidateViews()
            Toast.makeText(
                applicationContext,
                "$itemValue fue SACADO", Toast.LENGTH_LONG
            )
                .show()
            true
        }*/


    }
    fun regresarmenu (view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun borrarPedido (view: View){
        val myapp:MyApplication = applicationContext as MyApplication
        myapp.clear()
        Toast.makeText(applicationContext, "Se ha borrado todo el pedido exitosamente", Toast.LENGTH_LONG).show()
    }

    fun realizarPedido (view: View){
        val myapp:MyApplication = applicationContext as MyApplication

        Toast.makeText(applicationContext, myapp.done(), Toast.LENGTH_LONG).show()
    }
}





