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
    private HashMap<String,Integer> listaProductos = new HashMap<>();
    
    public void añadirProductos(){
        Boolean salir = false;
        do{
            System.out.print("Ingrese nombre del producto => -");
            String nombre = read.nextLine().toLowerCase();
            System.out.print("Ingrese precio del producto => $");
            Integer precio = read.nextInt();
            read.nextLine();

            listaProductos.put(nombre, precio);
            System.out.println("Producto agregado!");

            System.out.print("Desea seguir? (s/n) => ");
            String op = read.nextLine();
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
        if(listaProductos.isEmpty()){
            System.out.println("Aun no hay productos en la lista! Ingreselos primero!");
        }else{
            System.out.print("Ingrese el nombre del producto que desea modificar su precio => ");
            String nombreB = read.nextLine().toLowerCase();
            if(listaProductos.containsKey(nombreB)){
                System.out.println("Producto encontrado!");
                System.out.print("["+mayus1(nombreB)+"] Ingrese el nuevo precio => ");
                Integer precio = read.nextInt();
                read.nextLine();
                listaProductos.put(nombreB, precio);
            }
        }
    }

    public void eliminarProducto(){
        if(listaProductos.isEmpty()){
            System.out.println("Aun no hay productos en la lista! Ingreselos primero!");
        }else{
            System.out.print("Ingrese el nombre del producto que desea eliminar => ");
            String nombreB = read.nextLine().toLowerCase();
            if(listaProductos.containsKey(nombreB)){
                System.out.println("Producto encontrado!");
                System.out.println("["+mayus1(nombreB)+"] Se eliminó con éxito! ");
                listaProductos.remove(nombreB);
            }
        }
        // -Sofia Ceci
        // public void eliminarProducto(HashMap<String, Float> almacen){
        //     System.out.println("Ingrese el producto que desea eliminar");
        //        String producto = read.next();
        //        if (almacen.containsKey(producto)) {
        //            almacen.remove(producto);
        //        }else{
        //            System.out.println("El producto no se encuentra en stock");
        //        }
        //    }
    }

    public void mostrarLista(){
        if(listaProductos.isEmpty()){
            System.out.println("Aun no hay productos en la lista! Ingreselos primero!");
        }else{
            for(Map.Entry<String,Integer> producto: listaProductos.entrySet()){ // Recorrer un mapa trayendo llave y valor
                System.out.println("[Producto = "+mayus1(producto.getKey())+" | Precio = $"+producto.getValue()+"]");
            }
        }
    }

    // FUNCION EXTRA
    public String mayus1(String palabra){
        return String.valueOf(Character.toUpperCase(palabra.charAt(0))) + palabra.substring(1,palabra.length());
    }
}
