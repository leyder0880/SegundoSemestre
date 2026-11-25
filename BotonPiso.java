
    public class BotonPiso extends Boton {

    private int numeroPiso;
    private DireccionAscensor sentido;

    public BotonPiso(int numeroPiso, DireccionAscensor sentido) {
        super();
        this.numeroPiso = numeroPiso;
        this.sentido = sentido;
    }

    @Override
    public void presionar() {
        encenderIndicador();
        if (sentido == DireccionAscensor.ARRIBA) {
            System.out.println("   Boton de SUBIR presionado en el piso " + numeroPiso);
        } else {
            System.out.println("   Boton de BAJAR presionado en el piso " + numeroPiso);
        }
    }
}
    

