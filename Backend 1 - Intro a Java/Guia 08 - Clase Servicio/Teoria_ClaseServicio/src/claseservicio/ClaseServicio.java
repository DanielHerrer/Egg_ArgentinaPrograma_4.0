package claseservicio;


import claseservicio.Servicio.ServicioPersona;

public class ClaseServicio {

    public static void main(String[] args) {
        ServicioPersona service = new ServicioPersona();
        service.mostrarPersona(service.crearPersona());
    }

}
