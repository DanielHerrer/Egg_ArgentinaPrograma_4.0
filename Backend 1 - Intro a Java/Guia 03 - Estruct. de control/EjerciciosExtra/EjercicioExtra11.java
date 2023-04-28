import java.util.Scanner;

/// EJERCICIO EXTRA 11
// Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número. 
// Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. Calcular la cantidad de dígitos 
// matemáticamente utilizando el operador de división. Nota: recordar que las variables de tipo entero truncan 
// los números o resultados.

public class EjercicioExtra11 {
    public static void main (String[]args){
        int num, aux, contN = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        num = in.nextInt();
        aux = num;
        
        while(aux != 0){
            aux = aux / 10;
            contN++; 
        }
        
        System.out.println("El numero posee "+ contN + " caracteres.");
        in.close();
    }
}


