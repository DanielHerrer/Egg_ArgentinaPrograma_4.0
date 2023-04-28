// GUIA 9 EJERCICIO 2 - Daniel F. Herrera

import entities.ParDeNumeros;
import services.ParDeNumerosServicios;

public class App {
    public static void main(String[] args) throws Exception {
        
        ParDeNumeros nums = new ParDeNumeros();
        // ParDeNumerosServicios numSv = new ParDeNumerosServicios();
        ParDeNumerosServicios.mostrarValores(nums);
        ParDeNumerosServicios.calcularPotencia(nums);
        ParDeNumerosServicios.calculaRaiz(nums);

    }
}
