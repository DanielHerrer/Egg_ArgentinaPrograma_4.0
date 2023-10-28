// Guia 18 Ejercicio 14 - Daniel Franco Herrera
// Crear un objeto libro que contenga las siguientes propiedades: ISBN, Título, Autor,
// Número de páginas. Crear un método para cargar un libro pidiendo los datos al usuario
// y luego informar mediante otro método el número de ISBN, el título, 
// el autor del libro y el numero de páginas.

const crearLibro = function () {
    alert("Creando Libro");
    
    let isbn;
    do{
        isbn = parseInt(prompt("Ingrese isbn"));
    }while(isNaN(isbn));

    let titulo = prompt("Ingrese el titulo del Libro");
    
    let autor = prompt("Ingrese el nombre del Autor");

    let numPaginas;
    do{
        numPaginas = parseInt(prompt("Ingrese el numero de páginas del Libro"));
    }while(isNaN(numPaginas));

    let libro = {
        isbn: isbn,
        titulo: titulo,
        autor: autor,
        numPaginas: numPaginas
    };

    return libro; 
}

const mostrarLibro = function (libro) {
    alert("Mostrando Libro:\nISBN: "+libro.isbn+"\nTitulo: "+libro.titulo+"\nAutor: "+libro.autor+"\nNumero de páginas: "+libro.numPaginas);
}

var objeto = crearLibro();

mostrarLibro(objeto);