package entidadesCalculadora;

import java.util.Scanner;

public class Operacion {
    
    private int num1, num2;

    public Operacion() {
    }

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void crearOperacion(){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese numero 1:");
        num1 = in.nextInt();
        System.out.println("Ingrese numero 2:");
        num2 = in.nextInt();
        in.close();
    }

    public int sumar(){
        return num1 + num2;
    }

    public int restar(){
        return num1 - num2;
    }

    public int multiplicar(){
        if(num1 < 1 || num2 < 1){
            System.out.println("Error en la multiplicacion");
            return 0;
        }else{
            return num1 * num2;
        }
    }

    public int dividir(){
        if(num1 < 1 || num2 < 1){
            System.out.println("Error en la division");
            return 0;
        }else{
            return num1 / num2;
        }
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

}
