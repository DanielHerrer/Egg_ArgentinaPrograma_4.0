// • Sobre el personal de servicio, hay que conocer a qué sección están asignados
// (biblioteca, decanato, secretaría, ...).

package entities;

import java.util.Scanner;

public class PersonalServicio extends Empleado {
    
    private String seccion;

    public PersonalServicio(){}

    public PersonalServicio(String nombre, String apellido, String estadoCivil, int añoIncorporacion,
            int numeroDeDespacho, String seccion) {
        super(nombre, apellido, estadoCivil, añoIncorporacion, numeroDeDespacho);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public void setSeccion(Scanner read){
        System.out.println("-CAMBIAR SECCION-\n  1. Biblioteca\n  2. Decanato\n  3. Secretaría");
        String seccion = "";
        do{
            System.out.println(cyan+"Ingrese opcion => "+reset);
            int op = read.nextInt();
            read.nextLine();
            switch(op){
                case 1:
                    seccion = "Biblioteca";
                    break;
                case 2:
                    seccion = "Decanato";
                    break;
                case 3:
                    seccion = "Secretaría";
                    break;
                default:
                    System.out.println(red+"Opcion no valida."+reset);
            }
        }while(seccion == "");
    }

}