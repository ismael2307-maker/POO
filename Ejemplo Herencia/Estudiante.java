public class Estudiante extends Persona {
    private int codigoEstudiante;
    private float notaFinal;

    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal) {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    public int mostrarCodigoEstudiante() {
        return codigoEstudiante;
    }

    public float mostrarNotaFinal() {
        return notaFinal;
    }

    public void cambiarCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public void cambiarNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }

    public void reir(){
        System.out.println("Maynor está riendose ");
    }

    @Override
    public void comer(){
        System.out.println("Maynor esta comiendo"); 
        reir();
        super.comer();
    }

    public void caminar(){
        System.out.println("Maynor está caminando");
        moverse(5.00);
    }

    public void correr(){
        System.out.println("Maynor está corriendo");
        moverse(25.00);
    }

    public void mostrarDatos() {
        System.out.println("Nombre del estudiante: " + mostrarNombre());
        System.out.println("Apellido del estudiante: " + mostrarApellido());
        System.out.println("Edad del estudiante: " + mostrarEdad());
        System.out.println("codigo del estudiante: " + codigoEstudiante);
        System.out.println("Nota final del estudiante: " + notaFinal + " Puntos");
    }

}
