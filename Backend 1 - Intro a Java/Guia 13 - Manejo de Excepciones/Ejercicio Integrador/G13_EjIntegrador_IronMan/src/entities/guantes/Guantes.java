package entities.guantes;

import entities.Armadura;

public class Guantes extends Armadura {
    
    private Guante[] guantes = new Guante[2];

    public Guantes(){
        guantes[0] = new Guante();  // izquierda
        guantes[1] = new Guante();  // derecha
    }

}