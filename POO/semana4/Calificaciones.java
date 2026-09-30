public class Calificaciones {
    // atributos
    private String nombre;
    private String codigo;
    private String curso;
    private double nota1;
    private double nota2;
    private double nota3;

    // constructor
    public Calificaciones(String nombre, String codigo, String curso, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.curso = curso;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    public String toString() {
        return "Calificaciones [ nombre:" + nombre + " codigo: " + codigo + " curso: " + curso +
                " nota1: " + nota1 + " nota2: " + nota2 + " nota3: " + nota3 + "]";
    }
    //creacion de metodos 
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Curso: " + curso);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
    }
    public void calcularPromedio() {
        double promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("Promedio: " + promedio);
    }

}
