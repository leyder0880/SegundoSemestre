package POO.semana5;

public class Main {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Alexander Rojas", "1001234567", 20, "Ingeniería de Sistemas");
        Estudiante estudiante2 = new Estudiante("Laura Martínez", "1009876543", 22, "Administración de Empresas");
        Estudiante estudiante3 = new Estudiante("Carlos Gómez", "1005551234", 19, "Contaduría Pública");

        System.out.println("==  toString() ( objetos) ==");
        System.out.println(estudiante1);
        System.out.println(estudiante2);
        System.out.println(estudiante3);
        System.out.println();
        System.out.println("== atributos por separado ==");
        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Documento: " + estudiante1.getDocumento());
        System.out.println("Edad: " + estudiante1.getEdad());
        System.out.println("Programa: " + estudiante1.getPrograma());
    }
}
