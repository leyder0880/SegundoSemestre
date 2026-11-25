 public class PuertaAscensor extends Puerta {

    private boolean mantenerAbierta;

    public PuertaAscensor(SensorPuerta sensor) {
        super(sensor);
        this.mantenerAbierta = false;
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

    
    public void cierreAutomatico() {
        if (sensor.detectarObstaculo()) {
            return;
        }
        cerrar();
    }

    public void mantenerAbiertas(boolean activo) {
        this.mantenerAbierta = activo;
    }
}
