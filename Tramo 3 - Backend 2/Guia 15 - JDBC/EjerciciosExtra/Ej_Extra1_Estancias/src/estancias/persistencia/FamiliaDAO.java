package estancias.persistencia;

import java.util.ArrayList;
import java.util.Collection;

import estancias.entidades.Casa;
import estancias.entidades.Familia;

public final class FamiliaDAO extends DAO {
    
    // INSERT 
    public void guardarFamilia(Familia f) throws Exception {

        try {
            if (f == null) {
                throw new Exception("Debe indicar una familia");
            }

            String sql = "INSERT INTO familias (nombre,edad_minima,edad_maxima,num_hijos,email,id_casa_familia)"
                            + " VALUES ('"+f.getNombre()+"','"+f.getEdad_minima()+"','"+f.getEdad_maxima()+"','"+f.getNum_hijos()+"','"+f.getEmail()+"','"+f.getCasa_familia().getId_casa()+"')";
            insertUpdateDelete(sql);

        } catch(Exception e) {
            throw e;
        }
    }

    // UPDATE
    public void modificarFamilia(Familia f) throws Exception {
        
        try {
            if (f == null) {
                throw new Exception("Debe indicar la familia que desea modificar");
            }

            String sql = "UPDATE familias SET "
                            + "nombre='"+f.getNombre()+"', edad_minima='"+f.getEdad_minima()+"', edad_maxima='"+f.getEdad_maxima()+"', num_hijos='"+f.getNum_hijos()+"', email='"+f.getEmail()+"', id_casa_familia='"+f.getCasa_familia().getId_casa()+"' WHERE id_familia='"+f.getId_familia()+"'";
            insertUpdateDelete(sql);

        } catch(Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    // DELETE
    public void eliminarFamiliaPorId(int id) throws Exception {
        try {
            String sql = "DELETE FROM familias WHERE id_familia='"+id+"'";
            insertUpdateDelete(sql);

        } catch(Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

///////////////////////////////////////////////////////////

    // SELECT 

    // a) Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años.
    public Collection<Familia> listarFamilias3hijos10anios() throws Exception {
        try{
            String sql = "SELECT * FROM familias WHERE num_hijos >= 3 AND edad_maxima < 10";
            consultarBase(sql);

            // nombre,edad_minima,edad_maxima,num_hijos,email,id_casa_familia
            Familia f = null;
            Collection<Familia> familias = new ArrayList<>();
            while(resultado.next()){ // resultado es una variable ResultSet de DAO (padre)
                f = new Familia();
                f.setId_familia(resultado.getInt(1));
                f.setNombre(resultado.getString(2));
                f.setEdad_minima(resultado.getInt(3));
                f.setEdad_maxima(resultado.getInt(4));
                f.setNum_hijos(resultado.getInt(5));
                f.setEmail(resultado.getString(6));
                Integer id_casa_familia = resultado.getInt(7);
                Casa casaFamilia = new CasaDAO().buscarCasaPorId(id_casa_familia);
                f.setCasa_familia(casaFamilia);

                familias.add(f);
            }

            desconectarBase();
            return familias;

        }catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }

    // c) Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail.
    public Collection<Familia> listaFamiliasHotmail() throws Exception {
        try{
            String sql = "SELECT * FROM familias WHERE email LIKE '%@hotmail%'";
            consultarBase(sql);

            // nombre,edad_minima,edad_maxima,num_hijos,email,id_casa_familia
            Familia f = null;
            Collection<Familia> familias = new ArrayList<>();
            while(resultado.next()){ // resultado es una variable ResultSet de DAO (padre)
                f = new Familia();
                f.setId_familia(resultado.getInt(1));
                f.setNombre(resultado.getString(2));
                f.setEdad_minima(resultado.getInt(3));
                f.setEdad_maxima(resultado.getInt(4));
                f.setNum_hijos(resultado.getInt(5));
                f.setEmail(resultado.getString(6));
                Integer id_casa_familia = resultado.getInt(7);
                Casa casaFamilia = new CasaDAO().buscarCasaPorId(id_casa_familia);
                f.setCasa_familia(casaFamilia);

                familias.add(f);
            }

            desconectarBase();
            return familias;

        }catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }



}
