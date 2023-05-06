/*
Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Servicios {
    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public CantanteFamoso cargarCantante(){
        System.out.println("Ingrese un cantante");
        String nombre = read.next();
        System.out.println("Ingrese el disco de dicho cantante con mas discos vendidos");
        String disco = read.next();
        return new CantanteFamoso(nombre,disco);   
    }
   
    public void eliminarCantante(HashSet <CantanteFamoso> cantanteFamoso){
        System.out.println("¿Que cantante desea eliminar?");
        String cantante = read.next();
        Iterator<CantanteFamoso> comparar = cantanteFamoso.iterator();
        while (comparar.hasNext()) {
            CantanteFamoso next = comparar.next();
            if (next.getCantante().equalsIgnoreCase(cantante)) {
                comparar.remove();
                break;
            } else if (!comparar.hasNext()) {
                System.out.println("El cantante no se encuentra en la lista");
            }
        }
    }
    
    public void mostrarCantantes(HashSet <CantanteFamoso> cantanteFamoso){
        for (CantanteFamoso cantante : cantanteFamoso) {
            System.out.println(cantante);
        }
    }
    
}
