package services;

import entities.ExtraHotelero;
import entities.Camping;

public class CampingService extends ExtraHoteleroService {
    
    public Camping crearCamping(){
        ExtraHotelero eh = crearExtraHotelero();
        System.out.println("--- CREANDO CAMPING ---");
        System.out.print("Ingrese la cantidad maxima de carpas => ");
        int cantCarpas = read.nextInt();
        read.nextLine();
        System.out.print("Ingrese la cantidad de baños => ");
        int cantBaños = read.nextInt();
        read.nextLine();
        boolean restaurante;
        do{
            System.out.print("Ingrese si tiene restaurante (s/n) => ");
            char op = read.nextLine().charAt(0);
            if(op == 's' || op == 'S'){
                restaurante = true;
                break;
            }else if(op == 'n' || op == 'N'){
                restaurante = false;
                break;
            }
        }while(true);
        
        return new Camping(eh.getNombre(), eh.getDireccion(), eh.getLocalidad(), eh.getGerente(), eh.isPrivado(), eh.getMetros(), cantCarpas, cantBaños, restaurante);
    }    


}
