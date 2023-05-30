package services;

import entities.Barco;
import entities.Velero;

public class VeleroService extends BarcoService {
    
    public Velero crearVelero(){
        Barco b = crearBarco();

        System.out.print("Ingrese num. de mastiles => ");
        int numMastiles = read.nextInt();

        return new Velero(b,numMastiles);
    }

}