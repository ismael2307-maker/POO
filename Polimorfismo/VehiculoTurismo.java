public class VehiculoTurismo extends Vehiculo{
    private int numPuertas;

    public VehiculoTurismo(String matricula, String marca, String modelo, int numPuertas) {
        super(matricula, marca, modelo);
        this.numPuertas=numPuertas;
       
    }

    public int MostrarNumPuertas() {
        return numPuertas;
    }

    public void cambiarNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    @Override
     public String mostrarDatos(){
        return "Matricula: "+MostrarMatricula()+"\nMarca: "+MostrarMarca()+"\nModelo: "+MostrarModelo()+
        "\nNumeros de puertas: "+MostrarNumPuertas();
    }
    
}
