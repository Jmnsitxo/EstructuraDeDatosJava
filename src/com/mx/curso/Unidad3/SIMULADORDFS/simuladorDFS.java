package com.mx.curso.Unidad3.SIMULADORDFS;

public class simuladorDFS {
    public static void main(String[] args)  {

        PilaListaEnlazada pila = new PilaListaEnlazada();

        pila.push("A");
        System.out.println("Inicio en A");
        pila.mostrar();

        String actual = pila.pop();
        System.out.println("POP y Visitar" + actual);
        pila.mostrar();

        pila.push("B");
        System.out.println("B Vecino de A");
        pila.mostrar();

        pila.push("C");
        System.out.println("C Vecino de a");
        pila.mostrar();

        actual = pila.pop();
        System.out.println("POP y Visitar" + actual);
        pila.mostrar();

        pila.push("D");
        System.out.println("D Vecino de C");
        pila.mostrar();

        actual = pila.pop();
        System.out.println("POP y Visitar");
        pila.mostrar();

        actual = pila.pop()





    }
}
