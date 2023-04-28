package services;
import entities.Estudiante;
import java.util.Scanner;

public class EscuelaService {
    
    private Scanner read = new Scanner(System.in);
    private Scanner readNum = new Scanner(System.in);
    private Estudiante[] cursoAlumnos = new Estudiante[8];

    public Estudiante darAltaEstudiante(){
        System.out.print("Ingrese el nombre del estudiante => ");
        String nombre = read.nextLine();
        System.out.print("Ingrese la nota del estudiante => ");
        int nota = readNum.nextInt();
        return new Estudiante(nombre, nota);
    }

    public void llenarCurso(){
        for(int i=0; i< cursoAlumnos.length; i++){
            cursoAlumnos[i] = darAltaEstudiante();
        }
    }

    public float promedioCurso(){
        float promedio = 0;
        for(int i=0; i< cursoAlumnos.length; i++){
            promedio += cursoAlumnos[i].getNota();
        }
        return promedio / cursoAlumnos.length;
    }

    public String[] alumnosDestacados(){
        String[] alumnosDest;
        int cantAlumnos = 0;
        ///////////////////////////////////////////////////////
        for(int i=0; i< cursoAlumnos.length; i++){
            if(cursoAlumnos[i].getNota() > promedioCurso()){
                cantAlumnos++;
            }
        }
        alumnosDest = new String[cantAlumnos];
        ///////////////////////////////////////////////////////
        int j = 0;
        for(int i=0; i< cursoAlumnos.length; i++){
            if(cursoAlumnos[i].getNota() > promedioCurso()){
                alumnosDest[j] = cursoAlumnos[i].getNombre();
                j++;
            }
        }
        ///////////////////////////////////////////////////////
        return alumnosDest;
    }

    public void mostrarAlumnosDestacados(){
        for(String alumno: alumnosDestacados()){
            System.out.print("["+alumno+"] ");
        }
        System.out.println();
    }

}
