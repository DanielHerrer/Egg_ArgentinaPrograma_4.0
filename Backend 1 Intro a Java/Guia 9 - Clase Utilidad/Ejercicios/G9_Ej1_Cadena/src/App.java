// GUIA 9 EJERCICIO 1 - Daniel F. Herrera
// Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una frase (String) 
// y su longitud. Agregar constructor vacío y con atributo frase solamente. Agregar getters y setters. 
// El constructor con frase como atributo debe setear la longitud de la frase de manera automática. 
// Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
// Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
// Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. 
// Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
// Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar 
// cuántas veces se repite el carácter en la frase, por ejemplo:
// Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
// Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase 
// con otra nueva frase ingresada por el usuario.
// Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada 
// por el usuario y mostrar la frase resultante.
// Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, 
// por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
// Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario 
// y devuelve verdadero si la contiene y falso si no.

import entidades.Cadena;
import servicios.CadenaServicios;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("//////////////////////////////// INICIO ///////////////////////////////");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CadenaServicios cs = new CadenaServicios();
        Cadena ce = cs.crearFrase();
        System.out.println("------------------------------------------------------");
        // MOSTRAR CANTIDAD DE VOLCALES
        System.out.println("La cantidad de vocales que contiene su frase es de "+cs.mostrarVocales(ce)+" vocales");
        System.out.println("------------------------------------------------------");
        // MOSTRAR FRASE INVERTIDA
        System.out.println("La frase invertida es = "+cs.invertirFrase(ce));
        System.out.println("------------------------------------------------------");
        // MOSTRAR LA CANTIDAD DE VECES QUE SE ENCUENTRA UNA LETRA INGRESADA EN LA FRASE
        System.out.print("Ingrese una letra a buscar en la frase => ");
        String letra = leer.nextLine();
        System.out.println("\nLa letra '" + letra + "' se encuentra " + cs.vecesRepetido(ce, letra) + " veces repetida en la frase");
        System.out.println("------------------------------------------------------");
        // COMPARAR LA LONGITUD DE UNA FRASE INGRESADA CON LA FRASE REGISTRADA
        System.out.print("Ingrese una frase para comparar la longitud => ");
        String frase = leer.nextLine();
        System.out.println("");
        cs.compararLongitud(ce, frase);
        System.out.println("------------------------------------------------------");
        // CONCATENAR DOS FRASES
        System.out.print("Ingrese otra frase para concatenar => ");
        String frasecon = leer.nextLine();
        System.out.println("");
        System.out.println("La nueva frase concatenada es = "+cs.unirFrases(ce, frasecon));
        System.out.println("------------------------------------------------------");
        // MODIFICA LAS OCURRENCIAS "a" DE LA FRASE REGISTRADA, Y LO TRANSFORMA EN UNA FRASE CON LA LETRA INDICADA 
        System.out.print("Ingrese un caracter para reemplazar las letras 'a' => ");
        String caracter = leer.nextLine();
        System.out.println("");
        System.out.println("La nueva frase con la letra 'a' reemplazada es = " + cs.reemplazar(ce, caracter));
        System.out.println("------------------------------------------------------");
        // VERIFICA SI LA LETRA A BUSCAR SE ENCUENTRA EN LA FRASE REGISTRADA
        System.out.print("Ingrese una letra a buscar => ");
        String letraB = leer.nextLine();
        System.out.println("");
        if (cs.contiene(ce, letraB)){
            System.out.println("La frase SI contiene la letra '"+letraB+"'");
        }else{
            System.out.println("La frase NO contiene la letra '"+letraB+"'");
        }
        System.out.println("//////////////////////////////// FIN ///////////////////////////////");
        leer.close();
    }
    
}