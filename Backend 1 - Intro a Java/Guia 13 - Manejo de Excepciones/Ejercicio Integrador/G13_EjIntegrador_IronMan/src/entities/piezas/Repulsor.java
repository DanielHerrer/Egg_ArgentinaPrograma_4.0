package entities.piezas;

public class Repulsor {
    
    private boolean dañado;

    public Repulsor(){
        dañado = false;
    }

    public Repulsor(boolean dañado) {
        this.dañado = dañado;
    }

    public boolean isDañado() {
        return dañado;
    }

    public void setDañado(boolean dañado) {
        this.dañado = dañado;
    }

}
