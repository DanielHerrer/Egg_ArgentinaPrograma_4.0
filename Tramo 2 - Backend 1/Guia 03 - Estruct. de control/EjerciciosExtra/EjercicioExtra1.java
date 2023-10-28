/// EJERCICIO EXTRA 1
// Dado un tiempo en minutos, calcular su equivalente en días y horas. 
// Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.

import java.util.Scanner;

public class EjercicioExtra1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int mm, hh, dd;

        System.out.println("Ingrese un tiempo en minutos:");
        mm = in.nextInt();

        hh = mm / 60;
        dd = hh / 24;
        System.out.println("La cantidad de horas: "+hh);
        System.out.println("La cantidad de dias: "+dd);
        in.close();

    }
}