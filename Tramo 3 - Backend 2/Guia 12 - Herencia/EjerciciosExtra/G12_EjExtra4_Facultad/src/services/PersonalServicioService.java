package services;

import entities.*;

public class PersonalServicioService extends EmpleadoService {
    
    public PersonalServicio crearPersonalServicio(){
        Empleado e = crearEmpleado();
        System.out.println("-SECCION-\n  1. Biblioteca\n  2. Decanato\n  3. Secretaría");
        String seccion = "";
        do{
            System.out.print(cyan+"Ingrese opcion => "+reset);
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
        
        return new PersonalServicio(e.getNombre(), e.getApellido(), e.getEstadoCivil(), e.getAñoIncorporacion(), e.getNumeroDeDespacho(), seccion);
    }

}