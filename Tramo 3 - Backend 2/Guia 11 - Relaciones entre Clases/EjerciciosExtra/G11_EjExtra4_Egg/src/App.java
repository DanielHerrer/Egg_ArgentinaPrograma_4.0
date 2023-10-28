// GUIA 11 EJERCICIO EXTRA 4 - Daniel Franco Herrera

// Desarrollar un simulador del sistema de votación de facilitadores en Egg

import java.util.ArrayList;

import entities.Alumno;

import services.Simulador;

public class App {
    public static void main(String[] args) throws Exception {
        
        Simulador s = new Simulador();

        ArrayList<Alumno> curso = s.crearAlumnos(40);

        s.mostrarAlumnos(curso);
        s.infoVotos(s.votacion(curso));
        s.recuentoVotos(curso);
        s.crearDiezFacilitadores(curso);

    }
}