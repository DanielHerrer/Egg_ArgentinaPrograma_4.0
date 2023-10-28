// Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
// programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
// después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
// salir, se mostrará todos los perros guardados en el ArrayList.

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);
        ArrayList<String> razasPerros = new ArrayList<>();
        Boolean salir = false;
        do{
            System.out.print("Ingrese una raza de perro => ");
            razasPerros.add(read.nextLine());
            System.out.print("Desea salir? (si/no) => ");
            String op = read.nextLine();
            if(op.toLowerCase().equals("si")){
                salir = true;
            }
        }while(salir==false);

        for(String raza: razasPerros){
            System.out.print(raza+" ");
        }
        System.out.println();
        read.close();
    }

}