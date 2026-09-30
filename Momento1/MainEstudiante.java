public class MainEstudiante {
 
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Alexander Rojas";
        estudiante1.edad = 20;
        estudiante1.documento = "1001234567";
        estudiante1.programa = "Ingeniería de Sistemas";
 
        Estudiante estudiante2 = new Estudiante();
        estudiante2.nombre = "Laura Martínez";
        estudiante2.edad = 22;
        estudiante2.documento = "1009876543";
        estudiante2.programa = "Administración de Empresas";
 
        System.out.println("= Datos =");
        System.out.println("Estudiante 1: " + estudiante1.nombre + " | " + estudiante1.edad
                + " años | Doc: " + estudiante1.documento + " | " + estudiante1.programa);
        System.out.println("Estudiante 2: " + estudiante2.nombre + " | " + estudiante2.edad
                + " años | Doc: " + estudiante2.documento + " | " + estudiante2.programa);
 
        // Se modifica el estudiante 1
        estudiante1.edad = 21;
        estudiante1.programa = "Ingeniería Industrial";
 
        System.out.println();
        System.out.println("= Después de modificar  el estudiante 1 =");
        System.out.println("Estudiante 1: " + estudiante1.nombre + " | " + estudiante1.edad
                + " años | Doc: " + estudiante1.documento + " | " + estudiante1.programa);
        System.out.println("Estudiante 2: " + estudiante2.nombre + " | " + estudiante2.edad
                + " años | Doc: " + estudiante2.documento + " | " + estudiante2.programa);
    }
}

