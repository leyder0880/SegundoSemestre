package POO.semana5;

public class libro {
    

//Atributos
private String isbn;
private String titulo;
private String autor;
private int anioPublicacion;
private boolean disponible;

//Constructor
public libro(String titulo, String autor, int anioPublicacion, String isbn, boolean disponible) {
    this.isbn = isbn;
    this.titulo = titulo;
    this.autor = autor;
    this.anioPublicacion = anioPublicacion;
    this.disponible = disponible;
}
// getter y setter
public String getIsbn() {
    return isbn;
}

public void setIsbn(String isbn) {
    this.isbn = isbn;
}

public String getTitulo() {
    return titulo;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public String getAutor() {
    return autor;
}

public void setAutor(String autor) {
    this.autor = autor;
}

public int getAnioPublicacion() {
    return anioPublicacion;
}

public void setAnioPublicacion(int anioPublicacion) {
    this.anioPublicacion = anioPublicacion;
}

public boolean getDisponible() {
    return disponible;
}

public void setDisponible(boolean disponible) {
    this.disponible = disponible;
}
public void prestar() {
     disponible = false;
}
     public void devolver() {
        disponible = true;
    }
    public boolean estaDisponible() {
        return disponible;
    }

    public String toString() {
        return "libro{ isbn:" + isbn + " titulo " + titulo + " autor " + autor +
         " anioPublicacion " + anioPublicacion + " disponible " + disponible + " }";
         
                
    }

}
