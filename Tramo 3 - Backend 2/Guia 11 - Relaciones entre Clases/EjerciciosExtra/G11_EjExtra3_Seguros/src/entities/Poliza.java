// C. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
//      vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
//        póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
//          asegurado, si incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
//            terceros, etc.).

package entities;

public class Poliza {
    
    Vehiculo vehiculo;
    Cliente cliente;
    int numeroPoliza;
    String fechaInicio;
    String fechaFin;
    Cuota[] cuotas;
    double montoTotalAsegurado;
    boolean granizo;
    double montoMaximoGranizo;
    int tipoCobertura;

    public Poliza(){}

    public Poliza(Vehiculo vehiculo, Cliente cliente, int numeroPoliza, String fechaInicio, String fechaFin,
            Cuota[] cuotas, int formaPago, double montoTotalAsegurado, boolean granizo,
            double montoMaximoGranizo, int tipoCobertura) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.numeroPoliza = numeroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cuotas = cuotas;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.granizo = granizo;
        this.montoMaximoGranizo = montoMaximoGranizo;
        this.tipoCobertura = tipoCobertura;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getFormaDePago(){
        return cuotas[0].getFormaDePago();
    }

    public void setFormaDePago(String metodo){
        for(Cuota aux: cuotas){
            aux.setFormaDePago(metodo);
        }
    }

    public Cuota[] getCuotas() {
        return cuotas;
    }

    public void setCuotas(Cuota[] cuotas) {
        this.cuotas = cuotas;
    }

    public double getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(double montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public double getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public void setMontoMaximoGranizo(double montoMaximoGranizo) {
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    public int getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(int tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    @Override
    public String toString() {
        return "Poliza [vehiculo=" + vehiculo + ", cliente=" + cliente + ", numeroPoliza=" + numeroPoliza
                + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", cuotas=" + cuotas + ", montoTotalAsegurado=" + montoTotalAsegurado + ", granizo=" + granizo
                + ", montoMaximoGranizo=" + montoMaximoGranizo + ", tipoCobertura=" + tipoCobertura + "]";
    }

}