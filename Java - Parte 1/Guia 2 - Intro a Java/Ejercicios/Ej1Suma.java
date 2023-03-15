package ejercicios;
import java.util.Scanner;

public class Ej1Suma {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        int num1, num2, resultado;
        String resultadoSt;

        System.out.println("Ingrese el primer numero: ");
        num1 = scan.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        num2 = scan.nextInt();

        resultado = num1 + num2;
        resultadoSt = Integer.toString(resultado);

        System.out.println("El resultado de la suma da un resultado de "+ resultadoSt);
        scan.close();

    }
}