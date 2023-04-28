/// EJERCICIO 1
// Crear un programa que dado un número determine si es par o impar.

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int num;
        do{
            System.out.println("Ingrese un numero: ");
            num = in.nextInt();
        }while(num<1);
        if(num%2 == 0){
            System.out.println("El numero ingresado es PAR.");
        }else{
            System.out.println("El numero ingresado es IMPAR.");
        }
        in.close();
    }
}