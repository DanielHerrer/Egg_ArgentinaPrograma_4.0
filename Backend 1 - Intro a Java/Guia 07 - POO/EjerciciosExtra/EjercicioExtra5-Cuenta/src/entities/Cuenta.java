package entities;

import java.util.Scanner;

public class Cuenta {

    private String titular;
    private int saldo, impuesto = 10;

    public Cuenta(){
    }

    public Cuenta(String titular, int saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void retirar_dinero(){
        Scanner in = new Scanner(System.in);
        Boolean salir = false;
        int saldoRetirado, op;
        System.out.println("/////////////////////////////////////////////////////////////////////");
        System.out.println("- SALDO: $" + saldo);

        do{
            System.out.println("/////////////////////////////////////////////////////////////////////");
            System.out.println("Cuanto dinero desea retirar? ($10 de impuesto)");
            saldoRetirado = in.nextInt();

            if(saldoRetirado+impuesto > saldo){
                System.out.println("/////////////////////////////////////////////////////////////////////");
                System.out.println("El saldo ha retirar no es suficiente");
            }else{
                saldo -= (saldoRetirado+impuesto);
                System.out.println("/////////////////////////////////////////////////////////////////////");
                System.out.println("Retiraste $"+saldoRetirado+", se te han descontado $"+impuesto+" de impuestos por retirar.");
            }

            do{
                System.out.println("/////////////////////////////////////////////////////////////////////");
                System.out.println("Desea realizar otra operacion?\n1. Si\n2. No");
                op = in.nextInt();
            }while(op<1||op>2);
            
            if(op == 2){
                System.out.println("Finalizando..");
                salir = true;
            }else{
                System.out.println("/////////////////////////////////////////////////////////////////////");
                System.out.println("- SALDO: $" + saldo);
            }         
        }while(salir != true);
        
        in.close();
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(int impuesto) {
        this.impuesto = impuesto;
    }

    @Override
    public String toString() {
        return "Cuenta [titular=" + titular + ", saldo=" + saldo + ", impuesto=" + impuesto + "]";
    }

}