import java.util.Scanner;

public class teoria {
    public static void main(String[] args){

        Scanner leer = new Scanner(System.in);

        ////////////////////////////// EJERCICIO 6 TEORIA
        // Implementar un programa que le pida dos números enteros al usuario
        //  y determine si ambos o alguno de ellos es mayor a 25.

        // int num1, num2;
        
        // System.out.println("Ingrese dos numeros: ");
        // num1 = leer.nextInt();
        // num2 = leer.nextInt();

        // if(num1>25 && num2>25){
        //     System.out.println("Ambos numeros son mayores a 25.");
        // }else{
        //     if(num1>25 && num2<=25){
        //         System.out.println("El primer numero ("+ num1 +") es mayor a 25.");
        //     }else{
        //         if(num2>25 && num1<=25){
        //             System.out.println("El segundo numero ("+ num2 +") es mayor a 25.");
        //         }else{
        //             System.out.println("Ninguno de los dos numeros es mayor a 25.");
        //         }
        //     }
        // }
        // leer.close();

        ////////////////////////////// EJERCICIO 7 TEORIA
        // Considera que estás desarrollando una web para una empresa que fabrica motores 
        //  (suponemos que se trata del tipo de motor de una bomba para mover fluidos). 
        //   Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. 
        //    El programa debe mostrar lo siguiente:
        // o	Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
        // o	Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de gasolina”.
        // o	Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”.
        // o	Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.
        // o	Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor válido para tipo de bomba”

        // int tipoMotor;

        // System.out.println("Ingrese el tipo de motor: ");
        // tipoMotor = leer.nextInt();

        // switch(tipoMotor){
        //     case 1: System.out.println("La bomba es una bomba de agua");
        //     break;
        //     case 2: System.out.println("La bomba es una bomba de gasolina");
        //     break;
        //     case 3: System.out.println("La bomba es una bomba de hormigon");
        //     break;
        //     case 4: System.out.println("La bomba es una bomba de pasta alimenticia");
        //     break;
        //     default: System.out.println("No existe un valor válido para tipo de bomba");
        //     break;
        // }

        // leer.close();

        ////////////////////////////// EJERCICIO 8 TEORIA
        // Escriba un programa que valide si una nota está entre 0 y 10, 
        //  sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

        // int nota;

        // do{
        //     System.out.println("Ingrese su nota de examen: ");
        //     nota = leer.nextInt();
        // }while(nota<0 || nota>10);

        // System.out.println("La nota ingresada ("+ nota +") es correcta.");
        // leer.close();

        ////////////////////////////// EJERCICIO 9 TEORIA
        // Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del bucle
        //  y mostrar el mensaje "Se capturó el numero cero".  El programa deberá calcular y mostrar el resultado
        //   de la suma de los números leídos, pero si el número es negativo no debe sumarse. 
        //     Nota: recordar el uso de la sentencia break.

        // int numSuma = 0 , numIn;

        // for(int i=0;i<20;i++){
        //     System.out.println("Ingrese un numero");
        //     numIn = leer.nextInt();
        //     if(numIn < 0){
        //         continue;
        //     }else{
        //         if(numIn == 0){
        //             System.out.println("Se capturó el numero cero.");
        //             break;
        //         }else{
        //             numSuma = numSuma + numIn;
        //         }
        //     }        
        // }
        
        // System.out.println("La suma de todos los numeros ingresados es: "+ numSuma);

        ////////////////////////////// EJERCICIO 10 TEORIA
        // Realizar un programa que lea 4 números (comprendidos entre 1 y 20) 
        // e imprima el número ingresado seguido de tantos asteriscos como indique su valor.

        // int num, num1=0, num2=0, num3=0, num4=0;
        
        // for(int i=0;i<4;i++){
        //     do{
        //         System.out.println("Ingrese un numero entre 1 y 20: ");
        //         num = leer.nextInt();
        //     }while(num<1 || num>20);
        //     switch(i){
        //         case 0:
        //             num1 = num;
        //             break;
        //         case 1:
        //             num2 = num;
        //             break;
        //         case 2:
        //             num3 = num;
        //             break;
        //         case 3:
        //             num4 = num;
        //             break; 
        //     }
        // }

        // System.out.print(num1+" : ");
        // for(int i=0;i<num1;i++){
        //     System.out.print("*");
        // }
        // System.out.println("");
        // System.out.print(num2+" : ");
        // for(int i=0;i<num2;i++){
        //     System.out.print("*");
        // }
        // System.out.println("");
        // System.out.print(num3+" : ");
        // for(int i=0;i<num3;i++){
        //     System.out.print("*");
        // }
        // System.out.println("");
        // System.out.print(num4+" : ");
        // for(int i=0;i<num4;i++){
        //     System.out.print("*");
        // }

    }
}