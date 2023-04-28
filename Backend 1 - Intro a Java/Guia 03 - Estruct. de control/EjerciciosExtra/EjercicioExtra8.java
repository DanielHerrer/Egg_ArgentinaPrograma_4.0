/// EJERCICIO EXTRA 8
// Escriba un programa que lea números enteros. Si el número es múltiplo
// de cinco debe detener la lectura y mostrar la cantidad de números
// leídos, la cantidad de números pares y la cantidad de números impares.
// Al igual que en el ejercicio anterior los números negativos no deben
// sumarse. Nota: recordar el uso de la sentencia break.

import java.util.Scanner;

public class EjercicioExtra8 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int num, cant=0, pares=0, impares=0;
        do{
            System.out.println("Ingrese un numero: ");
            num = in.nextInt();
            cant++;
            if(num<1){
                continue;
            }else{
                if(num%2==0){
                    pares++;
                    continue;
                }else{
                    if(num%2!=0){
                        impares++;
                        continue;
                    }
                }
            }
        }while(!(num%5==0));

        System.out.println(" Cantidad de numeros leidos: "+cant+" \n Cantidad de numeros pares: "+pares+" \n Cantidad de numeros impares: "+impares);
        in.close();
    }   
}