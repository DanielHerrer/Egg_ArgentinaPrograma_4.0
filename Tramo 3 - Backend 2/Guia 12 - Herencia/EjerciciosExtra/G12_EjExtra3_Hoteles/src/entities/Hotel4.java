// • Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
// Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.

// Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
// acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
// cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
// será.

// El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
// PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
// agregado por gimnasio) + (valor agregado por limosinas).
// Donde:
// Valor agregado por el restaurante:
// • $10 si la capacidad del restaurante es de menos de 30 personas.
// • $30 si está entre 30 y 50 personas.
// • $50 si es mayor de 50.
// Valor agregado por el gimnasio:
// • $50 si el tipo del gimnasio es A.
// • $30 si el tipo del gimnasio es B.
// Valor agregado por las limosinas:
// • $15 por la cantidad de limosinas del hotel.

package entities;

public class Hotel4 extends Hotel {

    protected char gimnasio;
    protected String nombreRestaurante;
    protected int capacidadRestaurante;
    
    public Hotel4(){}

    public Hotel4(String nombre, String direccion, String localidad, String gerente, int cantHabitaciones,
            int cantCamas, int cantPisos, char gimnasio,
            String nombreRestaurante, int capacidadRestaurante) {
        super(nombre, direccion, localidad, gerente, cantHabitaciones, cantCamas, cantPisos);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
        super.setPrecioHabitacion(precioHabitacion()); // SE ASIGNA EL PRECIO DE LA HABITACION CUANDO SE CREA EL HOTEL
    }

    @Override
    public double precioHabitacion() {
        double precio = super.precioHabitacion();
        // VALOR DEL RESTAURANTE
        if(capacidadRestaurante<30){
            precio += 10f;
        }else if(capacidadRestaurante>=30 && capacidadRestaurante<=50){
            precio += 30f;
        }else if(capacidadRestaurante>50){
            precio += 50f;
        }
        // VALOR DEL GIMNASIO
        if(gimnasio == 'B'){
            precio += 30f;
        }else if(gimnasio == 'A'){
            precio += 50f;
        }

        return precio;
    }

    public char getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(char gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

}