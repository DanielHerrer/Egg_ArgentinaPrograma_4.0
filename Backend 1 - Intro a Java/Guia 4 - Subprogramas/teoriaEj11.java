import java.util.Scanner;

/// TEORIA EJERCICIO 11
// Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, 
// y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el carácter 
// que se indica en la tabla y el resto de los caracteres 
// (incluyendo a las vocales acentuadas) se mantienen sin cambios.

public class teoriaEj11 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String cadena;
        do{
            System.out.println("Ingrese una cadena terminada con un punto ('.') :");
            cadena = in.nextLine();
        }while(!cadena.substring(cadena.length()-1, cadena.length()).equals("."));

        System.out.println("La cadena codificada seria: \n"+codificar(cadena));
        in.close();
    }

    public static String codificar(String cadena) {
        String cadenaCod = "";
        
        for(int i=0;i<cadena.length();i++){
    
            if(cadena.substring(i, i+1).equals("a") ||cadena.substring(i, i+1).equals("e") ||cadena.substring(i, i+1).equals("i") ||cadena.substring(i, i+1).equals("o") ||cadena.substring(i, i+1).equals("u") ){
                switch(cadena.substring(i, i+1)){
                    case "a":
                        cadenaCod = cadenaCod + "@";
                        break;
                    case "e":
                        cadenaCod = cadenaCod + "#";
                        break;
                    case "i":
                        cadenaCod = cadenaCod + "$";
                        break;
                    case "o":
                        cadenaCod = cadenaCod + "%";
                        break;
                    case "u":
                        cadenaCod = cadenaCod + "*";
                        break;
    
                }    
            }else{
                cadenaCod = cadenaCod + cadena.substring(i, i+1);
            }
        }
    
        return cadenaCod;
    }

}

