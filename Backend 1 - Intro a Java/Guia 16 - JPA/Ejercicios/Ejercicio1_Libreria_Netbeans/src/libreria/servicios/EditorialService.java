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
    
    public void editarEditorial(Editorial editorial, String nombre) {
        try {
            editorial.setNombre(nombre);
            DAO.editar(editorial);
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
    
    public void ejecutarEditarEditorial() {
        Scanner read = new Scanner(System.in);
        Editorial editorial;
        String in, nombre;
        
        if(listarEditoriales().isEmpty()){
            System.out.println("Primero debe ingresar minimo 1 Editorial...");
        }else{
            int idE;
            do{ // SE ELIGE LA EDITORIAL PARA ACTUALIZAR
                try{
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Seleccione Editorial para ACTUALIZAR:");
                    List<Editorial> listEditorial = listarEditoriales();
                    for(Editorial e: listEditorial){
                        System.out.println("Editorial:\n ID = "+e.getId()+" || nombre = "+e.getNombre()+" || alta = "+e.getAlta());
                    }
                    System.out.print("Ingrese ID de la Editorial=> ");
                    in = read.nextLine().trim();
                    if (in.isEmpty()) {
                        throw new IllegalArgumentException("El ID de la Editorial no puede estar vacio.");
                    } else if (!in.matches("\\d+")) {
                        throw new NumberFormatException("El ID de la Editorial debe ser un numero correcto.");
                    } else if ((Integer.parseInt(in)) < 1 || (Integer.parseInt(in)) > listEditorial.size()) {
                        throw new NumberFormatException("El ID no corresponde a ninguna Editorial.");
                    }
                    idE = Integer.parseInt(in);
                    break;
                }catch(Exception e){
                    System.out.println("Error: "+e.getMessage());
                }
            }while(true);
            editorial = buscarPorId(idE);
            //////////////////////////////////////////////////////////////////
            do{
                try{
                    System.out.print("Ingrese un nombre para la Editorial => ");
                    nombre = read.nextLine().trim();
                    if (nombre.isEmpty()) {
                        throw new IllegalArgumentException("El nombre no puede estar vacio.");
                    }
                    break;
                }catch(Exception e){
                    System.out.println("Error: "+e.getMessage());
                }
            }while(true);
            //////////////////////////////////////////////////////////////////
            editarEditorial(editorial,nombre);
            System.out.println("Editorial:\n ID = "+editorial.getId()+" || nombre = "+editorial.getNombre()+" || alta = "+editorial.getAlta());
            System.out.println("Editorial editada!");
        }
    }
    
    public void ejecutarListarEditoriales() {
        List<Editorial> listaEditoriales = listarEditoriales();
        if(listaEditoriales.isEmpty()){
            System.out.println("No se ha encontrado ninguna Editorial..");
        }else{
            for(Editorial e: listaEditoriales){
                System.out.println("Editorial:\n ID = "+e.getId()+" || nombre = "+e.getNombre()+" || alta = "+e.getAlta());
            }
        }
    }
    
    public void ejecutarCrearEditorial() {
        Scanner read = new Scanner(System.in);
        String nombre;
        do{
            try{
                System.out.print("Ingrese un nombre para la Editorial => ");
                nombre = read.nextLine().trim();
                if (nombre.isEmpty()) {
                    throw new IllegalArgumentException("El nombre no puede estar vacio.");
                }
                crearEditorial(nombre);
                System.out.println("Editorial guardada!");
                break;
            }catch(Exception e){
                System.out.println("Error: "+e.getMessage());
            }
        }while(true);
    }
    
}
