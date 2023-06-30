// Realizar un menú en Java a través del cual se permita elegir qué consulta se desea realizar.
// Las consultas a realizar sobre la BD son las siguientes:
// a) Lista el nombre de todos los productos que hay en la tabla producto.
// b) Lista los nombres y los precios de todos los productos de la tabla producto.
// c) Listar aquellos productos que su precio esté entre 120 y 202.
// d) Buscar y listar todos los Portátiles de la tabla producto.
// e) Listar el nombre y el precio del producto más barato.
// f) Ingresar un producto a la base de datos.
// g) Ingresar un fabricante a la base de datos
// h) Editar un producto con datos a elección.

package tienda;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import tienda.servicios.FabricanteService;
import tienda.servicios.ProductoService;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner read = new Scanner(System.in);
        ProductoService productoSv = new ProductoService();
        FabricanteService fabricanteSv = new FabricanteService();

        try {
            System.out.println("Iniciando programa Java para DATABASE tienda");

            int opcion = 0;
            boolean salir = false;
            do{
                System.out.println("----------------------------------------------");
                System.out.println("MENU:");
                System.out.println("1. Listar el nombre de todos los productos que hay en la tabla producto.\n" + 
                        "2. Lista los nombres y los precios de todos los productos de la tabla producto.\n" + 
                        "3. Listar aquellos productos que su precio este entre 120 y 202.\n" + 
                        "4. Buscar y listar todos los Portatiles de la tabla producto.\n" + 
                        "5. Listar el nombre y el precio del producto mas barato.\n" + 
                        "6. Ingresar un producto a la base de datos.\n" + 
                        "7. Ingresar un fabricante a la base de datos (NO FUNCIONA)\n" + 
                        "8. Editar un producto con datos a eleccion.\n" + 
                        "9. Salir.");
                System.out.print("Ingrese una opcion => ");
                opcion = read.nextInt();
                read.nextLine();
                switch(opcion){
                    case 1:
                        productoSv.ejecutarListarNombresProductos();
                        break;
                    case 2:
                        productoSv.ejecutarListarNombresPreciosProductos();
                        break;
                    case 3:
                        productoSv.ejecutarListarNombrePrecio120_202();
                        break;
                    case 4:
                        productoSv.ejecutarListarProductosPortatiles();
                        break;
                    case 5:
                        productoSv.ejecutarBuscarProductoMasBarato();
                        break;
                    case 6:
                        productoSv.ejecutarNuevoProducto();
                        break;
                    case 7:
                        fabricanteSv.ejecutarNuevoFabricante();
                        break;
                    case 8:
                        productoSv.ejecutarModificarProducto();
                        break;
                    case 9:
                        salir = true;
                        System.out.println("Finalizando..");
                        break;
                    default :
                        System.out.println("Opcion incorrecta");
                }
            }while(salir==false);

            // productoService.crearProducto("Nutella", 3.33, 3);
            // productoService.eliminarProductoPorNombre("Nutella");
            
        } catch (Exception ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        read.close();
    }
}