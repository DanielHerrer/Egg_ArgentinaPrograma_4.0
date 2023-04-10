
// subir piso. bajar piso. 

package entidades;

public class Ascensor{

    private int maxPisos, pisoActual;

    public Ascensor() {
        maxPisos = 10;
        pisoActual = 0;
    }

    public Ascensor(int maxPisos, int pisoActual) {
        this.maxPisos = maxPisos;
        this.pisoActual = pisoActual;
    }

    public int getMaxPisos() {
        return maxPisos;
    }

    public void setMaxPisos(int maxPisos) {
        this.maxPisos = maxPisos;
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }

    @Override
    public String toString() {
        return "Ascensor [maximo de Pisos=" + maxPisos + ", Piso actual=" + pisoActual + "]";
    }

}