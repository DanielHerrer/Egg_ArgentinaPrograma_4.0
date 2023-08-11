package libreria.servicios;

import java.util.List;
import java.util.Scanner;

import libreria.entidades.Autor;
import libreria.persistencias.AutorDAO;

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

    public void editarAutor(Autor a, String nombre) {
        try {
            a.setNombre(nombre);
            DAO.editar(a);
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
    
    //////////////////////////////////////////////////////////////////////
    
    public void ejecutarEditarAutor() {
        Scanner read = new Scanner(System.in);
        Autor autor;
        String in, nombre;
        
        if(listarAutores().isEmpty()){
            System.out.println("Primero debe ingresar minimo 1 Autor...");
        }else{
            int idA;
            do{ // SE ELIGE EL AUTOR PARA ACTUALIZAR
                try{
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Seleccione Autor para ACTUALIZAR:");
                    List<Autor> listAutores = listarAutores();
                    for(Autor a: listAutores){
                        System.out.println("Autor:\n ID = "+a.getId()+" || nombre = "+a.getNombre()+" || alta = "+a.getAlta());
                    }
                    System.out.print("Ingrese ID del Autor => ");
                    in = read.nextLine().trim();
                    if (in.isEmpty()) {
                        throw new IllegalArgumentException("El ID del Autor no puede estar vacio.");
                    } else if (!in.matches("\\d+")) {
                        throw new NumberFormatException("El ID del Autor debe ser un numero correcto.");
                    } else if ((Integer.parseInt(in)) < 1 || (Integer.parseInt(in)) > listAutores.size()) {
                        throw new NumberFormatException("El ID no corresponde a ningun Autor.");
                    }
                    idA = Integer.parseInt(in);
                    break;
                }catch(Exception e){
                    System.out.println("Error: "+e.getMessage());
                }
            }while(true);
            autor = buscarPorId(idA);
            //////////////////////////////////////////////////////////////////
            do{
                try{
                    System.out.print("Ingrese un nombre para el Autor => ");
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
            editarAutor(autor,nombre);
            System.out.println("Autor:\n ID = "+autor.getId()+" || nombre = "+autor.getNombre()+" || alta = "+autor.getAlta());
            System.out.println("Autor editado!");
        }
    }
    
    public void ejecutarListarAutores(){
        List<Autor> listaAutores = listarAutores();
        if(listaAutores.isEmpty()){
            System.out.println("No se ha encontrado ningun Autor..");
        }else{
            for(Autor a: listaAutores){
                System.out.println("Autor:\n ID = "+a.getId()+" || nombre = "+a.getNombre()+" || alta = "+a.getAlta());
            }
        }
    }
    
    public void ejecutarCrearAutor(){
        Scanner read = new Scanner(System.in);
        String nombre;
        do{
            try{
                System.out.print("Ingrese un nombre para el Autor => ");
                nombre = read.nextLine().trim();
                if (nombre.isEmpty()) {
                    throw new IllegalArgumentException("El nombre no puede estar vacio.");
                }
                crearAutor(nombre);
                System.out.println("Autor guardado!");
                break;
            }catch(Exception e){
                System.out.println("Error: "+e.getMessage());
            }
        }while(true);
    }
}
