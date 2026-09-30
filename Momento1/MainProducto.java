public public class Main {
 
    public static void main(String[] args) {
        Producto producto1 = new Producto();
        producto1.codigo = "P001";
        producto1.nombre = "Portátil";
        producto1.precio = 1200000;
        producto1.cantidad = 4;
 
        Producto producto2 = new Producto();
        producto2.codigo = "P002";
        producto2.nombre = "Mouse";
        producto2.precio = 45000;
        producto2.cantidad = 30;
 
        Producto producto3 = new Producto();
        producto3.codigo = "P003";
        producto3.nombre = "Monitor oled";
        producto3.precio = 620000;
        producto3.cantidad = 0; 
        
        // cantidad en cero
 
        System.out.println("= Valor del inventario por producto =");
        System.out.println(producto1.nombre + ": " + (producto1.precio * producto1.cantidad));
        System.out.println(producto2.nombre + ": " + (producto2.precio * producto2.cantidad));
        System.out.println(producto3.nombre + ": " + (producto3.precio * producto3.cantidad));
    }
 
}
 
    

