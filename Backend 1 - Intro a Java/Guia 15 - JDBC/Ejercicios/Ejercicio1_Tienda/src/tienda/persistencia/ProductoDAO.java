package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;

import tienda.entidades.Fabricante;
import tienda.entidades.Producto;

public final class ProductoDAO extends DAO {

    // public boolean existeProducto(int codigo) throws Exception {
    //     try{
    //         Producto p = buscarProductoPorCodigo(codigo);
    //         if()
    //     }catch(Exception e){
    //         throw e;
    //     }

    // }

    public void guardarProducto(Producto producto) throws Exception {

        try {
            if (producto == null) {
                throw new Exception("Debe indicar un producto");
            }

            String sql = "INSERT INTO producto (nombre, precio, codigo_fabricante)"
                            + " VALUES ('"+producto.getNombre()+"','"+producto.getPrecio()+"','"+producto.getFabricante().getCodigo()+"')";
            insertUpdateDelete(sql);

        } catch(Exception e) {
            throw e;
        }
    }

    public void modificarProducto(Producto producto) throws Exception {
        
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto que desea modificar");
            }

            String sql = "UPDATE producto SET "
                            + "nombre='"+producto.getNombre()+"', precio='"+producto.getPrecio()+"', codigo_fabricante='"+producto.getFabricante().getCodigo()+"' WHERE codigo='"+producto.getCodigo()+"'";
            insertUpdateDelete(sql);

        } catch(Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminarProductoPorCodigo(int codigo) throws Exception {
        try {
            String sql = "DELETE FROM producto WHERE codigo='"+codigo+"'";
            insertUpdateDelete(sql);

        } catch(Exception e) {
            
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminarProducto(Producto p) throws Exception {
        try {
            String sql = "DELETE FROM producto WHERE codigo='"+p.getCodigo()+"'";
            insertUpdateDelete(sql);
            desconectarBase();

        } catch(Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Producto buscarProductoPorCodigo(int codigo) throws Exception {
        try{
            String sql = "SELECT * FROM producto WHERE codigo='"+codigo+"'";
            consultarBase(sql);

            Producto p = null;
            while(resultado.next()){ // resultado es una variable ResultSet de DAO (padre)
                p = new Producto();
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getDouble(3));
                Integer codigoFabricante = resultado.getInt(4);
                Fabricante fabricante = new FabricanteDAO().buscarFabricantePorCodigo(codigoFabricante);
                p.setFabricante(fabricante);
            }

            return p;

        } catch(Exception e) {   
            throw e;

        } finally {
            desconectarBase();
        }
    }

    public Producto buscarProductoPorNombre(String nombre) throws Exception {
        try{
            String sql = "SELECT * FROM producto WHERE nombre='"+nombre+"' LIMIT 1";
            consultarBase(sql);

            Producto p = null;
            while(resultado.next()){ // resultado es una variable ResultSet de DAO (padre)
                p = new Producto();
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getDouble(3));
                Integer codigoFabricante = resultado.getInt(4);
                Fabricante fabricante = new FabricanteDAO().buscarFabricantePorCodigo(codigoFabricante);
                p.setFabricante(fabricante);
            }

            return p;

        }catch(Exception e){
            throw e;

        } finally {
            desconectarBase();
        }
    }

    public Producto buscarProductoMasBarato() throws Exception {
        try{
            String sql = "SELECT * FROM producto ORDER BY precio ASC LIMIT 1";
            consultarBase(sql);

            Producto p = null;
            while(resultado.next()){ // resultado es una variable ResultSet de DAO (padre)
                p = new Producto();
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getDouble(3));
                Integer codigoFabricante = resultado.getInt(4);
                Fabricante fabricante = new FabricanteDAO().buscarFabricantePorCodigo(codigoFabricante);
                p.setFabricante(fabricante);
            }

            return p;

        }catch(Exception e){
            throw e;

        } finally {
            desconectarBase();
        }
    }

    public Collection<Producto> listarProductos() throws Exception {
        try{
            String sql = "SELECT * FROM producto";
            consultarBase(sql);

            Producto p = null;
            Collection<Producto> productos = new ArrayList<>();
            while(resultado.next()){ // resultado es una variable ResultSet de DAO (padre)
                p = new Producto();
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getDouble(3));
                Integer codigoFabricante = resultado.getInt(4);
                Fabricante fabricante = new FabricanteDAO().buscarFabricantePorCodigo(codigoFabricante);
                p.setFabricante(fabricante);
                productos.add(p);
            }

            desconectarBase();
            return productos;

        }catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        } finally {
            desconectarBase();
        }
    }

    public Collection<Producto> listarProductosPorCodigoFabricante(int codigo_fabricante) throws Exception {
        try{
            String sql = "SELECT * FROM producto WHERE codigo_fabricante='"+codigo_fabricante+"'";
            consultarBase(sql);

            Producto p = null;
            Collection<Producto> productos = new ArrayList<>();
            while(resultado.next()){ // resultado es una variable ResultSet de DAO (padre)
                p = new Producto();
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getDouble(3));
                Integer codigoFabricante = resultado.getInt(4);
                Fabricante fabricante = new FabricanteDAO().buscarFabricantePorCodigo(codigoFabricante);
                p.setFabricante(fabricante);
                productos.add(p);
            }

            desconectarBase();
            return productos;

        }catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        } finally {
            desconectarBase();
        }
    }

    public Collection<Producto> listarProductosPorPrecios(int precio1, int precio2) throws Exception {
        try{
            String sql = "SELECT * FROM producto WHERE precio BETWEEN "+precio1+" AND "+precio2;
            consultarBase(sql);

            Producto p = null;
            Collection<Producto> productos = new ArrayList<>();
            while(resultado.next()){ // resultado es una variable ResultSet de DAO (padre)
                p = new Producto();
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getDouble(3));
                Integer codigoFabricante = resultado.getInt(4);
                Fabricante fabricante = new FabricanteDAO().buscarFabricantePorCodigo(codigoFabricante);
                p.setFabricante(fabricante);
                productos.add(p);
            }

            desconectarBase();
            return productos;

        }catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        } finally {
            desconectarBase();
        }
    }

    public Collection<Producto> listarProductosPorNombre(String nombre) throws Exception {
        try{
            String sql = "SELECT * FROM producto WHERE nombre LIKE '%"+nombre+"%'";
            consultarBase(sql);

            Producto p = null;
            Collection<Producto> productos = new ArrayList<>();
            while(resultado.next()){ // resultado es una variable ResultSet de DAO (padre)
                p = new Producto();
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getDouble(3));
                Integer codigoFabricante = resultado.getInt(4);
                Fabricante fabricante = new FabricanteDAO().buscarFabricantePorCodigo(codigoFabricante);
                p.setFabricante(fabricante);
                productos.add(p);
            }

            desconectarBase();
            return productos;

        }catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        } finally {
            desconectarBase();
        }
    }

}
