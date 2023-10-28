package entities.armadura.piezas.dispositivos;

import java.util.Random;

public class Consola extends Dispositivo {

    public Consola() {
        super();
    }

    public void mostrar(String texto){
        String textoMay = texto.toUpperCase();
        if(super.isDañado()){
            String textoCorrupto = textoMay.replace('A', '4').replace(('E'), '3').replace(('I'), '|').replace(('O'), '@').replace(('U'), 'V');
            System.out.println("[\u001B[32mConsola\u001B[0m]: \u001B[41m"+ textoCorrupto +"\u001B[0m");
        }else{
            System.out.println("[\u001B[32mConsola\u001B[0m]: \u001B[32m"+ textoMay +"\u001B[0m");
        }
    }

    public void usar(String texto){
        mostrar(texto);
        if((new Random().nextInt(100)+1) <= 15){  // numero generado entre 1 y 100, si es menor o igual a 15
            super.dañado = true;
        }
    }

}
