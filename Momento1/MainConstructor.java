public class Main {
 
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Alexander Rojas", 20, "1001234567", "Ingeniería de Sistemas");
        Estudiante estudiante2 = new Estudiante("Laura Martínez", 22, "1009876543", "Administración de Empresas");
 
        estudiante1.mostrarDatos();
        estudiante2.mostrarDatos();
    }
}

