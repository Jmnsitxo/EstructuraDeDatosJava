package com.mx.curso.Unidad3.ia;

import java.util.LinkedList;
import java.util.ListIterator;

public class HistorialTransacciones {

    public static void main(String[] args) {

        LinkedList<String> historial = new LinkedList<>();

        System.out.println("Iniciamos el historial de transacciones");

        ListIterator<String> iterador = historial.listIterator();

        // Agregar acciones
        iterador.add("Accion 1: Crear Documento");
        iterador.add("Accion 2: Escribir Titulo");
        iterador.add("Accion 3: Insertar Imagen");

        System.out.println("Historial Completo: " + historial);

        System.out.println("Estado actual (Acción más reciente): " + historial.getLast());

        // UNDO (con previous)
        if (iterador.hasPrevious()) {
            String accionDes = iterador.previous();
            System.out.println("UNDO: " + accionDes);
        }

        if (iterador.hasPrevious()) {
            String accionDes = iterador.previous();
            System.out.println("UNDO: " + accionDes);
        }

        // Mostrar acción actual tras los UNDO
        System.out.println("Estado actual: " + iterador.next());

        // REDO (con next)
        if (iterador.hasNext()) {
            String accionRes = iterador.next();
            System.out.println("REDO: " + accionRes);
        }

        System.out.println("Estado actual final: " + historial.get(iterador.previousIndex()));
    }
}
