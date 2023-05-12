package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// import enums.Ennumeraciones.Carta;      // Importar el enum de Carta

public class Baraja {
    
    private ArrayList<Carta> mazo = new ArrayList<>();
    private ArrayList<Carta> monton = new ArrayList<>();
    private Iterator iterador;

    public Baraja(){
        for(Carta var: Carta.values()){ // Carta.values() = Recorre todos los valores del enum Carta
            mazo.add(var);              // Añade cada enum Carta (var) y lo añade al arraylist mazo
        }
        iterador = mazo.iterator();
    }

    public void barajar(){
        Collections.shuffle(mazo);
    }

    public Carta siguienteCarta(){
        if(iterador.hasNext()){
            Carta carta = (Carta) iterador.next();
            monton.add(carta);
            mazo.remove(carta);
            return carta;
        }else{
            return null;
        }
    }

    public int cartasDisponibles(){
        return mazo.size();
    }

    public ArrayList<Carta> darCartas(int cant){
        if(mazo.size()<cant){   // Si la cantidad de cartas pedidas es mayor que las cartas en el mazo
            return null;
        }else{                  // Si no ...
            ArrayList<Carta> mano = new ArrayList<>();
            for(int i = 0; i < cant; i++){
                mano.add(mazo.get(0));      // agrego la carta a la mano del jugador
                monton.add(mazo.get(0));    // la carta pasaria a ser del monton que ya salió
                mazo.remove(mazo.get(0));   // la carta se remueve del mazo
            }
            return mano;                          // retorna la mano a entregar
        }
    }

    public void cartasMonton(){
        if(monton.size()<1){
            System.out.println("Aun no se han repartido cartas.");
        }else{
            System.out.println("Cartas en monton: ");
            for(Carta carta: monton){
                // System.out.println(carta.values().toString()); // NO SE SI FUNCIONA
            }
        }
    }

}