// En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
// toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
// pregunta al usuario si quiere crear otro Alumno o no.
// Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
// Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
// final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
// del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
// promedio final, devuelto por el método y mostrado en el main.

package services;
import java.util.ArrayList;
import java.util.Scanner;
import entities.Alumno;

public class AlumnoService {
    private Scanner read = new Scanner(System.in);
    private Scanner readNum = new Scanner(System.in);

    private ArrayList<Alumno> alumnos = new ArrayList<>();

    public void agregarAlumnos(){
        Boolean salir = false;
        do{
            Alumno alumno = new Alumno();   // Se crea un alumno auxiliar
            System.out.print("Ingrese el nombre del alumno => ");
            alumno.setNombre(read.nextLine());
            //----------------------------------------------------------------------
            ArrayList<Integer> notas = new ArrayList<>();
            for(int i=0; i<3; i++){
                System.out.print("["+alumno.getNombre()+"] Nota Nº"+(i+1)+" => ");
                notas.add((readNum.nextInt()));
            }
            alumno.setNotas(notas);
            //----------------------------------------------------------------------
            alumnos.add(alumno);    // Se añade a la lista local el alumno aux
            //----------------------------------------------------------------------
            System.out.print("Desea añadir otro alumno? (s/n) => ");
            String op = read.nextLine();
            if(op.equalsIgnoreCase("si") || op.equalsIgnoreCase("s")){
                System.out.println("Repitiendo..");
            }else if(op.equalsIgnoreCase("no") || op.equalsIgnoreCase("n")){
                System.out.println("Finalizando..");
                salir = true;
            }else{
                System.out.println("Opcion incorrecta. Finalizando..");
                salir = true;
            }
        }while(salir!=true);
    }

    public float notaFinal(Alumno alumno){
        float notasAcumuladas = 0;
        for(Integer nota: alumno.getNotas()){
            notasAcumuladas += nota;
        }
        return notasAcumuladas / alumno.getNotas().size();
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}