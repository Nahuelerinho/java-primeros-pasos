public class TestFuncionario {

    public static void main(String[] args) {
        Funcionario nahuel = new Contador();

        nahuel.setNombre("Nahuel");
        nahuel.setDocumento("442352424");
        nahuel.setSalario(2000);
        nahuel.setTipo(0);

        System.out.println(nahuel.getSalario());
        System.out.println(nahuel.getBonificacion());
    }

}
