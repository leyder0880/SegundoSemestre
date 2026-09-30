public public class Estudiante {
 
    private String nombre;
    private String documento;
    private int edad;
    private String programa;
 
    public Estudiante(String nombre, String documento, int edad, String programa) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.programa = programa;
    }
 
    // Dentro de la propia clase se puede acceder a los atributos privados

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " | Documento: " + documento
                + " | Edad: " + edad + " | Programa: " + programa);
    }
 
    // getters y setters {
    }

    

