// Vamos a usar la clase Date que ya existe en Java. 
// Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
// Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
// Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. 
// Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
// Método fechaActual que cree un objeto fecha con el día actual. 
// Para esto usaremos el constructor vacío de la clase Date. 
// Ejemplo: Date fechaActual = new  Date();
// El método debe retornar el objeto Date.
// Método diferencia que reciba las dos fechas por parámetro y retorna la 
// diferencia de años entre una y otra (edad del usuario).

package services;

import java.util.Date;
import java.util.Scanner;

public class FechaService {
    
    public Date fechaNacimiento(){
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese dia de nacimiento => ");
        int dd = read.nextInt();
        System.out.print("\nIngrese mes de nacimiento => ");
        int mm = read.nextInt();
        System.out.print("\nIngrese año de nacimiento => ");
        int aa = read.nextInt();
        System.out.println("");
        return new Date(aa-1900,mm,dd);
    }   

    public Date fechaActual(){
        return new Date();
    }

    public int diferenciaDeAños(Date fecha1, Date fecha2){
        if(fecha1.getYear()>=fecha2.getYear()){
            return fecha1.getYear() - fecha2.getYear();
        }else{
            return fecha2.getYear() - fecha1.getYear();
        }
    }

}
