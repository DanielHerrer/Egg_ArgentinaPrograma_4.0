/// EJERCICIO 4
// Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y 
// un atributo privado altura. La clase incluirá un método para crear el rectángulo con los datos 
// del Rectángulo dados por el usuario. También incluirá un método para calcular la superficie del 
// rectángulo y un método para calcular el perímetro del rectángulo. Por último, tendremos un método 
// que dibujará el rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir 
// los métodos getters, setters y constructores correspondientes.
// Superficie = base * altura / Perímetro = (base + altura) * 2.

import java.util.Scanner;
import entidadesRectangulo.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Rectangulo ob = new Rectangulo();
        
        System.out.println("Ingrese base de su rectangulo: ");
        ob.setBase(in.nextInt());
        System.out.println("Ingrese altura de su rectangulo: ");
        ob.setAltura(in.nextInt());

        ob.dibujar();
        ob.calclularSuperficie();
        ob.calcularPerimetro();
        in.close();
    }
}
