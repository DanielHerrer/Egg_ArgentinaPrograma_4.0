// Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
// página: https://mapanet.eu/index.htm. 
// Nota: Poner el código postal sin la letra, solo el numero.
// • Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
// • Muestra por pantalla los datos introducidos
// • Pide un código postal y muestra la ciudad asociada si existe sino avisa al
// usuario.
// • Muestra por pantalla los datos
// • Agregar una ciudad con su código postal correspondiente más al HashMap.
// • Elimina 3 ciudades existentes dentro del HashMap

package services;

import utilities.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PostalService {
    private Scanner read = new Scanner(System.in);
    private HashMap<Integer,String> postales = new HashMap<>();
    
    public void agregarPostal(){
        System.out.println("////////////////////////// INGRESAR POSTAL //////////////////////////");
        System.out.print("Ingrese código postal => ");
        Integer postal = read.nextInt();
        read.nextLine();
        System.out.print("Ingrese ciudad => ");
        String ciudad = read.nextLine();
        
        postales.put(postal, ciudad);
    }

    public void mostrarPostalesHash(){
        System.out.println("////////////////////////// MOSTRAR POSTALES HASH //////////////////////////");
        for(Map.Entry<Integer,String> postal: postales.entrySet()){ 
            System.out.println("Postal = "+postal.getKey()+" / Ciudad = "+postal.getValue());
        }
    }

    public void mostrarPostalesAZ(){
        System.out.println("////////////////////////// MOSTRAR POSTALES A-Z //////////////////////////");
        ArrayList<Map.Entry<Integer,String>> lista = new ArrayList<>(postales.entrySet());
        Collections.sort(lista,Comparadores.ordernarAZ);
        for(Map.Entry<Integer,String> postal: lista){ 
            System.out.println("Postal = "+postal.getKey()+" / Ciudad = "+postal.getValue());
        }
    }

    public void mostrarPostal(){
        System.out.println("////////////////////////// BUSCAR POSTAL //////////////////////////");
        System.out.print("Ingrese código postal a buscar => ");
        Integer codigo = read.nextInt();
        read.nextLine();
        if(postales.containsKey(codigo)){
            System.out.println("Postal = "+codigo+" / Ciudad = "+postales.get(codigo));
        }else{
            System.out.println("No existe una ciudad asociada a ese código postal.");
        }
    }

    public void eliminarPostal(){
        System.out.println("////////////////////////// ELIMINAR POSTAL //////////////////////////");
        System.out.print("Ingrese código postal a eliminar => ");
        Integer codigo = read.nextInt();
        read.nextLine();
        if(postales.containsKey(codigo)){
            postales.remove(codigo);
        }else{
            System.out.println("No existe una ciudad asociada a ese código postal.");
        }
    }

}
