package libreria.persistencias;

import java.util.List;

import libreria.entidades.Libro;

public class LibroDAO extends DAO<Libro> {
    
    @Override
    public void guardar(Libro libro) {
        super.guardar(libro);
    }

    public void eliminar(Integer id) throws Exception {
        Libro libro = buscarPorId(id);
        super.eliminar(libro);
    }

    public void darDeBaja(Integer id) throws Exception {
        Libro libro = buscarPorId(id);
        libro.setAlta(false);
        super.editar(libro);
    }

    public Libro buscarPorId(Integer id) throws Exception {
        conectar();
        Libro libro = em.find(Libro.class, id);
        desconectar();
        return libro;
    }
    
    public Libro buscarPorIdAutor(Integer idAutor) throws Exception {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.autor.id = :id")
            .setParameter("id",idAutor).getSingleResult();
        desconectar();
        return libro;
    }

    public Libro buscarPorIsbn(Long isbn) throws Exception {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.isbn = :isbn")
            .setParameter("isbn",isbn).getSingleResult();
        desconectar();
        return libro;
    }
    
    public Libro buscarPorTitulo(String titulo) throws Exception {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo = :titulo")
            .setParameter("titulo",titulo).getSingleResult();
        desconectar();
        return libro;
    }
    
    public List<Libro> listarTodos() throws Exception {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l").getResultList();
        desconectar();
        return libros;
    }

    public List<Libro> listarTodosPorIdAutor(Integer idAutor) throws Exception {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.autor.id = :id")
            .setParameter("id",idAutor).getResultList();
        desconectar();
        return libros;
    }
    
    public List<Libro> listarTodosPorIdEditorial(Integer idEditorial) throws Exception {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.editorial.id = :id")
            .setParameter("id",idEditorial).getResultList();
        desconectar();
        return libros;
    }
    
}

