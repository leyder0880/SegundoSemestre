package POO.semana5;

public class MainProducto {
    public static void main(String[] args) {
        Producto producto1 = new Producto("P001", "Portátil", 1200000, 4);
        Producto producto2 = new Producto("P002", "Mouse ", 45000, 30);
        Producto producto3 = new Producto("P003", "Monitor oled ", 620000, 6);
 
        System.out.println(producto1);
        System.out.println("Valor del inventario: " + producto1.calcularValorInventario());
        System.out.println();
        System.out.println(producto2);
        System.out.println("Valor del inventario: " + producto2.calcularValorInventario());
        System.out.println();
        System.out.println(producto3);
        System.out.println("Valor del inventario: " + producto3.calcularValorInventario());
    }
}


