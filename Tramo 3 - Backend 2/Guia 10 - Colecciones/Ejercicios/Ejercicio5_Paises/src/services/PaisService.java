package services;

import entities.Pais;
import utilities.Comparadores;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PaisService {
    private Scanner read = new Scanner(System.in);
    private HashSet<Pais> listaPaises = new HashSet<>();

    public void añadirPaises(){
        Boolean salir = false;
        do{
            Pais p = new Pais();
            System.out.print("Ingrese el nombre del pais => ");
            p.setNombre(read.nextLine());
            if(listaPaises.isEmpty()){
                System.out.println("Primer pais añadido!");
                listaPaises.add(p);
            }else{
                Iterator<Pais> iterador = listaPaises.iterator();
                while(iterador.hasNext()){
                    if(iterador.next().getNombre().equalsIgnoreCase(p.getNombre())){
                        System.out.println("El pais ya fue ingresado anteriormente..");
                        break;
                    }
                    if(!iterador.hasNext()){
                        System.out.println("Pais añadido!");
                        listaPaises.add(p);
                    }
                }
                // ELIMINADO, NO FUNCIONO
                // for(Pais var: listaPaises){
                //     if(p.getNombre().equalsIgnoreCase(var.getNombre())){
                //         System.out.println("El pais ya fue ingresado anteriormente..");
                //         break;
                //     }else{
                //         System.out.println("Pais añadido!");
                //         listaPaises.add(p); 
                //         break;
                //     }
                // }
            }
            
            //--------------------------------------------------------------------------
            System.out.print("Desea salir? (s/n) => ");
            String op = read.nextLine();
            if(op.equalsIgnoreCase("si") || op.equalsIgnoreCase("s")){
                System.out.println("Finalizando..");
                salir = true;
            }else if(op.equalsIgnoreCase("no") || op.equalsIgnoreCase("n")){
                System.out.println("Repitiendo..");
            }else{
                System.out.println("Opcion incorrecta. Finalizando..");
                salir = true;
            }
        }while(salir!=true);
    }

    // Recibe una coleccion de paises y retorna un ArrayList de paises ordenados de A a Z
    public ArrayList<Pais> retornarPaisesAZ(Collection<Pais> c){
        ArrayList<Pais> paisesAZ = new ArrayList<>(c);
        paisesAZ.sort(Comparadores.compararNombreAZ);
        return paisesAZ;
    }
    
    // Muestra los paises de una coleccion de paises recibida por parametro
    public void mostrarPaises(Collection<Pais> c){
        for(Pais var: c){
            System.out.print("["+var.toString()+"] ");
        }
        System.out.println();
    }

    // Muestra los paises almacenados localmente por codigo Hash
    public void mostrarPaises(){
        for(Pais var: listaPaises){
            System.out.print("["+var.toString()+"] ");
        }
        System.out.println();
    }

    // Se convierte el HashSet a un ArrayList ordenado, luego con un iterador se recorre el ArrayList y 
    //   se elimina el pais ingresado, y finalmente se crea un iterador nuevo que reciba el ArrayList actualizado
    //     para recorrerlo desde 0 y poder mostrarlo.
    public void eliminarPais(){
        System.out.print("Ingrese nombre de pais a eliminar => ");
        String paisX = read.nextLine();

        // retornarPaisesAZ toma la listaPaises(HashSet) local y lo transforma en un ArrayList
        ArrayList<Pais> listaAZpaises = retornarPaisesAZ(listaPaises);

        // iterador recorre el ArrayList para eliminar el valor ingresado
        Iterator<Pais> iterador = listaAZpaises.iterator();
        while(iterador.hasNext()){
            if(iterador.next().getNombre().equalsIgnoreCase(paisX)){
                iterador.remove();
                System.out.println("Pais eliminado de la lista!");
                break;
            }
            if(!iterador.hasNext()){
                System.out.println("El pais no se encontró...");
            }
        }

        // iteradorNuevo recorre el ArrayList actualizado
        Iterator<Pais> iteradorNuevo = listaAZpaises.iterator();
        while(iteradorNuevo.hasNext()){
            System.out.print("["+iteradorNuevo.next()+"] ");
        }
        System.out.println();
    }

    public HashSet<Pais> getListaPaises() {
        return listaPaises;
    }

    public void setListaPaises(HashSet<Pais> listaPaises) {
        this.listaPaises = listaPaises;
    }
    
}
