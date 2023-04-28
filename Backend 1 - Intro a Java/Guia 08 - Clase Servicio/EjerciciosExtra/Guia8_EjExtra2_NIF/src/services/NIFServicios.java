package services;

import java.util.Scanner;

import entities.NIF;

public class NIFServicios {

    public NIF crearNif(){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese num DNI: ");
        int dni = read.nextInt();
        read.close();
        return new NIF(dni);
    }

    public void mostrar(NIF nif){
        System.out.println("El NIF es: "+getDni(nif)+"-"+getNif(nif));
    }

    public int getDni(NIF nif){
        return nif.getDni();
    }

    public String getNif(NIF nif){
        return nif.getNif();
    }
    
}
