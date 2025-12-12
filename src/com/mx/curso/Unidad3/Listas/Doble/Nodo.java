package com.mx.curso.Unidad3.Listas.Doble;

class Nodo {

    int dato;
    Nodo siguiente;
    Nodo anterior;

    public Nodo(int dato) {
        this.dato = dato;
        this.anterior = null;
        this.siguiente = null;
    }
}
