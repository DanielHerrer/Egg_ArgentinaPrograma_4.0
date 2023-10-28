// GUIA 12 EJERCICIO 3 - Daniel Franco Herrera

// Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
// para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.

// Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
// deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
// televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
// precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
// 2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
// electrodomésticos, 2000 para lavadora y 5000 para televisor.

import java.util.ArrayList;

import entities.*;
import services.*;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Electrodomestico> lista = new ArrayList<>();

        lista.add(new Televisor(2500, "negro", 'C', 20, 45, false));
        lista.add(new Lavadora(5000, "blanco", 'B', 60, 45));
        lista.add(new Televisor(3500, "rojo", 'B', 29, 60, true));
        lista.add(new Lavadora(6300, "azul", 'A', 75, 55));

        System.out.println("Compra de Electrodomesticos:");
        float precioTotal = 0;
        for(Electrodomestico e: lista){
            System.out.println("-------------------------------------------------------------");
            if(e instanceof Lavadora){
                Lavadora l = (Lavadora) e;
                LavadoraService ls = new LavadoraService();              
                ls.precioFinal(l);

                System.out.println("- Lavadora $"+l.getPrecio()+" | Color: "+l.getColor()+" | Carga: "+l.getCarga()+" kg.");
                precioTotal += l.getPrecio();
            }else if(e instanceof Televisor){
                Televisor t = (Televisor) e;
                TelevisorService ts = new TelevisorService();
                ts.precioFinal(t);
                
                System.out.println("- Televisor $"+t.getPrecio()+" | Color: "+t.getColor()+" | Resolucion: "+t.getResolucion()+" pulgadas");
                precioTotal += t.getPrecio();
            }
        }
        System.out.println("----------------------------\nPRECIO TOTAL = $"+precioTotal+" usd");
    }
}
