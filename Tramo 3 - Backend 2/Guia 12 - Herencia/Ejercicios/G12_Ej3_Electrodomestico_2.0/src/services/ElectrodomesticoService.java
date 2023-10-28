package services;

import java.util.Scanner;

import entities.Electrodomestico;

public class ElectrodomesticoService {
    
    protected Scanner read = new Scanner(System.in);

    public Electrodomestico crearElectrodomestico(){
        char letra;
        do{
            System.out.print("Ingrese consumo energetico del electrodomestico => ");
            letra = read.nextLine().charAt(0);
            if(!comprobarConsumoEnergetico(letra)){
                System.out.println("\u001B[31mEl consumo energetico ingresado no es válido.\u001B[0m");
            }
        }while(!comprobarConsumoEnergetico(letra));

        String color;
        do{
            System.out.print("Ingrese color del electrodomestico => ");
            color = read.nextLine();
            if(!comprobarColor(color)){
                System.out.println("\u001B[31mNo disponemos en ese color.\u001B[0m");
            }
        }while(!comprobarColor(color));
        
        int peso;
        do{
            System.out.print("Ingrese el peso del electrodomestico => ");
            peso = read.nextInt();
            read.nextLine();
            if(peso<1 || peso>100){
                System.out.println("\u001B[31mEl peso ingresado está fuera de rango.\u001B[0m");
            }    
        }while(peso<1 || peso>100);
        
        return new Electrodomestico(1000d, color, letra, peso);
    }

    public boolean comprobarConsumoEnergetico(char letra){
        letra = Character.toLowerCase(letra);
        if(letra == 'a' || letra == 'b' || letra == 'c' || letra == 'd' || letra == 'e' || letra == 'f'){
            return true;
        }else{
            return false;
        }
    }

    public boolean comprobarColor(String color){
        if(color.equalsIgnoreCase("blanco") || 
            color.equalsIgnoreCase("negro") || 
                color.equalsIgnoreCase("rojo") || 
                    color.equalsIgnoreCase("azul") || 
                        color.equalsIgnoreCase("gris")){
            return true;
        }else{
            return false;
        }
    }

    public void precioFinal(Electrodomestico e){
        if(e.getConsumoEnergetico() == 'A') {
            e.setPrecio(e.getPrecio() + 1000d);    
        }else if(e.getConsumoEnergetico() == 'B') {
            e.setPrecio(e.getPrecio() + 800d);
        }else if(e.getConsumoEnergetico() == 'C') {
            e.setPrecio(e.getPrecio() + 600d);
        }else if(e.getConsumoEnergetico() == 'D') {
            e.setPrecio(e.getPrecio() + 500d);
        }else if(e.getConsumoEnergetico() == 'E') {
            e.setPrecio(e.getPrecio() + 300d);
        }else if(e.getConsumoEnergetico() == 'F') {
            e.setPrecio(e.getPrecio() + 100d);
        }
        if(e.getPeso()>0 && e.getPeso()<20){
            e.setPrecio(e.getPrecio() + 100d);
        }else if(e.getPeso()>19 && e.getPeso()<50){
            e.setPrecio(e.getPrecio() + 500d);
        }else if(e.getPeso()>49 && e.getPeso()<80){
            e.setPrecio(e.getPrecio() + 800d);
        }else if(e.getPeso()>=80){
            e.setPrecio(e.getPrecio() + 1000d);
        }
    }

}
