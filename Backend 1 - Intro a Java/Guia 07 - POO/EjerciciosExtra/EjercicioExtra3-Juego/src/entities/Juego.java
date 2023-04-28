package entities;
import java.util.Scanner;

public class Juego {

    public Juego(){
    }

    public void iniciar_juego(){
        Scanner in = new Scanner(System.in);
        int numJ1, numJ2, maxTrys = 5, winsJ1 = 0, winsJ2 = 0;
        String op;
        Boolean finish = false;
        
        do{
            do{
                System.out.println("///////////////////////////////////////////////////////");
                System.out.println("Jugador 1: Introduzca el numero a adivinar (1 al 10)");
                numJ1 = in.nextInt();
            }while(numJ1<1 || numJ1>10);
    
            for(int i=0; i<maxTrys; i++){
                do{
                    System.out.println("///////////////////////////////////////////////////////");
                    System.out.println("[Intentos restantes:"+(maxTrys-i)+"]");
                    System.out.println("Jugador 2 : Adivine el numero del jugador 1 (1 al 10)");
                    numJ2 = in.nextInt();
                }while(numJ2<1 || numJ2>10);
                if(numJ2 == numJ1){
                    System.out.println("///////////////////////////////////////////////////////");
                    System.out.println("Jugador 2 : Ganaste, has adivinado el numero!!!");
                    System.out.println("Te ha tomado "+(i+1)+" intentos lograrlo!");
                    winsJ2++;
                    break;
                }else{
                    if(numJ2<numJ1){
                        System.out.println("Mas alto..");
                    }else{
                        System.out.println("Mas bajo..");
                    }
                }
                if(i==maxTrys-1){
                    System.out.println("///////////////////////////////////////////////////////");
                    System.out.println("Jugador 1 : Ganaste, no han adivinado el numero!!");
                    winsJ1++;
                }
            }

            System.out.println("///////////////////////////////////////////////////////");
            System.out.println("Jugador 1 partidas ganadas: "+winsJ1);
            System.out.println("Jugador 2 partidas ganadas: "+winsJ2);
            
            do{
                System.out.println("///////////////////////////////////////////////////////");
                System.out.println("Desea terminar el juego? (si/no)");
                op = in.next();
            }while(!op.equals("si") && !op.equals("no"));
            if(op.equals("si")){
                System.out.println("Finalizando juego.. Adios!");
                finish = true;
            }else{
                System.out.println("Reiniciando partida..");
            }
        }while(finish != true);
        
        in.close();
    }



}