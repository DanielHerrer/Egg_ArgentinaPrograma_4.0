// Ejercicio Extra 4 - Daniel F. Herrera 
// Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego, crea métodos para agregar 
// nuevas recetas a la lista, para buscar una receta por nombre y para obtener la lista de recetas que 
// se pueden preparar con los ingredientes disponibles en la cocina.
// Receta 1: Tortafritas
// agua harina sal aceite
// Receta 2: Huevo frito
// aceite huevo sal
// Receta 3: Pan
// harina levadura aceite agua sal
// Receta 4: Fideos
// sal fideos agua aceite
// Receta 5: Pure de papas
// agua sal papa leche manteca nuezMozcada

import java.util.Scanner;
import entities.Cocina;
import entities.Receta;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner read = new Scanner(System.in);
        Scanner readNum = new Scanner(System.in);

        Cocina cocina = new Cocina();

        System.out.println("//////////////////////////////////////////////////////////////");

        int op;
        do{
            System.out.println("--------------------------------------------------------------");
            System.out.println("Introduzca un ingrediente a la heladera:");
            cocina.añadirIngredienteHeladera(read.nextLine());
            System.out.println("Desea seguir? 1.Si 0.No");
            op = readNum.nextInt();
        }while(op==1);

        do{
            Receta recetaTemp;
            System.out.println("//////////////////////////////////////////////////////////////");
            System.out.println("Ingrese un nombre de la receta: ");
            String nombreReceta = read.nextLine();
            System.out.println("Cuantos ingredientes lleva?: ");
            int cantIngredientes = readNum.nextInt();
            String[] listaIng = new String[cantIngredientes];

            for(int i=0; i<cantIngredientes; i++){
                System.out.println("["+nombreReceta+"] Introduzca ingrediente nº"+(i+1)+":");
                listaIng[i] = read.nextLine();
            }

            recetaTemp = new Receta(nombreReceta,listaIng);
            cocina.añadirReceta(recetaTemp);

            System.out.println("Desea seguir añadiendo recetas? 1.Si 0.No");
            op = readNum.nextInt();
        }while(op==1);

        System.out.println("//////////////////////////////////////////////////////////////");

        System.out.println("De que manera desea buscar recetas:\n1. Por nombre de receta\n2. Por ingredientes de heladera");
        op = readNum.nextInt();
        switch(op){
            case 1:
                System.out.println("//////////////////////////////////////////////////////////////");
                System.out.println("Ingrese el nombre de la receta a buscar:");
                cocina.buscarRecetaPorNombre(read.nextLine());
                break; 
            case 2:
                System.out.println("//////////////////////////////////////////////////////////////");
                System.out.println("Usted tiene los siguientes ingredientes en su heladera: ");
                for(String ingredienteH: cocina.mostrarIngredientesHeladera()){
                    System.out.print("["+ingredienteH+"]");
                }
                System.out.println("");
                Receta[] listaRecetaHeladera = cocina.buscarRecetaPorHeladera();
                for(Receta receta: listaRecetaHeladera){
                    System.out.println(receta.toString());
                }
                break;
        }

        read.close();
        readNum.close();
    }

}
