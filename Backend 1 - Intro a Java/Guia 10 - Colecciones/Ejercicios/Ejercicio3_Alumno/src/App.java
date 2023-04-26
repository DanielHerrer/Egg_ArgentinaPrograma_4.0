// EJERCICIO 3 - Daniel Franco Herrera

import java.util.Scanner;
import entities.Alumno;
import services.AlumnoService;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner read = new Scanner(System.in);
        AlumnoService as = new AlumnoService();

        as.agregarAlumnos();

        System.out.print("Cual es el nombre del alumno a calcular promedio? => ");
        String nombre = read.nextLine();

        Boolean encontrado = false;
        for(Alumno alumno: as.getAlumnos()){
            if(alumno.getNombre().equalsIgnoreCase(nombre)){
                System.out.println("Promedio de "+alumno.getNombre()+" = "+as.notaFinal(alumno));
                encontrado = true; 
            }
        }
        if(!encontrado){
            System.out.println("Alumno no encontrado..");
        }

        read.close();
    }
}
