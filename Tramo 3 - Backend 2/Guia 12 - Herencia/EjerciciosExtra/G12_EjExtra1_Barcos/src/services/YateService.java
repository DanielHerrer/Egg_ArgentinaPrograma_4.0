package services;

import entities.BarcoMotor;
import entities.Yate;

public class YateService extends BarcoMotorService {
    
    public Yate crearYate(){

        BarcoMotor bm = crearBarcoMotor();

        System.out.print("Ingrese el num. de camarotes => ");
        int camarotes = read.nextInt();

        return new Yate(bm,camarotes);
    }


}
