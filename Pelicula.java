public class Pelicula {
    private String nombre;
    private int duracion;
    private String genero;
    private String calidad;
    private String clasificacion;

    public Pelicula() {
        System.out.println("Se creo objeto en el metodo constructor sin parametros");
    }

    public Pelicula(String nombre, int duracion, String genero, String calidad, String clasificacion) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
        this.calidad = calidad;
        this.clasificacion = clasificacion;
    }

    public String mostrarNombre() { //get
        return nombre;
    }

    public int mostrarDuracion() {
        return duracion;
    }

    public String mostrarGenero() {
        return genero;
    }

    public String mostrarCalidad() {
        return calidad;
    }

    public String mostrarClasificacion() {
        return clasificacion;
    }

    public void cambiarNombre(String nombre) {
        this.nombre = nombre;
    }

    public void cambiarDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void cambiarGenero(String genero) {
        this.genero = genero;
    }

    public void cambiarCalidad(String calidad) {
        this.calidad = calidad;
    }

    public void cambiarClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

}