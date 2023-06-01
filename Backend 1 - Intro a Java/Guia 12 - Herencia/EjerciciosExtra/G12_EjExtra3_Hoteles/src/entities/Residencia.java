// Para las residencias se indica la cantidad de habitaciones, 
// si se hacen o no descuentos a los gremios y si posee o no
// campo deportivo.

package entities;

public final class Residencia extends ExtraHotelero {
    
    private int cantHabitaciones;
    private boolean descuentoGremio;
    private boolean campoDeportivo;

    public Residencia(){}

    public Residencia(String nombre, String direccion, String localidad, String gerente, boolean privado, int metros,
            int cantHabitaciones, boolean descuentoGremio, boolean campoDeportivo) {
        super(nombre, direccion, localidad, gerente, privado, metros);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentoGremio = descuentoGremio;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuentoGremio() {
        return descuentoGremio;
    }

    public void setDescuentoGremio(boolean descuentoGremio) {
        this.descuentoGremio = descuentoGremio;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

}