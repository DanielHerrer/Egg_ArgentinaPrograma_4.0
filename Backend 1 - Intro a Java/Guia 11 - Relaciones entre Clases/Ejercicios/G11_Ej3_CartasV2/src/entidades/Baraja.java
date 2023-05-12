// Realizar una baraja de cartas españolas orientada a objetos. 
// La baraja estará compuesta por un conjunto de cartas, 40 exactamente.
// Las operaciones que podrá realizar la baraja son:
// • barajar(): cambia de posición todas las cartas aleatoriamente.
// • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
// se haya llegado al final, se indica al usuario que no hay más cartas.
// • cartasDisponibles(): indica el número de cartas que aún se puede repartir.
// • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
// cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
// debemos indicárselo al usuario.
// • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
// indicárselo al usuario
// • mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
// luego se llama al método, este no mostrara esa primera carta.

package entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import enums.Ennumeraciones.Palo;
import enums.Ennumeraciones.Valor;

public class Baraja {

    Iterator<Carta> dealer;
    ArrayList<Carta> baraja = new ArrayList<>(40);
    ArrayList<Carta> monton = new ArrayList<>(40);

    public Baraja(){
        for(Palo palo: Palo.values()){
            for(Valor valor: Valor.values()){
                baraja.add(new Carta(palo,valor));
            }
        }
        dealer = baraja.iterator();
    }

    public void barajar(){
        Collections.shuffle(baraja);
    }

    public Carta siguienteCarta(){
        if(dealer.hasNext()){
            Carta carta = dealer.next();
            monton.add(carta);
            baraja.remove(carta);
            return carta;
        }else{
            return null;
        }
    }

    public Integer cartasDisponibles(){
        return baraja.size();
    }

    public ArrayList<Carta> darCartas(Integer cant){
        if(baraja.size()<cant){   // Si la cantidad de cartas pedidas es mayor que las cartas en el mazo
            return null;
        }else{                  // Si no ...
            ArrayList<Carta> mano = new ArrayList<>();
            for(int i = 0; i < cant; i++){
                mano.add(baraja.get(0));      // agrego la carta a la mano del jugador
                monton.add(baraja.get(0));    // la carta pasaria a ser del monton que ya salió
                baraja.remove(baraja.get(0));   // la carta se remueve del mazo
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
                System.out.println(carta); 
            }
        }
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public ArrayList<Carta> getMonton() {
        return monton;
    }

}
