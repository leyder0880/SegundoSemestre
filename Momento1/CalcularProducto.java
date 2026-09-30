public public class CalcularProducto {
 
    String codigo;
    String nombre;
    double precio;
    int cantidad;
 
    public double calcularTotal() {
        return precio * cantidad;
    }
 
    public boolean tieneInventario() {
        return cantidad > 0;
    }
 
    public void aplicarDescuento(double porcentaje) {

        // Reto adicional: el precio nunca puede quedar negativo

        if (porcentaje < 0 || porcentaje > 100) {
            System.out.println("Descuento inválido (" + porcentaje + "%). El precio no cambia.");
        } else {
            precio = precio - (precio * porcentaje / 100);
        }
    }
}
 
    

