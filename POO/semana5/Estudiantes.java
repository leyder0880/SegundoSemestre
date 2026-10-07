package POO.semana5;

public class Estudiantes {

    private String nombre;
    private String documento;
    private int edad;
    private String correo;
    private String programa;
    private int semestre; // 0 = aún no matriculado; 1 a 10 = semestre en curso

    public Estudiantes(String nombre, String documento, int edad, String correo, String programa, int semestre) {
        // Valores por si algún dato recibido no es válido
        this.nombre = "Sin nombre";
        this.documento = "Sin documento";
        this.edad = 0;
        this.correo = "Sin correo";
        this.programa = "Sin programa";
        this.semestre = 0;
        setNombre(nombre);
        setDocumento(documento);
        setEdad(edad);
        setCorreo(correo);
        setPrograma(programa);
        setSemestre(semestre);
    }

    // - Getters -
    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPrograma() {
        return programa;
    }

    public int getSemestre() {
        return semestre;
    }

    // -Setters con validaciones -
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: el nombre no puede estar vacío.");
        }
    }

    public void setDocumento(String documento) {
        if (documento != null && !documento.trim().isEmpty()) {
            this.documento = documento;
        } else {
            System.out.println("Error: el documento no puede estar vacío.");
        }
    }

    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        } else {
            System.out.println("Error: la edad debe estar entre 0 y 120 (recibido " + edad + ").");
        }
    }

    public void setCorreo(String correo) {
        if (correo != null && correo.contains("@")) {
            this.correo = correo;
        } else {
            System.out.println("Error: el correo debe contener '@'.");
        }
    }

    public void setPrograma(String programa) {
        if (programa != null && !programa.trim().isEmpty()) {
            this.programa = programa;
        } else {
            System.out.println("Error: el programa no puede estar vacío.");
        }
    }

    public void setSemestre(int semestre) {
        if (semestre >= 0 && semestre <= 10) {
            this.semestre = semestre;
        } else {
            System.out.println("Error: el semestre debe estar entre 0 y 10 (recibido " + semestre + ").");
        }
    }

    // ----- Comportamientos -----
    public void estudiar() {
        System.out.println(nombre + " está estudiando para " + programa + ".");
    }

    public void avanzarSemestre() {
        if (semestre < 10) {
            semestre = semestre + 1;
            System.out.println(nombre + " avanzó al semestre " + semestre + ".");
        } else {
            System.out.println(nombre + " ya está en el último semestre (10); no puede avanzar más.");
        }
    }

    // Reto adicional
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public boolean esEstudianteActivo() {
        return semestre > 0;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
               "nombre='" + nombre + '\'' +
               ", documento='" + documento + '\'' +
               ", edad=" + edad +
               ", correo='" + correo + '\'' +
               ", programa='" + programa + '\'' +
               ", semestre=" + semestre +
               '}';
    }
}
