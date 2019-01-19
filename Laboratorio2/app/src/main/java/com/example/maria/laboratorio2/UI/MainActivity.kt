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

    fun abrirmenu(view: View) {
        val intent = Intent(this, MenuOrderActivity::class.java)
       // val editText = findViewById<View>(R.id.buttonPanel) as EditText
      //  val message = editText.text.toString()
        //intent.putExtra(EXTRA_MESSAGE, message)
        startActivity(intent)
    }

    fun abrirpedido (view: View){
        val intent = Intent(this, PedidoActivity::class.java)
        // val editText = findViewById<View>(R.id.buttonPanel) as EditText
        //  val message = editText.text.toString()
        //intent.putExtra(EXTRA_MESSAGE, message)
        startActivity(intent)
    }

}
