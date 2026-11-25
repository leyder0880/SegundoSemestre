 public class SensorPuerta {

    private boolean obstaculo;

    public SensorPuerta() {
        this.obstaculo = false;
    }

    public boolean detectarObstaculo() {
        return obstaculo;
    }

    public void setObstaculo(boolean obstaculo) {
        this.obstaculo = obstaculo;
    }
}
