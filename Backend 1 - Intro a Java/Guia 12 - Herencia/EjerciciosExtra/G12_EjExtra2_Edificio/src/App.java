// GUIA 12 Ejercicio Extra 2 - Daniel Franco Herrera

// Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
// dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
// métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
// superficie y el volumen de cada edificio.
// Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
// techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
// cantPersonas() y mostrar los resultados de cada edificio de oficinas.

import java.util.ArrayList;

import entities.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("------------- Ingrese 4 edificios -------------");
        ArrayList<Edificio> edificios = new ArrayList<>();
        for(int i=0; i<4; i++){
            if(i/2 == 0){
                System.out.println("-----------------------\nNUEVO POLIDEPORTIVO:");
                edificios.add(new Polideportivo());
            }else{
                System.out.println("-----------------------\nNUEVO EDIFICIO DE OFICINAS:");
                edificios.add(new EdificioDeOficinas());
            }
        }

        System.out.println("------------- Listado Edificios -------------");
        for(Edificio e: edificios){
            System.out.println("-----------------------");
            if(e instanceof Polideportivo){
                Polideportivo p = (Polideportivo) e;
                System.out.print("Polideportivo '"+p.getNombre()+"' | Techado: ");
                if(p.isTechado()){
                    System.out.println("SI");
                }else{
                    System.out.println("NO");
                }
                System.out.println("Superficie: "+p.calcularSuperficie()+" mt2");
                System.out.println("Volumen: "+p.calcularVolumen()+" mt3");
            }else if(e instanceof EdificioDeOficinas){
                EdificioDeOficinas eo = (EdificioDeOficinas) e;
                System.out.println("Edificio Ejecutivo | Num. Pisos: "+eo.getNumPisos()+" | Num. Ofic. x Piso: "+eo.getNumOficinas()+" | Num. Pers. x Ofic.: "+eo.getCantPersonasPorOficina());
                System.out.println("Superficie: "+eo.calcularSuperficie()+" mt2");
                System.out.println("Volumen: "+eo.calcularVolumen()+" mt3");
            }
        }

        System.out.println("------------- Recuento Polideportivos -------------");
        int techados=0, abiertos=0; 
        for(Edificio e: edificios){
            if(e instanceof Polideportivo){
                Polideportivo p = (Polideportivo) e;
                if(p.isTechado()){
                    techados++;
                }else{
                    abiertos++;
                }
            }
        }
        System.out.println("- "+techados+" Polideportivos techados");
        System.out.println("- "+abiertos+" Polideportivos aiertos");

        System.out.println("------------- Recuento Ejecutivos -------------");
        for(Edificio e: edificios){
            if(e instanceof EdificioDeOficinas){
                System.out.println("-----------------------");
                EdificioDeOficinas eo = (EdificioDeOficinas) e;
                System.out.println("Edificio ejecutivo con "+eo.getNumPisos()+" pisos");
                eo.cantPersonas();
            }
        }

    }
}