/// EJERCICIO EXTRA 10
// Realice un programa para que el usuario adivine el resultado de una
// multiplicación entre dos números generados aleatoriamente entre 0 y 10.
// El programa debe indicar al usuario si su respuesta es o no correcta. En
// caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
// su respuesta nuevamente. Para realizar este ejercicio investigue como
// utilizar la función Math.random() de Java.

import java.util.Scanner;

public class EjercicioExtra10 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int num1, num2, resultado, num;
        
        // Numeros generados aleatoriamente entre 0 y 10 (al sumarle +1 impedis el "0")
        num1 = (int) (Math.random()*11);
        num2 = (int) (Math.random()*11);
        resultado = num1 * num2;

        do{
            System.out.println("Ingrese el resultado de la multiplicacion misteriosa..");
            num = in.nextInt();
        }while(num!=resultado);

        System.out.println("Has acertado! \nResultado de "+num1+"*"+num2+" = "+resultado);
        in.close();
    }
}
