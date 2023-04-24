/// EJERCICIO EXTRA 7
// Realizar un programa que complete un vector con los N primeros números de la sucesión de Fibonacci. 
// Recordar que la sucesión de Fibonacci es la sucesión de los siguientes números:
// 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
// Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
// La sucesión del número 2 se calcula sumando (1+1)
// Análogamente, la sucesión del número 3 es (1+2),
// Y la del 5 es (2+3),
// Y así sucesivamente…
// La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
// Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
// Fibonaccin = 1 para todo n<=1
// Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba como parámetro 
// el valor de “n” y que calcule la serie hasta llegar a ese valor.

import java.util.Scanner;

public class EjercicioExtra7 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        int[] vector = rellenarFibonacci(in);
        buscarElemento(in, vector);

        in.close();
        System.out.println("Finalizando programa..");
    }

    public static int[] rellenarFibonacci(Scanner in){
        System.out.println("Ingrese el tamaño del vector: ");
        int N = in.nextInt();

        int[] vector = new int[N];
        int num1=0, num2=1, aux;

        for(int i=0; i<vector.length; i++){
            if(i==0){
                vector[i] = 1;
            }else{
                aux = num1 + num2;
                vector[i] = aux;
                num1 = num2;
                num2 = aux; 
            }
        }

        return vector;
    }

    public static void buscarElemento(Scanner in, int vector[]){
        System.out.println("Ingrese el valor a buscar: ");
        int numBuscado = in.nextInt();

        Boolean encontrado = false;
        for(int i=0; i<vector.length; i++){
            if(numBuscado == vector[i]){
                System.out.println("Fibonacci de "+numBuscado+" : ("+vector[i-2]+"+"+vector[i-1]+")");
                encontrado = true;
                break;
            }    
            if(encontrado != true && i==(vector.length-1)){
                System.out.println("No existe el numero ingresado en la sucesion Fibonacci.");
            }
        }
    }
    
}
