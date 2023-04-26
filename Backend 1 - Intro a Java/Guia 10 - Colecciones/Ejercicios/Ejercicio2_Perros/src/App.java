// EJERCICIO 2 - Daniel Franco Herrera
// Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
// un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
// está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
// ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
// la lista ordenada.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<String> razasPerros = new ArrayList<>();
        Boolean salir = false;
        do {
            System.out.print("Ingrese una raza de perro => ");
            razasPerros.add(read.nextLine());
            System.out.print("Desea salir? (si/no) => ");
            String op = read.nextLine();
            if (op.toLowerCase().equals("si")) {
                salir = true;
                System.out.println("Finalizando..");
            } else if(op.toLowerCase().equals("no")){
                System.out.println("Repitiendo..");
            } else {
                salir = true;
                System.out.println("Opcion incorrecta, finalizando..");
            }
        } while (salir == false);

        for (String raza : razasPerros) {
            System.out.print(raza + " ");
        }
        System.out.println();
        
        System.out.print("Ingrese la raza a eliminar => ");
        String raza = read.nextLine();
        Iterator<String> iterador = razasPerros.iterator();

        while (iterador.hasNext()){
            if (iterador.next().equalsIgnoreCase(raza)){
                iterador.remove();
                break;
            }else{
                if (!iterador.hasNext()){   // si NO hubiera un siguiente elemento
                    System.out.println("No se encontró la raza.");
                }
            }
        }

        Collections.sort(razasPerros);
        for (String raza1 : razasPerros) {
            System.out.print(raza1 + " ");
        }
        read.close();
    }
}