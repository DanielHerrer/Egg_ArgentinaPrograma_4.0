// Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
// disponibles y si posee o no un restaurante dentro de las instalaciones. 

package entities;

public final class Camping extends ExtraHotelero {
    
    private int cantMaxCarpas;
    private int cantBaños;
    private boolean restaurante;

    public Camping(){}

    public Camping(String nombre, String direccion, String localidad, String gerente, boolean privado, int metros,
            int cantMaxCarpas, int cantBaños, boolean restaurante) {
        super(nombre, direccion, localidad, gerente, privado, metros);
        this.cantMaxCarpas = cantMaxCarpas;
        this.cantBaños = cantBaños;
        this.restaurante = restaurante;
    }

    public int getCantMaxCarpas() {
        return cantMaxCarpas;
    }

    public void setCantMaxCarpas(int cantMaxCarpas) {
        this.cantMaxCarpas = cantMaxCarpas;
    }

    public int getCantBaños() {
        return cantBaños;
    }

    public void setCantBaños(int cantBaños) {
        this.cantBaños = cantBaños;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

}