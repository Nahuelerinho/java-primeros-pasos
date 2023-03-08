public class TestCuentaExceptionSaldo {

    public static void main(String[] args) {
        Cuenta cuenta = new CuentaAhorros(123, 456);

        cuenta.depositar(200);
        try {
            cuenta.saca(210);
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }

    }
}
