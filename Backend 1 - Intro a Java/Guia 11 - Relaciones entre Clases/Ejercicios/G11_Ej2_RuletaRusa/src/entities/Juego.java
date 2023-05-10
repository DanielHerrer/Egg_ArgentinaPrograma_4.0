// Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
// Revolver
// Métodos:
// • llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
// y el revolver para guardarlos en los atributos del juego.
// • ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
// aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
// moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
// mojar. Al final del juego, se debe mostrar que jugador se mojó.
// Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.

package entities;

import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver r;

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r){
        this.r = r;
        if(jugadores.size()>6){
            System.out.println("El juego solo puede tener 6 jugadores, pasarán los primeros en la lista..");
            ArrayList<Jugador> jugadoresX = new ArrayList<>(jugadores.subList(0, 6));   // .subList(desde,hasta) para recortar el arraylist
            this.jugadores = jugadoresX;
            for(int i=0;i<jugadores.size();i++){
                jugadores.get(i).setId(i+1);    // Setea los ID
            }
        }else{
            this.jugadores = jugadores;
            for(int i=0;i<jugadores.size();i++){
                jugadores.get(i).setId(i+1);    // Setea los ID
            }
        }
    }

    public void ronda(){
        Boolean fin = false;
        do{
            for(Jugador jugador: jugadores){
                jugador.disparo(r);
                if(jugador.isMojado()){
                    System.out.println("Fin del juego..");
                    fin=true;
                    break;
                }
            }
        }while(!fin==true);
    }
    
}
