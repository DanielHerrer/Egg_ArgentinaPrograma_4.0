// GUIA 12 EJERCICIO 2 - Daniel Franco Herrera
// Finalmente, en el main debemos realizar lo siguiente:
// Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
// el precio final de los dos electrodomésticos.

import entities.Lavadora;
import entities.Televisor;
import services.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        // ElectrodomesticoService es = new ElectrodomesticoService();
        LavadoraService ls = new LavadoraService();
        TelevisorService ts = new TelevisorService();

        // Electrodomestico lavadora1 = ls.crearLavadora();
        // Electrodomestico televisor1 = ts.crearTelevisor();

        Lavadora lavadora2 = ls.crearLavadora();
        Televisor televisor2 = ts.crearTelevisor();
        
        ls.precioFinal(lavadora2);
        ts.precioFinal(televisor2);

        System.out.println("Precio final de lavadora2 = $"+lavadora2.getPrecio()+" usd");
        System.out.println("Precio final de televisor2 = $"+televisor2.getPrecio()+" usd");

    }
}
