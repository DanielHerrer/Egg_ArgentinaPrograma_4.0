// Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
// un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
// se dispara y se moja. Las clases por hacer del juego son las siguientes:

import java.util.ArrayList;
import java.util.Scanner;

import entities.Juego;
import entities.Jugador;
import entities.Revolver;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner read = new Scanner(System.in);
        
        System.out.println("Bienvenido a la ruleta rusa de agua!");
        Juego juego = new Juego();

        ArrayList<Jugador> jugadores = new ArrayList<>();
        Boolean salir = false;
        do{
            System.out.println("Añadiendo jugador:");
            System.out.print("Ingrese nombre ('0' para salir) => ");
            String nombre = read.nextLine();
            if(nombre.equals("0")){
                salir = true;
            }else{
                jugadores.add(new Jugador(nombre)); // Se llena de jugadores la lista
            }
        }while(!salir==true);

        Revolver r = new Revolver();
        r.llenarRevolver();                         // Se llena el revolver con una bala aleatoria
        
        // System.out.println(r.toString());
        // System.out.println(jugadores.toString());

        juego.llenarJuego(jugadores, r);            // Se llena el juego con 6 jugadores max. y el revolver cargado

        juego.ronda();                              // Se empieza y termina el juego.

        read.close();
    }
}
