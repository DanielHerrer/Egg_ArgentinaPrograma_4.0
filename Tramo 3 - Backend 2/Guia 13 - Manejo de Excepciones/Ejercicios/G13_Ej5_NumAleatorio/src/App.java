// G13 EJ4 - Juan Pablo Godoy

// Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
// debe generar un número aleatorio entre 1 y 50, y el usuario tiene que intentar adivinarlo. Para
// ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
// número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
// consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
// ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
// controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
// carácter fallido como un intento.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer numAleatorio = (int)(Math.random()*51);
        Integer num = 0;
        Integer intentos = 0;
        boolean adivinado = false;
            System.out.println("Bienvenido al juego de adivinar un numero aleatorio de entre 1 y 500");
        do {
            try {
                System.out.print("Ingrese su numero => ");
                num = sc.nextInt();
                sc.nextLine();
                if (num > numAleatorio) {
                    System.out.println("El numero que esta buscando es menor que el numero ingresado");
                }else if (num < numAleatorio){
                    System.out.println("El numero que esta buscando es mayor que el numero ingresado");
                }else{
                    adivinado = true;
                }
            } catch (java.util.InputMismatchException e){
                System.err.println("Usted no ingreso un numero");
                sc.nextLine(); // posible solucion
            } catch (Exception e){
                System.err.println("Error de sistema");
                sc.nextLine(); // posible solucion
            } finally {
                intentos++;
            }
        } while (!adivinado);
     
        System.out.println("Adivinaste el numero en " + intentos + " intentos");
        sc.close();
    }
}
