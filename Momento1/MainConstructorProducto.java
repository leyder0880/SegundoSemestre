public public class Main {
 
    public static void main(String[] args) {
        Producto producto1 = new Producto("P001", "Portátil", 1200000, 3);
        Producto producto2 = new Producto("P002", "Mouse", 45000, 20);
        Producto producto3 = new Producto("P003", "Monitor oled", 620000, 4);
        Producto producto4 = new Producto("P004", "Teclado mecánico", 180000, 8);
        Producto producto5 = new Producto("P005", "Diadema gamer", 210000, 5);
 
        producto1.mostrarDatos();
        producto2.mostrarDatos();
        producto3.mostrarDatos();
        producto4.mostrarDatos();
        producto5.mostrarDatos();
 
        double totalInventario = producto1.calcularTotal() + producto2.calcularTotal()
                + producto3.calcularTotal() + producto4.calcularTotal()
                + producto5.calcularTotal();
 
        System.out.println();
        System.out.println("Valor total del inventario: " + totalInventario);
    }
    
}
