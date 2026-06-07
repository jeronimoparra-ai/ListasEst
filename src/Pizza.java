public class Pizza {
    String nombre;
    String[] ingredientes;

    public Pizza(String nombre, String[] ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public String mostrarIngredientes() {
        String texto = "";
        for (int i = 0; i < ingredientes.length; i++) {
            texto += ingredientes[i];
            if (i < ingredientes.length - 1) {
                texto += ", ";
            }
        }
        return texto;
    }

    @Override
    public String toString() {
        return "Pizza: " + nombre + " | Ingredientes: " + mostrarIngredientes();
    }
}
