// • Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
// pertenecen (lenguajes, matemáticas, arquitectura, ...).

package entities;

import java.util.Scanner;

public class Profesor extends Empleado {

    private String departamento;

    public Profesor(){}

    public Profesor(String nombre, String apellido, String estadoCivil, int añoIncorporacion,
            int numeroDeDespacho, String departamento) {
        super(nombre, apellido, estadoCivil, añoIncorporacion, numeroDeDespacho);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setDepartamento(Scanner read){
        System.out.println("-CAMBIAR DEPARTAMENTO-\n  1. Programación FrontEnd\n  2. Programación BackEnd\n  3. Analisis de datos");
        String departamentoX = "";
        do{
            System.out.print(cyan+"Ingrese opcion => "+reset);
            int op = read.nextInt();
            read.nextLine();
            switch(op){
                case 1:
                    departamentoX = blue+"Programación FrontEnd"+reset;
                    break;
                case 2:
                    departamentoX = purple+"Programación BackEnd"+reset;
                    break;
                case 3:
                    departamentoX = yellow+"Analisis de Datos"+reset;
                    break;
                default:
                    System.out.println(red+"Opcion invalida"+reset);
            }
        }while(departamentoX == "");
        this.departamento = departamentoX;
    }

}