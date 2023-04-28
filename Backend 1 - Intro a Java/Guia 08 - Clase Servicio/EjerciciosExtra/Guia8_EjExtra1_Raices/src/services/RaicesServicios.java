
// Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuación de 2º 
// grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c. Hay que insertar estos 3 
// valores para construir el objeto a través de un método constructor. Luego, en RaicesServicio las 
// operaciones que se podrán realizar son las siguientes:
// Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la 
// siguiente fórmula: (b^2)-4*a*c
// Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, 
// el discriminante debe ser mayor o igual que 0.
// Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, 
// el discriminante debe ser igual que 0.
// Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
// Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso 
// en que se tenga una única solución posible.
// Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las 
// posibles soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), 
// según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.

// Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b


package services;
import entities.Raices;
import java.util.Scanner;

public class RaicesServicios {
    
    public Raices crearRaiz(){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el coeficiente de A:");
        double a = read.nextDouble();
        System.out.println("Ingrese el coeficiente de B:");
        double b = read.nextDouble();
        System.out.println("Ingrese el coeficiente de C:");
        double c = read.nextDouble();
        read.close();
        return new Raices(a,b,c);
    }

    // (b^2)-4*a*c
    public double getDiscriminante(Raices r){
        return Math.pow(r.getB(),2) - 4*r.getA()*r.getC();
    }

    public Boolean tieneRaices(Raices r){
        if(getDiscriminante(r)>0){
            return true;
        }else{
            return false;
        }
    }

    public Boolean tieneRaiz(Raices r){
        if(getDiscriminante(r)==0){
            return true;
        }else{
            return false;
        }
    }

    // (-b ± √((b^2)-(4*a*c)))/(2*a)
    public void obtenerRaices(Raices r){
        double x1 = (-r.getB() + Math.sqrt((Math.pow(r.getB(),2))-(4*r.getA()*r.getC())))/(2*r.getA());
        System.out.println("(-b + √((b^2)-(4*a*c)))/(2*a) = "+x1);
        double x2 = (-r.getB() - Math.sqrt((Math.pow(r.getB(),2))-(4*r.getA()*r.getC())))/(2*r.getA());
        System.out.println("(-b - √((b^2)-(4*a*c)))/(2*a) = "+x2);
    }

    // (-b / √((b^2)-(4*a*c)))/(2*a)
    public void obtenerRaiz(Raices r){
        double x1 = (-r.getB() + Math.sqrt((Math.pow(r.getB(),2))-(4*r.getA()*r.getC())))/(2*r.getA());
        System.out.println("(-b + √((b^2)-(4*a*c)))/(2*a) = "+x1);             
    }

    public void calcular(Raices r){
        if(tieneRaices(r)==true || tieneRaiz(r)==true){
            if(tieneRaiz(r)==true){
                System.out.println("Tiene una unica raiz, la solucion seria la sig.:");
                obtenerRaiz(r);
            }else if(tieneRaices(r)==true){
                System.out.println("Tiene multiples raices, la solucion seria la sig.:");
                obtenerRaices(r);
            }
        }else{
            System.out.println("No tiene solucion.");
        }
    }
}
