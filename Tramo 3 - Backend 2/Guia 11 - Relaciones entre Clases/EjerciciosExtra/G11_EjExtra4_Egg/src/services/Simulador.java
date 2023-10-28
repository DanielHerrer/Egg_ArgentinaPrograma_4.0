// Además, crearemos una clase Simulador que va a tener los métodos para manejar los alumnos 
// y sus votaciones. Estos métodos serán llamados desde el main.

package services;

import enums.Nombre;
import enums.Apellido;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

import entities.Alumno;
import entities.Voto;
import utilities.Comparadores;

public class Simulador {
    
    // • La clase Simulador debe tener un método que genere un listado de alumnos manera
    //    aleatoria y lo retorne. Las combinaciones de nombre y apellido deben ser generadas de
    //     manera aleatoria. Nota: usar listas de tipo String para generar los nombres y los apellidos.
    public ArrayList<String> crearNombresCompletos(int num){
        ArrayList<String> nombresCompletos = new ArrayList<String>();
        for(int i=0; i<num; i++){
            int random = (int) (Math.random()*20);
            
            ArrayList<Nombre> nombres = new ArrayList<>();
            nombres.addAll(Arrays.asList(Nombre.values()));
            Collections.shuffle(nombres);

            ArrayList<Apellido> apellidos = new ArrayList<>();
            apellidos.addAll(Arrays.asList(Apellido.values()));
            Collections.shuffle(apellidos);

            nombresCompletos.add(nombres.get(random).toString() + " " + apellidos.get(random).toString());
        }
        return nombresCompletos;
    }

    //     • Ahora hacer un generador de combinaciones de DNI posibles, deben estar dentro de un
    //       rango real de números de documentos. Y agregar a los alumnos su DNI. Este método
    //       debe retornar la lista de dnis.
    public ArrayList<Integer> crearDnis(int num) {
        ArrayList<Integer> dnis = new ArrayList<>();
        for(int i=0; i<num; i++){
            int dni;
            do{
                dni = (int) (Math.random() * (50000000 - 20000000) + 20000000);
            }while(dnis.contains(dni));
            dnis.add(dni);
        }
        return dnis;
    }

    //     • Ahora tendremos un método que, usando las dos listas generadas, cree una cantidad de
    //       objetos Alumno, elegidos por el usuario, y le asigne los nombres y los dnis de las dos
    //       listas a cada objeto Alumno. No puede haber dos alumnos con el mismo dni, pero si con el
    //       mismo nombre.
    public ArrayList<Alumno> crearAlumnos(int num){
        ArrayList<String> nombres = crearNombresCompletos(num);
        ArrayList<Integer> dnis = crearDnis(num);
        ArrayList<Alumno> alumnos = new ArrayList<>();

        for(int i=0; i<num; i++){
            Alumno alumno = new Alumno(nombres.get(i), dnis.get(i));
            alumnos.add(alumno);
        }
        return alumnos;
    }

    //     • Se debe imprimir por pantalla el listado de alumnos.
    public void mostrarAlumnos(ArrayList<Alumno> alumnos){

        System.out.println("---------------------------------------------");
        System.out.println("\u001B[38;5;45mMostrar alumnos:\u001B[0m");
        for(Alumno alumno : alumnos){
            System.out.println(alumno.getNombreCompleto() + " - " + alumno.getDni());
        }
    }

    // • Crearemos un método votación en la clase Simulador que, recibe el listado de alumnos y
    //   para cada alumno genera tres votos de manera aleatoria. En este método debemos
    //   guardar a el alumno que vota, a los alumnos a los que votó y sumarle uno a la cantidad de
    //   votos a cada alumno que reciba un voto, que es un atributo de la clase Alumno.
    //   Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una vez al
    //   mismo alumno. Utilizar un hashset para resolver esto.
    public ArrayList<Voto> votacion(ArrayList<Alumno> alumnos){
        ArrayList<Voto> padron = new ArrayList<>();

        for (int i=0; i<alumnos.size(); i++) {
            HashSet<Alumno> votados = new HashSet<>();
            do {
                int eleccion;
                do {
                    eleccion = (int)(Math.random()*alumnos.size());
                } while(alumnos.get(i).equals(alumnos.get(eleccion))); // Mientras que el alumno elegido del curso sea él mismo
                votados.add(alumnos.get(eleccion)); // Añade a 'votados' un alumno SI no está ya alojado
            } while (votados.size()<3);

            for(Alumno alumno: votados){    // Añade un voto por cada alumno votado
                alumno.setVotos(alumno.getVotos()+1);
            }
            
            ArrayList<Alumno> arrayVotados = new ArrayList<>(votados);
            Voto aux = new Voto(alumnos.get(i), arrayVotados);
            padron.add(aux);
        }
        return padron;
    }

    // • Se debe crear un método que muestre a cada Alumno con su cantidad de votos y cuales
    //   fueron sus 3 votos.
    public void infoVotos(ArrayList<Voto> votos){
        
        System.out.println("---------------------------------------------");
        System.out.println("\u001B[38;5;45mInformación de votos:\u001B[0m");
        for(Voto var: votos){
            System.out.println("Alumno ["+var.getAlumno().getNombreCompleto()+"]");
            System.out.print("Votos: [");
            for(Alumno aux: var.getAlumnosVotados()){
                System.out.print(aux.getNombreCompleto()+", ");
            }
            System.out.print("]\n");
        }
    }

    // • Se debe crear un método que haga el recuento de votos, este recibe la lista de Alumnos y
    //   comienza a hacer el recuento de votos.
    public void recuentoVotos(ArrayList<Alumno> alumnos){
        System.out.println("---------------------------------------------");
        System.out.println("\u001B[38;5;45mRecuento de votos:\u001B[0m");
        for(Alumno alumno: alumnos){
            System.out.println(alumno.getNombreCompleto()+" ["+alumno.getVotos()+" voto/s]");
        }
    }
    
    // • Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se deben crear 5
    //   facilitadores suplentes con los 5 segundos alumnos más votados. A continuación, mostrar
    //   los 5 facilitadores y los 5 facilitadores suplentes.
    public void crearDiezFacilitadores(ArrayList<Alumno> alumnos){
        ArrayList<Alumno> alumnosAux = new ArrayList<>(alumnos);
        Collections.sort(alumnosAux,Comparadores.ordenarPorVotosMayorAMenor);

        Alumno[] facilitadores = new Alumno[5];
        Alumno[] facilitadoresSuplentes = new Alumno[5];

        int x=0;
        for(int i=0; i<facilitadores.length; i++){
            facilitadores[i] = alumnosAux.get(x);
            x++;
        }
        for(int i=0; i<facilitadoresSuplentes.length; i++){
            facilitadoresSuplentes[i] = alumnosAux.get(x);
            x++;
        }

        System.out.println("---------------------------------------------");
        System.out.println("\u001B[38;5;226mFacilitadores:\u001B[0m");
        for(Alumno fac: facilitadores){
            System.out.println(fac.getNombreCompleto()+" ["+fac.getVotos()+" voto/s]");
        }
        System.out.println("\u001B[38;5;208mFacilitadores Suplentes:\u001B[0m");
        for(Alumno facSup: facilitadoresSuplentes){
            System.out.println(facSup.getNombreCompleto()+" ["+facSup.getVotos()+" voto/s]");
        }

    }

}