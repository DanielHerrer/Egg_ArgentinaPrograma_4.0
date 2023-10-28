/// EJERCICIO EXTRA 6
// Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario 
// las va ingresando, construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las palabras 
// se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria. Una vez concluida 
// la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente 
// imprima por pantalla la sopa de letras creada.

import java.util.Scanner;

public class EjercicioExtra6 {
    public static void main(String[]args) {

        Scanner in = new Scanner(System.in);
        String[][] matriz = new String[20][20];
        
        String palabra;
        System.out.println("Ingrese 5 palabras.");

        // FOR - INGRESA 5 PALABRAS
        for(int cant=0; cant<5; cant++){
            // DO WHILE - MIENTRAS QUE LA PALABRA NO CONTENGA CARACTERES CORRECTOS
            do{
                System.out.println("Ingrese la palabra nº"+(cant+1));
                palabra = in.next();

                Boolean hayEspacio;
                do{
                    hayEspacio = true;
                    int filaRandom = (int) (Math.random()*20);
                    int coluRandom = (int) (Math.random()*15);

                    // FOR - CORROBORA SI ESTA OCUPADO EL ESPACIO A OCUPAR, en ese caso, false
                    for(int j=coluRandom; j<(coluRandom+palabra.length()); j++){ 
                        if(matriz[filaRandom][j] != null){
                            hayEspacio = false;
                        }
                    }

                    // IF - SI HAY ESPACIO
                    if(hayEspacio == true){
                        int j=coluRandom, inicio=0, fin=1;
                        // FOR - RECORRE LA PALABRA HASTA ASIGNAR CADA LETRA
                        for(int c=0; c<palabra.length(); c++){   
                            matriz[filaRandom][j] = palabra.substring(inicio, fin);
                            inicio ++;
                            fin ++;
                            j ++;
                        }
                    }
                    
                }while(hayEspacio != true);

            }while(palabra.length()<3 || palabra.length()>5);
        }

        // RELLENA CON NUMEROS LOS ESPACIOS VACIOS
        for(int i=0; i<20; i++){
            for(int j=0; j<20; j++){
                if(matriz[i][j]==null){
                    String numR = Integer.toString((int)(Math.random()*10));  // CONVIERTE DE INT A STRING
                    matriz[i][j] = numR;
                }
            }
        }

        // MUESTRA LA MATRIZ
        for(int i=0; i<20; i++){
            for(int j=0; j<20; j++){
                System.out.print("["+matriz[i][j]+"] ");
            }
            System.out.println("");
        }

        in.close();
    }
}
