// Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
// productos que venderemos y el precio que tendrán. Además, se necesita que la
// aplicación cuente con las funciones básicas.
// Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
// eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
// Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
// Realizar un menú para lograr todas las acciones previamente mencionadas.

package services;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaService {
    private Scanner read = new Scanner(System.in);
    private HashMap<String,Float> listaProductos = new HashMap<>();
    
    public void añadirProductos(){
        Boolean salir = false;
        do{
            System.out.print("Ingrese nombre del producto => ");
            String nombre = read.nextLine();
            System.out.print("Ingrese precio del producto => ");
            Float precio = read.nextFloat();

            listaProductos.put(nombre, precio);
            System.out.println("Producto agregado!");

            System.out.print("Desea seguir? (s/n) => ");
            String op = read.next();
            if(op.equalsIgnoreCase("s") || op.equalsIgnoreCase("si")){
                System.out.println("Repitiendo..");
            }else if(op.equalsIgnoreCase("n") || op.equalsIgnoreCase("no")){
                System.out.println("Finalizando..");
                salir = true;
            }else{
                System.out.println("Opción no válida, finalizando..");
                salir = true;
            }
        }while(!salir==true);
    }

    public void modificarPrecio(){
        System.out.print("Ingrese el nombre del producto que desea modificar su precio => ");
        String nombreB = read.nextLine();
        if(listaProductos.isEmpty()){
            System.out.println("Aun no hay productos en la lista! Ingreselos primero!");
        }else{
            for(String nombre: listaProductos.keySet()){
                if(nombreB.equalsIgnoreCase(nombre)){
                    System.out.println("Producto encontrado!");
                    System.out.print("["+nombre+"] Ingrese el nuevo precio => ");
                    Float precio = read.nextFloat();
                    listaProductos.put(nombre, precio);
                }
            }
        }
    }

    public void mostrarLista(){
        for(Map.Entry<String,Float> producto: listaProductos.entrySet()){ // Recorrer un mapa trayendo llave y valor
            System.out.println("[Producto = "+producto.getKey()+" | Precio = $"+producto.getValue()+"]");
        }
    }


}
