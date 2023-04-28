public class Rectangulo {

    private double lado1, lado2;

    public Rectangulo(){
    }

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double calcular_area(){
        return lado1 * lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public String toString() {
        return "Rectangulo [lado1=" + lado1 + ", lado2=" + lado2 + "]";
    }

}