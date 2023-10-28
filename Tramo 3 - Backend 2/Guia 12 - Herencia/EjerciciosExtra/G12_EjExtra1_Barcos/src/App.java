// En un puerto se alquilan amarres para barcos de distinto tipo. 

// Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:

// Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
// métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
// precio final de su alquiler.

import java.text.SimpleDateFormat;

import entities.Alquiler;
import services.AlquilerService;

public class App {
    public static void main(String[] args) throws Exception {
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Bienvenido al Puerto!");

        AlquilerService as = new AlquilerService();

        Alquiler a1 = as.crearAlquiler();
       
        System.out.println("--------------------------------------");
        System.out.println("Alquiler concluido!");
        String f1 = dateFormat.format(a1.getFechaAlquiler());
        String f2 = dateFormat.format(a1.getFechaDevolucion());
        System.out.println(a1.getNombre()+"\nAmarre nº"+a1.getPosicionAmarre()+" | "+a1.getBarco().getClass().getSimpleName()+"\nINICIO: "+f1+" | FINAL: "+f2);
        System.out.println("\u001B[32mMonto = $"+as.calcularAlquiler(a1)+"\u001B[0m");

    }
}