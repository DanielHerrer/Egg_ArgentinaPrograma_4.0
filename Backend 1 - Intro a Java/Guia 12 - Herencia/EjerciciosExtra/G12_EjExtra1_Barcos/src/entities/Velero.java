// En los veleros se suma el número de mástiles
// • Número de mástiles para veleros.

package entities;

public class Velero extends Barco{
    
    private int numMastiles;

    public Velero(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    public Velero(Barco b, int numMastiles){
        super(b.matricula, b.esloraMetros, b.añoFabricacion);
        this.numMastiles = numMastiles;
    }

    public Velero(Integer matricula, int esloraMetros, int añoFabricacion, int numMastiles) {
        super(matricula, esloraMetros, añoFabricacion);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    @Override
    public String toString() {
        return "Velero [numMastiles=" + numMastiles + "]";
    }

}