package estancias.persistencia;

import estancias.entidades.Cliente;

public final class ClienteDAO extends DAO {
    
    // INSERT 
    public void guardarCliente(Cliente c) throws Exception {

        try {
            if (c == null) {
                throw new Exception("Debe indicar un cliente");
            }

            String sql = "INSERT INTO clientes (nombre, calle, numero, codigo_postal, ciudad, pais, email)"
                            + " VALUES ('"+c.getNombre()+"','"+c.getCalle()+"','"+c.getNumero()+"','"+c.getCodigo_postal()+"','"+c.getCiudad()+"','"+c.getPais()+"','"+c.getEmail()+"')";
            insertUpdateDelete(sql);

        } catch(Exception e) {
            throw e;
        }
    }

    // UPDATE
    public void modificarCliente(Cliente c) throws Exception {
        
        try {
            if (c == null) {
                throw new Exception("Debe indicar el cliente que desea modificar");
            }

            String sql = "UPDATE clientes SET "
                            + "nombre='"+c.getNombre()+"', calle='"+c.getCalle()+"', numero='"+c.getNumero()+"', codigo_postal='"+c.getCodigo_postal()+"', ciudad='"+c.getCiudad()+"', pais='"+c.getPais()+"', email='"+c.getEmail()+"' WHERE id_cliente='"+c.getId_cliente() +"'";
            insertUpdateDelete(sql);

        } catch(Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    // DELETE
    public void eliminarClientePorId(int id) throws Exception {
        try {
            String sql = "DELETE FROM clientes WHERE id_cliente='"+id+"'";
            insertUpdateDelete(sql);

        } catch(Exception e) {
            
            throw e;
        } finally {
            desconectarBase();
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////

    // Cliente = id_cliente, nombre, calle, numero, codigo_postal, ciudad, pais, email
    public Cliente buscarClientePorId(int id) throws Exception {
        try{
            String sql = "SELECT * FROM clientes WHERE id_cliente='"+id+"'";
            consultarBase(sql);

            Cliente c = null;
            while(resultado.next()){ // resultado es una variable ResultSet de DAO (padre)
                c = new Cliente();
                c.setId_cliente(resultado.getInt(1));
                c.setNombre(resultado.getString(2));
                c.setCalle(resultado.getString(3));
                c.setNumero(resultado.getInt(4));
                c.setCodigo_postal(resultado.getString(5));
                c.setCiudad(resultado.getString(6));
                c.setPais(resultado.getString(7));
                c.setEmail(resultado.getString(8));
            }

            return c;

        } catch(Exception e) {   
            throw e;

        } finally {
            desconectarBase();
        }
    }

    public int buscarIdPorCliente(Cliente c) throws Exception {
        try{
            String sql = "SELECT * FROM clientes WHERE nombre = '"+c.getNombre()+"' AND calle = '"+c.getCalle()+"' AND numero = '"+c.getNumero()+"' AND codigo_postal = '"+c.getCodigo_postal()+"' AND ciudad = '"+c.getCiudad()+"' AND pais = '"+c.getPais()+"' AND email = '"+c.getEmail()+"'";
            consultarBase(sql);

            int id_cliente = 0;

            while(resultado.next()){
                id_cliente = resultado.getInt(1);
            }

            return id_cliente;

        } catch(Exception e) {   
            throw e;

        } finally {
            desconectarBase();
        }
    }

}
