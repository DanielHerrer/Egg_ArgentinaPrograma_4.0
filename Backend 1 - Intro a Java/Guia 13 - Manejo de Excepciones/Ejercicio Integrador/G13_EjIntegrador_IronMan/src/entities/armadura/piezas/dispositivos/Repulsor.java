package entities.armadura.piezas.dispositivos;

import java.util.Random;

public class Repulsor extends Dispositivo {
    
    private float consumo;

    public Repulsor(){
        super();
        consumo = 15f;
    }

    public Repulsor(float consumo) {
        super();
        this.consumo = consumo;
    }

    public float usar(int intensidad){  // usar para disparar
        return (consumo * intensidad);
    }

    public float usar(int intensidad, float tiempo){    // usar para moverse
        return (consumo * tiempo) * intensidad;
    }

    public boolean dañarse(){
        if((new Random().nextInt(100)+1)<=30){  // numero generado entre 1 y 100, si es menor o igual a 30
            super.dañado = true;
            return true;
        }else{
            return false;
        }
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

}
