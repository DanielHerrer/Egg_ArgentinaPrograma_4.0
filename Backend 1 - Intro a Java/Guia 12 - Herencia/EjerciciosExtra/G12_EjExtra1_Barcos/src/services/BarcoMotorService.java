package services;

import entities.Barco;
import entities.BarcoMotor;

public class BarcoMotorService extends BarcoService {
    
    public BarcoMotor crearBarcoMotor(){
        Barco b = super.crearBarco();
        
        System.out.print("Ingrese la potencia en CV => ");
        int potencia = read.nextInt();
        read.nextLine();

        return new BarcoMotor(b, potencia);
    }    

}