// GUIA 9 EJERCICIO 4 - FECHAS

import java.util.Date;
import services.FechaService;

public class App {
    public static void main(String[] args) throws Exception {
        
        FechaService fs = new FechaService();

        Date fechaNac = fs.fechaNacimiento();
        Date fechaAct = fs.fechaActual();
        System.out.println("Usted tiene "+fs.diferenciaDeAños(fechaNac, fechaAct)+" años.");

    }
}
