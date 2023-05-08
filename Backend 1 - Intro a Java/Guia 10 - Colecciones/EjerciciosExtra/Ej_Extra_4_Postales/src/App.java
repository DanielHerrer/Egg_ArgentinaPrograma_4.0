// GUIA 10 EJERCICIO EXTRA 4 - Daniel Franco Herrera

// Página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el numero.

import services.PostalService;

public class App {
    public static void main(String[] args) throws Exception {
        
        PostalService ps = new PostalService();
        
        // • Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
        for(int i=0; i<10; i++){
            ps.agregarPostal();
        }

        // • Muestra por pantalla los datos introducidos
        ps.mostrarPostalesHash();

        // • Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
        ps.mostrarPostal();

        // • Muestra por pantalla los datos
        ps.mostrarPostalesAZ();

        // • Agregar una ciudad con su código postal correspondiente más al HashMap.
        ps.agregarPostal();

        // • Elimina 3 ciudades existentes dentro del HashMap
        for(int i=0; i<3; i++){
            ps.eliminarPostal();
        }

        ps.mostrarPostalesAZ();

    }
}
