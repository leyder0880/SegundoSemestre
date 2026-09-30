public class MainCompraVentaVehiculos {
    public static void main(String[] args) {
        CompraVentaVehiculos compraVenta = new CompraVentaVehiculos();
        CompraVentaVehiculos.Vehiculo vehiculo1 = compraVenta.new Vehiculo();
        CompraVentaVehiculos.Vehiculo vehiculo2 = compraVenta.new Vehiculo();

        vehiculo1.marca = "Toyota";
        vehiculo1.modelo = "Corolla";
        vehiculo1.año = 2020;
        vehiculo1.precio = 20000.0;

        vehiculo2.marca = "Ferrari";
        vehiculo2.modelo = "Civic";
        vehiculo2.año = 2019;
        vehiculo2.precio = 18000.0;

        System.out.println("Información del Vehículo 1:");
        vehiculo1.mostrarInformacion();

        System.out.println("Información del Vehículo 2:");
        vehiculo2.mostrarInformacion();
    }
}
