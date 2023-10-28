package services;

import entities.Electrodomestico;
import entities.Televisor;

public class TelevisorService extends ElectrodomesticoService {
    
    // • Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
    // padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
    // los atributos del televisor.
    public Televisor crearTelevisor(){
        Electrodomestico e = crearElectrodomestico();
        System.out.print("Ingrese resolucion en pulgadas => ");
        int resolucion = read.nextInt();
        read.nextLine();
        System.out.print("Ingrese si posee sintonizador TDT (s/n) => ");
        String op = read.next();
        while(!(op.equalsIgnoreCase("s") || op.equalsIgnoreCase("n") || op.equalsIgnoreCase("si") || op.equalsIgnoreCase("no"))){
            System.out.println("\u001B[31mError!\u001B[0m, vuelva a ingresar si posee sintonizador TDT (s/n) => ");
            op = read.next();     
        }
        boolean tdt;
        if(op.equalsIgnoreCase("s") || op.equalsIgnoreCase("si")){
            tdt = true;
        }else{
            tdt = false;
        }
        Televisor t = new Televisor(e, resolucion, tdt);
        this.precioFinal(t);
        System.out.println("\u001B[0m");
        return t;
    }

    // • Método precioFinal(): este método será heredado y se le sumará la siguiente
    // funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
    // incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
    // $500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
    // también deben afectar al precio.
    public void precioFinal(Televisor t) {
        super.precioFinal(t);
        if(t.isTdt()){
            t.setPrecio(t.getPrecio() + 500);
        }
        if(t.getResolucion()>40){
            t.setPrecio(t.getPrecio() + (t.getPrecio()*0.3));
        }
    }

}