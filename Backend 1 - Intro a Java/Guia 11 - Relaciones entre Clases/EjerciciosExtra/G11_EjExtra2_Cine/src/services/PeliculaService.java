package services;

import java.util.Scanner;

import entities.Pelicula;

public class PeliculaService {
    
    private Scanner read = new Scanner(System.in);

    public Pelicula crearPelicula(){
        System.out.print("Ingrese el nombre de la pelicula => ");
        String nombre = read.nextLine();
        System.out.print("Ingrese la duracion en minutos => ");
        int duracion = read.nextInt();
        read.nextLine();
        System.out.print("Ingrese la edad minima => ");
        int edadMin = read.nextInt();
        read.nextLine();
        System.out.print("Ingrese el director => ");
        String director = read.nextLine();
        return new Pelicula(nombre, duracion, edadMin, director);
    }

}
