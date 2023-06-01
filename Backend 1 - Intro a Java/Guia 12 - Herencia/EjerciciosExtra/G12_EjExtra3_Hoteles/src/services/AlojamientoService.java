package services;

import java.util.Scanner;

import entities.Alojamiento;

public class AlojamientoService {
    
    protected Scanner read = new Scanner(System.in);

    public Alojamiento crearAlojamiento(){
        System.out.println("--- CREANDO ALOJAMIENTO ---");
        System.out.print("Ingrese el nombre del alojamiento => ");
        String nombre = read.nextLine();
        System.out.print("Ingrese la direccion del alojamiento => ");
        String direccion = read.nextLine();
        System.out.print("Ingrese la localidad del alojamiento => ");
        String localidad = read.nextLine();
        System.out.print("Ingese el nombre del gerente del alojamiento => ");
        String gerente = read.nextLine();

        return new Alojamiento(nombre,direccion,localidad,gerente);
    }


}
