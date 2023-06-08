package entities.piezas;

public class Propulsor {
    
    private boolean dañado;

    public Propulsor(){
        dañado = false;
    }

    public Propulsor(boolean dañado) {
        this.dañado = dañado;
    }

    public boolean isDañado() {
        return dañado;
    }

    public void setDañado(boolean dañado) {
        this.dañado = dañado;
    }
    
}
