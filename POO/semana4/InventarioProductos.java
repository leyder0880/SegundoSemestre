public class InventarioProductos {
    static class Producto {
        int id;
        String nombre;
        double precio;
        int cantidad;

        public void mostrarInformacion() {
            System.out.println("ID: " + id);
            System.out.println("Nombre: " + nombre);
            System.out.println("Precio: " + precio);
            System.out.println("Cantidad: " + cantidad);
        }
    }

    public static void main(String[] args) {
        // Creación del objeto de la clase Producto
        Producto producto1 = new Producto();
        Producto producto2 = new Producto();

        producto1.id = 101;
        producto1.nombre = "Laptop";
        producto1.precio = 1200.50;
        producto1.cantidad = 10;

        producto2.id = 102;
        producto2.nombre = "Smartphone";
        producto2.precio = 800.00;
        producto2.cantidad = 20;

        System.out.println("Información del Producto 1:");
        producto1.mostrarInformacion();

        System.out.println("Información del Producto 2:");
        producto2.mostrarInformacion();
    }
}


