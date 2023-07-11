package libreria.persistencia;

import java.util.List;

import libreria.entidades.Libro;

public class LibroDAO extends DAO<Libro> {
    
    @Override
    public void guardar(Libro libro) {
        super.guardar(libro);
    }

    public void eliminar(Long isbn) throws Exception {
        Libro libro = buscarPorIsbn(isbn);
        super.eliminar(libro);
    }

    public void darDeBaja(Long isbn) throws Exception {
        Libro libro = buscarPorIsbn(isbn);
        libro.setAlta(false);
    }

    public Libro buscarPorIsbn(Long isbn) throws Exception {
        conectar();
        Libro libro = em.find(Libro.class, isbn);
        desconectar();
        return libro;
    }

    public Libro buscarPorTitulo(String titulo) throws Exception {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE '%:titulo%'")
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

}
