// GUIA 10 EJERCICIO 6 - Franco Daniel Herrera

import java.util.Scanner;
import services.TiendaService;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        Boolean salir = false;
        TiendaService ts = new TiendaService();
        
        System.out.println("Bienvenide!");
        do{
            System.out.println("---------------------------------------------");
            System.out.println("MENU:");
            System.out.println("1. Agregar Productos a la lista");
            System.out.println("2. Modificar precio de Producto");
            System.out.println("3. Eliminar Producto");
            System.out.println("4. Mostrar lista de Productos");
            System.out.println("5. Salir");
            System.out.println("---------------------------------------------");
            System.out.print("Ingrese opcion => ");
            int opcion = read.nextInt();
            read.nextLine();
            System.out.println("---------------------------------------------");
    
            switch (opcion) {
                case 1:
                    ts.añadirProductos();
                    break;
                case 2:
                    ts.modificarPrecio();
                    break;
                case 3:
                    ts.eliminarProducto();
                    break;
                case 4:
                    ts.mostrarLista();
                    break;
                case 5:
                    System.out.println("Cerrando aplicacion..");
                    salir = true;
                    break;
            }
        }while(salir!=true);   
        read.close();  
    }
}
