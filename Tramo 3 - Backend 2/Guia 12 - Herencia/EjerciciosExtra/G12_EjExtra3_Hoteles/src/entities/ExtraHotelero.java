// En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
// hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
// Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
// cuadrados que ocupa. 

// Existen dos tipos de alojamientos extrahoteleros: los Camping y las
// Residencias.

package entities;

public class ExtraHotelero extends Alojamiento {
    
    private boolean privado;
    private int metros;

    public ExtraHotelero(){}
    
    public ExtraHotelero(String nombre, String direccion, String localidad, String gerente, boolean privado,
            int metros) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metros = metros;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }

}