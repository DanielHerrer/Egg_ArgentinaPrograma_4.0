/// EJERCICIO 1
// Realizar un algoritmo que llene un vector con los 100 primeros números enteros 
//  y los muestre por pantalla en orden descendente.

public class Ejercicio1{
    public static void main(String[]args){
        int [] vector;
        vector = new int[100];
    
        for (int i = 99; i < -1; i--) {
            vector[i] = i;
            System.out.println("[" + vector[i] + "]");
        }

   }
}
