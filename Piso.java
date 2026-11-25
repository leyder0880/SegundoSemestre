 public class Piso {

    private int ubicacion;
    private BotonPiso botonSube;
    private BotonPiso botonBaja;
    private PuertaPiso puerta;

    public Piso(int ubicacion) {
        this.ubicacion = ubicacion;
        this.botonSube = new BotonPiso(ubicacion, DireccionAscensor.ARRIBA);
        this.botonBaja = new BotonPiso(ubicacion, DireccionAscensor.ABAJO);
        this.puerta = new PuertaPiso(ubicacion, new SensorPuerta());
    }

    
    public void solicitar(DireccionAscensor dir) {
        if (dir == DireccionAscensor.ARRIBA) {
            botonSube.presionar();
        } else if (dir == DireccionAscensor.ABAJO) {
            botonBaja.presionar();
        }
    }

    
    public void apagarBotones() {
        botonSube.apagarIndicador();
        botonBaja.apagarIndicador();
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public PuertaPiso getPuerta() {
        return puerta;
    }
}
