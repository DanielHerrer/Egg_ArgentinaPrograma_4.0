// • Método calcularSuperficie(): calcula la superficie del edificio.
// • Método calcularVolumen(): calcula el volumen del edifico.
// Estos métodos serán abstractos y los implementarán las siguientes clases:
// • Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
// por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
// los atributos del padre.
// De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
// usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
// (suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
// cuantas personas entrarían en un piso y cuantas en todo el edificio.

package entities;

public class EdificioDeOficinas extends Edificio {
    
    private int numOficinas, cantPersonasPorOficina, numPisos;

    public EdificioDeOficinas(){
        super();
        System.out.print("Ingrese el numero de oficinas por piso => ");
        numOficinas = read.nextInt();
        read.nextLine();
        System.out.print("Ingrese la cantidad de personas por oficina => ");
        cantPersonasPorOficina = read.nextInt();
        read.nextLine();
        System.out.print("Ingrese el numero de pisos => ");
        numPisos = read.nextInt();
        read.nextLine();
    }

    public EdificioDeOficinas(float ancho, float alto, float largo){
        super(ancho, alto, largo);
        System.out.print("Ingrese el numero de oficinas => ");
        numOficinas = read.nextInt();
        read.nextLine();
        System.out.print("Ingrese la cantidad de personas por oficina => ");
        cantPersonasPorOficina = read.nextInt();
        read.nextLine();
        System.out.print("Ingrese el numero de pisos => ");
        numPisos = read.nextInt();
        read.nextLine();
    }

    public EdificioDeOficinas(float ancho, float alto, float largo, int numOficinas, int cantPersonasPorOficina, int numPisos) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.cantPersonasPorOficina = cantPersonasPorOficina;
        this.numPisos = numPisos;
    }

    public void cantPersonas(){
        int personasXpiso = cantPersonasPorOficina * numOficinas;
        System.out.println("Entran "+personasXpiso+" personas por piso");
        int personasXedificio = personasXpiso * numPisos;
        System.out.println("Entran "+personasXedificio+" personas en todo el edificio");
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

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getCantPersonasPorOficina() {
        return cantPersonasPorOficina;
    }

    public void setCantPersonasPorOficina(int cantPersonasPorOficina) {
        this.cantPersonasPorOficina = cantPersonasPorOficina;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

}
