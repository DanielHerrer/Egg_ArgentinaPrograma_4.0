// Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un programa 
// para organizar la información de cada curso. Para ello, crearemos una clase entidad llamada Curso, 
// cuyos atributos serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde),  
// precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de dimensión 5 (cinco), 
// donde se alojarán los nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
// Un constructor por defecto.
// Un constructor con todos los atributos como parámetro.
// Métodos getters y setters de cada atributo.
// Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases. 
// Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, 
// solicitando en cada repetición que se ingrese el nombre de cada alumno.
// Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después 
// se le asignan a sus respectivos atributos para llenar el objeto Curso. En este método invocamos al método 
// cargarAlumnos() para asignarle valor al atributo alumnos
// Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. 
// Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos 
// y la cantidad de días a la semana que se repite el encuentro.

package entities;
import java.util.Scanner;

public class Curso {

    private Scanner read = new Scanner(System.in); 
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private int cantidadAlumnos;
    private String[] alumnos = new String[5];

    public Curso(){
    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno,
            double precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    public void cargarAlumnos(int i){
        System.out.print("Ingrese nombre del alumno nº"+(i+1)+" => ");
        alumnos[i] = read.nextLine();
    }

    public void crearCurso(){
        System.out.print("Ingrese nombre del curso => ");
        nombreCurso = read.nextLine();
        do{
            System.out.print("Ingrese turno del curso (mañana / tarde) => ");
            turno = read.nextLine().toLowerCase();
        }while(!(turno.equals("mañana")||turno.equals("tarde")));
        System.out.print("Ingrese horas al dia => ");
        cantidadHorasPorDia = read.nextInt();
        System.out.print("Ingrese cantidad de dias a la semana => ");
        cantidadDiasPorSemana = read.nextInt();
        System.out.print("Ingrese el precio p/ hora => $");
        precioPorHora = read.nextDouble();
        System.out.print("Ingrese la cantidad de alumnos => ");
        cantidadAlumnos = read.nextInt();
        read.nextLine();
        for(int i=0; i<cantidadAlumnos; i++){  cargarAlumnos(i);   }
        System.out.println("--------- Curso registrado con exito! ---------");
    }

    public void calcularGananciaSemanal(){
        double gananciaSemanal = (((cantidadHorasPorDia * precioPorHora)*cantidadAlumnos)*cantidadDiasPorSemana);
        System.out.println("La ganancia semanal del curso "+nombreCurso+" es de = $"+gananciaSemanal);
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public Scanner getRead() {
        return read;
    }

    public void setRead(Scanner read) {
        this.read = read;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

}