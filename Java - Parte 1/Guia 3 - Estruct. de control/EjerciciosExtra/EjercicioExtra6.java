import java.util.Scanner;

/// EJERCICIO EXTRA 6
// Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
//  por debajo de 1.60 mts. y el promedio de estaturas en general.

public class EjercicioExtra6 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int nPersonas, promDebajo=0;
        double altura, promGeneral=0;

        System.out.println("Cuantas personas hay?:");
        nPersonas = in.nextInt();

        for(int i=0;i<nPersonas;i++){
            System.out.println("Ingrese la altura de la persona nº"+i+": ");
            altura = in.nextDouble();
            if(altura<1.60){
                promDebajo++;
            }
            promGeneral = promGeneral + altura;
        }

        System.out.println("La estatura general de "+nPersonas+" persona/s es: "+promGeneral/nPersonas);
        System.out.println("El promedio de personas por debajo de 1.60mts es: "+promDebajo+" de "+nPersonas);
        in.close();
    }
}
