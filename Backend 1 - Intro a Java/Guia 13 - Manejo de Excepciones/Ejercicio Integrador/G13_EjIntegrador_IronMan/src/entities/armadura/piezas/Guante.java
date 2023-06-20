package entities.armadura.piezas;

import entities.armadura.piezas.dispositivos.Repulsor;

public class Guante {

    private Repulsor repulsor;

    public Guante(){
        repulsor = new Repulsor();
    }

    public Guante(Repulsor r){
        repulsor = r;
    }

    public float usar(int intensidad){
        return repulsor.usar(intensidad);
    }

    public float usar(int intensidad, float tiempo){
        return repulsor.usar(intensidad,tiempo);
    }

    public boolean dañarse(){
        return repulsor.dañarse();
    }

    public boolean isDañado(){
        if(repulsor.isDañado()){
            return true;
        }else{
            return false;
        }
    }

    public boolean isDestruido(){
        if(repulsor.isDestruido()){
            return true;
        }else{
            return false;
        }
    }

    public Repulsor getRepulsor() {
        return repulsor;
    }

    public void setRepulsor(Repulsor repulsor) {
        this.repulsor = repulsor;
    }

}
