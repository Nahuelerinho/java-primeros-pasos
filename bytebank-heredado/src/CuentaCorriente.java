public class CuentaCorriente extends Cuenta{

    public CuentaCorriente(int agencia, int numero) {
        super(agencia, numero);

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException {
        double comision = 0.2;
        super.saca(valor + comision);
    }
}
