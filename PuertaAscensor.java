public class PuertaAscensor extends Puerta {

    private boolean mantenerAbierta;

    public PuertaAscensor(SensorPuerta sensor) {
        super(sensor);
    }

    @Override
    public void abrir() {
        abierta = true;
    }

    @Override
    public void cerrar() {
        if (!mantenerAbierta) {
            abierta = false;
        }
    }

    public void mantenerAbiertas(boolean activo) {
        this.mantenerAbierta = activo;
    }
}
