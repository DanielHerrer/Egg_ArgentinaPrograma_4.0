// Crear un programa que dibuje una escalera de números, donde cada línea de números 
// comience en uno y termine en el número de la línea. Solicitar la altura de la escalera 
// al usuario al comenzar. Ejemplo: si se ingresa el número 3:
// 1
// 12
// 123

import java.util.Scanner;

public class EjercicioExtra13 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un numero:");
        num = in.nextInt();

        // CONVIERTE UN INT EN UN STRING
        // String numString = Integer.toString(numInt);

        String numStr="";
        for(int i=0;i<num;i++){
            numStr = numStr + Integer.toString(i+1);
            System.out.print(numStr);
            System.out.println("");
        }
        
        in.close();
    }
}
