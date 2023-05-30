package services;

import entities.Electrodomestico;
import entities.Lavadora;

public class LavadoraService extends ElectrodomesticoService {

    // • Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
    // padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
    // el atributo propio de la lavadora.
    public Lavadora crearLavadora(){
        Electrodomestico e = crearElectrodomestico();
        System.out.print("Ingrese capacidad de carga => ");
        int capacidad = read.nextInt();
        read.nextLine();
        Lavadora l = new Lavadora(e,capacidad);
        this.precioFinal(l);
        return l;
    }

    // • Método precioFinal(): este método será heredado y se le sumará la siguiente
    // funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
    // carga es menor o igual, no se incrementará el precio. Este método debe llamar al
    // método padre y añadir el código necesario. Recuerda que las condiciones que hemos
    // visto en la clase Electrodoméstico también deben afectar al precio.
    public void precioFinal(Lavadora l) {
        super.precioFinal(l);
        if(l.getCarga()>30){
            l.setPrecio(l.getPrecio()+500);
        }
    }

}