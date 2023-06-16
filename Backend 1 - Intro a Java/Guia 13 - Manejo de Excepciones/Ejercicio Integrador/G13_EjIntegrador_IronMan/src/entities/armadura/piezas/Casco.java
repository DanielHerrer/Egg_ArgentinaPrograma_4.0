package entities.armadura.piezas;

import entities.armadura.piezas.dispositivos.Consola;
import entities.armadura.piezas.dispositivos.Sintetizador;

public class Casco {
    
    private Consola c;
    private Sintetizador s;

    public Casco(){
        c = new Consola();
        s = new Sintetizador();
    }

    public Casco(Consola c, Sintetizador s){
        this.c = c;
        this.s = s;
    }

    public void usarSintetizador(String texto){
        s.usar(texto);
    }

    public void usarConsola(String texto){
        c.usar(texto);
    }

    public boolean isDañado(){
        if(c.isDañado() && s.isDañado()){
            return true;
        }else if(c.isDañado() || s.isDañado()){
            return true;
        }else{
            return false;
        }
    }

    public boolean isDestruido(){
        if(c.isDestruido() && s.isDestruido()){
            return true;
        }else{
            return false;
        }
    }

    public Consola getConsola() {
        return c;
    }

    public void setConsola(Consola c) {
        this.c = c;
    }

    public Sintetizador getSintetizador() {
        return s;
    }

    public void setSintetizador(Sintetizador s) {
        this.s = s;
    }

}
