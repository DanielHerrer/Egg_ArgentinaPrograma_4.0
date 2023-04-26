import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class EjerciciosGuia {
    public static void main(String[] args){

        // LISTAS :
        ArrayList<Integer> numerosPares = new ArrayList();
        // CONJUNTOS :
        HashSet<String> listadoFrutas = new HashSet();
        // MAPAS :
        HashMap<Integer,String> personasDni = new HashMap();

        /////////////////////////// AÑADIR ELEMENTOS ///////////////////////////

        numerosPares.add(2);
        numerosPares.add(4);
        numerosPares.add(6);
        numerosPares.add(12);
        numerosPares.add(24);

        listadoFrutas.add("Manzana");
        listadoFrutas.add("Banana");
        listadoFrutas.add("Frutilla");
        listadoFrutas.add("Pera");
        listadoFrutas.add("Tomate");

        personasDni.put(41125305, "Daniel");
        personasDni.put(41225183, "Lucia");
        personasDni.put(41396173, "Fernando");
        personasDni.put(41068971, "Matias");
        personasDni.put(41531648, "Ludmila");

        /////////////////////////// REMOVER ELEMENTOS ///////////////////////////

        numerosPares.remove(0); // En la lista remueve en forma de Index (en posicion: 0)
        numerosPares.remove(6); // Remueve en forma de elemento (el primer elemento existente: '6')
        
        listadoFrutas.remove("Banana"); // Los conjuntos solo remueven por valor
        listadoFrutas.remove("Pera");

        personasDni.remove(41068971,"Matias"); // Los mapas requiere llave y valor
        personasDni.remove(41396173,"Fernando");

        /////////////////////////// RECORRER LISTAS, CONJUNTOS Y MAPAS ///////////////////////////
        
        // Recorrer LISTA
        for(Integer numPar: numerosPares){
            System.out.println(numPar);
        }
        // Recorrer CONJUNTO
        for(String fruta: listadoFrutas){
            System.out.println(fruta);
        }
        // Recorrer MAPA
            // CON Map.Entry
            for(Map.Entry<Integer,String> persona: personasDni.entrySet()){ // Recorrer un mapa trayendo llave y valor
                System.out.println("DNI = "+persona.getKey()+" / Nombre = "+persona.getValue());
            }
            // SIN Map.Entry
            for(Integer dni: personasDni.keySet()){ // mostrar solo las llaves
                System.out.println("DNI = "+dni);
            }
            for(String nombre: personasDni.values()){ // mostrar solo los valores
                System.out.println("Nombre = "+nombre);
            }
        
        /////////////////////////// ITERATOR ///////////////////////////
        // Este método iterator(), devuelve la colección, lo recibe el objeto Iterator 
        // y usando el objeto Iterator, podemos iterar sobre nuestra colección.

        Iterator<Integer> iterator = numerosPares.iterator(); 
        
        System.out.println("Elementos de la lista: ");
        while(iterator.hasNext()){  // hasNext(): (boolean) Retorna verdadero si al iterator le quedan elementos por iterar
            System.out.print(iterator.next()+" ");  // next(): (Object) Devuelve el siguiente elemento en la colección, mientras el método hasNext() retorne true.
        }
        System.out.println();

        /////////////////////////// COLLECTIONS.sort() ///////////////////////////

        // ORDENAR LISTAS:
        ArrayList<Integer> numeros = new ArrayList<>();
        Collections.sort(numeros);

        // ORDENAR CONJUNTOS:
        HashSet<Integer> numerosSet = new HashSet<>();
        // Se convierte el HashSet a Lista
        ArrayList<Integer> numerosLista = new ArrayList<>(numerosSet);
        Collections.sort(numerosLista);

        // ORDENAR MAPAS:
        HashMap<Integer,String> alumnos = new HashMap<>();
        // Se convierte el HashMap a TreeMap
        TreeMap<Integer,String> alumnosTree = new TreeMap(alumnos); // Los Tree se ordenan por si solos, automaticamente.

        /////////////////////////// COMPARATOR ///////////////////////////

        // Creamos un metodo Comparator dentro de nuestra Entidad
        public static Comparator<Perro> compararEdad = new Comparator<Perro>(){
            @Override
            public int compare(Perro p1, Perro p2){
                return p2.getEdad().compareTo(p1.getEdad());    // Devuelve 0 si la edad es la misma, 1 si la primera edad es mayor a la segunda y -1 si la primera edad es menor a la segunda.
            }
        };

        // LISTAS:
        ArrayList<Perro> perros = new ArrayList<>();
        // Se llama el metodo estatico a traves de la clase y se pone la lista a ordenar.
        perros.sort(Perro.compararEdad);

        // CONJUNTOS: 
        HashSet<Perro> perrosSet = new HashSet<>();
        ArrayList<Perro> perrosLista = new ArrayList<>(perrosSet);
        perrosLista.sort(Perro.compararEdad);
        
        // TREESET: (El Tree se ordena solo, por eso le pasamos bajo que atributo se va a ordenar)
        TreeSet<Perro> perrosConjunto = new TreeSet<>(Perro.compararEdad);
        Perro perro1 = new Perro();
        perros.add(perro1);

        // MAPAS:
        HashMap<Integer,Alumno> map = new HashMap<>();
        // Se usa una funcion de los mapas para traer todos los valores.
        ArrayList<Alumno> nombres = new ArrayList<>(map.values());
        nombres.sort(Alumno.compararDni);

        //////////////////////////  





    }

}