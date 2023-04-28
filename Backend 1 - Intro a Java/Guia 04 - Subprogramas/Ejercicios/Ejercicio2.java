/// EJERCICIO 2
// Diseñe una función que pida el nombre y la edad de N personas e imprima los datos 
// de las personas ingresadas por teclado e indique si son mayores o menores de edad. 
// Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
// mostrando personas y frenar cuando el usuario ingrese la palabra “No”.

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de personas: ");
        int cantPers = read.nextInt();
        
        esMayor(cantPers);
        read.close();
    }

    public static void esMayor(int cantPers){

        // el useDelimiter("\n") toma los in.next() HASTA el proximo "enter"
        Scanner in = new Scanner(System.in).useDelimiter("\n");

        int age;
        String name, op;
        Boolean flag = null;

        for(int i=0;i<cantPers;i++){
            System.out.println("Ingrese el nombre de la persona nº"+(i+1)+": ");
            name = in.next();
            
            System.out.println("Ingrese la edad de la persona nº"+(i+1)+": ");
            age = in.nextInt();

            if(age >= 18){
                System.out.println(name+" es mayor de edad.");
            }else{
                System.out.println(name+" es menor de edad.");
            }

            if(i != cantPers-1){
                do{
                    System.out.println("Desea seguir introduciendo datos? (Si/No): ");
                    op = in.next();
                    if(op.equals("Si")){
                        flag = true;
                    }else{
                        if(op.equals("No")){
                            flag = false;
                        }else{
                            System.out.println("Incorrecto..." );
                        }
                    }
                }while(flag == null);
            }

            // Si se ha elegido NO entonces break sale del FOR y termina.
            if(flag == false){
                break;
            }

        }

        in.close();
    }
    
}
