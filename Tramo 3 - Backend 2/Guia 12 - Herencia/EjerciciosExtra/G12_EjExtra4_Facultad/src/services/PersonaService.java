package services;

import java.util.Scanner;

import entities.Persona;

public class PersonaService {
    
    protected Scanner read = new Scanner(System.in);
    
    protected String red = "\u001B[31m";
    protected String yellow = "\u001B[33m";
    protected String blue = "\u001B[34m";
    protected String purple = "\u001B[35m";
    protected String cyan = "\u001B[36m";
    protected String reset = "\u001B[0m";

    public Persona crearPersona(){
        System.out.print(cyan+"Ingresar nombre => "+reset);
        String nombre = read.nextLine();
        System.out.print(cyan+"Ingresar apellido => "+reset);
        String apellido = read.nextLine();
        System.out.println("-ESTADO CIVIL-\n  1. Solterx\n  2. Casadx\n  3. Poliamor");
        String estadoCivil = "";
        do{
            System.out.print(cyan+"Ingrese opcion => "+reset);
            int opEstadoCivil = read.nextInt();
            read.nextLine();
            switch(opEstadoCivil){
                case 1: 
                    estadoCivil = "Solterx";
                    break;
                case 2:
                    estadoCivil = "Casadx";
                    break;
                case 3:
                    estadoCivil = "Poliamor";
                    break;
                default:
                    System.out.println(red+"Opcion invalida"+reset);
            }
        }while(estadoCivil == "");

        return new Persona(nombre, apellido, estadoCivil);
    }

}
