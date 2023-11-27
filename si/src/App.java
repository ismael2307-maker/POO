import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner x = new Scanner(System.in);

        Pelicula depredador = new Pelicula();
        depredador.cambiarNombre("Depredador");
        depredador.cambiarDuracion(97);
        depredador.cambiarGenero("Ciencia ficcion");
        depredador.cambiarClasificacion("Mayores de 18");
        depredador.cambiarCalidad("1080p");
        // Resultados (Manera estatica)
        System.out.println("Nombre de la pelicula: " + depredador.mostrarNombre());
        System.out.println("Duracion de la pelicula: " + depredador.mostrarDuracion() + " Minutos");
        System.out.println("Genero de la peliucula: " + depredador.mostrarGenero());
        System.out.println("Clasificacion de la pelicula: " + depredador.mostrarClasificacion() + " Años");
        System.out.println("Calidad de la pelicula: " + depredador.mostrarCalidad());
        System.out.println("**********************************************************************");
        // Manera dinamica
        Pelicula laFamiliaDelFuturo = new Pelicula();
        System.out.print("Cual es el nombre de la pelicula ?: ");
        String name = x.nextLine();
        laFamiliaDelFuturo.cambiarNombre(name);
        System.out.print("Cual es la Duracion de la pelicula?: ");
        int Duracion = x.nextInt();
        laFamiliaDelFuturo.cambiarDuracion(Duracion);
            
        System.out.print("cual es el Genero de la pelicula?: ");
        String genero = x.nextLine();
        laFamiliaDelFuturo.cambiarGenero(genero);
        System.out.print("cual es la Clasificacion de la pelicula?: ");
        String clasi = x.nextLine();
        laFamiliaDelFuturo.cambiarClasificacion(clasi);
        System.out.print("Cual es la calidad de la pelicula?: ");
        String cali = x.nextLine();
        laFamiliaDelFuturo.cambiarCalidad(cali);
        System.out.println("Nombre de la pelicula: " + laFamiliaDelFuturo.mostrarNombre());
        System.out.println("Duracion de la pelicula: " + laFamiliaDelFuturo.mostrarDuracion() + " Minutos");
        System.out.println("Genero de la peliucula: " + laFamiliaDelFuturo.mostrarGenero());
        System.out.println("Clasificacion de la pelicula: " + laFamiliaDelFuturo.mostrarClasificacion() + " Años");
        System.out.println("Calidad de la pelicula: " + laFamiliaDelFuturo.mostrarCalidad());

        x.close();
    }
}
