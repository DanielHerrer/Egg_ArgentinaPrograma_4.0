/// EJERCICIO EXTRA 4
// Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y 
//  se muestre su equivalente en romano.

import java.util.Scanner;

public class EjercicioExtra4 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int num;
        do{
            System.out.println("Ingrese un numero entre 1 y 10: ");
            num = in.nextInt();
        }while(num>10||num<1);

        switch(num){
            case 1:
                System.out.println(num+" = I");
                break;
            case 2:
                System.out.println(num+" = II");
                break;
            case 3:
                System.out.println(num+" = III");
                break;
            case 4:
                System.out.println(num+" = IV");
                break;
            case 5:
                System.out.println(num+" = V");
                break;
            case 6:
                System.out.println(num+" = VI");
                break;
            case 7:
                System.out.println(num+" = VII");
                break;
            case 8:
                System.out.println(num+" = VIII");
                break;
            case 9:
                System.out.println(num+" = IX");
                break;
            case 10:
                System.out.println(num+" = X");
                break;
        }
        in.close();
    }
    
}
