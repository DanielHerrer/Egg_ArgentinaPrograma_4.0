package entidadesCircunferencia;

import java.util.Scanner;

public class Circunferencia {
    
    private Scanner in = new Scanner(System.in);
    private double radio;

    public Circunferencia(){
        
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia(){
        System.out.println("Ingrese el radio de la circunferencia: ");
        radio = in.nextDouble();
    }

    public double area(){
        double area = Math.pow((3.14 * radio),2); // Math.pow(6,2); = 6 elevado al cuadrado  
        return area;
    }

    public double perimetro(){
        double perimetro = 2 * 3.14 * radio;
        return perimetro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

}
