/// EJERCICIO EXTRA 2
// Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, 
// sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto 
// puntos usando un método crearPuntos() que le pide al usuario los dos números y los 
// ingresa en los atributos del objeto. Después, a través de otro método calcular y devolver 
// la distancia que existe entre los dos puntos que existen en la clase Puntos.

import entidadesPunto.*;

public class App {
    public static void main(String[] args) throws Exception {
        Puntos p = new Puntos();

        p.crearPuntos();
        System.out.println("Hay una distancia total de "+p.distanciaPuntos()+" puntos.");
    }
}
