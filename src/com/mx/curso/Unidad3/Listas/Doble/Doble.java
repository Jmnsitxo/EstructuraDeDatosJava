package com.mx.curso.Unidad3.Listas.Doble;


class ListaDoble {

    Nodo cabeza; // referencia al primer nodo
    Nodo cola; // referencia al ultimo nodo

    public ListaDoble() {
        this.cabeza = null;
        this.cola = null;
    }

    // Construir un mmetodo para agregar un nodo al final de la lista
    public void agregar(int dato) {

        Nodo nuevoNodo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            return;
        }

        cola.siguiente = nuevoNodo;
        nuevoNodo.anterior = cola;
        cola = nuevoNodo;
    }

    public void imprimirHaciaAdelante() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.dato + "<->");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    public void imprimirHaciaAtras() {
        Nodo actual = cola;
        while (actual != null) {
            System.out.println(actual.dato + "<->");
            actual = actual.anterior;
        }
        System.out.println("null");
    }


}

