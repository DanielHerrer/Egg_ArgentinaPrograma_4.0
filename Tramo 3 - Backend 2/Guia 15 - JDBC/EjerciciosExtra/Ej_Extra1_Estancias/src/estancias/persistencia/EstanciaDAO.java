package estancias.persistencia;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

import estancias.entidades.Casa;
import estancias.entidades.Cliente;
import estancias.entidades.Estancia;

public final class EstanciaDAO extends DAO {
    
    // INSERT 
    public void guardarEstancia(Estancia e) throws Exception {

        try {
            if (e == null) {
                throw new Exception("Debe indicar una estancia");
            }

            String fechaDesde = new SimpleDateFormat("yyyy-MM-dd").format(e.getFecha_desde()); 
            Date sqlDesde = Date.valueOf(fechaDesde);

            String fechaHasta = new SimpleDateFormat("yyyy-MM-dd").format(e.getFecha_hasta());           
            Date sqlHasta = Date.valueOf(fechaHasta);
            
            String sql = "INSERT INTO estancias (id_cliente, id_casa, nombre_huesped, fecha_desde, fecha_hasta)"
                            + " VALUES ('"+e.getCliente().getId_cliente()+"','"+ e.getCasa().getId_casa()+"','"+ e.getNombre_huesped() +"','"+ sqlDesde +"','"+ sqlHasta +"')";
            insertUpdateDelete(sql);

        } catch(Exception ex) {
            throw ex;
        }
    }

    // UPDATE
    public void modificarEstancia(Estancia e) throws Exception {
        
        try {
            if (e == null) {
                throw new Exception("Debe indicar la estancia que desea modificar");
            }

            String sql = "UPDATE estancias SET "
                            + "id_cliente='"+ e.getCliente().getId_cliente() +"', id_casa='"+ e.getCasa().getId_casa()+"', nombre_huesped='"+e.getNombre_huesped()+"', fecha_desde='"+e.getFecha_desde()+"', fecha_hasta='"+e.getFecha_hasta()+"' WHERE id_estancia='"+ e.getId_estancia() +"'";
            insertUpdateDelete(sql);

        } catch(Exception ex) {
            throw ex;
        } finally {
            desconectarBase();
        }
    }

    // DELETE
    public void eliminarEstanciaPorId(int id) throws Exception {
        try {
            String sql = "DELETE FROM estancias WHERE id_estancia='"+id+"'";
            insertUpdateDelete(sql);

        } catch(Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////

    // e) Listar los datos de todos los clientes que en algún momento realizaron una estancia y la
    // descripcion de la casa donde la realizaron.
    public Collection<Estancia> listarEstanciasConClientes() throws Exception {
        try{

            // String sql = "SELECT cli.id_cliente, cas.id_casa, cli.nombre, cli.pais, cli.ciudad, "+
            //                 "cas.tipo_vivienda, cas.pais, cas.ciudad, "+
            //                 "cas.calle, cas.numero "+
            //                     "FROM clientes cli "+
            //                     "INNER JOIN estancias est ON cli.id_cliente = est.id_cliente "+
            //                     "INNER JOIN casas cas ON est.id_casa = cas.id_casa";
            String sql = "SELECT * FROM estancias";
            consultarBase(sql);

            Estancia e = null;
            Cliente cliente = null;
            Casa casa = null;

            Collection<Estancia> estancias = new ArrayList<>();
            while(resultado.next()){ // resultado es una variable ResultSet de DAO (padre)
                e = new Estancia();

                e.setId_estancia((resultado.getInt(1)));
                cliente = new ClienteDAO().buscarClientePorId((resultado.getInt(2)));
                e.setCliente(cliente);
                casa = new CasaDAO().buscarCasaPorId((resultado.getInt(3)));
                e.setCasa(casa);
                e.setNombre_huesped((resultado.getString(4)));
                e.setFecha_desde((resultado.getDate(5)));
                e.setFecha_hasta((resultado.getDate(6)));

                estancias.add(e);
            }

            desconectarBase();
            return estancias;

        }catch(Exception e){
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }

}
