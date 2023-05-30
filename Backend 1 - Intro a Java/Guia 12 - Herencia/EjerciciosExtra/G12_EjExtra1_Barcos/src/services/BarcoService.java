package services;

import java.util.Scanner;

import entities.Barco;

public class BarcoService {
    
    protected Scanner read = new Scanner(System.in);

    public Barco crearBarco(){
        System.out.print("Ingresa la matricula del barco => ");
        int matricula = read.nextInt();
        read.nextLine();

        System.out.print("Ingrese su eslora (tamaño) en metros => ");
        int esloraMetros = read.nextInt();
        read.nextLine();
        
        int añoFabricacion;
        do{
            System.out.print("Ingrese año de fabricacion => ");
            añoFabricacion = read.nextInt();
            read.nextLine();
            if(añoFabricacion>=1800 && añoFabricacion<2024){
                break;
            }
        }while(true);

        return new Barco(matricula, esloraMetros, añoFabricacion);
    }

}
