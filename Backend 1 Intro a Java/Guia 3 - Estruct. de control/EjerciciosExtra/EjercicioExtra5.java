/// EJERCICIO EXTRA 5
// Una obra social tiene tres clases de socios:
// Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
// Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
// Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
// Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento 
// (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.


import java.util.Scanner;

public class EjercicioExtra5 {
    public static void main(String[]args){
        Scanner in =  new Scanner(System.in);
        double precioBase=125000, precioDesc;
        char clase;

        System.out.println("Ingrese su clase de socio: ");
        clase = in.next().charAt(0);

        switch (clase) {
            case 'a':
                System.out.println("Precio base: " + precioBase);
                precioDesc = precioBase * 0.5;
                System.out.println("(Socio clase A) Precio con descuento: " + precioDesc);
                break;
            case 'b':
                System.out.println("Precio base: " + precioBase);
                precioDesc = precioBase * 0.65;
                System.out.println("(Socio clase B) Precio con descuento: " + precioDesc);
                break;
            case 'c':
                System.out.println("Precio base: " + precioBase);
                precioDesc = precioBase;
                System.out.println("(Socio clase C) No posee descuento alguno.");
                break;
            default:
                System.out.println("La opcion ingresada es incorrecta.");
                break;
        }
        in.close();
    }
}
