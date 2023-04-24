/// EJERCICIO 3
// Crea una aplicación que a través de una función nos convierta una cantidad de euros 
// introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. 
// La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena, 
// este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
// El cambio de divisas es:
// I. * 0.86 libras es un 1 €
// II. * 1.28611 $ es un 1 €
// III. * 129.852 yenes es un 1 €

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int euros; 
        String op;

        System.out.println("Ingrese la cantidad de euros a convertir: ");
        euros = in.nextInt();
        System.out.println("Menu\n-'Libra'\n-'Dolar'\n-'Yen'\nEscriba la moneda a convertir:");
        op = in.next();

        convertir(euros, op);
        in.close();
    }

    public static void convertir(int euros, String op){
        switch(op){
            case "Libra":
                System.out.println(euros+" euros = £"+euros * 0.86+" libras.");
                break;
            case "Dolar":
                System.out.println(euros+" euros = $"+euros * 1.28611+" dolares.");
                break;
            case "Yen":
                System.out.println(euros+" euros = ¥"+euros * 129.852+" yenes.");
                break;
            default:
                System.out.println("Opcion Incorrecta..");
                break;
        }
    }
}