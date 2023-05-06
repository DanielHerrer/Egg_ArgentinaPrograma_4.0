// GUIA 10 EJERCICIO EXTRA 3 - Daniel Franco Herrera
// En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
// sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
// se le pregunta al usuario si quiere crear otro Libro o no.

// También se creará en el main un HashSet de tipo Libro que guardará todos los libros
// creados.

import entities.Libreria;
import entities.Libro;
import java.util.HashSet;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        HashSet<Libro> libros = new HashSet<>();
        Libreria libreria = new Libreria();

        Boolean fin = false;
        do{
            System.out.print("-----------------------------------------" +
                "\n    -MENU-" +
                    "\n1. Crear libros" +
                        "\n2. Pedir Libro" +
                            "\n3. Devolver Libro" +
                                "\n4. Mostrar Libros" +
                                    "\n5. Salir" +
                                        "\nIngrese opcion => ");
            int op = read.nextInt();
            read.nextLine();
            switch (op){
                case 1:
                    Boolean salir = false;
                    do{
                        System.out.println("-----------------------------------------");
                        libros.add(libreria.crearLibro());
                        System.out.print("-----------------------------------------\n" +
                                            "Desea seguir creando libros? (s/n) => " );
                        String opc = read.nextLine();
                        if(opc.equalsIgnoreCase("si") || opc.equalsIgnoreCase("s")){
                            System.out.println("Repitiendo..");
                        }else if(opc.equalsIgnoreCase("no") || opc.equalsIgnoreCase("n")){
                            System.out.println("Finalizando..");
                            salir = true;
                        }else{
                            System.out.println("Opcion Incorrecta. Finalizando..");
                            salir = true;
                        }
                    }while(salir != true);
                    break;
                case 2:
                    libreria.prestamo(libros);
                    break;
                case 3:
                    libreria.devolucion(libros);
                    break;
                case 4:
                    libreria.toString(libros);
                    break;
                case 5:
                    System.out.println("-----------------------------------------" +
                        "\nFinalizando programa...");
                    fin = true;
                    break;
                default:
                    System.out.println("Opcion no válida");
            }
        }while(fin != true);

        read.close();
    }
}
