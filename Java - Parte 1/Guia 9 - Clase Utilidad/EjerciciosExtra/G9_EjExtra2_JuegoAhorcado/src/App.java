import entities.Ahorcado;
import services.AhorcadoService;

public class App {
    public static void main(String[] args) throws Exception {
        
        AhorcadoService as = new AhorcadoService();
        Ahorcado a = as.crearJuego();
        as.juego(a);

        // POR HACER: 
        // - SI SE PONE LA MISMA LETRA EN 2 INTENTOS DIFERENTES, TIENE QUE SALIR UN MENSAJE EN EL 2DO INTENTO
        // - SI SE ENCUENTRA UNA LETRA QUE MUESTRE A LA DERECHA LAS LETRAS ENCONTRADAS ej: " A _ O R _ A D O"

    }
}
