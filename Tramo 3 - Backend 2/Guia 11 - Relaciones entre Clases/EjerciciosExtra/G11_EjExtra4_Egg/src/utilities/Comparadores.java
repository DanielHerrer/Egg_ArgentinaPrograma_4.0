package utilities;

import entities.Alumno;

import java.util.Comparator;

public class Comparadores {

    public static Comparator<Alumno> ordenarPorVotosMayorAMenor = new Comparator<Alumno> () {
        @Override
        public int compare(Alumno o1, Alumno o2) {
            return o2.getVotos().compareTo(o1.getVotos());
        }
    };

}