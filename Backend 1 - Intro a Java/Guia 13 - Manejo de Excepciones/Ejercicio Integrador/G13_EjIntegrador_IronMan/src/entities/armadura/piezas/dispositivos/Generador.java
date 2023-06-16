//  Poner como carga máxima del reactor el mayor float posible.

package entities.armadura.piezas.dispositivos;

public class Generador {
    
    private final float energiaMax = Float.MAX_VALUE;
    private float energia;  // energia del reactor
    
    public Generador(){
        energia = Float.MAX_VALUE;
    }

    public Generador(float e){
        energia = e;
    }

    public float getEnergia() {
        return energia;
    }

    public void setEnergia(float energia) {
        this.energia = energia;
    }

    public float getEnergiaMax() {
        return energiaMax;
    }

}
