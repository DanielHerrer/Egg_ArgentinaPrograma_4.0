package entities.armadura.piezas.dispositivos;

import java.util.Random;

public class Sintetizador extends Dispositivo {

    public Sintetizador(){
        super();
    }

    public void usar(String texto){
        susurrar(texto);
        if((new Random().nextInt(100)+1) <= 15){  // numero generado entre 1 y 100, si es menor o igual a 15
            super.dañado = true;
        }
    }

    public void susurrar(String texto){
        if(super.isDañado()){
            String textoCorrupto = (texto.toLowerCase()).replace('a', '4').replace(('e'), '3').replace(('i'), '|').replace(('o'), '@').replace(('u'), 'V');
            System.out.println("[\u001B[36mJarvis\u001B[0m]: \u001B[41m"+ textoCorrupto +"\u001B[0m");
        }else{
            System.out.println("[\u001B[36mJarvis\u001B[0m]: \u001B[46m"+ texto +"\u001B[0m");
        }
    }

}
