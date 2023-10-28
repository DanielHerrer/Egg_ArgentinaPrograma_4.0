// • Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
// identificación y su estado civil.

package entities;

import java.util.Scanner;

public class Persona {

    protected String red = "\u001B[31m";
    protected String yellow = "\u001B[33m";
    protected String blue = "\u001B[34m";
    protected String purple = "\u001B[35m";
    protected String cyan = "\u001B[36m";
    protected String reset = "\u001B[0m";

    private Integer numeroID;
    private String nombre, apellido;
    private String estadoCivil;

    public Persona(){}
    
    public Persona(String nombre, String apellido, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNumeroID() {
        return numeroID;
    }

    public void setNumeroID(Integer numeroID) {
        this.numeroID = numeroID;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setEstadoCivil(Scanner read){
        System.out.println("-CAMBIAR ESTADO CIVIL-\n  1. Solterx\n  2. Casadx\n  3. Poliamor");
        String estadoCivilX = "";
        do{
            System.out.print(cyan+"Ingrese opcion => "+reset);
            int opEstadoCivil = read.nextInt();
            read.nextLine();
            switch(opEstadoCivil){
                case 1: 
                    estadoCivilX = "Solterx";
                    break;
                case 2:
                    estadoCivilX = "Casadx";
                    break;
                case 3:
                    estadoCivilX = "Poliamor";
                    break;
                default:
                    System.out.println(red+"Opcion invalida"+reset);
            }
        }while(estadoCivilX == "");
        this.estadoCivil = estadoCivilX;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", numeroID=" + numeroID + ", estadoCivil="
                + estadoCivil + "]";
    }

}
