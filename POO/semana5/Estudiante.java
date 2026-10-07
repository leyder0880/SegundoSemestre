public class Estudiante {

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

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public int getEdad() {
        return edad;
    }

    public String getPrograma() {
        return programa;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
            "nombre='" + nombre + '\'' +
            ", documento='" + documento + '\'' +
            ", edad=" + edad +
            ", programa='" + programa + '\'' +
            '}';
    }
}
