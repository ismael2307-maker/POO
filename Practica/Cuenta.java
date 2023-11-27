public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;

    }

    public String mostrarTitular() {
        return titular;
    }

    public double mostrarCantidad() {
        return cantidad;
    }

    public void cambiarTitular(String titular) {
        this.titular = titular;
    }

    public void cambiarCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresarMonto(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        
        }
    }

    public void retirarMonto(double cantidad){
        if(this.cantidad-cantidad<0){
            this.cantidad=0;
        }else{
            this.cantidad-=cantidad;
        }
    }
}
