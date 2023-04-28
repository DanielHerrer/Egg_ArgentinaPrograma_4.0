// Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
// Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y 
// después se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba 
// que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un 
// mensaje
// Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). 
// Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de 
// su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 
// (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. 
// Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene 
// sobrepeso, y la función devuelve un 1.

package services;

import java.util.Scanner;
import entities.Persona;

public class PersonaServicio {
    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    private Scanner readNum = new Scanner(System.in);
    
    public Persona crearPersona(){
        char sexo;
        System.out.println("Ingrese el nombre de la persona: ");
        String nombre = read.next();
        System.out.println("Ingrese la edad de la persona: ");
        int edad = readNum.nextInt();
        do{
            System.out.println("Ingrese su sexo: (H,M,O)");
            sexo = read.next().charAt(0);
        }while(!(sexo=='H') && !(sexo=='M') && !(sexo=='O') && !(sexo=='h') && !(sexo=='m') && !(sexo=='o'));
        System.out.println("Ingrese su peso: ");
        double peso = readNum.nextDouble();
        System.out.println("Ingrese su altura: ");
        double altura = readNum.nextDouble();
        System.out.println("Ingrese su color de ojos: ");
        String colorOjos = read.next();

        return new Persona(nombre,edad,sexo,peso,altura,colorOjos);
    }

    public Boolean esMayorDeEdad(Persona p){
        if(p.getEdad()<18){
            return false;
        }else{
            return true;
        }
    }

    public int calcularIMC(Persona p){
        double imc = p.getPeso() / (Math.pow(p.getAltura(),2));
        if(imc<20){
            return -1;
        }else{
            if(imc >= 20 && imc <= 25 ){
                return 0;
            }else{
                return 1;
            }
        }
    }

}
