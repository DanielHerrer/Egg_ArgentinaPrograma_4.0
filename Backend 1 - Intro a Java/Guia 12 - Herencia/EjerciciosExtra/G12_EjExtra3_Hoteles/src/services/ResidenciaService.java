package services;

import entities.ExtraHotelero;
import entities.Residencia;

public class ResidenciaService extends ExtraHoteleroService {
    
    public Residencia crearResidencia(){
        ExtraHotelero eh = crearExtraHotelero();
        System.out.println("--- CREANDO RESIDENCIA ---");
        System.out.print("Ingresar numero de habitaciones => ");
        int numHabitaciones = read.nextInt();
        read.nextLine();
        boolean descGremio;
        do{
            System.out.print("Realiza descuentos a los afiliados al gremio? (s/n) => ");
            char op1 = read.nextLine().charAt(0);
            if(op1 == 's' || op1 == 'S'){
                descGremio = true;
                break;
            }else if(op1 == 'n' || op1 == 'N'){
                descGremio = false;
                break;
            }
        }while(true);
        boolean campoDeport;
        do{
            System.out.print("Posee campo deportivo? (s/n) => ");
            char op2 = read.nextLine().charAt(0);
            if(op2 == 's' || op2 == 'S'){
                campoDeport = true;
                break;
            }else if(op2 == 'n' || op2 == 'N'){
                campoDeport = false;
                break;
            }
        }while(true);

        return new Residencia(eh.getNombre(),eh.getDireccion(),eh.getLocalidad(),eh.getGerente(),eh.isPrivado(),eh.getMetros(),numHabitaciones,descGremio,campoDeport);
    }
}