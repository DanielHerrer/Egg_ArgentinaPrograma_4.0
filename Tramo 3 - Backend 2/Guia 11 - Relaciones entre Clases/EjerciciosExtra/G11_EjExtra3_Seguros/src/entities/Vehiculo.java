// B. Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,
//      modelo, anio, número de motor, chasis, color, tipo (camioneta, sedán, etc.).

package entities;

public class Vehiculo {

    private String marca;
    private String modelo;
    private int anio;
    private int numeroMotor;
    private String chasis;
    private String color;
    private String tipo;
    
    public Vehiculo(){}

    public Vehiculo(String marca, String modelo, int anio, int numeroMotor, String chasis, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numeroMotor = numeroMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getanio() {
        return anio;
    }

    public void setanio(int anio) {
        this.anio = anio;
    }

    public int getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(int numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", numeroMotor=" + numeroMotor
                + ", chasis=" + chasis + ", color=" + color + ", tipo=" + tipo + "]";
    }
    
}
