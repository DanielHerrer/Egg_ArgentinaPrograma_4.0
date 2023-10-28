/// EJERCICIO EXTRA 7 - Daniel F. Herrera
// Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método "calcular_area"
//  que calcule y devuelva el área del rectángulo. Luego crea un objeto "rectangulo1" de la clase 
//  "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.

public class App {
    public static void main(String[] args) throws Exception {
        
        Rectangulo rectangulo1 = new Rectangulo(4,6);
        System.out.println("El area de un rectangulo con 6 y 4 es = "+rectangulo1.calcular_area());

    }
}
