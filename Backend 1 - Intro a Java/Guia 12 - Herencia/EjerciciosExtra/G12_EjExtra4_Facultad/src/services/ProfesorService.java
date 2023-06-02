package services;

import entities.*;

public class ProfesorService extends EmpleadoService {

    public Profesor crearProfesor(){
        Empleado e = crearEmpleado();
        System.out.println("-DEPARTAMENTO-\n  1. FrontEnd\n  2. BackEnd\n  3. Analisis");
        String departamento = "";
        do{
            System.out.print(cyan+"Ingrese opcion => "+reset);
            int op = read.nextInt();
            read.nextLine();
            switch(op){
                case 1:
                    departamento = blue+"FrontEnd"+reset;
                    break;
                case 2:
                    departamento = purple+"BackEnd"+reset;
                    break;
                case 3:
                    departamento = yellow+"Analisis"+reset;
                    break;
            }
        }while(departamento == "");
        
        return new Profesor(e.getNombre(), e.getApellido(), e.getEstadoCivil(), e.getAñoIncorporacion(), e.getNumeroDeDespacho(), departamento);
    }
    
}
