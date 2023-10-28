package services;

import java.util.Scanner;
import entities.Espectador;
import enums.Ennumeracion.Nombre;

public class EspectadorService {
    
    private Scanner read = new Scanner(System.in);

    public Espectador crearEspectador(){
        System.out.print("Ingrese nombre del espectador => ");
        String nombre = read.nextLine();
        System.out.print("Ingrese la edad del espectador => ");
        Integer edad = read.nextInt();
        read.nextLine();
        System.out.print("Ingrese el dinero disponible => ");
        Float dinero = read.nextFloat();
        read.nextLine();
        return new Espectador(nombre,edad,dinero);
    }

    public Espectador crearEspectadorAuto(){
        String nombre = Nombre.getNombrePorPosicion((int) (Math.random()*16)); // Se elige uno de los 16 nombres existentes
        Integer edad = (int) ((Math.random()*73)+8); // Del 8 del 80
        Float dinero = (float) (Math.random()*250); // Del 0 al 249
        return new Espectador(nombre, edad, dinero);
    }

}
