/// EJERCICIO EXTRA 2
// Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una.
//  A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A,
//   A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales y los valores finales de cada variable.
//    Utilizar sólo una variable auxiliar.

import java.util.Scanner;

public class EjercicioExtra2 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a=1, b=2, c=3, d=4, aux;
        System.out.println("Valores iniciales: A:"+a+" B:"+b+" C:"+c+" D:"+d);
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        System.out.println("Valores finales: A:"+a+" B:"+b+" C:"+c+" D:"+d);
        in.close();
    }   
}
