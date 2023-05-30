// GUIA 12 - EJERCICIO 4 - Daniel Franco Herrera
// Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
// geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
// dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
// dos métodos para calcular el área, el perímetro y el valor de PI como constante.
// Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
// calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
// resultado final.

import entities.*;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");

        Circulo c = new Circulo(5);
        Rectangulo r = new Rectangulo(15,20);

        System.out.println("El area de un circulo = "+c.calculaArea());
        System.out.println("El perimetro de un circulo = "+c.calcularPerimetro());
        System.out.println("El area de un rectangulo = "+r.calculaArea());
        System.out.println("El perimetro de un rectangulo = "+r.calcularPerimetro());

    }
}