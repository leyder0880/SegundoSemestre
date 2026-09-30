class Main {
 
    public static void main(String[] args) {
        Producto producto1 = new Producto();
        producto1.codigo = "P001";
        producto1.nombre = "Portátil";
        producto1.precio = 1200000;
        producto1.cantidad = 4;
 
        Producto producto2 = new Producto();
        producto2.codigo = "P003";
        producto2.nombre = "Monitor Oled";
        producto2.precio = 620000;
        producto2.cantidad = 0;
 
        System.out.println("--- " + producto1.nombre + " ---");
        System.out.println("Total: " + producto1.calcularTotal());
        System.out.println("¿Tiene Inventario? " + producto1.tieneInventario());
        producto1.aplicarDescuento(10);
        System.out.println("Precio con 10% de descuento: " + producto1.precio);
        System.out.println("Nuevo total: " + producto1.calcularTotal());
 
        System.out.println("--- " + producto2.nombre + " ---");
        System.out.println("Total: " + producto2.calcularTotal());
        System.out.println("¿Tiene Inventario? " + producto2.tieneInventario());
        producto2.aplicarDescuento(150);

        // descuento inválido
        producto2.aplicarDescuento(-5);

        // descuento inválido
        System.out.println("Precio sin cambios: " + producto2.precio);
        producto2.aplicarDescuento(100);

        // límite: precio queda en 0, nunca negativo
        System.out.println("Precio con 100% de descuento: " + producto2.precio);
    }
}

class Producto {
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

    public boolean tieneIventario() {
        return tieneInventario();
    }

    public void aplicarDescuento(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) {
            return;
        }

        double descuento = precio * porcentaje / 100;
        precio = Math.max(0, precio - descuento);
    }
}

    

