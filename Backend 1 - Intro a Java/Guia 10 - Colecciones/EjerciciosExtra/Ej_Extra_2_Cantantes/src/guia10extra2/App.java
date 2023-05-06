// Guia 10 Ejercicio Extra 2 (Sofia Ceci)
/*Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.*/


import java.util.HashSet;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        HashSet <CantanteFamoso> cantanteFamoso = new HashSet<>();
        Servicios serv = new Servicios();

        for (int i = 0; i < 5; i++) {
            cantanteFamoso.add(serv.cargarCantante());   
        }

        int choice;
        do {
            System.out.println("===============");
            System.out.println("     MENU      ");
            System.out.println("===============");
            System.out.println("");
            System.out.println("1-Agregar cantante");
            System.out.println("2-Eliminar Cantante");
            System.out.println("3-Mostrar lista de cantantes");
            System.out.println("4-Salir");
            System.out.println("Ingrese un valor y luego presione la tecla enter.");
            choice = read.nextInt();
            switch (choice) {
                case 1:
                    cantanteFamoso.add(serv.cargarCantante());
                    break;
                case 2:
                    serv.eliminarCantante(cantanteFamoso);
                    break;
                case 3:
                    serv.mostrarCantantes(cantanteFamoso);
                    break;
                case 4:
                    System.out.println("Gracias!");
                    break;
                default:
                    System.out.println("Digito Invalido");
                    break;
            }
        } while (choice != 4);
        read.close();
    }
}
