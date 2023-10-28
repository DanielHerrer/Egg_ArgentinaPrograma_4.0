/// EJERCICIO 7
// Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo 
// lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo: tienen que ser de
//  un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
// Las secuencias leídas que respeten el formato se consideran correctas, 
// la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
// y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
// Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas.

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String cadena, letraIni, letraFin;
        int cantCorr = 0, cantInco = 0;

        do{
            System.out.println("Ingrese una cadena: ");
            cadena = in.next();
            letraIni = cadena.substring(0,1);
            letraFin = cadena.substring((cadena.length()-1), (cadena.length()));
            if(cadena.length() == 5 && letraIni.equals("X") && letraFin.equals("O")){
                System.out.println("CORRECTO");
                cantCorr++;
            }else{
                if(cadena.equals("&&&&&")){
                    break;
                }else{
                    System.out.println("INCORRECTO");
                    cantInco++;
                }
            }
        }while(cadena != "&&&&&");
        System.out.println("Se ha declarado el final de los envios.");
        System.out.println("Cant. de cadenas correctas: "+cantCorr);
        System.out.println("Cant. de cadenas incorrectas: "+cantInco);
        in.close();
    }
}
