package entities.armadura.piezas;

import entities.armadura.piezas.dispositivos.Propulsor;

public class Bota {
 
    private Propulsor propulsor;

    public Bota(){
        propulsor = new Propulsor();
    }

    public Bota(Propulsor p){
        propulsor = p;
    }

    public float usar(int intensidad, float tiempo){
        return propulsor.usar(intensidad,tiempo);
    }

    public boolean dañarse(){
        return propulsor.dañarse();
    }

    public boolean isDañado(){
        if(propulsor.isDañado()){
            return true;
        }else{
            return false;
        }
    }

    public boolean isDestruido(){
        if(propulsor.isDestruido()){
            return true;
        }else{
            return false;
        }
    }

    public Propulsor getPropulsor() {
        return propulsor;
    }

    public void setPropulsor(Propulsor propulsor) {
        this.propulsor = propulsor;
    }

}
