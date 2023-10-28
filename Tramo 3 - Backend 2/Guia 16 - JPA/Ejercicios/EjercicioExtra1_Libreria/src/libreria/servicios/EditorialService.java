package libreria.servicios;

import java.util.List;
import java.util.Scanner;

import libreria.entidades.Editorial;
import libreria.persistencias.EditorialDAO;

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

    //////////////////////////////////////////////////////////////////////
    
    public void ejecutarListarEditoriales(){
        List<Editorial> listaEditoriales = listarEditoriales();
        if(listaEditoriales.isEmpty()){
            System.out.println("No se ha encontrado ninguna Editorial..");
        }else{
            for(Editorial e: listaEditoriales){
                System.out.println("Editorial:\n ID = "+e.getId()+" || nombre = "+e.getNombre()+" || alta = "+e.getAlta());
            }
        }
    }
    
    public void ejecutarCrearEditorial(){
        System.out.print("Ingrese un nombre para la Editorial => ");
        String nombreE = new Scanner(System.in).nextLine();
        crearEditorial(nombreE);
        System.out.println("Editorial guardada!");
    }
    
}
