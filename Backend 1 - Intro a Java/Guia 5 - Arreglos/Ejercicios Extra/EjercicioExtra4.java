/// EJERCICIO EXTRA 4 - GUIA 5
// Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 
// 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. Durante el período de cursado cada alumno 
// obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:

// Primer trabajo práctico evaluativo 10%
// Segundo trabajo práctico evaluativo 15%
// Primer Integrador 25%
// Segundo integrador 50%

// Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del programa los profesores
//  necesitan obtener por pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que solo aprueban los
//   alumnos con promedio mayor o igual al 7 de sus notas del curso.

import java.util.Scanner;

public class EjercicioExtra4 {
    public static void main(String[]args){
        int aprobados=0, desaprobados=0;
        double[] notasAlumnos = new double[10];

        calcularPromedio(notasAlumnos);
        mostrarVector(notasAlumnos);

        for(int i=0; i<notasAlumnos.length; i++){
            if(notasAlumnos[i]>=7){
                aprobados++;
            }else{
                desaprobados++;
            }
        }
        System.out.println("Los alumnos APROBADOS son "+aprobados);
        System.out.println("Los alumnos DESAPROBADOS son "+desaprobados);
    }

    public static void mostrarVector(double vector[]){
        for(int i=0; i<vector.length; i++){
            System.out.print("["+vector[i]+"] ");
        }
        System.out.println("");
    }

    public static void calcularPromedio(double vector[]){
        Scanner in = new Scanner(System.in);
        double tp1, tp2, integ1, integ2;
        for(int i=0; i<vector.length; i++){
            System.out.println("Ingrese la nota del primer trabajo practico del alumno nº"+(i+1));
            tp1 = in.nextDouble();
            System.out.println("Ingrese la nota del segundo trabajo practico del alumno nº"+(i+1));
            tp2 = in.nextDouble();

            System.out.println("Ingrese la nota del primer integrador del alumno nº"+(i+1));
            integ1 = in.nextDouble();
            System.out.println("Ingrese la nota del segundo integrador del alumno nº"+(i+1));
            integ2 = in.nextDouble();

            vector[i] = ((tp1*0.1)+(tp2*0.15)+(integ1*0.25)+(integ2*0.50));
        }
        in.close();
    }
}
