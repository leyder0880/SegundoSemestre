public public class EstudianteEstudiando{
 
    String nombre;
    int edad;
    String documento;
    String programa;
 
    public void estudiar() {
        System.out.println(nombre + " está estudiando.");
    }
 
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Documento: " + documento);
        System.out.println("Programa: " + programa);
    }
 
    public void saludar(String mensaje) {
        System.out.println(nombre + " dice: " + mensaje);
    }
}
 {
    
}
