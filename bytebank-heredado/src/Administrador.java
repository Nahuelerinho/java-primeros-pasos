public class Administrador extends Funcionario implements Autenticable{

    public double getBonificacion() {
        return 200;
    }

    @Override
    public void setClave(String clave) {

    }

    @Override
    public boolean iniciarSecion(String clave) {
        return false;
    }
}
