// Implemente un programa para una Librería haciendo uso de un HashSet para evitar
// datos repetidos. Para ello, se debe crear una clase llamada Libro que guarde la
// información de cada uno de los libros de una Biblioteca. La clase Libro debe guardar
// el título del libro, autor, número de ejemplares y número de ejemplares prestados.

package entities;

public class Libro {

    private String nombre, autor;
    private Integer numEjemplares, numEjemplaresPrestados;

    public Libro() {
    }

    public Libro(String nombre, String autor, Integer numEjemplares, Integer numEjemplaresPrestados) {
        this.nombre = nombre;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }

    public boolean prestarEjemplar(){
        if(this.numEjemplares<1){
            return false;
        }else{
            this.numEjemplares--;
            this.numEjemplaresPrestados++;
            return true;
        }
    }

    public boolean guardarEjemplar(){
        if(this.numEjemplaresPrestados<1){
            return false;
        }else{
            this.numEjemplares++;
            this.numEjemplaresPrestados--;
            return true;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "------------- LIBRO ---------------" +
            "\nTitulo = " + nombre + 
            "\nAutor = " + autor + 
            "\nNum. de Ejemplares = " + numEjemplares +
            "\nNum. de Ejemplares Prestados = " + numEjemplaresPrestados;
    }
    
}
