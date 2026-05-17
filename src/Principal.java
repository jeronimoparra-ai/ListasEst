import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        GestionPedidos gestion = new GestionPedidos();

        int opcion;

        do {
            System.out.println("\n====== PIZZATRACK ======");
            System.out.println("1. Registrar pizza");
            System.out.println("2. Deshacer pedido (Undo)");
            System.out.println("3. Rehacer pedido (Redo)");
            System.out.println("4. Ver última pizza");
            System.out.println("5. Mostrar pedidos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Nombre de la pizza: ");
                    String nombre = teclado.nextLine();

                    String[] ingredientes = new String[3];

                    for (int i = 0; i < ingredientes.length; i++) {
                        System.out.print("Ingrediente " + (i + 1) + ": ");
                        ingredientes[i] = teclado.nextLine();
                    }

                    Pizza nueva = new Pizza(nombre, ingredientes);
                    gestion.registrarPizza(nueva);
                    break;

                case 2:
                    gestion.deshacer();
                    break;

                case 3:
                    gestion.rehacer();
                    break;

                case 4:
                    gestion.mostrarUltimaPizza();
                    break;

                case 5:
                    gestion.mostrarActual();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        teclado.close();
    }
}
