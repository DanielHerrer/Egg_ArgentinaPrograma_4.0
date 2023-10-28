package services;

import java.time.LocalDate;

import entities.*;

public class EmpleadoService extends PersonaService {
    
    public Empleado crearEmpleado(){
        Persona p = crearPersona();
        
        int añoIncorporacion;
        do{
            System.out.print(cyan+"Ingrese año de incorporación (2000 < X) => "+reset);
            añoIncorporacion = read.nextInt();
            read.nextLine();
        }while(añoIncorporacion < 2000 || añoIncorporacion > LocalDate.now().getYear());  // LocalDate.now().getYear() = AÑO ACTUAL
        
        System.out.print(cyan+"Ingrese numero de despacho => "+reset);
        int numeroDeDespacho = read.nextInt();
        read.nextLine();

        return new Empleado(p.getNombre(), p.getApellido(), p.getEstadoCivil(), añoIncorporacion, numeroDeDespacho);
    }

}
