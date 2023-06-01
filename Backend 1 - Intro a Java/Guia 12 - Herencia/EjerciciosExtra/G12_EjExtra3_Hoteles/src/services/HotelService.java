package services;

import entities.Alojamiento;
import entities.Hotel;

public class HotelService extends AlojamientoService {

    public Hotel crearHotel(){
        Alojamiento a = crearAlojamiento();
        System.out.println("--- CREANDO HOTEL ---");
        System.out.print("Ingrese cantidad de camas por habitacion => ");
        int camas = read.nextInt();
        read.nextLine();
        System.out.print("Ingrese cantidad de habitaciones por piso => ");
        int habitaciones = read.nextInt();
        read.nextLine();
        System.out.print("Ingrese la cantidad de pisos del hotel => ");
        int pisos = read.nextInt();
        read.nextLine();

        return new Hotel(a.getNombre(),a.getDireccion(),a.getLocalidad(),a.getGerente(),habitaciones,camas,pisos);
    }

}
