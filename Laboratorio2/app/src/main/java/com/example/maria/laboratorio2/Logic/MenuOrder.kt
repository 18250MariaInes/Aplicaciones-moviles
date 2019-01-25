package com.example.maria.laboratorio2
//INTERFAZ PREDETERMINADA

interface MenuOrder {
    var menuOrder: ArrayList<String> // Pedido

    fun clear() // Limpiar pedido
    fun add(element: String) // Agregar elemento
    fun del(elementIndex: Int) // Elimina elemento
    fun done(): String // Realiza pedido
}