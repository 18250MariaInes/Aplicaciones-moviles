package com.example.maria.laboratorio2

import android.app.Application

class MyApplication : Application() ,MenuOrder{
    override var menuOrder: ArrayList<String> = arrayListOf()
    override fun clear() {
        menuOrder.clear()
  }

    override fun add(element: String) {
        menuOrder.add(element)
    }

    override fun del(elementIndex: Int) {
        menuOrder.removeAt(elementIndex) }

    override fun done(): String {
        menuOrder.clear()
        return "Su pedido se ha realizado exitosamente, espere recibirlo en poco tiempo"
    }


}
