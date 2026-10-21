import java.util.Date;

public class Pedido {
    
    private Object cliente;
    private Object producto;
    private Date fecha;
    private int numeroTarjetaCredito;

    public Pedido(Object cliente, Object producto, Date fecha, int numeroTarjetaCredito) {

        this.cliente = cliente;
        this.producto = producto;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public Object getCliente() {
        return cliente;
    }

    public void setCliente(Object cliente) {
        this.cliente = cliente;
    }

    public Object getProducto() {
        return producto;
    }

    public void setProducto(Object producto) {
        this.producto = producto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumeroTarjetaCredito() {
        return numeroTarjetaCredito;
    }

    public void setNumeroTarjetaCredito(int numeroTarjetaCredito) {
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    @Override
    public String toString() {
        return "Pedido{cliente=" + cliente +
            ", producto=" + producto +
                ", fecha=" + fecha +
                ", numeroTarjetaCredito=" + numeroTarjetaCredito + "}";
    }
}