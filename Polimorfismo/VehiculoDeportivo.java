public class VehiculoDeportivo extends Vehiculo {
    private int cilindrada;

    public VehiculoDeportivo(String matricula, String marca, String modelo, int cilindrada) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int MostrarCilindrada() {
        return cilindrada;
    }

    public void cambiarCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String mostrarDatos(){
        return "Matricula: "+MostrarMatricula()+"\nMarca: "+MostrarMarca()+"\nModelo: "+MostrarModelo()
        +"\nCilindrada: "+MostrarCilindrada()+" Cilindrada";
    }

    

}
