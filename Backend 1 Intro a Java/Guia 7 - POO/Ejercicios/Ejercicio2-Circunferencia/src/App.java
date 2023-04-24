/// EJERCICIO 2
// Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
// A continuación, se deben crear los siguientes métodos:
// Método constructor que inicialice el radio pasado como parámetro.
// Métodos get y set para el atributo radio de la clase Circunferencia.
// Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
// Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
// Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

import entidadesCircunferencia.Circunferencia;

public class App {
    public static void main(String[] args) throws Exception {
        
        Circunferencia circ = new Circunferencia();

        circ.crearCircunferencia();

        // LOS DATOS RECIBIDOS PUEDEN SER ERRONEOS DEBIDO A QUE LOS CALCULOS NO PUDIERON SER CHEQUEADOS
        System.out.println("El area de la circunferencia es = "+circ.area());
        System.out.println("El perimetro de la circunferencia es = "+circ.perimetro());
        
    }
}