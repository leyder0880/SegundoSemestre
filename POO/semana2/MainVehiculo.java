public class MainVehiculo {
    public static void main(String[] args) {

        //Creación del objeto de la clase Vehiculo
        Vehiculo objVehiculo1 = new Vehiculo();
        Vehiculo objVehiculo2 = new Vehiculo();

        objVehiculo1.setModelo("Corolla");
        objVehiculo1.setMarca("Toyota");
        objVehiculo1.setAnio(2022);
        objVehiculo1.setCategoria("Sedan");
        objVehiculo1.setColor("Blanco");
        objVehiculo1.setPeso(1300.5);

        objVehiculo2.setModelo("CBR600");
        objVehiculo2.setMarca("Honda");
        objVehiculo2.setAnio(2020);
        objVehiculo2.setCategoria("Motocicleta");
        objVehiculo2.setColor("Rojo");
        objVehiculo2.setPeso(195.0);

        //Mostrar la información del objeto 1 (objVehiculo1)
        System.out.println(objVehiculo1.getModelo());
        System.out.println(objVehiculo1.getMarca());
        System.out.println(objVehiculo1.getAnio());
        System.out.println(objVehiculo1.getCategoria());
        System.out.println(objVehiculo1.getColor());
        System.out.println(objVehiculo1.getPeso());

        //Mostrar la información del objeto 2 (objVehiculo2)
        System.out.println(objVehiculo2.getModelo());
        System.out.println(objVehiculo2.getMarca());
        System.out.println(objVehiculo2.getAnio());
        System.out.println(objVehiculo2.getCategoria());
        System.out.println(objVehiculo2.getColor());
        System.out.println(objVehiculo2.getPeso());
    }
}


