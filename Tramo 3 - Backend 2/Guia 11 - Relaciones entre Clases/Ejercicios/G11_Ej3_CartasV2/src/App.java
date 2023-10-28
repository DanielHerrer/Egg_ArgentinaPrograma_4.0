// GUIA 11 EJERCICIO 3 - Daniel Franco Herrera

import java.util.ArrayList;
import entidades.Baraja;
import entidades.Carta;

public class App {
    public static void main(String[] args) throws Exception {
        
        Baraja baraja = new Baraja();
        ArrayList<Carta> mano = new ArrayList<>();

        System.out.println("Cartas dispo. = "+baraja.cartasDisponibles());
        
        mano = baraja.darCartas(3);
        // mano.toString(); ARREGLAR

        baraja.barajar();

        System.out.println("Cartas dispo. = "+baraja.cartasDisponibles());
        baraja.cartasMonton();

        for(Carta carta: baraja.getBaraja()){
            System.out.println(carta);
        }

    }
}
