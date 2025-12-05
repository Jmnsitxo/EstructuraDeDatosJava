package Pilas;

import java.util.ArrayDeque;

public class EjemploStack {

    public static void main(String[] args) {

        ArrayDeque<String> pila = new ArrayDeque<>();

        // PUSH (apilar elementos)
        pila.push("A");
        pila.push("B");
        pila.push("C");

        System.out.println("Contenido de la pila: " + pila);

        // POP (desapilar)
        String eliminado = pila.pop();
        System.out.println("Elemento eliminado con pop(): " + eliminado);

        // PEEK (ver el tope sin eliminar)
        String tope = pila.peek();
        System.out.println("Elemento en el tope con peek(): " + tope);

        System.out.println("Contenido actual de la pila: " + pila);
    }
}

