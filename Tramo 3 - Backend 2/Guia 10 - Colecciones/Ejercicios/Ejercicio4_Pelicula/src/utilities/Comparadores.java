package utilities;
import java.util.Comparator;
import entities.Pelicula;

public class Comparadores {

    public static Comparator<Pelicula> ordenarPorDuracionMayorAMenor = new Comparator <Pelicula> () {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getHoras().compareTo(o1.getHoras());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorDuracionMenorAMayor = new Comparator <Pelicula> () {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getHoras().compareTo(o2.getHoras());
        }
    };
    
    public static Comparator<Pelicula> ordenarAlfabeticamentePorTituloZa = new Comparator <Pelicula> () {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getTitulo().compareTo(o1.getTitulo());
        }
    };
    
    public static Comparator<Pelicula> ordenarAlfabeticamentePorTituloAz = new Comparator <Pelicula> () {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };

}
