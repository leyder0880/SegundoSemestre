public class CuentaBancaria{
 
    String titular;
    String numeroCuenta;
    double saldo;
 
    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Depósito exitoso de " + valor);
        } else {
            System.out.println("El valor a depositar debe ser mayor que cero.");
        }
    }
 
    public void retirar(double valor) {
        if (valor <= 0) {
            System.out.println("El valor a retirar debe ser mayor que cero.");
        } else if (valor > saldo) {
            System.out.println("Fondos insuficientes. Intentó retirar " + valor + " y el saldo es " + saldo);
        } else {
            saldo = saldo - valor;
            System.out.println("Retiro exitoso de " + valor);
        }
    }
 
    public double consultarSaldo() {
        return saldo;
    }
    
}
