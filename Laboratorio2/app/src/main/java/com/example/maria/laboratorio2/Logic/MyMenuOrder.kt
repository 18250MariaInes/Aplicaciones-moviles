package com.example.maria.laboratorio2

import android.widget.Toast

class MyMenuOrder (
    override var menuOrder: ArrayList<String>
):MenuOrder
{
    override fun clear(){
        menuOrder.clear();
    } // Limpiar pedido
    override fun add(element: String) {
        menuOrder.add(element);
    }// Agregar elemento
    override fun del(elementIndex: Int){
        menuOrder.removeAt(elementIndex);
    } // Elimina elemento
    override fun done(): String {
        return "Hola"
    }// Realiza pedido
}