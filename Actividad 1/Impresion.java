public class Impresion {

    private int numero;
    private String color;
    private Object[] foto;

    public Impresion(int numero, String color, Object[] foto) {

        setNumero(numero);
        this.color = color;
        this.foto = foto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Object[] getFoto() {
        return foto;
    }

    public void setFoto(Object[] foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Impresion{numero=" + getNumero() + ", color='" + color + "', foto=" + java.util.Arrays.toString(foto) + "}";
    }

}
    

