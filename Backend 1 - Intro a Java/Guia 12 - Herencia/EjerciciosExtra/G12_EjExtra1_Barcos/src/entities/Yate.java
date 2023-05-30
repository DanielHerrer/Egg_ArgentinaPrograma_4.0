// En los yates se suma la potencia en CV y el número de camarotes.
// • Potencia en CV y número de camarotes para yates de lujo.

package entities;

public final class Yate extends BarcoMotor{
    
    private int numCamarotes;

    public Yate(int cv, int numCamarotes) {
        super(cv);
        this.numCamarotes = numCamarotes;
    }
    
    public Yate(BarcoMotor bm, int numCamarotes){
        super(bm);
        this.numCamarotes = numCamarotes;
    }

    public Yate(Integer matricula, int esloraMetros, int añoFabricacion, int cv, int numCamarotes) {
        super(matricula, esloraMetros, añoFabricacion, cv);
        this.numCamarotes = numCamarotes;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    @Override
    public String toString() {
        return "Yate [numCamarotes=" + numCamarotes + "]";
    }

}