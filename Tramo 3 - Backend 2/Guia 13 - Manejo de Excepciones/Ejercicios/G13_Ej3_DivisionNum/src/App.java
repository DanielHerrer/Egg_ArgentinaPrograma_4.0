// G13 EJ3 - Juan Pablo Godoy

// Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
// números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
// para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
// una división con los dos numeros y mostrar el resultado.

import entities.DivisionNumero;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DivisionNumero dn = new DivisionNumero();
        try {
            System.out.println("Ingrese el primer numero");
            dn.setNum1(Integer.parseInt(sc.next()));
            System.out.println("Ingrese el segundo numero");
            dn.setNum2(Integer.parseInt(sc.next()));
            System.out.println(dn.getNum1() / dn.getNum2());
        } catch (ArithmeticException a) {
            System.out.println("Division por 0");
            System.out.println(a.fillInStackTrace());
            System.out.println(a.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.fillInStackTrace());
            System.out.println(e.getMessage());
            System.out.println("No se que queres hacer mostro");
        }
        sc.close();
    }
}
