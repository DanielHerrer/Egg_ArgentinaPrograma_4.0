// Clase Integer
// Escribe un programa que determine si un número entero es un número primo.
// Escribe un programa que determine si un número entero es un número perfecto 
// (es decir, la suma de sus factores propios es igual al número).
// Escribe un programa que encuentre el número entero más grande que se puede representar con n bits 
// (donde n es un número entero que el usuario ingresa).
// Escribe un programa que encuentre todos los números primos menores o iguales a un número entero 
// ingresado por el usuario utilizando el algoritmo del criba de Eratóstenes.
// Escribe un programa que determine el número entero más grande que es una suma de dos números primos 
// (por ejemplo, 28 es igual a 5 + 23).

import java.util.Scanner;
import entidades.FuncionesMatematicas;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        FuncionesMatematicas fm = new FuncionesMatematicas();
        int num;

        /////////////////////////////////////////////////////////////////////////////
        System.out.print("El numero ingresado es un numero primo? => ");
        num = read.nextInt();
        if(fm.esPrimo(num)){
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
        /////////////////////////////////////////////////////////////////////////////
        System.out.println("El numero ingresado es un numero perfecto? => ");
        num = read.nextInt();
        if(fm.esPerfecto(num)){
            System.out.println("El numero es perfecto");
        }else{
            System.out.println("El numero no es perfecto");
        }
        /////////////////////////////////////////////////////////////////////////////

    }
}
