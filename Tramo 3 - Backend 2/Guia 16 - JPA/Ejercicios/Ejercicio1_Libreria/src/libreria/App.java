// GUIA 16 EJECICIO 1 - Daniel Franco Herrera
// 1) Crear base de datos Librería
// 2) Crear unidad de persistencia
// 3) Crear entidades previamente mencionadas (excepto Préstamo)
// 4) Generar las tablas con JPA
// 5) Crear servicios previamente mencionados.
// 6) Crear los métodos para persistir entidades en la base de datos librería
// 7) Crear los métodos para dar de alta/bajo o editar dichas entidades.
// 8) Búsqueda de un Autor por nombre.
// 9) Búsqueda de un libro por ISBN.
// 10) Búsqueda de un libro por Título.
// 11) Búsqueda de un libro/s por nombre de Autor.
// 12) Búsqueda de un libro/s por nombre de Editorial.

// 13) Agregar las siguientes validaciones a todas las funcionalidades de la aplicación:
// • Validar campos obligatorios.
// • No ingresar datos duplicados.

package libreria;

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

        Libro libro = null;
        Autor autor = null;
        Editorial editorial = null;

        boolean salir = false;
        do{
            System.out.println("-------------------------------------------");
            System.out.println("MENU:");
            System.out.println("1. Buscar un Autor por nombre \n"+
                                "2. Buscar un Libro por ISBN \n"+
                                "3. Buscar un Libro por titulo \n"+
                                "4. Buscar Libro/s por nombre de Autor \n"+
                                "5. Buscar Libro/s por nombre de Editorial"+
                                "6. Salir");
            System.out.print("Ingrese una opcion => ");
            int op = read.nextInt();
            read.nextLine();

            
            switch(op){
                case 1:
                    System.out.println("-------------------------------------------");
                    System.out.print("Ingrese un nombre de Autor => ");
                    String nombre = read.nextLine();

                    autor = as.buscarPorNombre(nombre);
                    if(autor.getId() != null){
                        System.out.println("Autor:\n ID = "+autor.getId()+" || nombre = "+autor.getNombre()+" || alta = "+autor.getAlta());
                    }else{
                        System.out.println("No se ha encontrado ningun Autor con un nombre igual o parecido..");
                    }
                    autor = null;
                    break;
                case 2:
                    System.out.println("-------------------------------------------");
                    System.out.print("Ingrese un ISBN de Libro => ");
                    Long isbn = read.nextLong();
                    read.nextLine();

                    libro = ls.buscarPorIsbn(isbn);
                    if(libro.getIsbn() != null){
                        System.out.println("Libro:\n ISBN = "+libro.getIsbn()+" || titulo = '"+libro.getTitulo()+"' || anio ="+libro.getAnio()+"\n || ejemplares = "+libro.getEjemplares()+" || ejemplaresPrestados"+libro.getEjemplaresPrestados()+" || ejemplaresRestantes = "+libro.getEjemplaresRestantes()+" || alta = "+libro.getAlta());
                    }else{
                        System.out.println("No se ha encontrado ningun Libro con un ISBN igual..");
                    }
                    libro = null;
                    break;
                case 3:
                    System.out.println("-------------------------------------------");
                    System.out.print("Ingrese un titulo de Libro => ");
                    String titulo = read.nextLine();

                    libro = ls.buscarPorTitulo(titulo);
                    if(libro.getIsbn() != null){
                        System.out.println("Libro:\n ISBN = "+libro.getIsbn()+" || titulo = '"+libro.getTitulo()+"' || anio ="+libro.getAnio()+"\n || ejemplares = "+libro.getEjemplares()+" || ejemplaresPrestados"+libro.getEjemplaresPrestados()+" || ejemplaresRestantes = "+libro.getEjemplaresRestantes()+" || alta = "+libro.getAlta());
                    }else{
                        System.out.println("No se ha encontrado ningun Libro con un titulo igual o parecido..");
                    }
                    libro = null;
                    break;
                case 4:
                    System.out.println("-------------------------------------------");

                    break;
                case 5:
                    System.out.println("-------------------------------------------");
                    break;
                case 6:
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
