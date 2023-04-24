// GUIA 9 EJERCICIO 6 - Daniel Franco Herrera

import java.util.Arrays;
import entities.Curso;

public class App {
    public static void main(String[] args) throws Exception {
        
        Curso curso1 = new Curso();
        curso1.crearCurso();
        
        System.out.println(curso1.getNombreCurso()+" = "+Arrays.toString(curso1.getAlumnos()));
        curso1.calcularGananciaSemanal();

    }
}
