import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner x = new Scanner(System.in);

        /*
         * Cuenta cuenta1 = new Cuenta("ismael", 300);
         * 
         * cuenta1.ingresarMonto(400);
         * cuenta1.retirarMonto(100);
         * System.out.println("Su saldo quedo en: " + cuenta1.mostrarCantidad() +
         * " Cordobas");
         */

        Cuenta cuenta2 = new Cuenta(null, 0);
        System.out.println("cuanto dinero desea ingresar? ");
        int ingre = x.nextInt();
        cuenta2.ingresarMonto(ingre);
        System.out.println("su saldo actual es de :" + cuenta2.mostrarCantidad());
        System.out.println(" Cuanto dinero desea retirar? ");
        int ret = x.nextInt();
        cuenta2.retirarMonto(ret);
        System.out.println("su saldo actual es de :" + cuenta2.mostrarCantidad());

        x.close();
    }
}
