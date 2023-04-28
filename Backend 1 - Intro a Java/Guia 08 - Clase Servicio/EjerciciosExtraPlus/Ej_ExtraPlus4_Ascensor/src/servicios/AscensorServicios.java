package servicios;

import entidades.Ascensor;

public class AscensorServicios {
    
    public void irA(Ascensor a, int piso){
        a.setPisoActual(piso);
    }

    public void subirPiso(Ascensor a){
        a.setPisoActual(a.getPisoActual()+1);
    }

    public void bajarPiso(Ascensor a){
        a.setPisoActual(a.getPisoActual()-1);
    }

}
