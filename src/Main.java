import java.util.Scanner;

/**
 * Clase Main.
 * Interfaz de consola con menú interactivo.
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArbolInventario inventario = new ArbolInventario();
        int opcion;

        do {
            System.out.println("\n===== TREE-STOCK =====");
            System.out.println("1. Registrar producto");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Buscar producto");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = leerEntero(teclado);

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ID del producto: ");
                    int id = leerEntero(teclado);

                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = teclado.nextLine();

                    inventario.insertar(id, nombre);
                    System.out.println("Producto registrado correctamente.");
                    break;

                case 2:
                    inventario.mostrarInventario();
                    break;

                case 3:
                    System.out.print("Ingrese el ID a buscar: ");
                    int idBuscar = leerEntero(teclado);

                    Producto encontrado = inventario.buscar(idBuscar);

                    if (encontrado != null) {
                        System.out.println("Producto encontrado: " + encontrado);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        teclado.close();
    }

    private static int leerEntero(Scanner teclado) {
        while (!teclado.hasNextInt()) {
            System.out.print("Ingrese un valor entero válido: ");
            teclado.next();
        }
        int valor = teclado.nextInt();
        teclado.nextLine();
        return valor;
    }
}
