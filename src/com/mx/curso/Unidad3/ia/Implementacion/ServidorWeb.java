package com.mx.curso.Unidad3.ia.Implementacion;

import java.util.LinkedList;
import java.util.Queue;

public class ServidorWeb {
    public static void main(String[] args) {

        //Crear una instancia de Queue
        Queue<String> colaUsuarios = new LinkedList<>();

        //AAgregamos nuestroa usuarios
        colaUsuarios.offer("Alice");
        colaUsuarios.offer("Bob");
        colaUsuarios.offer("Charlie");
        colaUsuarios.offer("David");
        colaUsuarios.offer("Eve");

        System.out.println("Cola despues de agregar usuarios" + colaUsuarios);

        while(!colaUsuarios.isEmpty()){
            String usuario = colaUsuarios.poll();
            System.out.println("Atendiendo:" + usuario);
        }
        System.out.println("Cola despues de atender a los usuarios:" +
                " " + colaUsuarios);


    }
}
