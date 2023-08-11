package libreria.persistencias;

import java.util.List;
import javax.persistence.TypedQuery;

import libreria.persistencias.DAO;
import libreria.entidades.Autor;


public class AutorDAO extends DAO<Autor> {
    
    @Override
    public void guardar(Autor autor) {
        super.guardar(autor);
    }
    
    @Override
    public void editar(Autor autor) {
        super.editar(autor);
    }

    public void eliminar(Integer id) throws Exception {
        Autor autor = buscarPorId(id);
        super.eliminar(autor);
    }

    public void darDeBaja(Integer id) throws Exception {
        Autor autor = buscarPorId(id);
        autor.setAlta(false);
        super.editar(autor);
    }

    public Autor buscarPorId(Integer id) throws Exception {
        conectar();
        Autor autor = em.find(Autor.class, id);
        desconectar();
        return autor;
    }

    public Autor buscarPorNombre(String nombre) throws Exception {
        conectar();
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre = :nombre")
            .setParameter("nombre",nombre).getSingleResult();
        desconectar();
        return autor;
    }

    public List<Autor> listarTodos() throws Exception {
        conectar();
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a").getResultList();
        desconectar();
        return autores;
    }
    
}
