package libreria.servicios;

import java.util.List;
import java.util.Scanner;

import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencias.LibroDAO;

public class LibroService {
    
    private AutorService as;
    private EditorialService es;
    private final LibroDAO DAO;

    public LibroService() {
        this.DAO = new LibroDAO();
    }

    public void setServicios(AutorService as, EditorialService es) {
        this.as = as;
        this.es = es;
    }

    // este método persiste un registro de tipo Persona en la base de datos
    // a través del método guardar() de la clase DAO.
    public Libro crearLibro(Long isbn, String titulo, Integer anio, Integer ejemplares, Autor autor, Editorial editorial) {

        Libro libro = new Libro();
        try {
            libro.setIsbn(isbn);
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);
            libro.setAutor(autor);
            libro.setEditorial(editorial);

            DAO.guardar(libro);
            return libro;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Libro buscarPorId(Integer id) {
        try {
            return DAO.buscarPorId(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Libro buscarPorIsbn(Long isbn) {
        try {
            return DAO.buscarPorIsbn(isbn);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Libro buscarPorTitulo(String titulo) {
        try {
            return DAO.buscarPorTitulo(titulo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Libro buscarPorAutor(Autor autor) {
        try {
            return DAO.buscarPorIdAutor(autor.getId());
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

    public List<Libro> listarLibros() {
        try {
            return DAO.listarTodos();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public List<Libro> listarLibrosPorAutor(Autor a) {
        try {
            return DAO.listarTodosPorIdAutor(a.getId());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public List<Libro> listarLibrosPorEditorial(Editorial ed) {
        try {
            return DAO.listarTodosPorIdEditorial(ed.getId());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    public void ejecutarListarLibros(){
        List<Libro> listaLibros = listarLibros();
        if(listaLibros.isEmpty()){
            System.out.println("No se ha encontrado ningun Libro..");
        }else{
            for(Libro l: listaLibros){
                System.out.println("Libro:\n ID = "+l.getId()+" || ISBN = "+l.getIsbn()+" || titulo = '"+l.getTitulo()+
                        "' || anio = "+l.getAnio()+"\n || ejemplares = "+l.getEjemplares()+
                        " || ejemplaresPrestados"+l.getEjemplaresPrestados()+
                        " || ejemplaresRestantes = "+l.getEjemplaresRestantes()+
                        " || alta = "+l.getAlta()+" || autor_id = "+l.getAutor().getId()+
                        " || editorial_id = "+l.getEditorial().getId());
            }
        }
    }
    
    public void ejecutarCrearLibro(){
        Scanner read = new Scanner(System.in);
        
        System.out.print("Ingrese ISBN del Libro => ");
        Long isbnL = read.nextLong();
        read.nextLine();
        System.out.print("Ingrese titulo del Libro => ");
        String tituloL = read.nextLine();
        System.out.print("Ingrese anio del Libro => ");
        Integer anioL = read.nextInt();
        read.nextLine();
        System.out.print("Ingrese la cantidad de ejemplares => ");
        Integer cantL = read.nextInt();
        read.nextLine();
        //////////////////////////////////////////////////////////////////
        System.out.println("Seleccione Autor:");
        List<Autor> listAutor = as.listarAutores();
        for(Autor a: listAutor){
            System.out.println("Autor:\n ID = "+a.getId()+" || nombre = "+a.getNombre()+" || alta = "+a.getAlta());
        }
        System.out.print("Ingrese ID del Autor => ");
        int idA = read.nextInt();
        read.nextLine();
        Autor aut = as.buscarPorId(idA);
        //////////////////////////////////////////////////////////////////
        System.out.println("Seleccione Editorial:");
        List<Editorial> listEditorial = es.listarEditoriales();
        for(Editorial e: listEditorial){
            System.out.println("Editorial:\n ID = "+e.getId()+" || nombre = "+e.getNombre()+" || alta = "+e.getAlta());
        }
        System.out.print("Ingrese ID de la Editorial=> ");
        int idE = read.nextInt();
        read.nextLine();
        Editorial edi = es.buscarPorId(idE);
        //////////////////////////////////////////////////////////////////
        crearLibro(isbnL, tituloL, anioL, cantL, aut, edi);
        System.out.println("Libro guardado!");
    }

}
