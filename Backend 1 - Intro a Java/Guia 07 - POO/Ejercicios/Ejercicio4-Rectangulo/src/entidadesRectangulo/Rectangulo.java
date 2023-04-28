package entidadesRectangulo;

public class Rectangulo {
    
    private int base, altura;
    
    public Rectangulo(){
    }

    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public void dibujar(){
        for(int i=0; i<altura; i++){
            for(int j=0; j<base; j++){
                if(i==0 || i==altura-1){
                    System.out.print(" * ");
                }else{
                    if(j==0 || j==base-1){
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
    }

    public void calclularSuperficie(){
        System.out.println("La superficie del rectangulo es = "+ base * altura);
    }

    public void calcularPerimetro(){
        System.out.println("El perimetro del rectangulo es = "+ (base + altura) * 2);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo [base=" + base + ", altura=" + altura + "]";
    }

}