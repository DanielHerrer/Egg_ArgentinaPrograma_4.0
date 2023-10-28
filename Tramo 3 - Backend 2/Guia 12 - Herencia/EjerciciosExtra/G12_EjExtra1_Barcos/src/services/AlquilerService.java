package services;

import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import entities.Alquiler;
import entities.Barco;
import entities.BarcoMotor;
import entities.Velero;
import entities.Yate;

public class AlquilerService {
    
    private Scanner read = new Scanner(System.in);

    public Alquiler crearAlquiler(){
        System.out.println("--------------------------------------");
        System.out.print("Ingrese nombre completo => ");
        String nombre = read.nextLine();

        System.out.println("--------------------------------------");
        Integer dni;
        do{
            System.out.print("Ingrese DNI => ");
            dni = read.nextInt();
            read.nextLine();
            if(dni>9999999 && dni<99999999){
                break;
            }
        }while(true);
        
        System.out.println("--------------------------------------");
        // - LUIS DIAZ
        Date inicio;
        do{
            System.out.print("Ingrese la fecha INICIO dd/mm/aaaa => ");
            String fecha = read.nextLine();
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            try {
                inicio = dateFormat.parse(fecha);
                break;
            } catch (Exception e) {
                System.out.println("Error al cargar la fecha revise su ingreso");
                e.printStackTrace();
            }
        }while(true);
        
        System.out.println("--------------------------------------");
        Date fin;
        do{
            System.out.print("Ingrese la fecha FIN dd/mm/aaaa => ");
            String fecha = read.nextLine();
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            try {
                fin = dateFormat.parse(fecha);
                if(fin.getTime() <= inicio.getTime()){
                    System.out.println("La fecha final debe ser posterior a la fecha de inicio");
                }else{
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error al cargar la fecha revise su ingreso");
                e.printStackTrace();
            }
        }while(true);

        System.out.println("--------------------------------------");
        System.out.print("Ingrese posicion del amarre => ");
        int posicion = read.nextInt();
        read.nextLine();
        
        Barco b = elegirBarcos();

        return new Alquiler(nombre, dni, inicio, fin, posicion, b);
    }

    // Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
    // alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
    // multiplicando por 10 los metros de eslora).
    public float calcularAlquiler(Alquiler a){
        float diferenciaMilis = a.getFechaDevolucion().getTime() - a.getFechaAlquiler().getTime();
        int cantDias = (int) (Math.floor(diferenciaMilis / 86400000)); // 86400000 (que representa el número de milisegundos en un día)
        float valorModulo = a.getBarco().getEsloraMetros() * 10;
        return valorModulo * cantDias;
    }

    public Barco elegirBarco(){
        System.out.println("--------------------------------------");
        System.out.println("1. Barco Motor\n2. Yate\n3. Velero");
        int tipo;
        do{
            System.out.print("Ingrese el tipo de barco => ");
            tipo = read.nextInt();
            read.nextLine();
            if(tipo<=3 && tipo>=1){
                break;
            }
        }while(true);

        Barco b = new Barco();
        switch(tipo){
            case 1:
                BarcoMotorService bs = new BarcoMotorService();
                b = bs.crearBarcoMotor();
                break;
            case 2:
                YateService ys = new YateService();
                b = ys.crearYate();
                break;
            case 3:
                VeleroService vs = new VeleroService();
                b = vs.crearVelero();
                break;
            default:
                System.out.println("Opcion incorrecta");
        }

        return b;
    }

    public Barco elegirBarcos(){
        ArrayList<Barco> barcos = new ArrayList<>();
        barcos.add(new BarcoMotor(154698, 40, 2006, 45));
        barcos.add(new Yate(648235, 125, 2013, 65, 16));
        barcos.add(new Velero(946315, 75, 2001, 2));
        System.out.println("--------------------------------------");
        int i=1;
        for(Barco b: barcos){
            System.out.println("BARCO "+i+":");
            if(b instanceof Velero){
                Velero v = (Velero) b;
                System.out.print("Velero | ");
                System.out.println("Matricula: "+v.getMatricula()+" | "+v.getAñoFabricacion()+" | "+v.getEsloraMetros()+" mt. de eslora | "+v.getNumMastiles()+" mastil/es");
            }else if(b instanceof Yate){
                Yate y = (Yate) b;
                System.out.print("Yate | ");
                System.out.println("Matricula: "+y.getMatricula()+" | "+y.getAñoFabricacion()+" | "+y.getEsloraMetros()+" mts. de eslora | "+y.getCv()+" cv de potencia | "+y.getNumCamarotes()+" camarotes");  
            }else if(b instanceof BarcoMotor){
                BarcoMotor bm = (BarcoMotor) b;
                System.out.print("Barco a motor | ");
                System.out.println("Matricula: "+bm.getMatricula()+" | "+bm.getAñoFabricacion()+" | "+bm.getEsloraMetros()+" mts. de eslora | "+bm.getCv()+" cv de potencia");
            }
            i++;
        }
        do{
            System.out.print("Elija un barco => ");
            i = read.nextInt();
            read.nextLine();
            if(i>=1 && i<=barcos.size()){
                break;
            }
        }while(true);
        return barcos.get(i-1);
    }

}