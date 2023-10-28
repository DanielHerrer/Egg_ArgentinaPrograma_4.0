// GUIA 16 EJECICIO 1 - Daniel Franco Herrera
// 1) Crear base de datos Librería
// 2) Crear unidad de persistencia
// 3) Crear entidades previamente mencionadas (excepto Préstamo)
// 4) Generar las tablas con JPA
// 5) Crear servicios previamente mencionados.
// 6) Crear los métodos para persistir entidades en la base de datos librería
// 7) Crear los métodos para dar de alta/bajo o editar dichas entidades.
///////////////////////////////////////////////////////////////////////////////
// 8) Búsqueda de un Autor por nombre.
// 9) Búsqueda de un libro por ISBN.
// 10) Búsqueda de un libro por Título.
// 11) Búsqueda de un libro/s por nombre de Autor.
// 12) Búsqueda de un libro/s por nombre de Editorial.

// 13) Agregar las siguientes validaciones a todas las funcionalidades de la aplicación:
// • Validar campos obligatorios.
// • No ingresar datos duplicados.

package libreria.main;

import java.util.List;
import java.util.Scanner;

import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.servicios.AutorService;
import libreria.servicios.EditorialService;
import libreria.servicios.LibroService;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Bienvenido a la Libreria JPA!");

        Scanner read = new Scanner(System.in);
        System.out.println("Creando EditorialService");
        EditorialService es = new EditorialService();
        System.out.println("Creando AutorService");
        AutorService as = new AutorService();
        System.out.println("Creando LibroService");
        LibroService ls = new LibroService();
        es.setServicios(as, ls);
        as.setServicios(es, ls);
        ls.setServicios(as, es);

        Libro libro = null;
        Autor autor = null;
        Editorial editorial = null;

        boolean salir = false;
        do{
            System.out.println("-------------------------------------------");
            System.out.println("MENU:");
            System.out.println("1. CRUD \n"+
                                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n"+
                                "2. Buscar un Autor por nombre \n"+
                                "3. Buscar un Libro por ISBN \n"+
                                "4. Buscar un Libro por titulo \n"+
                                "5. Buscar Libro/s por nombre de Autor \n"+
                                "6. Buscar Libro/s por nombre de Editorial \n"+
                                "7. - \n"+
                                "8. - \n"+
                                "9. - \n"+
                                "10. Salir");
            int op;
            do{
                try {
                    System.out.print("Ingrese una opcion => ");
                    String input = read.nextLine();
                    if (!input.matches("\\d+")) {   // '\\d' representa un numero del 0 al 9 y el '+' representa numeros consecutivos
                        throw new NumberFormatException();
                    }
                    op = Integer.parseInt(input);
                    if (op < 1 || op > 10) {
                        throw new IllegalArgumentException();
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Ingrese un número válido.");
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: Opción inválida.");
                }
            }while(true);
            

            boolean volver;
            switch(op){
                case 1: // -----------------------------------------------------------------------------------------------
                    System.out.println("-------------------------------------------");
                                System.out.println("MENU (CRUD):");
                                System.out.println("1. SELECT \n"+
                                                    "2. INSERT \n"+
                                                    "3. UPDATE \n"+
                                                    "4. DELETE (Sin terminar) \n"+
                                                    "5. Volver");
                    System.out.print("Ingrese una opcion => ");
                    op = read.nextInt();
                    read.nextLine();
                    switch(op){
                        case 1:
                            volver = false;
                            do{
                                System.out.println("-------------------------------------------");
                                System.out.println("MENU (SELECT):");
                                System.out.println("1. Autor \n"+
                                                    "2. Editorial \n"+
                                                    "3. Libro \n"+
                                                    "4. Volver");
                                
                                do{
                                    try {
                                        System.out.print("Ingrese una opcion => ");
                                        String input = read.nextLine();
                                        if (!input.matches("\\d+")) {
                                            throw new NumberFormatException();
                                        }
                                        op = Integer.parseInt(input);
                                        if (op < 1 || op > 4) {
                                            throw new IllegalArgumentException();
                                        }
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Error: Ingrese un número válido.");
                                    } catch (IllegalArgumentException e) {
                                        System.out.println("Error: Opción inválida.");
                                    }
                                }while(true);
                                
                                switch(op){
                                    case 1:
                                        System.out.println("-------------------------------------------");
                                        as.ejecutarListarAutores();
                                        break;
                                    case 2:
                                        System.out.println("-------------------------------------------");
                                        es.ejecutarListarEditoriales();
                                        break;
                                    case 3:
                                        System.out.println("-------------------------------------------");
                                        ls.ejecutarListarLibros();
                                        break;
                                    case 4:
                                        System.out.println("-------------------------------------------");
                                        volver = true;
                                        System.out.println("Volviendo a MENU (CRUD)");
                                        break;
                                    default:
                                        System.out.println("-------------------------------------------");
                                        System.out.println("Opcion incorrecta..");
                                }
                            }while(!volver);
                            break;
                            
                        case 2: 
                            volver = false;
                            do{
                                System.out.println("-------------------------------------------");
                                System.out.println("MENU (INSERT):");
                                System.out.println("1. Autor \n"+
                                                    "2. Editorial \n"+
                                                    "3. Libro  \n"+
                                                    "4. Volver");
                                
                                do{
                                    try {
                                        System.out.print("Ingrese una opcion => ");
                                        String input = read.nextLine();
                                        if (!input.matches("\\d+")) {
                                            throw new NumberFormatException();
                                        }
                                        op = Integer.parseInt(input);
                                        if (op < 1 || op > 4) {
                                            throw new IllegalArgumentException();
                                        }
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Error: Ingrese un número válido.");
                                    } catch (IllegalArgumentException e) {
                                        System.out.println("Error: Opción inválida.");
                                    }
                                }while(true);
                                
                                switch(op){
                                    case 1:
                                        System.out.println("-------------------------------------------");
                                        as.ejecutarCrearAutor();
                                        break;
                                    case 2:
                                        System.out.println("-------------------------------------------");
                                        es.ejecutarCrearEditorial();
                                        break;
                                    case 3:
                                        System.out.println("-------------------------------------------");
                                        ls.ejecutarCrearLibro();
                                        break;
                                    case 4:
                                        System.out.println("-------------------------------------------");
                                        volver = true;
                                        System.out.println("Volviendo a MENU (CRUD)");
                                        break;
                                    default:
                                        System.out.println("-------------------------------------------");
                                        System.out.println("Opcion incorrecta..");
                                }
                            }while(!volver);
                        case 3:
                            volver = false;
                            do{
                                System.out.println("-------------------------------------------");
                                System.out.println("MENU (UPDATE):");
                                System.out.println("1. Autor \n"+
                                                    "2. Editorial \n"+
                                                    "3. Libro  \n"+
                                                    "4. Volver");
                                
                                do{
                                    try {
                                        System.out.print("Ingrese una opcion => ");
                                        String input = read.nextLine();
                                        if (!input.matches("\\d+")) {
                                            throw new NumberFormatException();
                                        }
                                        op = Integer.parseInt(input);
                                        if (op < 1 || op > 4) {
                                            throw new IllegalArgumentException();
                                        }
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Error: Ingrese un número válido.");
                                    } catch (IllegalArgumentException e) {
                                        System.out.println("Error: Opción inválida.");
                                    }
                                }while(true);
                                
                                switch(op){
                                    case 1:
                                        System.out.println("-------------------------------------------");
                                        as.ejecutarEditarAutor();
                                        break;
                                    case 2:
                                        System.out.println("-------------------------------------------");
                                        es.ejecutarEditarEditorial();
                                        break;
                                    case 3:
                                        System.out.println("-------------------------------------------");
                                        ls.ejecutarEditarLibro();
                                        break;
                                    case 4:
                                        System.out.println("-------------------------------------------");
                                        volver = true;
                                        System.out.println("Volviendo a MENU (CRUD)");
                                        break;
                                    default:
                                        System.out.println("-------------------------------------------");
                                        System.out.println("Opcion incorrecta..");
                                }
                            }while(!volver);
                            break;
                        case 4:
                            volver = false;
                            do{
                                System.out.println("-------------------------------------------");
                                System.out.println("MENU (DELETE):");
                                System.out.println("1. Autor (sin terminar)\n"+
                                                    "2. Editorial (sin terminar)\n"+
                                                    "3. Libro  (sin terminar)\n"+
                                                    "4. Volver");
                                
                                do{
                                    try {
                                        System.out.print("Ingrese una opcion => ");
                                        String input = read.nextLine();
                                        if (!input.matches("\\d+")) {
                                            throw new NumberFormatException();
                                        }
                                        op = Integer.parseInt(input);
                                        if (op < 1 || op > 4) {
                                            throw new IllegalArgumentException();
                                        }
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Error: Ingrese un número válido.");
                                    } catch (IllegalArgumentException e) {
                                        System.out.println("Error: Opción inválida.");
                                    }
                                }while(true);
                                
                                switch(op){
                                    case 1:
                                        System.out.println("-------------------------------------------");
                                        
                                        break;
                                    case 2:
                                        System.out.println("-------------------------------------------");
                                        
                                        break;
                                    case 3:
                                        System.out.println("-------------------------------------------");
                                        
                                        break;
                                    case 4:
                                        System.out.println("-------------------------------------------");
                                        volver = true;
                                        System.out.println("Volviendo a MENU (CRUD)");
                                        break;
                                    default:
                                        System.out.println("-------------------------------------------");
                                        System.out.println("Opcion incorrecta..");
                                }
                            }while(!volver);
                            break;
                        case 5:
                            System.out.println("-------------------------------------------");
                            volver = true;
                            System.out.println("Volviendo a MENU");
                            break;
                        default:
                            System.out.println("Opcion incorrecta");
                    }
                    break;
                case 2: 
                    System.out.println("-------------------------------------------");
                    String nombre;
                    do{
                        try {
                            System.out.print("Ingrese un nombre de Autor => ");
                            nombre =  read.nextLine().trim();
                            if (nombre.isEmpty()) {
                                throw new IllegalArgumentException("El nombre no puede estar vacío.");
                            } else if (nombre.matches(".*\\d.*")) {
                                throw new IllegalArgumentException("El nombre no puede contener números.");
                            }
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: "+e.getMessage());
                        }
                    }while(true);
                    
                    autor = as.buscarPorNombre(nombre);
                    if(autor == null){
                        System.out.println("No se ha encontrado ningun Autor con un nombre igual o parecido..");
                    }else{
                        System.out.println("Autor:\n ID = "+autor.getId()+" || nombre = "+autor.getNombre()+" || alta = "+autor.getAlta());
                    }
                    autor = null;
                    break;
                case 3:
                    System.out.println("-------------------------------------------");
                    Long isbn;
                    do{
                        try {
                            System.out.print("Ingrese un ISBN de Libro => ");
                            String input = read.nextLine().trim();
                            if (input.isEmpty()) {
                                throw new IllegalArgumentException("El ISBN no puede estar vacio.");
                            } else if (!input.matches("\\d+")) {
                                throw new NumberFormatException("El ISBN debe ser un numero correcto.");
                            }
                            isbn = Long.parseLong(input);
                            break;
                        } catch (Exception e) {
                            System.out.println("Error: "+e.getMessage());
                        }
                    }while(true);

                    libro = ls.buscarPorIsbn(isbn);
                    if(libro == null){
                        System.out.println("No se ha encontrado ningun Libro con un ISBN igual..");
                    }else{
                        System.out.println("Libro:\n ISBN = "+libro.getIsbn()+" || titulo = '"+libro.getTitulo()+"' || anio = "+libro.getAnio()+"\n || ejemplares = "+libro.getEjemplares()+" || ejemplaresPrestados"+libro.getEjemplaresPrestados()+" || ejemplaresRestantes = "+libro.getEjemplaresRestantes()+" || alta = "+libro.getAlta());
                    }
                    libro = null;
                    break;
                case 4:
                    System.out.println("-------------------------------------------");
                    String titulo = null;
                    do{
                        try {
                            System.out.print("Ingrese un titulo de Libro => ");
                            nombre = read.nextLine().trim();
                            if (nombre.isEmpty()) {
                                throw new IllegalArgumentException("El nombre no puede estar vacío.");
                            } else if (nombre.matches(".*\\d.*")) {
                                throw new IllegalArgumentException("El nombre no puede contener números.");
                            }
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: "+e.getMessage());
                        }
                    }while(true);
                    
                    libro = ls.buscarPorTitulo(titulo);
                    if(libro == null){
                        System.out.println("No se ha encontrado ningun Libro con un titulo igual o parecido..");
                    }else{
                        System.out.println("Libro:\n ISBN = "+libro.getIsbn()+" || titulo = '"+libro.getTitulo()+"' || anio = "+libro.getAnio()+"\n || ejemplares = "+libro.getEjemplares()+" || ejemplaresPrestados"+libro.getEjemplaresPrestados()+" || ejemplaresRestantes = "+libro.getEjemplaresRestantes()+" || alta = "+libro.getAlta());
                    }
                    libro = null;
                    break;
                case 5:
                    System.out.println("-------------------------------------------");
                    do{
                        try {
                            System.out.print("Ingrese un nombre de Autor => ");
                            nombre = read.nextLine().trim();
                            if (nombre.isEmpty()) {
                                throw new IllegalArgumentException("El nombre no puede estar vacío.");
                            } else if (nombre.matches(".*\\d.*")) {
                                throw new IllegalArgumentException("El nombre no puede contener números.");
                            }
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: "+e.getMessage());
                        }
                    }while(true);
                    
                    autor = as.buscarPorNombre(nombre);
                    if(autor == null){
                        System.out.println("No se ha encontrado ningun Autor con un nombre igual o parecido..");
                    }else{
                        List<Libro> libros = ls.listarLibrosPorAutor(autor);
                        if(libros.isEmpty()){
                            System.out.println("No se ha encontrado ningun Libro con ese Autor..");
                        }else{
                            for(Libro l: libros){
                                System.out.println("Libro:\n ISBN = "+l.getIsbn()+" || titulo = '"+l.getTitulo()+"' || anio = "+l.getAnio()+" || autor = '"+l.getAutor().getNombre()+"'\n || ejemplares = "+l.getEjemplares()+" || ejemplaresPrestados"+l.getEjemplaresPrestados()+" || ejemplaresRestantes = "+l.getEjemplaresRestantes()+" || alta = "+l.getAlta());
                            }
                        }
                        libros = null;
                    }
                    autor = null;
                    break;
                case 6:
                    System.out.println("-------------------------------------------");
                    do{
                        try {
                            System.out.print("Ingrese un nombre de Editorial => ");
                            nombre = read.nextLine().trim();
                            if (nombre.isEmpty()) {
                                throw new IllegalArgumentException("El nombre no puede estar vacío.");
                            } else if (nombre.matches(".*\\d.*")) {
                                throw new IllegalArgumentException("El nombre no puede contener números.");
                            }
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: "+e.getMessage());
                        }
                    }while(true);
                    
                    editorial = es.buscarPorNombre(nombre);
                    
                    if(editorial == null){
                        System.out.println("No se ha encontrado ninguna Editorial con un nombre igual o parecido..");
                    }else{
                        List<Libro> libros = ls.listarLibrosPorEditorial(editorial);
                        if(libros.isEmpty()){
                            System.out.println("No se ha encontrado ningun Libro con esa Editorial..");
                        }else{
                            for(Libro l: libros){
                                System.out.println("Libro:\n ISBN = "+l.getIsbn()+" || titulo = '"+l.getTitulo()+"' || anio = "+l.getAnio()+" || editorial = '"+l.getEditorial().getNombre()+"'\n || ejemplares = "+l.getEjemplares()+" || ejemplaresPrestados"+l.getEjemplaresPrestados()+" || ejemplaresRestantes = "+l.getEjemplaresRestantes()+" || alta = "+l.getAlta());
                            }
                        }
                        libros = null;
                    }
                    editorial = null;
                    break;
                case 7:
                    System.out.println("-------------------------------------------");
                    
                    break;
                case 8:
                    System.out.println("-------------------------------------------");
                    
                    break;
                case 9:
                    System.out.println("-------------------------------------------");
                    
                    break;
                case 10:
                    System.out.println("-------------------------------------------");
                    System.out.println("Finalizando");
                    salir = true;
                    break;
                default:
                    System.out.println("-------------------------------------------");
                    System.out.println("Opcion incorrecta");
            }
        }while(!salir);


    }
    
}
