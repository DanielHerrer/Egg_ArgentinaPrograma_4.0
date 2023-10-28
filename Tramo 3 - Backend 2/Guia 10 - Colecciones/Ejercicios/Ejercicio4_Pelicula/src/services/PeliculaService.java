package services;
import java.util.ArrayList;
import entities.Pelicula;
import java.util.Scanner;

public class PeliculaService {
    
    Pelicula peli;
       
    public ArrayList<Pelicula> crearPelicula(){
        boolean rto = true;
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        
        do {
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Ingrese titulo de la pelicula:");
            String titulo = leer.next();
            System.out.println("Ingrese el director de la pelicula:");
            String director = leer.next();
            System.out.println("Ingrese la duracion en horas de la pelicula:");
            int dur = leer.nextInt();
            
            peliculas.add(new Pelicula(titulo, director, dur));

            System.out.println("Desea agregar otra pelicula? Si o No");
            String aux = leer.next();

            if(aux.equals("No")){
                rto=false;
            }    

            leer.close();
        } while(rto);
        
        return peliculas;
    }
    
    public void mostrarPeliculas(ArrayList<Pelicula> peliculas) {  
        for (Pelicula peli : peliculas) {
            System.out.println(peli.getTitulo() + " " + peli.getDirector() +" " + peli.getHoras());      
        }
    }   
    
}