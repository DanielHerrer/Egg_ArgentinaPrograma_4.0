package entities;

public class Cafetera {
    private int capacidadMáxima = 100, cantActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMáxima, int cantActual) {
        this.capacidadMáxima = capacidadMáxima;
        this.cantActual = cantActual;
    }

    //////////////////////////////////////////////////////////////////

    public int getCapacidadMáxima() {
        return capacidadMáxima;
    }

    public void setCapacidadMáxima(int capacidadMáxima) {
        this.capacidadMáxima = capacidadMáxima;
    }

    public int getCantActual() {
        return cantActual;
    }

    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }

    @Override
    public String toString() {
        return "Cafetera [capacidadMáxima=" + capacidadMáxima + ", cantActual=" + cantActual + "]";
    }

}
