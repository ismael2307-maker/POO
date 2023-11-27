public class Asignaturas {
    private String nombre;
    private String codigo;
    private int curso;

    public Asignaturas(String nombre, String codigo, int curso) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.curso = curso;
    }

    public String mostrarNombre() {
        return nombre;
    }

    public String mostrarCodigo() {
        return codigo;
    }

    public int mostrarCurso() {
        return curso;
    }

    public void cambiarNombre(String nombre) {
        this.nombre = nombre;
    }

    public void cambiarCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void cambiarCurso(int curso) {
        this.curso = curso;
    }

}