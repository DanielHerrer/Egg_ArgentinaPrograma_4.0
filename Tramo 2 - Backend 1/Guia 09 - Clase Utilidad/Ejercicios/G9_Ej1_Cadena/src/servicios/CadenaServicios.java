package servicios;

import entidades.Cadena;
import java.util.Scanner;

public class CadenaServicios {

    public Cadena crearFrase(){
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese la cadena a registrar => ");
        String frase = read.nextLine();
        System.out.println("");
        return new Cadena(frase);
    }

    public int mostrarVocales(Cadena cadena) {
        int contadorvocal = 0;
        String cadMin = cadena.getFrase().toLowerCase();
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadMin.substring(i, i + 1).equals("a") || 
                    cadMin.substring(i, i + 1).equals("e") || 
                        cadMin.substring(i, i + 1).equals("i") || 
                            cadMin.substring(i, i + 1).equals("o") || 
                                cadMin.substring(i, i + 1).equals("u")) {
                contadorvocal++;
            }
        }
        return contadorvocal;
    }

    public String invertirFrase(Cadena c1){
        String fraseAux = c1.getFrase();
        String fraseInv = "";
        // Recorre del final al principio de la frase
        for (int i = fraseAux.length(); i > 0; i--) {
            fraseInv += fraseAux.substring(i-1, i);
        }
        return fraseInv;
    }
    
    public int vecesRepetido(Cadena cadena, String letra){
        int contadorletras = 0;
        String fraseAux = cadena.getFrase().toLowerCase();
        for (int i = 0; i < fraseAux.length(); i++) {
            if (fraseAux.substring(i, i + 1).equals(letra.toLowerCase())){
                contadorletras++;
            }
        }
        return contadorletras;
    }
    
    public void compararLongitud(Cadena cadena , String frase){
        if (cadena.getLongitud() == frase.length()){
            System.out.println("La longitud de las frases es IGUAL");
        }else{
            System.out.println("La longitud de las frases NO es IGUAL");
        }
    }
    
    public String unirFrases(Cadena cadena, String frase){
        String fraseNueva = cadena.getFrase() + " " + frase;
        return fraseNueva;
    }
    
    public String reemplazar(Cadena cadena, String caracter){
        String frasereemplazo = "";
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if((cadena.getFrase().substring(i, i + 1)).toLowerCase().equals("a")){
                frasereemplazo += caracter;
            }else {
                frasereemplazo += cadena.getFrase().substring(i, i + 1);
            }
        }
        return frasereemplazo;
    }
    
    public Boolean contiene(Cadena cadena, String letraB){
        boolean contiene = false;
        String fraseAux = cadena.getFrase().toLowerCase();
        for (int i = 0; i < fraseAux.length() ; i++) {
            if (fraseAux.substring(i, i + 1).equals(letraB.toLowerCase())){
                contiene=true;
            }
        }
        return contiene;
    }
}