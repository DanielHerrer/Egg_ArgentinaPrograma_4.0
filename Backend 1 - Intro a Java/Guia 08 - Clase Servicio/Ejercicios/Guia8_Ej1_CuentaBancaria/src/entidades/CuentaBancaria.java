package entidades;

public class CuentaBancaria {

   private int numeroCuenta;
   private long dniCliente;
   private double SaldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, long dniCliente, double SaldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.SaldoActual = SaldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public double getSaldoActual() {
        return SaldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public void setSaldoActual(double SaldoActual) {
        this.SaldoActual = SaldoActual;
    }
   
}