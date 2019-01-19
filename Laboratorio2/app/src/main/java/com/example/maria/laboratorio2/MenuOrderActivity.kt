package com.example.maria.laboratorio2
import android.content.Intent
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MenuOrderActivity : AppCompatActivity() {
    var array = arrayOf("Cafe", "Te", "Pie", "Capuchino", "Galleta")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_order)

        val adapter = ArrayAdapter(this,
            R.layout.listview, array)

        val listView: ListView = this.findViewById(R.id.listview_1)
        listView.setAdapter(adapter)
        listView.onItemClickListener = object : AdapterView.OnItemClickListener {

            override fun onItemClick(parent: AdapterView<*>, view: View,
                                     position: Int, id: Long) {

                // value of item that is clicked
                val itemValue = listView.getItemAtPosition(position) as String
                val myapp:MyApplication = applicationContext as MyApplication
                myapp.add(itemValue)
                // Toast the values
                Toast.makeText(applicationContext,
                    "Position :$position\nItem Value : $itemValue", Toast.LENGTH_LONG)
                    .show()
            }
        }
    }

    fun regresarmenu (view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }


}
