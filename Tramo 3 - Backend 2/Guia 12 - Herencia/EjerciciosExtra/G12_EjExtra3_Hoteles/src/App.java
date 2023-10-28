// GUIA 12 EJERCICIO EXTRA 3 - Daniel Franco Herrera

// Una compañía de promociones turísticas desea mantener información sobre la infraestructura
// de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
// acuerdo con sus posibilidades.

// Realizar un programa en el que se representen todas las relaciones
// descriptas.

// Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
// • todos los alojamientos.
// • todos los hoteles de más caro a más barato.
// • todos los campings con restaurante
// • todos las residencias que tienen descuento.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import entities.*;
import services.*;


public class App {
    public static void main(String[] args) throws Exception {

        Scanner read = new Scanner(System.in);

        HashSet<Alojamiento> alojamientos = new HashSet<>();

        System.out.println("Bienvenido!");
        
        int option;
        do{
            System.out.println("------- MENU -------\n1. Registrar Alojamientos\n2. Consultar Alojamientos\n3. Salir");
            System.out.print("Ingrese su opcion => ");
            option = read.nextInt();
            read.nextLine();
            if(option == 1){
                System.out.println("------- REGISTRAR ALOJAMIENTO -------\n1. Camping\n2. Residencia\n3. Hotel 4 estrellas\n4. Hotel 5 estrellas");
                int optionAloj;
                do{
                    System.out.print("Ingrese su opcion => ");
                    optionAloj = read.nextInt();
                    read.nextLine();
                    if(optionAloj == 1){
                        Alojamiento a = new CampingService().crearCamping();
                        alojamientos.add(a);
                        break;
                    }else if(optionAloj == 2){
                        Alojamiento a = new ResidenciaService().crearResidencia();
                        alojamientos.add(a);
                        break;
                    }else if(optionAloj == 3){
                        Alojamiento a = new Hotel4Service().crearHotel4();
                        alojamientos.add(a);
                        break;
                    }else if(optionAloj == 4){
                        Alojamiento a = new Hotel5Service().crearHotel5();
                        alojamientos.add(a);
                        break;
                    }else{
                        System.out.println("\u001B[31mOpcion no valida\u001B[0m");
                    }
                }while(true);
            }else if(option == 2){
                if(alojamientos.size()<2){
                    System.out.println("\u001B[33mRegistre al menos 2 alojamientos primero...\u001B[0m");
                }else{
                    System.out.println("------- CONSULTAR ALOJAMIENTOS -------\n1. Todos los alojamientos\n2. Todos los hoteles (+$ a -$)\n3. Todos los campings con restaurante\n4. Todas las residencias con descuento gremial");
                    int optionCons;
                    do{
                        System.out.print("Ingrese su opcion => ");
                        optionCons = read.nextInt();
                        read.nextLine();
                        if(optionCons == 1){
                            for(Alojamiento a: alojamientos){
                                if(a instanceof Camping){
                                    System.out.print("\u001B[36mCamping: \u001B[0m"); // Cian
                                    System.out.println(a.getNombre());
                                }else if(a instanceof Residencia){
                                    System.out.print("\u001B[35mResidencia: \u001B[0m"); // Magenta
                                    System.out.println(a.getNombre());
                                }else if(a instanceof Hotel4){
                                    System.out.print("\u001B[38;5;208mHotel 4 estrellas: \u001B[0m"); // Naranja
                                    System.out.println(a.getNombre());
                                }else if(a instanceof Hotel5){
                                    System.out.print("\u001B[33mHotel 5 estrellas: \u001B[0m"); // Amarillo
                                    System.out.println(a.getNombre());
                                }
                            }
                            break;
                        }else if(optionCons == 2){
                            ArrayList<Hotel> hoteles = new ArrayList<>();
                            for(Alojamiento a: alojamientos){
                                if(a instanceof Hotel4 || a instanceof Hotel5){
                                    hoteles.add((Hotel) a);
                                }
                            }
                            Collections.sort(hoteles, Comparator.comparingDouble(Hotel::getPrecioHabitacion).reversed());
                            for(Hotel h: hoteles){
                                if(h instanceof Hotel5){
                                    System.out.print("\u001B[33mHotel 5 estrellas: \u001B[0m"); 
                                    System.out.println(h.getNombre()+" | Precio= $"+h.getPrecioHabitacion());
                                }else if(h instanceof Hotel4){
                                    System.out.print("\u001B[38;5;208mHotel 4 estrellas: \u001B[0m");
                                    System.out.println(h.getNombre()+" | Precio= $"+h.getPrecioHabitacion());
                                }
                            }
                            break;
                        }else if(optionCons == 3){
                            ArrayList<Camping> campings = new ArrayList<>();
                            for(Alojamiento a: alojamientos){
                                if(a instanceof Camping && ((Camping)a).isRestaurante()){ // Si es camping Y tiene restaurante
                                    campings.add((Camping) a);
                                }
                            }
                            for(Camping c: campings){
                                System.out.print("\u001B[36mCamping: \u001B[0m");
                                System.out.println(c.getNombre());
                            }
                            break;
                        }else if(optionCons == 4){
                            ArrayList<Residencia> residencias = new ArrayList<>();
                            for(Alojamiento a: alojamientos){
                                if(a instanceof Residencia && ((Residencia)a).isDescuentoGremio()){ // Si es residencia Y tiene descuento gremial
                                    residencias.add((Residencia) a);
                                }
                            }
                            for(Residencia r: residencias){
                                System.out.print("\u001B[35mResidencia: \u001B[0m");
                                System.out.println(r.getNombre());
                            }
                            break;
                        }else{
                            System.out.println("\u001B[31mOpcion no valida\u001B[0m");
                        }
                    }while(true);
                }
            }else if(option != 3){
                System.out.println("\u001B[31mOpcion no valida\u001B[0m");
            }
        }while(option!=3);
        System.out.println("\u001B[90mFinalizando programa..\u001B[0m");



        read.close();
    }
}
