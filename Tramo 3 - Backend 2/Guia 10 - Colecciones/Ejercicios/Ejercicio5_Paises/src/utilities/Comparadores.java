package utilities;

import entities.Pais;

import java.util.Comparator;

public class Comparadores {
    
    public static Comparator<Pais> compararNombreAZ = new Comparator<>() {
        @Override
        public int compare(Pais o1, Pais o2) {
            return o1.getNombre().compareTo(o2.getNombre());
        };
    };

}
