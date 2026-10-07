package POO.semana5;

public class MainEstudiantes {

    public static void main(String[] args) {
        Estudiante estudiante1 = crearEstudiante("Alexander Rojas", "1001234567", 20,
                "alexander@ucc.edu.co", "Ingeniería de Sistemas", 4);
        Estudiante estudiante2 = crearEstudiante("Laura Martínez", "1009876543", 22,
                "laura@ucc.edu.co", "Administración de Empresas", 6);
        Estudiante estudiante3 = crearEstudiante("Carlos Gómez", "1005551234", 17,
                "carlos@ucc.edu.co", "Contaduría Pública", 1);
        Estudiante estudiante4 = crearEstudiante("Sofía Herrera", "1003332211", 25,
                "sofia@ucc.edu.co", "Derecho", 10);
        Estudiante estudiante5 = crearEstudiante("Daniel Ortiz", "1007778899", 19,
                "daniel@ucc.edu.co", "Psicología", 0);

        System.out.println("= Estado inicial =");
        System.out.println(estudiante1);
        System.out.println(estudiante2);
        System.out.println(estudiante3);
        System.out.println(estudiante4);
        System.out.println(estudiante5);

        System.out.println();
        System.out.println("=Comportamientos =");
        estudiante1.estudiar();
        estudiante1.avanzarSemestre();
        estudiante4.avanzarSemestre(); // ya está en el semestre 10
        estudiante5.avanzarSemestre(); // pasa de 0 a 1

        System.out.println();
        System.out.println("=== Modificaciones setters (válidas e inválidas) ===");
        estudiante2.setPrograma("Economía");
        estudiante2.setCorreo("laura.martinez@ucc.edu.co");
        estudiante3.setEdad(18);
        estudiante3.setEdad(-5);          // inválida
        estudiante3.setSemestre(15);      // inválida
        estudiante3.setCorreo("sin-arroba"); // inválida
        estudiante4.setNombre("");        // inválida

        System.out.println();
        System.out.println("= Reto adicional =");
        System.out.println(estudiante3.getNombre() + " es mayor de edad: " + estudiante3.esMayorDeEdad());
        System.out.println(estudiante5.getNombre() + " es estudiante activo: " + estudiante5.esEstudianteActivo());

        System.out.println();
        System.out.println("= Estado final =");
        System.out.println(estudiante1);
        System.out.println(estudiante2);
        System.out.println(estudiante3);
        System.out.println(estudiante4);
        System.out.println(estudiante5);
    }

    private static Estudiante crearEstudiante(String nombre, String cedula, int edad,
            String correo, String programa, int semestre) {
        return new Estudiante(nombre, cedula, edad, correo, programa, semestre);
    }

    private static class Estudiante {
        private String nombre;
        private String cedula;
        private int edad;
        private String correo;
        private String programa;
        private int semestre;

        private Estudiante(String nombre, String cedula, int edad, String correo,
                String programa, int semestre) {
            this.nombre = nombre;
            this.cedula = cedula;
            this.edad = edad;
            this.correo = correo;
            this.programa = programa;
            this.semestre = semestre;
        }

        private void estudiar() {
            System.out.println(nombre + " está estudiando.");
        }

        private void avanzarSemestre() {
            if (semestre < 10) {
                semestre++;
                System.out.println(nombre + " pasó al semestre " + semestre + ".");
            } else {
                System.out.println(nombre + " ya está en el semestre 10.");
            }
        }

        private void setPrograma(String programa) {
            this.programa = programa;
            System.out.println("Programa actualizado: " + programa);
        }

        private void setCorreo(String correo) {
            if (correo.contains("@")) {
                this.correo = correo;
                System.out.println("Correo actualizado: " + correo);
            } else {
                System.out.println("Correo inválido: " + correo);
            }
        }

        private void setEdad(int edad) {
            if (edad >= 0) {
                this.edad = edad;
                System.out.println("Edad actualizada: " + edad);
            } else {
                System.out.println("Edad inválida: " + edad);
            }
        }

        private void setSemestre(int semestre) {
            if (semestre >= 0 && semestre <= 10) {
                this.semestre = semestre;
                System.out.println("Semestre actualizado: " + semestre);
            } else {
                System.out.println("Semestre inválido: " + semestre);
            }
        }

        private void setNombre(String nombre) {
            if (nombre != null && !nombre.isEmpty()) {
                this.nombre = nombre;
                System.out.println("Nombre actualizado: " + nombre);
            } else {
                System.out.println("Nombre inválido.");
            }
        }

        private String getNombre() {
            return nombre;
        }

        private boolean esMayorDeEdad() {
            return edad >= 18;
        }

        private boolean esEstudianteActivo() {
            return semestre > 0;
        }

        @Override
        public String toString() {
            return "Estudiante{" +
                    "nombre='" + nombre + '\'' +
                    ", cedula='" + cedula + '\'' +
                    ", edad=" + edad +
                    ", correo='" + correo + '\'' +
                    ", programa='" + programa + '\'' +
                    ", semestre=" + semestre +
                    '}';
        }
    }
}
