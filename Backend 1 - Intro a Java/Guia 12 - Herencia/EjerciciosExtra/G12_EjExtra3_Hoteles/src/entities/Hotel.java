// Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
// Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
// características de las distintas categorías son las siguientes:

package entities;

public class Hotel extends Alojamiento {
    
    protected int cantHabitaciones; // HABITACIONES POR PISO
    protected int cantCamas;    // CAMAS POR HABITACION
    protected int cantPisos;    // CANTIDAD DE PISOS
    protected double precioHabitacion;

    public Hotel(){}

    public Hotel(String nombre, String direccion, String localidad, String gerente, int cantHabitaciones, int cantCamas,
            int cantPisos) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.cantCamas = cantCamas;
        this.cantPisos = cantPisos;
        // this.precioHabitacion = precioHabitacion;
    }

    public int capacidadDelHotel(){
        return (cantHabitaciones * cantCamas) * cantPisos;
    }

    public double precioHabitacion(){
        double precio = 50f + (1 * capacidadDelHotel());
        return precio;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

}