package tienda.servicios;

import java.util.Collection;
import java.util.Scanner;

// exceptions creadas
import tienda.entidades.exceptions.EmptyNameException;

import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.persistencia.FabricanteDAO;
import tienda.persistencia.ProductoDAO;

public class ProductoService {

    private Scanner read = new Scanner(System.in);
    private ProductoDAO dao;

    public ProductoService(){
        dao = new ProductoDAO();
    }
    
    public void crearProducto(String nombre, Double precio, Fabricante fabricante) throws Exception, EmptyNameException {
        // Validamos
        if(nombre == null || nombre.trim().isEmpty()){
            throw new EmptyNameException("El campo Nombre es obligatorio");
        }
        if(dao.buscarProductoPorNombre(nombre) != null){
            throw new Exception("Ya existe un producto con el nombre indicado.");
        }
        if(precio == null){
            throw new Exception("El campo Precio es obligatorio");
        }else if(precio.equals(0.0) || precio < 0.0 || precio.isNaN()){
            throw new Exception("El precio es incorrecto");
        }
        if(fabricante == null){
            throw new Exception("El campo Fabricante es obligatorio");
        }

        // Creamos el producto
        Producto producto = new Producto();
        producto.setNombre(nombre);
        producto.setPrecio(precio);
        producto.setFabricante(fabricante);

        // Guarda el producto en la database
        dao.guardarProducto(producto);
    }

    public void eliminarProducto() throws Exception {
        try{
            
            Producto producto = null;
            do {
                System.out.print("Ingrese codigo del producto => ");
                Integer codigoProducto = read.nextInt();
                read.nextLine();
                producto = new ProductoDAO().buscarProductoPorCodigo(codigoProducto);
                if(producto.getCodigo()==null){
                    System.err.println("No se encuentra ningun registro para este código");
                }
            } while(producto.getCodigo()==null);

            dao.eliminarProducto(producto);
            
        }catch(Exception e){
            throw e;
        }
    }

    /////////////////////////////////////////////////////////

    // 1. Listar el nombre de todos los productos que hay en la tabla producto.
    public void ejecutarListarNombresProductos() {
        try{
            Collection<Producto> productos = dao.listarProductos();

            System.out.println("----------------------------------------------");
            System.out.println("Productos: (nombre)");
            for (Producto p : productos) {
                System.out.println("nombre = "+p.getNombre());
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

// 2. Lista los nombres y los precios de todos los productos de la tabla producto.
    public void ejecutarListarNombresPreciosProductos() {
        try{
            Collection<Producto> productos = dao.listarProductos();

            System.out.println("----------------------------------------------");
            System.out.println("Productos: (nombre,precio)");
            for (Producto p : productos) {
                System.out.println("nombre = "+p.getNombre()+" || precio = $"+p.getPrecio());
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

// 3. Listar aquellos productos que su precio esté entre 120 y 202.
    public void ejecutarListarNombrePrecio120_202(){
        try{
            Collection<Producto> productos = dao.listarProductosPorPrecios(120,202);

            System.out.println("----------------------------------------------");
            System.out.println("Productos: (120 <= precio <= 202)");
            for (Producto p : productos) {
                System.out.println("codigo = "+p.getCodigo()+" || nombre = "+p.getNombre()+" || precio = $"+p.getPrecio());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

// 4. Buscar y listar todos los Portátiles de la tabla producto.
    public void ejecutarListarProductosPortatiles(){
        try{
            Collection<Producto> productos = dao.listarProductosPorNombre("Portatil");

            System.out.println("----------------------------------------------");
            System.out.println("Productos: (nombre ~ Portatil)");
            for (Producto p : productos) {
                System.out.println("codigo = "+p.getCodigo()+" || nombre = "+p.getNombre()+" || precio = $"+p.getPrecio());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
// 5. Listar el nombre y el precio del producto más barato.
    public void ejecutarBuscarProductoMasBarato(){
        try{
            Producto p = dao.buscarProductoMasBarato();

            System.out.println("----------------------------------------------");
            System.out.println("Productos: (MIN(precio))");
            System.out.println("nombre = "+p.getNombre()+" || precio = $"+p.getPrecio());

        }catch(Exception e){
            e.printStackTrace();
        }
    }

// 6. Ingresar un producto a la base de datos.
    public void ejecutarNuevoProducto() {
        try{
            System.out.println("Nuevo producto:");
            System.out.print("Ingrese un nombre de producto => ");
            String nombre = read.nextLine();
            System.out.print("Ingrese precio del producto => $");
            Double precio = read.nextDouble();
            read.nextLine();
            Fabricante fabricante = null;
            do {
                System.out.print("Ingrese codigo del fabricante => ");
                Integer codigoFabricante = read.nextInt();
                read.nextLine();
                fabricante = new FabricanteDAO().buscarFabricantePorCodigo(codigoFabricante);
                if(fabricante.getCodigo()==null){
                    System.err.println("No se encuentra ningun registro para este código");
                }
            } while(fabricante.getCodigo()==null);

            crearProducto(nombre, precio, fabricante);

        } catch(EmptyNameException emp) {
            System.out.println("Buenas, no hay nombre chabon");
            emp.printStackTrace();
            ejecutarNuevoProducto();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

// 8. Editar un producto con datos a elección.
    public void ejecutarModificarProducto(){
        try{
            Producto p = null;
            do{
                System.out.print("Ingrese un codigo de producto => ");
                int codProd = read.nextInt();
                read.nextLine();
                p = dao.buscarProductoPorCodigo(codProd);
            }while(p.getCodigo() == null);

            System.out.println("Producto encontrado!");
            System.out.println("codigo = "+p.getCodigo()+" || nombre = "+p.getNombre()+" || precio = $"+p.getPrecio()+" || codigo_fabricante = "+p.getFabricante().getCodigo());
            
            System.out.print("Ingrese un nuevo nombre => ");
            String nombre = read.nextLine();
            System.out.print("Ingrese una nuevo precio => $");
            double precio = read.nextDouble();
            read.nextLine();

            Fabricante fabricante = null;
            do {
                System.out.print("Ingrese un nuevo codigo de fabricante => ");
                Integer codigoFabricante = read.nextInt();
                read.nextLine();
                fabricante = new FabricanteDAO().buscarFabricantePorCodigo(codigoFabricante);
                if(fabricante.getCodigo()==null){
                    System.err.println("No se encuentra ningun fabricante para este código!");
                }
            } while(fabricante.getCodigo()==null);

            p.setNombre(nombre);
            p.setPrecio(precio);
            p.setFabricante(fabricante);

            dao.modificarProducto(p);
            System.out.println("Producto modificado correctamente!");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
