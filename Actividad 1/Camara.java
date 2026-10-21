public class Camara{
    private int numero;
    private String marca;
    private String modelo;

    public Camara(int numero, String marca, String modelo) {
        setNumero(numero);
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Camara{numero=" + getNumero() + ", marca='" + marca + "', modelo='" + modelo + "'}";
    }
}
