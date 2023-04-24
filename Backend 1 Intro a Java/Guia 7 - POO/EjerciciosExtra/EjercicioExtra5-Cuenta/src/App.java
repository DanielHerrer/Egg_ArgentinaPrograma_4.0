/// EJERCICIO EXTRA 5 - Daniel F. Herrera
// Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, 
// crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta. 
// Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.

import entities.Cuenta;

public class App {
    public static void main(String[] args) throws Exception {

        Cuenta c1 = new Cuenta("Daniel",5000);
        c1.retirar_dinero();
        
    }
}
