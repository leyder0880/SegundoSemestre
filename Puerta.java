 public abstract class Puerta {

    protected boolean abierta;
    protected final SensorPuerta sensor;

    protected Puerta(SensorPuerta sensor) {
        this.sensor = sensor;
        this.abierta = false;
    }

    public abstract void abrir();

    public abstract void cerrar();

    public boolean estaAbierta() {
        return abierta;
    }

    public SensorPuerta getSensor() {
        return sensor;
    }
}
