/// EJERCICIO 1
// Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
// restar, multiplicar y dividir. La aplicación debe tener una función para cada operación matemática 
// y deben devolver sus resultados para imprimirlos en el main. 

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n1, n2, op;
        System.out.println("Ingrese dos numeros: ");
        System.out.print("Numero 1: ");
        n1 = in.nextInt();
        System.out.print("\nNumero 2: ");
        n2 = in.nextInt();

        System.out.println("\nMenu\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir");
        System.out.println("Elija una opcion: ");
        op = in.nextInt();

        switch (op) {
            case 1:
                System.out.println("El resultado de la suma entre "+n1+" y "+n2+" es: "+sumar(n1, n2));
                break;
            case 2:
                System.out.println("El resultado de la resta entre "+n1+" y "+n2+" es: "+restar(n1, n2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicacion entre "+n1+" y "+n2+" es: "+multiplicar(n1, n2));
                break;
            case 4:
                System.out.println("El resultado de la division entre "+n1+" y "+n2+" es: "+dividir(n1, n2));
                break;
            default:
                System.out.println("La opcion ingresada es incorrecta...");
                break;
        }
        in.close();
    }

    public static int sumar(int n1, int n2){
        int resultado = n1 + n2;
        return resultado;
    }
    public static int restar(int n1, int n2){
        int resultado = n1 - n2;
        return resultado;
    }
    public static int multiplicar(int n1, int n2){
        int resultado = n1 * n2;
        return resultado;
    }
    public static double dividir(int n1, int n2){
        double resultado = n1 / n2;
        return resultado;
    }
}
