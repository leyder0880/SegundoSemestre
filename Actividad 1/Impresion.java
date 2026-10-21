public class Impresion extends Producto {
    private String color;
    private Foto[] foto;

    public Impresion(int numero, String color, Foto[] foto) {
        setNumero(numero);
        this.color = color;
        this.foto = foto;
    }

    public String getColor() {
        return color;
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
        return "Impresion{numero=" + getNumero() + ", color='" + color + "', foto=" +toString(foto) + "}";
    }
}

