package com.mx.curso.Unidad3.Listas.Doble;

import Unidad3.ia.Implementacion.Pilas.Lista.simple.ListaDoble;

public class EjemploListaDoble {

    public static void main(String[] args) {

        ListaDoble lista = new ListaDoble();
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.agregar(4);

        System.out.println("Recorremos hacia adelante");
        lista.imprimirHaciaAdelante();

        System.out.println("Recorremos hacia atras");
        lista.imprimirHaciaAtras();
    }
}
