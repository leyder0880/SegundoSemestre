import java.util.*;

public class Impresion extends Producto{
    private int numero;
    private String color;
    private Foto[] foto;

    public Impresion(int numero, String color, Foto[] foto) {
        super(numero);
        this.color = color;
        this.foto = foto;
    }

    public String getColor() {
        return color;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Foto[] getFoto() {
        return foto;
    }

    public void setFoto(Foto[] foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Impresion{numero=" + getNumero() + ", color='" + color + "', foto=" + Arrays.toString(foto) + "}";
    }
}

