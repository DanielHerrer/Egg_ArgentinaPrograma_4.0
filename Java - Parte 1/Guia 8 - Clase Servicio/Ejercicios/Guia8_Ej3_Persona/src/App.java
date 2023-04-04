/// EJERCICIO 3 Persona  Daniel F. Herrera
// Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos: 
// nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura. Si desea añadir 
// algún otro atributo, puede hacerlo. Agregar constructores, getters y setters.
// En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
// Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
// Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y 
// después se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba 
// que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un 
// mensaje
// Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). 
// Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de 
// su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 
// (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. 
// Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene 
// sobrepeso, y la función devuelve un 1.

// A continuación, en la clase main hacer lo siguiente:
// Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos 
// para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por 
// debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.

// Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas 
// variables(arrays), para después calcular un porcentaje de esas 4 personas cuantas están por debajo 
// de su peso, cuantas en su peso ideal y cuantos, por encima, y también calcularemos un porcentaje
//  de cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos métodos adicionales.

import entities.Persona;
import services.PersonaServicio;

public class App {
    public static void main(String[] args) throws Exception {
        
        PersonaServicio ps = new PersonaServicio();
        Persona p1 = ps.crearPersona();
        Persona p2 = ps.crearPersona();
        Persona p3 = ps.crearPersona();
        Persona p4 = ps.crearPersona(); 

        Boolean[] listaEdad = new Boolean[4];
        int[] listaPeso = new int[4];

        listaEdad[0] = ps.esMayorDeEdad(p1);
        listaEdad[1] = ps.esMayorDeEdad(p2);
        listaEdad[2] = ps.esMayorDeEdad(p3);
        listaEdad[3] = ps.esMayorDeEdad(p4);

        // Para sacar un porcentaje:
        // Divido la cantidad de personas sobre la cantidad de personas max.
        // Y ese numero lo multiplico x 100 para sacar porcentaje.
        int mayores=0, menores=0;
        for(Boolean siEs: listaEdad){
            if(siEs==true){
                mayores++;
            }else{
                menores++;
            }
        }

        System.out.println("El porcentaje de menores: "+((menores/listaEdad.length)*100));
        System.out.println("El porcentaje de mayores: "+((mayores/listaEdad.length)*100));

        ////////////////////////////////////////////////////////////////////////////////////////

        listaPeso[0] = ps.calcularIMC(p1);
        listaPeso[1] = ps.calcularIMC(p2);
        listaPeso[2] = ps.calcularIMC(p3);
        listaPeso[3] = ps.calcularIMC(p4);

        int sobrePeso=0, promedioPeso=0, bajoPeso=0;
        for(int imc: listaPeso){
            if(imc==-1){
                bajoPeso++;
            }else{
                if(imc==0){
                    promedioPeso++;
                }else{
                    if(imc==1){
                        sobrePeso++;
                    }
                }
            }
        }

        System.out.println("El porcentaje de sobrepeso: "+ (((double)(sobrePeso)/listaPeso.length)*100)) ;
        System.out.println("El porcentaje de peso promedio: "+(((double)(promedioPeso)/listaPeso.length)*100));
        System.out.println("El porcentaje de bajo peso: "+(((double)(bajoPeso)/listaPeso.length)*100));
    
    }
}