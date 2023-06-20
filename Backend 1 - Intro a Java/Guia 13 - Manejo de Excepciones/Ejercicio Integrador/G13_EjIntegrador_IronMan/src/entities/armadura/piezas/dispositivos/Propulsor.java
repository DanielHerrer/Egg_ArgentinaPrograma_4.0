package entities.armadura.piezas.dispositivos;

import java.util.Random;

public class Propulsor extends Dispositivo {
    
    private float consumo;

    public Propulsor(){
        super();
        consumo = 15f;
    }

    public Propulsor(int consumo) {
        this.consumo = consumo;
    }

    public float usar(int intensidad, float tiempo){
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
