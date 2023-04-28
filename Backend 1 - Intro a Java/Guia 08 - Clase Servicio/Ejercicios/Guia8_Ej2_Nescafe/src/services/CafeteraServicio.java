package services;
import java.util.Scanner;

import entities.Cafetera;

public class CafeteraServicio {
    Scanner read = new Scanner(System.in);

    public Cafetera crearCafetera(){
        int cantCafe;
        do{
            System.out.println("Ingrese cantidad que tiene la cafetera actualmente: (Max=100)");
            cantCafe = read.nextInt(); 
        }while(cantCafe<0 || cantCafe>100);
        System.out.println("Cafetera creada con una cantidade de cafe de "+cantCafe+"/100");
        return new Cafetera(100,cantCafe);
    }

    public void llenarCafetera(Cafetera c){
        c.setCantActual(c.getCapacidadMáxima());
    }
    
    public void servirTaza(int taza, Cafetera c){
        if(taza<=c.getCantActual()){
            c.setCantActual(c.getCantActual()-taza);
            System.out.println("La taza se lleno!");
            System.out.println("[Cafetera] "+c.getCantActual()+"/100");
        }else{
            System.out.println("La cafetera se vacio! La taza se lleno con "+c.getCantActual()+" de cafe..");
            c.setCantActual(0);
            System.out.println("[Cafetera] "+c.getCantActual()+"/100");
        }
    }

    public void vaciarCafetera(Cafetera c){
        c.setCantActual(0);
    }

    public void agregarCafe(int cafe, Cafetera c){
        if(c.getCantActual()+cafe <= c.getCapacidadMáxima()){
            c.setCantActual(c.getCantActual()+cafe);
            System.out.println("Se ha agregado el cafe a la cafetera correctamente!");
            System.out.println("[Cafetera] "+c.getCantActual()+"/100");
        }else{
            System.out.println("Se ha agregado el cafe a la cafetera, se lleno y ha sobrado "+((c.getCantActual()+cafe)-c.getCapacidadMáxima())+" de cafe");
            c.setCantActual(c.getCapacidadMáxima());
        }
    }

}
