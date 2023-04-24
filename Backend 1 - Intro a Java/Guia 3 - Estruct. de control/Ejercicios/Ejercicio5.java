/// EJERCICIO 5
// Escriba un programa en el cual se ingrese un valor límite positivo, 
// y a continuación solicite números al usuario hasta que la suma de los 
// números introducidos SUPERE el límite inicial.

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numLimite, numTotal=0, num;
        do{
            System.out.println("Ingrese un limite positivo: ");
            numLimite = in.nextInt();
        }while(numLimite<1);
        while(numTotal <= numLimite){
            System.out.println("(Limite:"+numLimite+") (Actual:"+numTotal+") Ingrese un numero: ");
            num = in.nextInt();
            if(num<0){
                continue;
            }else{
                numTotal = numTotal + num;
            }
        }
        System.out.println("Se ha superado el limite inicial. (Limite:"+numLimite+") (Actual:"+numTotal+")");
        in.close();
    }
}
