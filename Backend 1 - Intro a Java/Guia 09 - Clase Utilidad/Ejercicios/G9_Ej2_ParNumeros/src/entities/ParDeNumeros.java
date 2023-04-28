// Realizar una clase llamada ParDeNumeros que tenga como atributos dos
// números reales con los cuales se realizarán diferentes operaciones
// matemáticas. La clase debe tener un constructor vacío, getters y setters.
// En el constructor vacío se usará el Math.random para generar los dos
// números. 

package entities;

public class ParDeNumeros {

    // LOS VALORES STATICOS SE MODIFICAN EN CONJUNTO (CLASE) NO EN UNIDAD (OBJETO)
    private static double n1, n2;

    public ParDeNumeros(){
        n1 = (double) ((Math.random()*9)+1);
        n2 = (double) ((Math.random()*9)+1);
    }

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

    public static void setN2(double n2) {
        ParDeNumeros.n2 = n2;
    }

    public static void setN1(double n1) {
        ParDeNumeros.n1 = n1;
    }

}
