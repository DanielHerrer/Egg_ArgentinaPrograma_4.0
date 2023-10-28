// GUIA 11 EJERCICIO EXTRA 3 - Daniel Franco Herrera

// Ha llegado el momento de poner de prueba tus conocimientos. Para te vamos a contar que te
// ha contratado “La Tercera Seguros”, una empresa aseguradora que brinda a sus clientes
// coberturas integrales para vehículos.
// Luego de un pequeño relevamiento, te vamos a pasar en limpio los requerimientos del sistema
// que quiere realizar la empresa.

//    Nota: prestar atención al principio de este enunciado y pensar en las
//        relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
//             muchos a uno o de muchos a muchos.
//       Debemos realizar el diagrama de clases completo, teniendo en cuenta todos los
//          requerimientos arriba descriptos. Modelando clases con atributos y sus correspondientes relaciones.

import java.util.Scanner;

import service.Service;

import entities.Cliente;
import entities.Poliza;
import entities.Vehiculo;

public class App {

    public static void main(String[] args) throws Exception {
        
        Scanner read = new Scanner(System.in);
        Service sv = new Service();
        Cliente cliente = null;
        Vehiculo vehiculo = null;
        Poliza poliza = null;

        System.out.println("\u001B[36mBienvenido a La Tercera Seguros!\u001B[0m");

        boolean salir = false;
        do{
            System.out.println("\u001B[33mMENU 'La Tercera Seguros':\u001B[0m");
            System.out.print("1. Ingresar cliente\n2. Ingresar vehiculo\n3. Generar poliza\n4. Gestion de cuotas\n0. Salir\nIngrese opcion => ");
            int opcion = read.nextInt();
            read.nextLine();
            switch(opcion){
                case 1:
                    cliente = sv.crearCliente();
                    break;
                case 2:
                    vehiculo = sv.crearVehiculo();
                    break;
                case 3:
                    if(cliente==null || vehiculo==null){
                        System.out.println("\u001B[31mNo se pudo crear poliza\u001B[0m"); // ROJO
                    }else{
                        poliza = sv.crearPoliza(vehiculo, cliente);
                    }
                    break;
                case 4:
                    if(poliza==null){
                        System.out.println("\u001B[31mGenere una poliza antes\u001B[0m"); // ROJO
                    }else{
                        sv.gestionCuotas(poliza);
                    }
                    break;
                case 0:
                    System.out.println("\u001B[36mFinalizando programa\u001B[0m");  // CELESTE
                    salir = true;
                    break;
                default:
                    System.out.println("\u001B[31mOpcion invalida..\u001B[0m"); // ROJO
            }
        }while(salir!=true);
        
        read.close();
    }

}