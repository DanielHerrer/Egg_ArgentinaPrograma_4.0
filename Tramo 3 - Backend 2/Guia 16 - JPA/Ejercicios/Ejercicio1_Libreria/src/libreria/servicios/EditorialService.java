package libreria.servicios;

import java.util.List;

import libreria.entidades.Editorial;
import libreria.persistencia.EditorialDAO;

public class EditorialService {
    
    private AutorService as;
    private LibroService ls;
    private final EditorialDAO DAO;

    public EditorialService() {
        this.DAO = new EditorialDAO();
    }

    public void setServicios(AutorService as, LibroService ls) {
        this.as = as;
        this.ls = ls;
    }

    // este método persiste un registro de tipo Persona en la base de datos
    // a través del método guardar() de la clase DAO.
    public Editorial crearEditorial(String nombre) {

        Editorial editorial = new Editorial();
        try {
            editorial.setNombre(nombre);

            DAO.guardar(editorial);
            return editorial;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Editorial buscarPorId(Integer id) {
        try {
            return DAO.buscarPorId(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Editorial buscarPorNombre(String nombre) {
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

    public List<Editorial> listarEditoriales() {
        try {
            return DAO.listarTodos();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
