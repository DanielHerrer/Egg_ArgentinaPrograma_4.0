// En los barcos a motor se le suma la potencia en CV
// • Potencia en CV para barcos a motor.

package entities;

public class BarcoMotor extends Barco {
    
    protected int cv;

    public BarcoMotor(int cv) {
        this.cv = cv;
    }

    public BarcoMotor(BarcoMotor bm){
        super(bm.matricula, bm.esloraMetros, bm.añoFabricacion);
        this.cv = bm.cv;
    }

    public BarcoMotor(Barco b, int cv){
        super(b.matricula, b.esloraMetros, b.añoFabricacion);
        this.cv = cv;
    }

    public BarcoMotor(Integer matricula, int esloraMetros, int añoFabricacion, int cv) {
        super(matricula, esloraMetros, añoFabricacion);
        this.cv = cv;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "BarcoMotor [cv=" + cv + "]";
    }

}