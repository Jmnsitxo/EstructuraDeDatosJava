package Lista.simple;

import Lista.ListaEnlazada;

public class TestLista {

    public static void main(String[] args) {

        ListaEnlazada lista = new ListaEnlazada();

        System.out.println("Insertar nuevos datos");
        lista.insertarAlInicio(10);
        lista.insertarAlInicio(20);
        lista.insertarAlFinal(30);

        System.out.println("\nImprimir lista:");
        lista.imprimirLista();
    }
}
