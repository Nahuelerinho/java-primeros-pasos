public class Gerente extends Funcionario implements Autenticable {
    public double getBonificacion() {
        return 2000;
    }

    @Override
    public void setClave(String clave) {

    }

    @Override
    public boolean iniciarSecion(String clave) {
        return false;
    }
}
