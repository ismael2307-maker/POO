public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String mostrarNombre() {
        return nombre;
    }

    public String mostrarApellido() {
        return apellido;
    }

    public int mostrarEdad() {
        return edad;
    }

    public void cambiarNombre(String nombre) {
        this.nombre = nombre;
    }

    public void cambiarApellido(String apellido) {
        this.apellido = apellido;
    }

    public void cambiarEdad(int edad) {
        this.edad = edad;
    }

    public void comer() {
        System.out.println("La persona está comiendo");
    }

    public void moverse(double velocidad) {
        System.out.println("La persona se está moviendo a "+ velocidad+ "mtrs/hr");
    }

}