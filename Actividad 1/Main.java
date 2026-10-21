import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Clientes
        Cliente cliente1 = new Cliente("1001", "Alexander");
        Cliente cliente2 = new Cliente("1002", "Maria");

        // Fotos
        Foto foto1 = new Foto("playa.jpg");
        Foto foto2 = new Foto("familia.jpg");

        // Productos
        Camara camara = new Camara(1, "Canon", "EOS 250D");
        Impresion impresion = new Impresion(2, "Color", new Foto[]{foto1, foto2});

        // Pedidos
        Pedido pedido1 = new Pedido(cliente1, new Producto[0], new Date(), 123456789);
        Pedido pedido2 = new Pedido(cliente2, new Producto[0], new Date(), 987654321);

        // Mostrar objetos
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(camara);
        System.out.println(impresion);
        System.out.println(pedido1);
        System.out.println(pedido2);

        // Metodo print() de Foto
        foto1.print();
        foto2.print();
    }
}
