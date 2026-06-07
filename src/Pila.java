public class Pila {

    private Nodo tope;
    @SuppressWarnings("unused")
    private int cantidad;

    public Pila() {
        tope = null;
        cantidad = 0;
    }

    public boolean isEmpty() {
        return tope == null;
    }

    public void push(Pizza pizza) {
        Nodo nuevo = new Nodo(pizza);
        nuevo.siguiente = tope;
        tope = nuevo;
        cantidad++;
    }

    public Pizza pop() {
        if (isEmpty()) {
            return null;
        }

        Pizza eliminado = tope.dato;
        tope = tope.siguiente;
        cantidad--;

        return eliminado;
    }

    public Pizza peek() {
        if (isEmpty()) {
            return null;
        }

        return tope.dato;
    }

    public void mostrar() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return;
        }

        Nodo actual = tope;
        int posicion = 1;

        while (actual != null) {
            System.out.println(posicion + ". " + actual.dato);
            actual = actual.siguiente;
            posicion++;
        }
    }

    public void limpiar() {
        tope = null;
        cantidad = 0;
    }
}
