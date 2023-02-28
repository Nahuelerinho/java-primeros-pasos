public class PruebaEncapsulamiento {
    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta(4);

        Cliente cliente = new Cliente();

        cliente.setNombre("Diego");
        cliente.setDocumento("FDFD343434");

        cuenta.setTitular(cliente);

        Cliente titular = cuenta.getTitular();

        System.out.println(cliente);
        System.out.println(cuenta.getTitular());

        System.out.println(titular);

    }
}
