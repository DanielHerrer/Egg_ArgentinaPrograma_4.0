package services;

import entities.Alojamiento;
import entities.ExtraHotelero;

public class ExtraHoteleroService extends AlojamientoService {


    public ExtraHotelero crearExtraHotelero(){
        Alojamiento a = crearAlojamiento();
        System.out.println("--- CREANDO EXTRA HOTELERO ---");
        boolean privado;
        do{
            System.out.print("Ingrese si es privado o no (s/n) => ");
            char op = read.nextLine().charAt(0);
            if(op == 's' || op == 'S'){
                privado = true;
                break;
            }else if(op == 'n' || op == 'N'){
                privado = false;
                break;
            }
        }while(true);
        System.out.print("Ingrese la cantidad de metros cuadrados (m2) => ");
        int metros = read.nextInt();
        read.nextLine();

        return new ExtraHotelero(a.getNombre(),a.getDireccion(),a.getLocalidad(),a.getGerente(),privado,metros);
    }



}
