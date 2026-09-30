public public class ConstructorProducto {
 
    String codigo;
    String nombre;
    double precio;
    int cantidad;
 
    public Producto(String codigo, String nombre, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
 
    public double calcularTotal() {
        return precio * cantidad;
    }
 
    public void mostrarDatos() {
        System.out.println(codigo + " | " + nombre + " | Precio: " + precio
                + " | Cantidad: " + cantidad + " | Total: " + calcularTotal());
    }

    
}
