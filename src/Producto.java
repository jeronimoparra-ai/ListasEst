/**
 * Clase Producto.
 * Representa un nodo del árbol binario de búsqueda.
 * Cada producto guarda un id, un nombre y referencias al hijo izquierdo y derecho.
 */
public class Producto {
    int id;
    String nombre;
    Producto izquierdo;
    Producto derecho;

    public Producto(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.izquierdo = null;
        this.derecho = null;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nombre: " + nombre;
    }
}
