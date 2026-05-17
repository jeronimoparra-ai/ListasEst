public class GestionPedidos {

    private Pila principal;
    private Pila redo;

    public GestionPedidos() {
        principal = new Pila();
        redo = new Pila();
    }

    public void registrarPizza(Pizza pizza) {
        principal.push(pizza);
        redo.limpiar();
        System.out.println("Pizza registrada correctamente.");
    }

    public void deshacer() {
        if (principal.isEmpty()) {
            System.out.println("No hay pedidos para deshacer.");
            return;
        }

        Pizza eliminada = principal.pop();
        redo.push(eliminada);

        System.out.println("Pedido deshecho: " + eliminada.nombre);
    }

    public void rehacer() {
        if (redo.isEmpty()) {
            System.out.println("No hay pedidos para rehacer.");
            return;
        }

        Pizza recuperada = redo.pop();
        principal.push(recuperada);

        System.out.println("Pedido restaurado: " + recuperada.nombre);
    }

    public void mostrarActual() {
        System.out.println("\n===== PILA PRINCIPAL =====");
        principal.mostrar();
    }

    public void mostrarUltimaPizza() {
        Pizza cima = principal.peek();

        if (cima == null) {
            System.out.println("No hay pizzas registradas.");
        } else {
            System.out.println(cima);
        }
    }
}
