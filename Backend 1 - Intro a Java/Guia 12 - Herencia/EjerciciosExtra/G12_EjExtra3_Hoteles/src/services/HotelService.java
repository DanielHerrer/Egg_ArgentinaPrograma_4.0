package services;

import entities.Alojamiento;
import entities.Hotel;

public class HotelService extends AlojamientoService {

    public Hotel crearHotel(){
        Alojamiento a = super.crearAlojamiento();
        System.out.println("--- CREANDO HOTEL ---");
        System.out.println("Ingrese cantidad de camas por habitacion => ");
        int camas = read.nextInt();
        read.nextLine();
        System.out.println("Ingrese cantidad de habitaciones por piso => ");
        int habitaciones = read.nextInt();
        read.nextLine();
        System.out.println("Ingrese la cantidad de pisos del hotel => ");
        int pisos = read.nextInt();
        read.nextLine();

        return new Hotel(a.getNombre(),a.getDireccion(),a.getLocalidad(),a.getGerente(),habitaciones,camas,pisos);
    }

}
