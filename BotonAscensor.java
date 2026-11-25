 public class BotonAscensor extends Boton {

    private int pisoDestino;

    public BotonAscensor(int pisoDestino) {
        super();
        this.pisoDestino = pisoDestino;
    }

    @Override
    public void presionar() {
        encenderIndicador();
        System.out.print("   Boton del piso " + pisoDestino + " presionado dentro del ascensor");
        if (sonidoActivo) {
            System.out.print(" *beep*");
        }
        System.out.println();
    }
}
