// GUIA 10 EJERCICIO 4 - Nicolas Garay / Daniel F. Herrera
// Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
// tendremos una clase Pelicula con el título, director y duración de la película (en horas).
// Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
// que se pide a continuación:
// En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
// todos sus datos y guardándolos en el objeto Pelicula.
// Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
// crear otra Pelicula o no.
// Después de ese bucle realizaremos las siguientes acciones:
// • Mostrar en pantalla todas las películas.
// • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
// • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
// pantalla.
// • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
// pantalla.
// • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
// • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.

import entities.Pelicula;
import services.PeliculaService;
import utilities.Comparadores;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {

        PeliculaService sP = new PeliculaService();
        ArrayList<Pelicula> peliculas = sP.crearPelicula();
        
        //Mostrar peliculas
        sP.mostrarPeliculas(peliculas);
        
        //Peliculas mayor a 1hr
        System.out.println("Peliculas mayor a 1hr");
        for(Pelicula peli : peliculas){
            if(peli.getHoras()>1){
                System.out.println(peli.getTitulo());
            }
        }
        
        //Ordenar peliculas de acuerdo a su duracion de mayor a menor
        System.out.println("Peliculas ordenadas por duracion mayor a menor");
        Collections.sort(peliculas, Comparadores.ordenarPorDuracionMayorAMenor);       
        sP.mostrarPeliculas(peliculas);
        
        //Ordenar peliculas de acuerdo a su duracion de menor a mayor
        System.out.println("Ordenar peliculas de acuerdo a su duracion de menor a mayor");
        Collections.sort(peliculas, Comparadores.ordenarPorDuracionMenorAMayor);
        sP.mostrarPeliculas(peliculas);
     
        //Ordenar peliculas alfaticamente de Z a A
        System.out.println("Ordenar peliculas alfaticamente de Z a A");
        Collections.sort(peliculas, Comparadores.ordenarAlfabeticamentePorTituloZa);
        sP.mostrarPeliculas(peliculas);

        //Ordenar peliculas alfaticamente de A a Z
        System.out.println("Ordenar peliculas alfaticamente de A a Z");
        Collections.sort(peliculas, Comparadores.ordenarAlfabeticamentePorTituloAz);
        sP.mostrarPeliculas(peliculas);
        
    }
}