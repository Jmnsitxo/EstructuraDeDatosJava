package Lista;

public class listaEnlazada {

    Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;

    }

    public void insertarAlInicio (int nuevoDato){

        Nodo nuevoNodo = new Nodo(nuevoDato);
        nuevoNodo.siguiente = cabeza;

        cabeza = nuevoNNodo;
        System.out.println("insertado al inicio" + nuevoDato);
    }

    public void insertarAlFinal (int nuevoDato) {
        Nodo nuevoNodo = new Nodo(nuevoDato);

        //si la lista esta vacia, el nuevo nodo es la cabeza
        if (cabeza == null) {
            cabeza = nuevoNodo;
            System.out.println("Insertado al final de la lista(lista vacia)" + nuevoDato);
            return;
        }

        //si la lista no esta vacia, recorrer hasta el ultimo nodo
        nodo actual = cabeza;
        while( actual.siguiente !=null){
            actual = actual.siguiente;
        }
        //el ultimo nodo apunta al nuevo nodo
        actual.siguiente =nuevoNodo;
        System.out.println("insertado al final" + nuevoDato);

    }
    public void imprimirLista(){
        Nddo actual = cabeza;
        System.out.println("Lista simple");

        while (actual !=null){
            system.out.println(actual.dato + " -> ");
            actual = actual.siguiente;
        }

        system.out.println("null");
    }
}
