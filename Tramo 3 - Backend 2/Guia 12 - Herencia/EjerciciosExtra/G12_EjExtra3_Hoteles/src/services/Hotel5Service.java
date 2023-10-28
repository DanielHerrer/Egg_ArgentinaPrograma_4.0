package services;

import entities.Hotel4;
import entities.Hotel5;

public class Hotel5Service extends Hotel4Service {
    
    public Hotel5 crearHotel5(){
        Hotel4 h = crearHotel4();
        System.out.println("--- CREANDO HOTEL 5 ---");
        System.out.print("Ingrese la cantidad de salones de conferencia => ");
        int cantSalonesConferencia = read.nextInt();
        read.nextLine();
        System.out.print("Ingrese la cantidad de suites disponibles => ");
        int cantSuites = read.nextInt();
        read.nextLine();
        System.out.print("Ingrese la cantidad de limosinas funcionales => ");
        int cantLimosinas = read.nextInt();
        read.nextLine();

        return new Hotel5(h.getNombre(),h.getDireccion(),h.getLocalidad(),h.getGerente(),h.getCantHabitaciones(),h.getCantCamas(),h.getCantPisos(),h.getGimnasio(),h.getNombreRestaurante(),h.getCapacidadRestaurante(),cantSalonesConferencia,cantSuites,cantLimosinas);
    }

}
