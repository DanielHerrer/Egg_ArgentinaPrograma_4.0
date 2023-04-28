/// EJERCICIO EXTRA 9
// Simular la división usando solamente restas. Dados dos números enteros
// mayores que uno, realizar un algoritmo que calcule el cociente y el
// residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
// obtener un resultado menor que el divisor, este resultado es el residuo, y
// el número de restas realizadas es el cociente.

import java.util.Scanner;

public class EjercicioExtra9 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int dividendo, divisor, cociente=0, resto;
        System.out.println("Ingrese el dividendo y el divisor: ");
        dividendo = in.nextInt();
        divisor = in.nextInt();
        resto = dividendo;
        while(resto>=divisor){
            resto = resto - divisor;
            cociente++;
        }
        System.out.println("El resultado de "+dividendo+"/"+divisor+"\nEl cociente queda en = "+cociente+"\nEl resto queda en = "+resto);
        in.close();
    }
}
