// GUIA 9 EJERCICIO 3 - Daniel F. Herrera
// Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
// arreglo B de 20 números reales. 

import services.ArregloService;

public class App {
    public static void main(String[] args) throws Exception {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        ArregloService as = new ArregloService();

        as.inicializarA(arregloA);
        as.mostrar(arregloA);
        as.ordenar(arregloA);
        as.inicializarB(arregloA, arregloB);
        as.mostrar(arregloA);
        as.mostrar(arregloB);


    }
}
