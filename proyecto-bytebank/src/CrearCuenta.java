public class CrearCuenta {
    public static void main(String[] args) {

        Cuenta primeraCuenta = new Cuenta(1);
        primeraCuenta.saldo = 400;
        System.out.println(primeraCuenta.saldo);

        Cuenta segundaCuenta = new Cuenta(2);
        segundaCuenta.saldo = 400;
        System.out.println(segundaCuenta.saldo);

        if (primeraCuenta == segundaCuenta){
            System.out.println("Son el mismo objeto");
        }else {
            System.out.println("Son diferentes");
        }


    }
}
