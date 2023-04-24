/// EJERCICIO EXTRA 14
// Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos. 
// Escriba un programa que pida la cantidad de familias y para cada familia la cantidad de hijos 
// para averiguar la media de edad de los hijos de todas las familias.

import java.util.Scanner;

public class EjercicioExtra14 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese el num de familias:");
        int numFamilias = in.nextInt();

        int numHijos, edadTotal=0, numHijosTotal=0;
        for(int i=0;i<numFamilias;i++){

            System.out.println("Ingrese la cant de hijos de la familia Nº"+(i+1));
            numHijos = in.nextInt();
            numHijosTotal = numHijosTotal + numHijos;

            for(int j=0;j<numHijos;j++){
                System.out.println("Ingrese la edad del hijo Nº"+(j+1));
                edadTotal = edadTotal + in.nextInt();
            }
        }

        System.out.println("La edad media de los hijos es: "+ edadTotal/numHijosTotal);
        in.close();
    }
}