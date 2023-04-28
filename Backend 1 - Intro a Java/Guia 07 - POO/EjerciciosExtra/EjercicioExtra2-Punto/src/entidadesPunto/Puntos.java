package entidadesPunto;

import java.util.Scanner;

public class Puntos {

    private int x1, x2, y1, y2;

    public Puntos() {
    }

    public Puntos(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public void crearPuntos(){
        Scanner in = new Scanner(System.in);
        System.out.println("Primer Punto: Ingrese X");
        x1 = in.nextInt();
        System.out.println("Primer Punto: Ingrese Y");
        y1 = in.nextInt();
        System.out.println("//////////////////////////");
        System.out.println("Segundo Punto: Ingrese X");
        x2 = in.nextInt();
        System.out.println("Segundo Punto: Ingrese Y");
        y2 = in.nextInt();
        System.out.println("//////////////////////////");
        in.close();
    }

    public int distanciaPuntos(){
        int distanciaX, distanciaY;

        if(x1>x2){
            distanciaX = x1 - x2;
        }else{
            distanciaX = x2 - x1;
        }
        if(y1>y2){
            distanciaY = y1 - y2;
        }else{
            distanciaY = y2 - y1;
        }

        return distanciaX + distanciaY; 
    }

}

