// Hacer que la resistencia, las coordenadas
//  y la hostilidad sean aleatorios 

package entities.radar;

public class Objetivo {
    
    private int x, y, z;
    private int resistencia;
    private boolean hostil;

    public Objetivo(){
        x = (int) Math.random() * 50;
        y = (int) Math.random() * 50;
        z = (int) Math.random() * 50;
        resistencia = (int) ((Math.random() * 50) + 51); // (0-49)+51 = [51/100]
        hostil = ((int) (Math.random()) == 1) ? true : false; // [0/1] = Si es 1 es hostil, si es 0 es aliado
    }
    
    public Objetivo(boolean hostil) {
        this.hostil = hostil;
        this.x = (int) (Math.random() * 50);
        this.y = (int) (Math.random() * 50);
        this.z = (int) (Math.random() * 50);
        resistencia = (int) ((Math.random() * 50) + 51); // (0-49)+51 = [51/100]
    }

    public Objetivo(int x, int y, int z, int resistencia, boolean hostil) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.resistencia = resistencia;
        this.hostil = hostil;
    }

    public void setPosiciones(){
        this.x = (int) (Math.random() * 50);
        this.y = (int) (Math.random() * 50);
        this.z = (int) (Math.random() * 50);
    }

    public int[] getPosiciones(){
        int[] posiciones = new int[3];
        posiciones[0] = this.x;
        posiciones[1] = this.y;
        posiciones[2] = this.z;
        return posiciones;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public boolean isHostil() {
        return hostil;
    }

    public void setHostil(boolean hostil) {
        this.hostil = hostil;
    }

    





    




}
