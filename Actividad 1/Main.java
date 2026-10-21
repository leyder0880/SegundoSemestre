import java.util.Date;

public class Main {
    public static void main(String[] args) {
       
        Cliente cliente1 = new Cliente("1001", "Alexander");
        Cliente cliente2 = new Cliente("1002", "Maria");

        Foto foto1 = new Foto("playa.jpg");
        Foto foto2 = new Foto("familia.jpg");

        Foto[] fotos = {foto1, foto2};

        Camara camara = new Camara(1, "Canon", "EOS 250D");
        Impresion impresion = new Impresion(2, "Color", fotos);

        Producto[] productos = {camara, impresion};

        Pedido pedido1 = new Pedido(cliente1, productos, new Date(), 123456789);
        //Pedido pedido2 = new Pedido(cliente2, productos, new Date(), 987654321);
    
        System.out.println(pedido1);
    }
}
