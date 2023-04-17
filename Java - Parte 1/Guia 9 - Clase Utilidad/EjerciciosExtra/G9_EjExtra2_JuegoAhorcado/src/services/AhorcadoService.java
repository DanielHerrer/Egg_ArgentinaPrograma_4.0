// Definir los siguientes métodos en AhorcadoService:
// Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
// Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
// Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra 
// en un índice del vector. Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
// Método longitud(): muestra la longitud de la palabra que se debe encontrar. 
// Nota: buscar como se usa el vector.length.
// Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada 
// es parte de la palabra o no. También informará si la letra estaba o no.
// Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han 
// sido encontradas y cuántas le faltan. Este método además deberá devolver true si la letra estaba y false 
// si la letra no estaba, ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
// Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
// Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e 
// informará cuando el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.

package services;
import entities.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {
    
    private Scanner read = new Scanner(System.in);
    private Scanner readNum = new Scanner(System.in);

    public Ahorcado crearJuego(){
        System.out.print("Ingrese la palabra secreta => ");
        String palabra = read.nextLine();
        System.out.println("Ingrese num. de intentos maximo => ");
        int intentosMax = readNum.nextInt();
        return new Ahorcado(palabra, intentosMax);
    }

    public void juego(Ahorcado a){
        String letra;
        while(intentos(a)>0){
            // CORROBORA QUE SOLO SE INGRESE UNA LETRA
            do{
                System.out.print("Ingrese una letra => ");
                letra = read.nextLine();
            }while(letra.length()>1);
            // ACTUALIZA LAS LETRAS QUE SE ENCONTRARON, Y SINO SE ENCONTRARON SE PIERDE UN INTENTO
            encontradas(letra, a);
            // SI LAS LETRAS ENCONTRADAS ES IGUAL A LA LONGITUD DE LA PALABRA EL USUARIO GANA
            if(a.getLetrasEncontradas()==longitud(a)){
                System.out.println("Has ganado! Bien hecho");
                break;
            }
        }
        // SI LA CANTIDAD DE INTENTOS TERMINO COMO 0 ENTONCES EL USUARIO PIERDE
        if(intentos(a)==0){
            System.out.println("Has perdido! Te has quedado sin intentos...");
        }
    }

    public int longitud(Ahorcado a){
        return a.getPalabraSecreta().length;

    }

    public Boolean buscar(String letra, Ahorcado a){
        Boolean encontrado = false;
        for(String l: a.getPalabraSecreta()){
            if(letra.equals(l)){
                encontrado = true;
            }
        }
        return encontrado;
    }

    public void encontradas(String letra, Ahorcado a){
        int vecesEncontrado = 0;
        if(buscar(letra,a)){
            for(int i=0; i<longitud(a); i++){
                if(letra.equals(a.getPalabraSecreta()[i])){
                    vecesEncontrado++;
                }
            }
            a.setLetrasEncontradas(a.getLetrasEncontradas()+vecesEncontrado);   // ACTUALIZA LAS LETRAS ENCONTRADAS
            System.out.println("Has descubierto "+vecesEncontrado+" letras secretas, te faltan "+
                (longitud(a) - a.getLetrasEncontradas()));
        }else{
            a.setIntentosRestantes(intentos(a)-1); // SI FALLA, ACTUALIZA LOS INTENTOS RESTANTES
            System.out.println("Has fallado, INTENTOS RESTANTES = "+intentos(a));
        }
        
    }

    public int intentos(Ahorcado a){
        return a.getIntentosRestantes();
    }

}
