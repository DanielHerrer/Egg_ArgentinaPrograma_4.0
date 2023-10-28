// GUIA 9 EJERCICIO EXTRA 2 - Daniel Franco Herrera

import entities.Ahorcado;
import services.AhorcadoService;

public class App {
    public static void main(String[] args) throws Exception {
        
        AhorcadoService as = new AhorcadoService();
        Ahorcado a = as.crearJuego();
        as.juego(a);

    }
}
