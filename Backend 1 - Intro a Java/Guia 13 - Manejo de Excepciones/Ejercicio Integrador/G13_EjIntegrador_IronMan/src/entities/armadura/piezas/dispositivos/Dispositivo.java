package entities.armadura.piezas.dispositivos;

public abstract class Dispositivo {
    
    protected boolean dañado;
    protected boolean destruido;

    public Dispositivo(){
        dañado = false;
        destruido = false;
    }

    public Dispositivo(boolean dañado, boolean destruido){
        this.dañado = dañado;
        this.destruido = destruido;
    }

    public boolean isDañado() {
        return dañado;
    }

    public void setDañado(boolean dañado) {
        this.dañado = dañado;
    }

    public boolean isDestruido() {
        return destruido;
    }

    public void setDestruido(boolean destruido) {
        this.destruido = destruido;
    }

}
