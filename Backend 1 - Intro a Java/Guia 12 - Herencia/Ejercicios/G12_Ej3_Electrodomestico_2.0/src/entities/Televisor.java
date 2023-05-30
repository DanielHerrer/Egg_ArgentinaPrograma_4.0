// Se debe crear también una subclase llamada Televisor con los siguientes atributos:
// resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
// heredados.
// Los constructores que se implementarán serán:
// • Un constructor vacío.
// • Un constructor con la resolución, sintonizador TDT y el resto de los atributos
// heredados. Recuerda que debes llamar al constructor de la clase padre.
// Los métodos que se implementara serán:
// • Método get y set de los atributos resolución y sintonizador TDT.

package entities;

public class Televisor extends Electrodomestico {
    
    private int resolucion;
    private boolean tdt;

    public Televisor() {}

    public Televisor(double precio, String color, char consumoEnergetico, int peso, int resolucion, boolean tdt) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public Televisor(Electrodomestico e, int resolucion, boolean tdt){
        super(e.getPrecio(),e.getColor(),e.getConsumoEnergetico(),e.getPeso());
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public String toString() {
        return "Televisor [resolucion=" + resolucion + ", tdt=" + tdt + "]";
    }

}
