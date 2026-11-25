 public abstract class Boton {

    protected boolean iluminado;
    protected boolean sonidoActivo;

    public Boton() {
        this.iluminado = false;
        this.sonidoActivo = true;
    }

    public abstract void presionar();

    public void encenderIndicador() {
        iluminado = true;
    }

    public void apagarIndicador() {
        iluminado = false;
}
}   
    

