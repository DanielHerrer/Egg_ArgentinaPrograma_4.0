// Crear la clase ArregloService, en el
// paquete servicio, con los siguientes métodos:
// 1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
// números aleatorios.
// 2) Método mostrar recibe un arreglo por parámetro y lo muestra por
// pantalla.
// 3) Método ordenar recibe un arreglo por parámetro y lo ordena de
// mayor a menor.
// 4) Método inicializarB copia los primeros 10 números del arreglo A en el
// arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
// En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
// mostrar A y B.

package services;

import java.util.Arrays;

public class ArregloService {

    public void inicializarA(double[] arreglo){
        for(int i=0;i<arreglo.length;i++){
            arreglo[i] = (double)(Math.random()*10);
        }
    }

    public void inicializarB(double[] arreglo){
        for(int i=0;i<arreglo.length;i++){
            arreglo[i] = (double)(Math.random()*10);
        }
    }

    public void mostrar(double[] arreglo){
        // System.out.println(Arrays.toString(arreglo));
        // Utilizo el for para permitirme usar el String.format y mostrar un numero más chico
        for(double d: arreglo){
            System.out.print("["+String.format("%.2f", d)+"] ");
        }
        System.out.println("\n--------------------------------------------------------------------------------------");
    }

    public void ordenar(double[] arreglo){
        // NO PUEDO HACER 'double[] arregloAux = arreglo;' PORQUE CREO UNA REFERENCIA
        // LO QUE SE MODIFIQUE EN UNO MODIFICA AL OTRO
        double[] arregloAux = new double[arreglo.length];
        // ASGINO VALOR POR VALOR A UN ARREGLO AUXILIAR
        int i=0;
        for(double n: arreglo){
            arregloAux[i] = n;
            i++;
        }
        // ORDENO EL ARREGLO AUXILIAR DE MENOR A MAYOR
        Arrays.sort(arregloAux);
        // ASGINO INVERSAMENTE LOS VALORES DEL ARREGLO AUX AL ARREGLO ORIGINAL
        i=0;
        for(int j=arreglo.length-1; j>=0; j--){
            arreglo[i] = arregloAux[j];
            i++;
        }    
    }

    public void inicializarB(double[] arregloA, double[] arregloB){
        for(int i=0; i<10; i++){
            arregloB[i] = arregloA[i];
        }
        Arrays.fill(arregloB, 10, 20, 0.5);
    }

}