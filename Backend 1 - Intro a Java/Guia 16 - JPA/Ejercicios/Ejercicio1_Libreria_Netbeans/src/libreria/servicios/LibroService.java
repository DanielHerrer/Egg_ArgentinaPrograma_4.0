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
    
    public void editarLibro(Libro libro, Long isbn, String titulo, Integer anio, Integer ejemplares, Autor autor, Editorial editorial) {
        try {
            libro.setIsbn(isbn);
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(0);
            libro.setEjemplaresRestantes(0);
            libro.setAutor(autor);
            libro.setEditorial(editorial);

            DAO.editar(libro);
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
    
    public void ejecutarEditarLibro() {
        Scanner read = new Scanner(System.in);
        Libro libro;
        String in, titulo;
        Long isbn;
        Integer anio, cant;
        
        if(listarLibros().isEmpty()){
            System.out.println("Primero debe ingresar minimo 1 Libro...");
        }else{
            do{
                int idL;
                do{ // SE ELIGE EL LIBRO PARA ACTUALIZAR
                    try{
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("Seleccione Libro para ACTUALIZAR:");
                        List<Libro> listaLibros = listarLibros();
                        for(Libro l: listaLibros){
                            System.out.println("Libro:\n ID = "+l.getId()+" || ISBN = "+l.getIsbn()+" || titulo = '"+l.getTitulo()+
                                    "' || anio = "+l.getAnio()+"\n || ejemplares = "+l.getEjemplares()+
                                    " || ejemplaresPrestados = "+l.getEjemplaresPrestados()+
                                    " || ejemplaresRestantes = "+l.getEjemplaresRestantes()+
                                    " || alta = "+l.getAlta()+" || autor_id = "+l.getAutor().getId()+
                                    " || editorial_id = "+l.getEditorial().getId());
                        }
                        System.out.print("Ingrese ID del Libro => ");
                        in = read.nextLine().trim();
                        if (in.isEmpty()) {
                            throw new IllegalArgumentException("El ID del Libro no puede estar vacio.");
                        } else if (!in.matches("\\d+")) {
                            throw new NumberFormatException("El ID del Libro debe ser un numero correcto.");
                        } else if ((Integer.parseInt(in)) < 1 || (Integer.parseInt(in)) > listaLibros.size()) {
                            throw new NumberFormatException("El ID no corresponde a ningun Libro.");
                        }
                        idL = Integer.parseInt(in);
                        break;
                    }catch(Exception e){
                        System.out.println("Error: "+e.getMessage());
                    }
                }while(true);
                libro = buscarPorId(idL);
                
                try {
                    System.out.print("Ingrese ISBN del Libro => ");
                    in = read.nextLine().trim();
                    if (in.isEmpty()) {
                        throw new IllegalArgumentException("El ISBN no puede estar vacio.");
                    } else if (!in.matches("\\d+")) {
                        throw new NumberFormatException("El ISBN debe ser un numero correcto.");
                    }
                    isbn = Long.parseLong(in);

                    System.out.print("Ingrese titulo del Libro => ");
                    titulo = read.nextLine().trim();
                    if (titulo.isEmpty()) {
                        throw new IllegalArgumentException("El titulo no puede estar vacio.");
                    }

                    System.out.print("Ingrese anio del Libro => ");
                    in = read.nextLine().trim();
                    if (in.isEmpty()) {
                        throw new IllegalArgumentException("El anio no puede estar vacio.");
                    } else if (!in.matches("\\d+")) {
                        throw new NumberFormatException("El anio debe ser un numero correcto.");
                    } else if ((Integer.parseInt(in)) > 2023 || (Integer.parseInt(in)) < 1) {
                        throw new NumberFormatException("El anio debe ser un anio existente.");
                    }
                    anio = Integer.parseInt(in);

                    System.out.print("Ingrese la cantidad de ejemplares => ");
                    in = read.nextLine().trim();
                    if (in.isEmpty()) {
                        throw new IllegalArgumentException("La cantidad de ejemplares no puede estar vacio.");
                    } else if (!in.matches("\\d+")) {
                        throw new NumberFormatException("La cantidad de ejemplares debe ser un numero correcto.");
                    } else if ((Integer.parseInt(in)) < 1) {
                        throw new NumberFormatException("La cantidad de ejemplares debe ser un numero mayor o igual a 1.");
                    }
                    cant = Integer.parseInt(in);
                    break;
                } catch(Exception e) {
                    System.out.println("Error: "+e.getMessage());
                }
            }while(true);

            //////////////////////////////////////////////////////////////////
            int idA;
            do{
                try{
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Seleccione Autor:");
                    List<Autor> listAutor = as.listarAutores();
                    for(Autor a: listAutor){
                        System.out.println("Autor:\n ID = "+a.getId()+" || nombre = "+a.getNombre()+" || alta = "+a.getAlta());
                    }
                    System.out.print("Ingrese ID del Autor => ");
                    in = read.nextLine().trim();
                    if (in.isEmpty()) {
                        throw new IllegalArgumentException("El ID del Autor no puede estar vacio.");
                    } else if (!in.matches("\\d+")) {
                        throw new NumberFormatException("El ID del Autor debe ser un numero correcto.");
                    } else if ((Integer.parseInt(in)) < 1 || (Integer.parseInt(in)) > listAutor.size()) {
                        throw new NumberFormatException("El ID no corresponde a ningun Autor.");
                    }
                    idA = Integer.parseInt(in);
                    break;
                }catch(Exception e){
                    System.out.println("Error: "+e.getMessage());
                }
            }while(true);
            Autor aut = as.buscarPorId(idA);
            //////////////////////////////////////////////////////////////////
            int idE;
            do{
                try{
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Seleccione Editorial:");
                    List<Editorial> listEditorial = es.listarEditoriales();
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
            Editorial edi = es.buscarPorId(idE);
            //////////////////////////////////////////////////////////////////
            editarLibro(libro,isbn, titulo, anio, cant, aut, edi);
            System.out.println("Libro:\n ID = "+libro.getId()+" || ISBN = "+libro.getIsbn()+" || titulo = '"+libro.getTitulo()+
                                    "' || anio = "+libro.getAnio()+"\n || ejemplares = "+libro.getEjemplares()+
                                    " || ejemplaresPrestados = "+libro.getEjemplaresPrestados()+
                                    " || ejemplaresRestantes = "+libro.getEjemplaresRestantes()+
                                    " || alta = "+libro.getAlta()+" || autor_id = "+libro.getAutor().getId()+
                                    " || editorial_id = "+libro.getEditorial().getId());
            System.out.println("Libro editado!");
        }
    }
    
    public void ejecutarListarLibros() {
        List<Libro> listaLibros = listarLibros();
        if(listaLibros.isEmpty()){
            System.out.println("No se ha encontrado ningun Libro..");
        }else{
            for(Libro l: listaLibros){
                System.out.println("Libro:\n ID = "+l.getId()+" || ISBN = "+l.getIsbn()+" || titulo = '"+l.getTitulo()+
                        "' || anio = "+l.getAnio()+"\n || ejemplares = "+l.getEjemplares()+
                        " || ejemplaresPrestados = "+l.getEjemplaresPrestados()+
                        " || ejemplaresRestantes = "+l.getEjemplaresRestantes()+
                        " || alta = "+l.getAlta()+" || autor_id = "+l.getAutor().getId()+
                        " || editorial_id = "+l.getEditorial().getId());
            }
        }
    }
    
    public void ejecutarCrearLibro() {
        Scanner read = new Scanner(System.in);
        String in, titulo;
        Long isbn;
        Integer anio, cant;
        
        if(as.listarAutores().isEmpty() || es.listarEditoriales().isEmpty()){
            System.out.println("Primero debe ingresar minimo 1 Autor y 1 Editorial...");
        }else{
            do{
                try {
                    System.out.print("Ingrese ISBN del Libro => ");
                    in = read.nextLine().trim();
                    if (in.isEmpty()) {
                        throw new IllegalArgumentException("El ISBN no puede estar vacio.");
                    } else if (!in.matches("\\d+")) {
                        throw new NumberFormatException("El ISBN debe ser un numero correcto.");
                    }
                    isbn = Long.parseLong(in);

                    System.out.print("Ingrese titulo del Libro => ");
                    titulo = read.nextLine().trim();
                    if (titulo.isEmpty()) {
                        throw new IllegalArgumentException("El titulo no puede estar vacio.");
                    }

                    System.out.print("Ingrese anio del Libro => ");
                    in = read.nextLine().trim();
                    if (in.isEmpty()) {
                        throw new IllegalArgumentException("El anio no puede estar vacio.");
                    } else if (!in.matches("\\d+")) {
                        throw new NumberFormatException("El anio debe ser un numero correcto.");
                    } else if ((Integer.parseInt(in)) > 2023 || (Integer.parseInt(in)) < 1) {
                        throw new NumberFormatException("El anio debe ser un anio existente.");
                    }
                    anio = Integer.parseInt(in);

                    System.out.print("Ingrese la cantidad de ejemplares => ");
                    in = read.nextLine().trim();
                    if (in.isEmpty()) {
                        throw new IllegalArgumentException("La cantidad de ejemplares no puede estar vacio.");
                    } else if (!in.matches("\\d+")) {
                        throw new NumberFormatException("La cantidad de ejemplares debe ser un numero correcto.");
                    } else if ((Integer.parseInt(in)) < 1) {
                        throw new NumberFormatException("La cantidad de ejemplares debe ser un numero mayor o igual a 1.");
                    }
                    cant = Integer.parseInt(in);
                    break;
                } catch(Exception e) {
                    System.out.println("Error: "+e.getMessage());
                }
            }while(true);

            //////////////////////////////////////////////////////////////////
            int idA;
            do{
                try{
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Seleccione Autor:");
                    List<Autor> listAutor = as.listarAutores();
                    for(Autor a: listAutor){
                        System.out.println("Autor:\n ID = "+a.getId()+" || nombre = "+a.getNombre()+" || alta = "+a.getAlta());
                    }
                    System.out.print("Ingrese ID del Autor => ");
                    in = read.nextLine().trim();
                    if (in.isEmpty()) {
                        throw new IllegalArgumentException("El ID del Autor no puede estar vacio.");
                    } else if (!in.matches("\\d+")) {
                        throw new NumberFormatException("El ID del Autor debe ser un numero correcto.");
                    } else if ((Integer.parseInt(in)) < 1 || (Integer.parseInt(in)) > listAutor.size()) {
                        throw new NumberFormatException("El ID no corresponde a ningun Autor.");
                    }
                    idA = Integer.parseInt(in);
                    break;
                }catch(Exception e){
                    System.out.println("Error: "+e.getMessage());
                }
            }while(true);
            Autor aut = as.buscarPorId(idA);
            //////////////////////////////////////////////////////////////////
            int idE;
            do{
                try{
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Seleccione Editorial:");
                    List<Editorial> listEditorial = es.listarEditoriales();
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
            Editorial edi = es.buscarPorId(idE);
            //////////////////////////////////////////////////////////////////
            crearLibro(isbn, titulo, anio, cant, aut, edi);
            System.out.println("Libro guardado!");
        }
    }

}
