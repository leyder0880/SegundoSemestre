public class PuertaPiso extends Puerta {

    private int numeroPiso;

    public PuertaPiso(int numeroPiso, SensorPuerta sensor) {
        super(sensor);
        this.numeroPiso = numeroPiso;
    }

    @Override
    public void abrir() {
        if (!abierta) {
            abierta = true;
            System.out.println("   Se abre la puerta del piso " + numeroPiso);
        }
    }

    @Override
    public void cerrar() {
        if (abierta) {
            abierta = false;
            System.out.println("   Se cierra la puerta del piso " + numeroPiso);
        }
    }
}
