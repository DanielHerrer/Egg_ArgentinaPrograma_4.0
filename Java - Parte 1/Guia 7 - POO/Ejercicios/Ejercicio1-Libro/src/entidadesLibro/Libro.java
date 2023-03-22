/// EJERCICIO 1
// Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, 
// y un constructor con todos los atributos pasados por parámetro y un constructor vacío. Crear un método para 
// cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN,
//  el título, el autor del libro y el número de páginas.

package entidadesLibro;

import java.util.Scanner;

public class Libro {

    private int isbn;
    private String titulo;
    private String autor;
    private int numPaginas;

    public Libro() {

    }

    public Libro(int isbn, String titulo, String autor, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public void rellenarLibro(){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el titulo del libro:");
        titulo = in.nextLine();
        System.out.println("Ingrese el autor del libro:");
        autor = in.nextLine();
        System.out.println("Ingrese la cantidad de paginas del libro:");
        numPaginas = in.nextInt();
        System.out.println("Ingrese el ISBN del libro:");
        isbn = in.nextInt();
        in.close();
    }

    public int getISBN() {
        return isbn;
    }

    public void setISBN(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Libro [ISBN=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numPaginas + "]";
    }

}