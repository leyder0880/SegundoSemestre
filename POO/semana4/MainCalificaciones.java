public class MainCalificaciones {
    private String nombre;
    private String matricula;
    private String materia;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;

    public MainCalificaciones(String nombre, String matricula, String materia,
                              double calificacion1, double calificacion2, double calificacion3) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.materia = materia;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Matricula: " + matricula);
        System.out.println("Materia: " + materia);
        System.out.println("Calificaciones: " + calificacion1 + ", " + calificacion2 + ", " + calificacion3);
    }

    public void calcularPromedio() {
        double promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
        System.out.println("Promedio: " + promedio);
    }

    public static void main(String[] args) {
        // Crear un objeto de la clase Calificaciones
        MainCalificaciones calificacion = new MainCalificaciones("Juan Perez", "12345", "Matemáticas", 5.0, 3.7, 4.5);

        // Mostrar información del estudiante
        calificacion.mostrarInformacion();

        // Calcular y mostrar el promedio
        calificacion.calcularPromedio();
    }
}
    
