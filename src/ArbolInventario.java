/**
 * Clase ArbolInventario.
 * Contiene la lógica del árbol binario de búsqueda:
 * - insertar de forma recursiva
 * - buscar por ID
 * - recorrido inorden para mostrar ordenado
 */
public class ArbolInventario {

    private Producto raiz;

    public ArbolInventario() {
        raiz = null;
    }

    public void insertar(int id, String nombre) {
        raiz = insertarRecursivo(raiz, id, nombre);
    }

    private Producto insertarRecursivo(Producto nodoActual, int id, String nombre) {
        if (nodoActual == null) {
            return new Producto(id, nombre);
        }

        if (id < nodoActual.id) {
            nodoActual.izquierdo = insertarRecursivo(nodoActual.izquierdo, id, nombre);
        } else if (id > nodoActual.id) {
            nodoActual.derecho = insertarRecursivo(nodoActual.derecho, id, nombre);
        } else {
            System.out.println("El ID " + id + " ya existe. No se insertó el producto.");
        }

        return nodoActual;
    }

    public void mostrarInventario() {
        if (raiz == null) {
            System.out.println("El inventario está vacío.");
            return;
        }

        System.out.println("\n--- INVENTARIO ORDENADO (INORDEN) ---");
        inorden(raiz);
    }

    private void inorden(Producto nodoActual) {
        if (nodoActual != null) {
            inorden(nodoActual.izquierdo);
            System.out.println(nodoActual);
            inorden(nodoActual.derecho);
        }
    }

    public Producto buscar(int id) {
        return buscarRecursivo(raiz, id);
    }

    private Producto buscarRecursivo(Producto nodoActual, int id) {
        if (nodoActual == null) {
            return null;
        }

        if (id == nodoActual.id) {
            return nodoActual;
        }

        if (id < nodoActual.id) {
            return buscarRecursivo(nodoActual.izquierdo, id);
        } else {
            return buscarRecursivo(nodoActual.derecho, id);
        }
    }
}
