// Guia 10 Ejercicio Extra 1 (Maximiliano Luna)

package guia10extra1;

import java.util.ArrayList;
import java.util.Scanner;

public class Guia10Extra1 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        
        do {
            System.out.println("Ingrese un número entero");
            int numero = leer.nextInt();
            if (numero != -99) {
                numeros.add(numero);
                suma += numero;
            } else {
                System.out.println("Termino la carga de numeros");
                break;
            }
        } while (true);
        
        float promedio = (float) Math.round(suma/numeros.size()*100)/100;
        
        System.out.println("Lista de números: " + numeros.toString());
        System.out.println("Su promedio es: " + promedio);
    }
}
