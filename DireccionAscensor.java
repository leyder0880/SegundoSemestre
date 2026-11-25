public enum DireccionAscensor {
    
    ARRIBA(1),
    ABAJO(-1),
    NINGUNA(0);

    private int piso;

    DireccionAscensor(int piso) {
        this.piso = piso;
    }

    public int getPiso() {
        return piso;
    }
}