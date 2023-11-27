import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner x = new Scanner(System.in);
        Estudiante estudiante = new Estudiante("Ismael", "Davila", 18, 20230958, 18);
        estudiante.mostrarDatos();
        //estudiante.comer();
        estudiante.caminar();
        estudiante.correr();
        System.out.println(
                "********************************************************************************************************");
        Estudiante estudiante2 = new Estudiante(null, null, 0, 0, 0);
        System.out.println("cual es el nombre del estudiante?: ");
        String name = x.nextLine();
        estudiante2.cambiarNombre(name);
        // x.nextLine();
        System.out.println("cual es el apellido del estudiante?: ");
        String ape = x.nextLine();
        estudiante2.cambiarApellido(ape);
        System.out.println("cual es la edad del estudiante?: ");
        int ed = x.nextInt();
        estudiante2.cambiarEdad(ed);
        System.out.println("cual es el codigo del estudiante?: ");
        int cod = x.nextInt();
        estudiante2.cambiarCodigoEstudiante(cod);
        System.out.println("cual es la nota final del estudiante del estudiante?: ");
        float not = x.nextFloat();
        estudiante2.cambiarNotaFinal(not);

        estudiante2.mostrarDatos();
        x.close();
    }
}
