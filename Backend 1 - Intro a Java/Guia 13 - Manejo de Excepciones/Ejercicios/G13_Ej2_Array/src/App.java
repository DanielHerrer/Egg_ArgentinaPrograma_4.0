// G13 EJ2 - Juan Pablo Godoy

// Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
// generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
// de rango).

import entities.Autos;

public class App {
    public static void main(String[] args) {
        Autos a = new Autos();
        
        try{
            System.out.println(a.getMarcaAutos()[6]);
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e);
            System.out.println(e.fillInStackTrace());
            System.out.println("Te saliste del rango mostro");
        }
        
        
    }
}
