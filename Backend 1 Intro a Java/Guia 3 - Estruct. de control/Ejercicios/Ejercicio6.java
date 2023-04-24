/// EJERCICIO 6
// Realizar un programa que pida dos números enteros positivos por teclado 
// y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción 
// y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
// El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, 
// si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
// se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)?
//  Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num1, num2, option, resultado;

        do{
            System.out.println("Ingrese el primer numero: ");
            num1 = in.nextInt();
        }while(num1<1);
        do{
            System.out.println("Ingrese el segundo numero: ");
            num2 = in.nextInt();
        }while(num2<1);
        do{
            System.out.println("MENU:\n 1. SUMAR\n 2. RESTAR\n 3. MULTIPLICAR\n 4. DIVIDIR\n 5. SALIR\n Ingrese su opcion:");
            option = in.nextInt();

            switch(option){
                case 1:
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es: "+resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta es: "+resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("El resultado de la multiplicacion es: "+resultado);
                    break;
                case 4:
                    resultado = num1 / num2;
                    System.out.println("El resultado de la division es: "+resultado);
                    break;
            }
        }while(option!=5);
        System.out.println("Finalizando..");
        in.close();
    }
}
