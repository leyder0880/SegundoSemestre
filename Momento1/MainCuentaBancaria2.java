public public class Main {
 
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.titular = "Alexander Rojas";
        cuenta.numeroCuenta = "123-456-789";
        cuenta.saldo = 0;
 
        cuenta.depositar(500000);
        System.out.println("Saldo: " + cuenta.consultarSaldo());
 
        cuenta.retirar(200000);
        System.out.println("Saldo: " + cuenta.consultarSaldo());
 
        cuenta.retirar(400000); // supera el saldo
        System.out.println("Saldo: " + cuenta.consultarSaldo());
 
        cuenta.depositar(150000);
        System.out.println("Saldo: " + cuenta.consultarSaldo());
 
        cuenta.depositar(-1000); // inválido
        cuenta.retirar(350000);  // deja el saldo en cero
        System.out.println("Saldo final: " + cuenta.consultarSaldo());
    }
    
}
