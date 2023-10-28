// • En cuanto a los estudiantes, se requiere almacenar el curso en el que están
// matriculados.

package entities;

import java.util.Scanner;

public class Estudiante extends Persona {
    
    private String curso;

    public Estudiante(){}

    public Estudiante(String nombre, String apellido, String estadoCivil, String curso) {
        super(nombre, apellido, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setCurso(Scanner read){
        System.out.println("-CAMBIAR CURSO-\n  1. Programación FrontEnd\n  2. Programación BackEnd\n  3. Analisis de datos");
        String cursoX = "";
        do{
            System.out.print(cyan+"Ingrese opcion => "+reset);
            int op = read.nextInt();
            read.nextLine();
            switch(op){
                case 1:
                    cursoX = blue+"Programación FrontEnd"+reset;
                    break;
                case 2:
                    cursoX = purple+"Programación BackEnd"+reset;
                    break;
                case 3:
                    cursoX = yellow+"Analisis de Datos"+reset;
                    break;
                default:
                    System.out.println(red+"Opcion invalida"+reset);
            }
        }while(cursoX == "");
        this.curso = cursoX;
    }

}
