package services;

import entities.*;

public class EstudianteService extends PersonaService {
    
    public Estudiante crearEstudiante(){
        Persona p = crearPersona();
        System.out.println("-CURSO-\n  1. Programación FrontEnd\n  2. Programación BackEnd\n  3. Analisis de datos");
        String curso = "";
        do{
            System.out.print(cyan+"Ingrese opcion => "+reset);
            int op = read.nextInt();
            read.nextLine();
            switch(op){
                case 1:
                    curso = blue+"Programación FrontEnd"+reset;
                    break;
                case 2:
                    curso = purple+"Programación BackEnd"+reset;
                    break;
                case 3:
                    curso = yellow+"Analisis de Datos"+reset;
                    break;
                default:
                    System.out.println(red+"Opcion invalida"+reset);
            }
        }while(curso == "");
        
        return new Estudiante(p.getNombre(), p.getApellido(), p.getEstadoCivil(), curso);
    }


}
