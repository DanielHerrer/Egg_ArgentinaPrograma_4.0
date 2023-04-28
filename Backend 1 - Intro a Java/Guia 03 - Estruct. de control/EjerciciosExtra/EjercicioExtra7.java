/// EJERCICIO EXTRA 7
// Realice un programa que calcule y visualice el valor máximo, el valor mínimo y 
//   el promedio de n números (n>0). El valor de n se solicitará al principio del programa 
//     y los números serán introducidos por el usuario. Realice dos versiones del programa, 
//        una usando el bucle “while” y otra con el bucle “do - while”.

import java.util.Scanner;

public class EjercicioExtra7 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int contador=0, cantNumeros, numMin=0, numMax=0, numTotal=0, aux;
        
        do{
            System.out.println("Ingrese la cant. de numeros: ");
            cantNumeros = in.nextInt();
        }while(cantNumeros<1);

        ///////////////////////////////////////////////// WHILE
        // while(contador<cantNumeros){
        //     System.out.println("Ingrese su numero:");
        //     aux = in.nextInt();
        //     if(contador==0){
        //         numMax = aux;
        //         numMin = aux;
        //     }else{
        //         if(aux>numMax){
        //             numMax = aux;
        //         }
        //         if(aux<numMin){
        //             numMin = aux;
        //         }
        //     }
        //     numTotal = numTotal + aux;
        //     contador++;
        // }

        ///////////////////////////////////////////////// DO-WHILE
        do{
            System.out.println("Ingrese su numero:");
            aux = in.nextInt();
            if(contador==0){
                numMax = aux;
                numMin = aux;
            }else{
                if(aux>numMax){
                    numMax = aux;
                }
                if(aux<numMin){
                    numMin = aux;
                }
            }
            numTotal = numTotal + aux;
            contador++;
        }while(contador<cantNumeros);

        System.out.println("El promedio de los numeros ingresados es: "+numTotal/cantNumeros);
        System.out.println("El numero más bajo es: "+numMin);
        System.out.println("El numero más alto es: "+numMax);
        in.close();
    }
}
