public class VehiculoFurgoneta extends Vehiculo {
    private int carga;

    public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int MostrarCarga() {
        return carga;
    }

    public void cambiarCarga(int carga) {
        this.carga = carga;
    }
    
    
    public String mostrarDatos(){
        return "Matricula: "+MostrarMatricula()+"\nMarca: "+MostrarMarca()+"\nModelo: "+MostrarModelo()
        +"\nCarga: "+MostrarCarga()+" Carga";
    }
}
