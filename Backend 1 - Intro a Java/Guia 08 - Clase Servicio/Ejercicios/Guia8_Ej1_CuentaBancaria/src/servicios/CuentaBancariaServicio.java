package servicios;
import entidades.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {

    Scanner read = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {
        System.out.println("Ingrese el numero de cuenta");
        int numeroCuenta = read.nextInt();
        System.out.println("Ingrese el dni");
        long dniCliente = read.nextLong();
        System.out.println("Ingrese el saldo Actual");
        double saldoActual = read.nextDouble();
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }

    public void ingresarDinero(double ingDin, CuentaBancaria c) {
        c.setSaldoActual(c.getSaldoActual() + ingDin);
    }

    public void retirarDinero(double retDin, CuentaBancaria c) {
        if (c.getSaldoActual() < retDin) {
            System.out.println("Solamente se pudo retirar " + c.getSaldoActual());
            c.setSaldoActual(0);
        } else {
            c.setSaldoActual(c.getSaldoActual() - retDin);
        }
    }

    public void extraccionRapida(double extraDin, CuentaBancaria c) {
        if (extraDin <= (c.getSaldoActual()* 0.20)) {
            c.setSaldoActual(c.getSaldoActual() - extraDin);
        } else {
            System.out.println("Solo se pudo retirar el 20%:" + (c.getSaldoActual() * 0.20));
            c.setSaldoActual(c.getSaldoActual() *0.8);
        }
    }

    public void consultarSaldo (CuentaBancaria c){
        System.out.println("El saldo es " + c.getSaldoActual());
    }
    
    public void consultarDatos (CuentaBancaria c){
        System.out.println("El numero de cuenta es " + c.getNumeroCuenta());
        System.out.println("El DNI es " + c.getDniCliente());
        System.out.println("El saldo es " + c.getSaldoActual());
    }
}