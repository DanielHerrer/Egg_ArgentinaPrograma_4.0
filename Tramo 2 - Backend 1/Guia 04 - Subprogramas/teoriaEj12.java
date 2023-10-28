/// TEORIA EJERCICIO 12
// Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
// validando que el primer número múltiplo del segundo e imprima si el primer número es 
// múltiplo del segundo, sino informe que no lo son.

import java.util.Scanner;

public class teoriaEj12 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese dos numeros: ");
        num1 = in.nextInt();
        num2 = in.nextInt();

        EsMultiplo(num1,num2);
        in.close();
    }

    public static void EsMultiplo(int n1, int n2){
        if(n1%n2 == 0){
            System.out.println("El numero1 ("+n1+") SI es multiplo del numero2 ("+n2+").");
        }else{
            System.out.println("El numero1 ("+n1+") NO es multiplo del numero2 ("+n2+").");
        }
    }
}
