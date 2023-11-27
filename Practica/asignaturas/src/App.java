import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner x = new Scanner(System.in);
        // Manera estatica
        Asignaturas asig1 = new Asignaturas("Programacion", "1p1", 003);
        System.out.println("Nombre de la asignatura: " + asig1.mostrarNombre());
        System.out.println("Codigo de la asignatura: " + asig1.mostrarCodigo());
        System.out.println("Curso: " + asig1.mostrarCurso());
        System.out.println("*************************************************");
        Asignaturas asig2 = new Asignaturas(null, null, 0);
        System.out.println("Digite el nombre de la asignatura: ");
        String Nom = x.nextLine();
        asig2.cambiarNombre(Nom);
        System.out.println("Digite el codigo de la asignatura: ");
        String cod = x.nextLine();
        asig2.cambiarCodigo(cod);
        System.out.println("Digite el curso de la asignatura: ");
        int cur = x.nextInt();
        asig2.cambiarCurso(cur);
        System.out.println("Nombre de la asignatura: " + asig2.mostrarNombre());
        System.out.println("Codigo de la asignatura: " + asig2.mostrarCodigo());
        System.out.println("Curso: " + asig2.mostrarCurso());

    }
}
