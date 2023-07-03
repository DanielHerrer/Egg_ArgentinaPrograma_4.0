package estancias.persistencia;

import estancias.entidades.Comentario;

public final class ComentarioDAO extends DAO {

    // INSERT 
    public void guardarComentario(Comentario c) throws Exception {

        try {
            if (c == null) {
                throw new Exception("Debe indicar un comentario");
            }

            String sql = "INSERT INTO comentarios (id_casa, comentario)"
                            + " VALUES ('"+c.getCasa().getId_casa()+"','"+ c.getComentario() +"')";
            insertUpdateDelete(sql);

        } catch(Exception e) {
            throw e;
        }
    }

    // UPDATE
    public void modificarComentario(Comentario c) throws Exception {
        
        try {
            if (c == null) {
                throw new Exception("Debe indicar el comentario que desea modificar");
            }

            String sql = "UPDATE comentarios SET "
                            + "id_casa='"+ c.getCasa().getId_casa() +"', comentario='"+ c.getComentario() +"' WHERE id_comentario='"+ c.getId_comentario() +"'";
            insertUpdateDelete(sql);

        } catch(Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    // DELETE
    public void eliminarComentarioPorId(int id) throws Exception {
        try {
            String sql = "DELETE FROM comentarios WHERE id_comentario='"+id+"'";
            insertUpdateDelete(sql);

        } catch(Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

}
