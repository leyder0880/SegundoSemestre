public class CompraVentaVehiculos {
    public class Vehiculo {
        String marca;
        String modelo;
        int año;
        double precio;

        public void mostrarInformacion() {
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Año: " + año);
            System.out.println("Precio: " + precio);
        }
    }
}