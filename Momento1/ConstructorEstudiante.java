public class ConstructorEstudiante {
 
    String nombre;
    int edad;
    String documento;
    String programa;
 
    public ConstructorEstudiante(String nombre, int edad, String documento, String programa) {
        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
        this.programa = programa;
    }
 
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad
                + " | Documento: " + documento + " | Programa: " + programa);
    }
}

