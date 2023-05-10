// Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
// del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
// tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
// Métodos:
// • llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
// deben ser aleatorios.
// • mojar(): devuelve true si la posición del agua coincide con la posición actual
// • siguienteChorro(): cambia a la siguiente posición del tambor
// • toString(): muestra información del revolver (posición actual y donde está el agua)

package entities;

public class Revolver {

    private Integer posActual, posAgua;

    public Revolver() {
    }

    public void llenarRevolver(){
        posAgua = (int)((Math.random()*6) -1);   // Posición del tambor donde se encuentra la bala de agua
        posActual = (int)((Math.random()*6) -1); // Posicion del tambor actual donde el cañón 
    }

    public Boolean mojar(){
        if (posAgua == posActual){ 
            return true; 
        }else{
            return false;
        }
    }

    public void siguienteChorro(){
        if(posActual++ > 5){
            posActual = 0;
        }else{
            posActual++;
        }
    }

    public Integer getPosActual() {
        return posActual;
    }

    public void setPosActual(Integer posActual) {
        this.posActual = posActual;
    }

    public Integer getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(Integer posAgua) {
        this.posAgua = posAgua;
    }

    @Override
    public String toString() {
        return "RevolverDeAgua [posActual=" + posActual + ", posAgua=" + posAgua + "]";
    }
}
