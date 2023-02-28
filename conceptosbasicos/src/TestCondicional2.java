public class TestCondicional2 {

    public static void main(String[] args) {

        System.out.println("probando condicionales");

        int edad = 21;
        int cantidadPersonas = 3;

        boolean esPareja = cantidadPersonas > 1;
        boolean puedeEntrar = edad >= 18 && esPareja;

        System.out.println("El valor de la condicion es: " + esPareja);

        if (puedeEntrar) {
            System.out.println("Tienes más de 18 años");
            System.out.println("Bienvenido ");
        } else {
            System.out.println("Usted no puede ingresar");
        }

    }

}