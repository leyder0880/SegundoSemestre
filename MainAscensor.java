public class MainAscensor {

    public static void main(String[] args) {

        Ascensor ascensor = new Ascensor(1, 5, new SensorPuerta() {});

        ascensor.agregarDestino(3);
        ascensor.agregarDestino(1);

        for (int i = 1; i <= 20; i++) {
            ascensor.paso();
            System.out.println("Paso " + i + " | Piso: " + ascensor.getPisoActual()
                    + " | Estado: " + ascensor.getEstado());
        }
    }

    static class SensorPuerta {
    }

    static class Ascensor {
        private final int pisoMinimo;
        private final int pisoMaximo;
        private final java.util.LinkedList<Integer> destinos = new java.util.LinkedList<Integer>();
        private int pisoActual;
        private String estado = "DETENIDO";

        Ascensor(int pisoInicial, int pisoMaximo, SensorPuerta sensorPuerta) {
            this.pisoActual = pisoInicial;
            this.pisoMinimo = 1;
            this.pisoMaximo = pisoMaximo;
        }

        void agregarDestino(int piso) {
            if (piso >= pisoMinimo && piso <= pisoMaximo && !destinos.contains(piso)) {
                destinos.add(piso);
            }
        }

        void paso() {
            if (destinos.isEmpty()) {
                estado = "DETENIDO";
                return;
            }

            int destino = destinos.peekFirst();
            if (pisoActual == destino) {
                destinos.removeFirst();
                estado = "DETENIDO";
                return;
            }

            if (pisoActual < destino) {
                pisoActual++;
                estado = "SUBIENDO";
            } else {
                pisoActual--;
                estado = "BAJANDO";
            }
        }

        int getPisoActual() {
            return pisoActual;
        }

        String getEstado() {
            return estado;
        }
    }
}
