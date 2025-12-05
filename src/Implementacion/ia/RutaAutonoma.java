package Implementacion.ia;

import java.util.LinkedList;

public class RutaAutonoma {

    public static void main(String[] args) {

        LinkedList<String> rutaActual = new LinkedList<>();

        System.out.println("Generando ruta autónoma...");

        rutaActual.add("Punto A");
        rutaActual.add("Punto B");
        rutaActual.add("Punto C");

        System.out.println("Ruta generada: " + rutaActual);

        System.out.println("Siguiente destino: " + rutaActual.peek());

        // Avanzar al siguiente punto
        String puntoActual = rutaActual.poll();
        System.out.println("Avanzando desde: " + puntoActual);

        System.out.println("Ruta restante: " + rutaActual);

        rutaActual.addFirst("Punto de Desvío");
        System.out.println("Ruta con desvío: " + rutaActual);
    }
}
