package libreria.servicios;

import java.util.List;

import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

public class AutorService {

    private EditorialService es;
    private LibroService ls;
    private final AutorDAO DAO;

    public AutorService() {
        this.DAO = new AutorDAO();
    }

    public void setServicios(EditorialService es, LibroService ls) {
        this.es = es;
        this.ls = ls;
    }

    // este método persiste un registro de tipo Persona en la base de datos
    // a través del método guardar() de la clase DAO.
    public Autor crearAutor(String nombre) {

        Autor autor = new Autor();
        try {
            autor.setNombre(nombre);

            DAO.guardar(autor);
            return autor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Autor buscarPorId(Integer id) {
        try {
            return DAO.buscarPorId(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Autor buscarPorNombre(String nombre) {
        try {
            return DAO.buscarPorNombre(nombre);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public boolean eliminarPorId(Integer id) {
        try {
            DAO.eliminar(id);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean darDeBajaPorId(Integer id) {
        try {
            DAO.darDeBaja(id);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public List<Autor> listarAutores() {
        try {
            return DAO.listarTodos();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    ///////////////////////////////////////////////////////////////

    // public void mostrarAutorPorNombre() {
        
    // }

}
