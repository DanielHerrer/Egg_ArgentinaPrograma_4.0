// A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
// además de los atributos heredados.
// Los constructores que se implementarán serán:
// • Un constructor vacío.
// • Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
// llamar al constructor de la clase padre.
// Los métodos que se implementara serán:
// • Método get y set del atributo carga.

package entities;

public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora() {}

    public Lavadora(double precio, String color, char consumoEnergetico, int peso, int carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Lavadora(Electrodomestico e, int carga){
        super(e.precio,e.color,e.consumoEnergetico,e.peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }    
    
}
