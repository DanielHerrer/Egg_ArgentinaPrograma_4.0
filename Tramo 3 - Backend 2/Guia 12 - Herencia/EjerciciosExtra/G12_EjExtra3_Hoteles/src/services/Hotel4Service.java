package services;

import entities.Hotel;
import entities.Hotel4;

public class Hotel4Service extends HotelService {
    
    public Hotel4 crearHotel4(){
        Hotel h = crearHotel();
        System.out.println("--- CREANDO HOTEL 4 ---");
        char categoriaGim;
        do{
            System.out.print("Ingrese categoria del gimnasio (A/B) => ");
            categoriaGim = read.nextLine().charAt(0);
            categoriaGim = Character.toUpperCase(categoriaGim);
            if(categoriaGim == 'A'){
                break;
            }else if(categoriaGim == 'B'){
                break;
            }
        }while(true);
        System.out.print("Ingrese nombre del restaurante => ");
        String nombreRestaurante = read.nextLine();
        System.out.print("Ingrese la capacidad maxima del restaurante => ");
        int capacidadRestaurante = read.nextInt();
        read.nextLine();

        return new Hotel4(h.getNombre(),h.getDireccion(),h.getLocalidad(),h.getGerente(),h.getCantHabitaciones(),h.getCantCamas(),h.getCantPisos(),categoriaGim,nombreRestaurante,capacidadRestaurante);
    }

}
