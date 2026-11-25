public class BotonAscensor {

    private final int pisoDestino;
    private boolean iluminado;

    public BotonAscensor(int pisoDestino) {
        this.pisoDestino = pisoDestino;
    }

    public int getPisoDestino() {
        return pisoDestino;
    }

    public boolean isIluminado() {
        return iluminado;
    }

    public void presionar() {
        iluminado = true;
    }

    public void apagarIndicador() {
        iluminado = false;
    }
}
