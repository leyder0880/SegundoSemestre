public class MainConstructor {
 
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Alexander Rojas", 20, "1001234567", "Ingeniería de Sistemas");
        Estudiante estudiante2 = new Estudiante("Laura Martínez", 22, "1009876543", "Administración de Empresas");
 
        estudiante1.mostrarDatos();
        estudiante2.mostrarDatos();
    }

    private static class Estudiante {
        private final String nombre;
        private final int edad;
        private final String documento;
        private final String carrera;

        Estudiante(String nombre, int edad, String documento, String carrera) {
            this.nombre = nombre;
            this.edad = edad;
            this.documento = documento;
            this.carrera = carrera;
        }

        void mostrarDatos() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Documento: " + documento);
            System.out.println("Carrera: " + carrera);
        }
    }
}

