// • Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
// Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
// Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.

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

public final class Hotel5 extends Hotel4 {

    private int cantSalonesConferencia;
    private int cantSuites;
    private int cantLimosinas;

    public Hotel5(){}

    public Hotel5(String nombre, String direccion, String localidad, String gerente, int cantHabitaciones,
            int cantCamas, int cantPisos, char gimnasio,
            String nombreRestaurante, int capacidadRestaurante, int cantSalonesConferencia, int cantSuites,
            int cantLimosinas) {
        super(nombre, direccion, localidad, gerente, cantHabitaciones, cantCamas, cantPisos,
                gimnasio, nombreRestaurante, capacidadRestaurante);
        this.cantSalonesConferencia = cantSalonesConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
        super.setPrecioHabitacion(precioHabitacion()); // SE ASIGNA EL PRECIO DE LA HABITACION CUANDO SE CREA EL HOTEL
    }

    @Override
    public double precioHabitacion() {
        double precio = super.precioHabitacion();
        precio += (15 * cantLimosinas);
        
        return precio;
    }

    public int getCantSalonesConferencia() {
        return cantSalonesConferencia;
    }

    public void setCantSalonesConferencia(int cantSalonesConferencia) {
        this.cantSalonesConferencia = cantSalonesConferencia;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }
    
}
