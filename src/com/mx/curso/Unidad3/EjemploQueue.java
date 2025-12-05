package com.mx.curso.Unidad3;

import java.util.LinkedList;
import java.util.Queue;


public class EjemploQueue {

    public static void main(String[] args) {
        //Crear una instancia de la clase Queue
        Queue<String> cola = new LinkedList<>();
        cola.add("Elemento 1");
        cola.add("Elemento 2");
        cola.add("Elemento 3");

        System.out.println("Contenido de la cola" + cola);
        System.out.println("Primer elemento" + cola );

    }
}
