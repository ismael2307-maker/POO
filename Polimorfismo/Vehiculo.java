public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String MostrarMatricula() { // get
        return matricula;
    }

    public String MostrarMarca() {
        return marca;
    }

    public String MostrarModelo() {
        return modelo;
    }

    public void cambiarMatricula(String matricula) { //set
        this.matricula = matricula;
    }

    public void cambiarMarca(String marca) {
        this.marca = marca;
    }

    public void cambiarModelo(String modelo) {
        this.modelo = modelo;
    }

    public String mostrarDatos(){
        return "Matricula: "+MostrarMatricula()+"\nMarca: "+MostrarMarca()+"\nModelo: "+MostrarModelo();
    }

}