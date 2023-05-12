// Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos)
//  y un Palo (espadas, bastos, oros y copas). Esta clase debe contener 
//   un método toString() que retorne el número de carta y el Palo. 

package entidades;

import enums.Ennumeraciones.Palo;
import enums.Ennumeraciones.Valor;

public class Carta {

    private Palo palo;
    private Valor valor;

    public Carta(Palo palo, Valor valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public Valor getValor() {
        return valor;
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Carta [palo=" + palo.toString() + ", valor=" + valor.toString().substring(1, 2) + "]";
    }

}