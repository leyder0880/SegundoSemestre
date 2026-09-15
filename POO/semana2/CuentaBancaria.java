public class MainCuentaBancaria {
    public static void main(String[] args) {

        //Creación del objeto de la clase CuentaBancaria
        CuentaBancaria objCuenta1 = new CuentaBancaria();
        CuentaBancaria objCuenta2 = new CuentaBancaria();

        objCuenta1.setSaldo(1500000);
        objCuenta1.setTitular("Jorge Ramirez");
        objCuenta1.setNumeroCuenta("1023456789");
        objCuenta1.setTipoCuenta("Ahorros");
        objCuenta1.setClave("1234");

        objCuenta2.setSaldo(3200000);
        objCuenta2.setTitular("Fernanda Lopez");
        objCuenta2.setNumeroCuenta("1098765432");
        objCuenta2.setTipoCuenta("Corriente");
        objCuenta2.setClave("5678");

        //Mostrar la información del objeto 1 (objCuenta1)
        System.out.println(objCuenta1.getSaldo());
        System.out.println(objCuenta1.getTitular());
        System.out.println(objCuenta1.getNumeroCuenta());
        System.out.println(objCuenta1.getTipoCuenta());

        //Mostrar la información del objeto 2 (objCuenta2)
        System.out.println(objCuenta2.getSaldo());
        System.out.println(objCuenta2.getTitular());
        System.out.println(objCuenta2.getNumeroCuenta());
        System.out.println(objCuenta2.getTipoCuenta());
    }
}