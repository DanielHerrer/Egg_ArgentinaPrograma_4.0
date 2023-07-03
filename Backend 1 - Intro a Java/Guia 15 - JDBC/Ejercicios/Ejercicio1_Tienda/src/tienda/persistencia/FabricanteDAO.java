package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;

import tienda.entidades.Fabricante;

public class FabricanteDAO extends DAO {

    public void guardarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar un fabricante");
            }

            String sql = "INSERT INTO fabricante (nombre)"
                            + " VALUES ('"+fabricante.getNombre()+"')";
            insertUpdateDelete(sql);

        } catch(Exception e) {
            throw e;
        }
    }

    public void modificarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar el producto que desea modificar");
            }

            String sql = "UPDATE fabricante SET "
                            + "nombre='"+fabricante.getNombre()+"' WHERE codigo='"+fabricante.getCodigo()+"'";
            insertUpdateDelete(sql);

        } catch(Exception e) {
            throw e;
        }
    }

    public void eliminarFabricante(Fabricante fabricante) throws Exception {
        try {
            String sql = "DELETE FROM fabricante WHERE codigo='"+fabricante.getCodigo()+"'";
            insertUpdateDelete(sql);
            desconectarBase();

        } catch(Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public void eliminarFabricantePorCodigo(int codigo) throws Exception {
        try {
            String sql = "DELETE FROM fabricante WHERE codigo='"+codigo+"'";
            insertUpdateDelete(sql);
            desconectarBase();

        } catch(Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Fabricante buscarFabricante(Fabricante fabricante) throws Exception {
        try{
            String sql = "SELECT * FROM fabricante WHERE codigo='"+fabricante.getCodigo()+"'";
            consultarBase(sql);

            Fabricante f = null;
            while(resultado.next()){ // resultado es una variable ResultSet de DAO (padre)
                f = new Fabricante();
                f.setCodigo(resultado.getInt(1));
                f.setNombre(resultado.getString(2));
            }

            desconectarBase();
            return f;

        }catch(Exception e){
            desconectarBase();
            throw e;
        }
    }

    public Fabricante buscarFabricantePorCodigo(int codigo) throws Exception {
        try{
            String sql = "SELECT * FROM fabricante WHERE codigo='"+codigo+"'";
            consultarBase(sql);

            Fabricante f = null;
            while(resultado.next()){ // resultado es una variable ResultSet de DAO (padre)
                f = new Fabricante();
                f.setCodigo(resultado.getInt(1));
                f.setNombre(resultado.getString(2));
            }

            desconectarBase();
            return f;

        }catch(Exception e){
            desconectarBase();
            throw e;
        }
    }

    public Fabricante buscarFabricantePorNombre(String nombre) throws Exception {
        try{
            String sql = "SELECT * FROM fabricante WHERE nombre='"+nombre+"' LIMIT 1";
            consultarBase(sql);

            Fabricante fabricante = null;
            while(resultado.next()){ // resultado es una variable ResultSet de DAO (padre)
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
            }

            desconectarBase();
            return fabricante;

        }catch(Exception e){
            desconectarBase();
            throw e;
        }
    }

    public Collection<Fabricante> listarFabricantes() throws Exception {
        try{
            String sql = "SELECT * FROM fabricante";
            consultarBase(sql);

            Fabricante f = null;
            Collection<Fabricante> fabricantes = new ArrayList<>();
            while(resultado.next()){ // resultado es una variable ResultSet de DAO (padre)
                f = new Fabricante();
                f.setCodigo(resultado.getInt(1));
                f.setNombre(resultado.getString(2));
                fabricantes.add(f);
            }

            desconectarBase();
            return fabricantes;

        }catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }
}
