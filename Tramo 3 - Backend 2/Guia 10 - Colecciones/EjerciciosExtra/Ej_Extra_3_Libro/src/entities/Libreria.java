// La clase Librería contendrá además los siguientes métodos:
// • Constructor por defecto.
// X Constructor con parámetros.
// X Métodos Setters/getters

package entities;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Libreria {

    private Scanner read = new Scanner(System.in);

    public Libreria(){
    }

    public Libro crearLibro(){
        System.out.print("Ingrese el titulo del libro => ");
        String titulo = read.nextLine();
        System.out.print("Ingrese el autor de '"+titulo+"' => ");
        String autor = read.nextLine();
        System.out.print("Ingrese el numero de ejemplares disponibles => ");
        Integer numEjem = read.nextInt();
        read.nextLine();
        System.out.print("Ingrese el numero de ejemplares prestados => ");
        Integer numEjemPrest = read.nextInt();
        read.nextLine();
        return new Libro(titulo, autor, numEjem, numEjemPrest);
    }

    // • Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
    // busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
    // método. El método se incrementa de a uno, como un carrito de compras, el
    // atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
    // cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
    // que no queden ejemplares disponibles para prestar. Devuelve true si se ha
    // podido realizar la operación y false en caso contrario.
    public void prestamo(HashSet<Libro> libros){
        System.out.println("-----------------------------------------");
        System.out.print("Ingrese el titulo del Libro a pedir => ");
        String titulo = read.nextLine();
        Iterator<Libro> iterador = libros.iterator();
        while(iterador.hasNext()){
            Libro libro = iterador.next();
            if(libro.getNombre().equalsIgnoreCase(titulo)){
                System.out.println("Libro encontrado ..");
                if(libro.prestarEjemplar()){ // DEVUELVE TRUE O FALSE
                    System.out.println("["+libro.getNombre()+"] Libro prestado! No olvide devolverlo.");
                }else{
                    System.out.println("["+libro.getNombre()+"] Lamentablemente no quedan ejemplares disponibles ..");
                }
                break;
            }        
            if(!iterador.hasNext()){
                System.out.println("Libro no encontrado ..");
            }
        }                        
    }

    // • Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
    // lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
    // El método decrementa de a uno, como un carrito de compras, el atributo
    // ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
    // vez que se produzca la devolución de un libro. No se podrán devolver libros
    // donde que no tengan ejemplares prestados. Devuelve true si se ha podido
    // realizar la operación y false en caso contrario.
    public void devolucion(HashSet<Libro> libros){
        System.out.println("-----------------------------------------");
        System.out.print("Ingrese el titulo del Libro a devolver => ");
        String titulo = read.nextLine();
        Iterator<Libro> iterador = libros.iterator();
        while(iterador.hasNext()){
            Libro libro = iterador.next();
            if(libro.getNombre().equalsIgnoreCase(titulo)){
                System.out.println("Libro encontrado ..");
                if(libro.guardarEjemplar()){ // DEVUELVE TRUE O FALSE
                    System.out.println("["+libro.getNombre()+"] Libro devuelto! Muchas gracias.");
                }else{
                    System.out.println("["+libro.getNombre()+"] No se ha prestado ningun ejemplar ..");
                }
                break;
            }
            if(!iterador.hasNext()){
                System.out.println("Libro no encontrado ..");
            }
        }
    }

    // • Método toString para mostrar los datos de los libros.
    public void toString(HashSet<Libro> libros){
        Iterator<Libro> iterador = libros.iterator();
        while(iterador.hasNext()){
            System.out.println(iterador.next());
        }
    }
}