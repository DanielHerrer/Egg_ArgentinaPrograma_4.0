// • Método calcularSuperficie(): calcula la superficie del edificio.
// • Método calcularVolumen(): calcula el volumen del edifico.
// Estos métodos serán abstractos y los implementarán las siguientes clases:
// • Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
// Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.

package entities;

public class Polideportivo extends Edificio {

    private String nombre;
    private boolean techado;

    public Polideportivo(){
        super();
        System.out.print("Ingrese el nombre del polideportivo => ");
        nombre = read.nextLine();
        do{
            System.out.print("Ingrese si el polideportivo es techado o abierto (t/a) => ");
            char op = read.nextLine().charAt(0);
            if(op == 't' || op == 'T'){
                System.out.println("TECHADO");
                techado = true;
                break;
            }else if(op == 'a' || op == 'A'){
                System.out.println("ABIERTO");
                techado = false;
                break;
            }
        }while(true);
    }

    public Polideportivo(float ancho, float alto, float largo){
        super(ancho, alto, largo);
        System.out.print("Ingrese el nombre del polideportivo => ");
        nombre = read.nextLine();
        do{
            System.out.print("Ingrese si el polideportivo es techado o abierto (t/a) => ");
            char op = read.nextLine().charAt(0);
            if(op == 't' || op == 'T'){
                System.out.println("TECHADO");
                techado = true;
                break;
            }else if(op == 'a' || op == 'A'){
                System.out.println("ABIERTO");
                techado = false;
                break;
            }
        }while(true);
    }

    public Polideportivo(float ancho, float alto, float largo, String nombre, boolean techado) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    // ANCHO * LARGO = SUPERFICIE(mts cuadrados)
    @Override
    public float calcularSuperficie() {
        return ancho * largo;
    }

    // ANCHO * LARGO * ALTO = VOLUMEN(mts cubicos)
    @Override
    public float calcularVolumen() {
        return ancho * largo * alto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

}
