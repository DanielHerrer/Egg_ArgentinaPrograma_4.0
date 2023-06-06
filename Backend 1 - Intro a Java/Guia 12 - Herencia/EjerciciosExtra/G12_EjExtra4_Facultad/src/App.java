// GUIA 12 EJERCICIO EXTRA 4 - Daniel Franco Herrera

// Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
// la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
// tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de
// información debe gestionar esta aplicación:

// El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
// continuación, debe programar las clases definidas en las que, además de los constructores,
// hay que desarrollar los métodos correspondientes a las siguientes operaciones:
// • Cambio del estado civil de una persona.
// • Reasignación de despacho a un empleado.
// • Matriculación de un estudiante en un nuevo curso.
// • Cambio de departamento de un profesor.
// • Traslado de sección de un empleado del personal de servicio.
// • Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
// que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.

import java.util.ArrayList;
import java.util.Scanner;

import entities.*;
import services.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        String red = "\u001B[31m"; // ANSI_RED
        String green = "\u001B[32m"; // ANSI_GREEN
        // String yellow = "\u001B[33m";
        // String blue = "\u001B[34m";
        // String purple = "\u001B[35m";
        String cyan = "\u001B[36m";

        String reset = "\u001B[0m";

        ArrayList<Persona> personasFacultad = new ArrayList<>();
        int id = 0;

        System.out.println("Bienvenido al Sistema de Gestión de la Facultad!");
        boolean salir = false;
        do{
            int op;
            System.out.println("MENU:\n1. Registrar Personas\n2. Gestionar Personas\n3. Salir");
            System.out.print(green+"Ingrese opcion => "+reset);
            op = read.nextInt();
            read.nextLine();
            switch(op){
                case 1:
                    int op_1;
                    do{
                        System.out.println("MENU: -Registrar Personas-\n1. Registrar Estudiante\n2. Registrar Profesor\n3. Registrar Personal de Servicio\n4. Volver");
                        System.out.print(green+"Ingrese opcion => "+reset);
                        op_1 = read.nextInt();
                        read.nextLine();
                        switch(op_1){
                            case 1:
                                System.out.println("REGISTRANDO ESTUDIANTE:");
                                Persona e = new EstudianteService().crearEstudiante();
                                id++;
                                e.setNumeroID(id);
                                personasFacultad.add(e);
                                break;
                            case 2:
                                System.out.println("REGISTRANDO PROFESOR:");
                                Persona p = new ProfesorService().crearProfesor();
                                id++;
                                p.setNumeroID(id);
                                personasFacultad.add(p);
                                break;
                            case 3:
                                System.out.println("REGISTRANDO PERSONAL DE SERVICIO:");
                                Persona ps = new PersonalServicioService().crearPersonalServicio();
                                id++;
                                ps.setNumeroID(id);
                                personasFacultad.add(ps);
                                break;
                            case 4:
                                System.out.println("Volviendo..");
                                break;
                            default:
                                System.out.println(red+"Opcion invalida"+reset);
                        }
                    }while(op_1!=4);
                    break;
                case 2:
                    int op_2;
                    do{
                        System.out.println("MENU: -Gestionar Personas-\n1. Cambiar estado civil de una Persona\n2. Reasignar despacho de un Empleado"+
                        "\n3. Matricular a un Estudiante en un nuevo curso\n4. Cambiar departamento de un Profesor\n5. Trasladar de sección a un Empleado en Personal de Servicio"+
                        "\n6. Imprimir Personas\n7. Volver");
                        System.out.print(green+"Ingrese opcion => "+reset);
                        op_2 = read.nextInt();
                        read.nextLine();

                        int id_find;
                        switch(op_2){
                            case 1: // Cambiar estado civil de una Persona
                                System.out.println("-MENU CAMBIAR ESTADO CIVIL- (Persona)");
                                System.out.print(green+"Ingrese ID de la Persona => "+reset);
                                id_find = read.nextInt();
                                read.nextLine();
                                for(int i=0; i<personasFacultad.size(); i++){
                                    if(personasFacultad.get(i).getNumeroID() == id_find){
                                        personasFacultad.get(i).setEstadoCivil(read);   // CAMBIAR ESTADO CIVIL
                                        break;
                                    }
                                    if((i+1) == personasFacultad.size()){   // Si la ULTIMA iteracion es equivalente al tamaño del arraylist
                                        System.out.println(red+"ID invalido.."+reset);
                                    }
                                }
                                break;
                            case 2: // Reasignar despacho de un Empleado
                                System.out.println("-MENU REASIGNAR DESPACHO- (Empleado)");
                                System.out.print(green+"Ingrese ID de la Persona => "+reset);
                                id_find = read.nextInt();
                                read.nextLine();
                                for(int i=0; i<personasFacultad.size(); i++){
                                    if(personasFacultad.get(i).getNumeroID() == id_find){
                                        if(personasFacultad.get(i) instanceof Empleado){
                                            System.out.print(cyan+"Ingrese numero de despacho => "+reset);
                                            int despacho = read.nextInt();
                                            read.nextLine();
                                            ((Empleado) personasFacultad.get(i)).setNumeroDeDespacho(despacho);   // CAMBIAR NUM. DESPACHO
                                            break;
                                        }else{
                                            System.out.println(red+"Esta Persona NO es Empleado .."+reset);
                                            break;
                                        }
                                    }
                                    if((i+1) == personasFacultad.size()){   // Si la ULTIMA iteracion es equivalente al tamaño del arraylist
                                        System.out.println(red+"ID invalido.."+reset);
                                    }
                                }
                                break;
                            case 3: // Matricular a un Estudiante en un nuevo curso
                                System.out.println("-MENU MATRICULAR NUEVO CURSO- (Estudiante)");
                                System.out.print(green+"Ingrese ID de la Persona => "+reset);
                                id_find = read.nextInt();
                                read.nextLine();
                                for(int i=0; i<personasFacultad.size(); i++){
                                    if(personasFacultad.get(i).getNumeroID() == id_find){
                                        if(personasFacultad.get(i) instanceof Estudiante){
                                            ((Estudiante) personasFacultad.get(i)).setCurso(read);   // CAMBIAR CURSO
                                            break;
                                        }else{
                                            System.out.println(red+"Esta Persona NO es Estudiante .."+reset);
                                            break;
                                        }
                                    }
                                    if((i+1) == personasFacultad.size()){   // Si la ULTIMA iteracion es equivalente al tamaño del arraylist
                                        System.out.println(red+"ID invalido.."+reset);
                                    }
                                }
                                break;
                            case 4: // Cambiar departamento de un Profesor
                                System.out.println("-MENU CAMBIAR DEPARTAMENTO- (Profesor)");
                                System.out.print(green+"Ingrese ID de la Persona => "+reset);
                                id_find = read.nextInt();
                                read.nextLine();
                                for(int i=0; i<personasFacultad.size(); i++){
                                    if(personasFacultad.get(i).getNumeroID() == id_find){
                                        if(personasFacultad.get(i) instanceof Profesor){
                                            ((Profesor) personasFacultad.get(i)).setDepartamento(read);   // CAMBIAR DEPARTAMENTO
                                            break;
                                        }else{
                                            System.out.println(red+"Esta Persona NO es Profesor .."+reset);
                                            break;
                                        }
                                    }
                                    if((i+1) == personasFacultad.size()){   // Si la ULTIMA iteracion es equivalente al tamaño del arraylist
                                        System.out.println(red+"ID invalido.."+reset);
                                    }
                                }
                                break;
                            case 5: // Trasladar de sección a un Empleado en Personal de Servicio
                                System.out.println("-MENU TRASLADAR SECCION- (Personal de Servicio)");
                                System.out.print(green+"Ingrese ID de la Persona => "+reset);
                                id_find = read.nextInt();
                                read.nextLine();
                                for(int i=0; i<personasFacultad.size(); i++){
                                    if(personasFacultad.get(i).getNumeroID() == id_find){
                                        if(personasFacultad.get(i) instanceof PersonalServicio){
                                            ((PersonalServicio) personasFacultad.get(i)).setSeccion(read);   // CAMBIAR SECCION
                                            break;
                                        }else{
                                            System.out.println(red+"Esta Persona NO es Personal de Servicio .."+reset);
                                            break;
                                        }
                                    }
                                    if((i+1) == personasFacultad.size()){   // Si la ULTIMA iteracion es equivalente al tamaño del arraylist
                                        System.out.println(red+"ID invalido.."+reset);
                                    }
                                }
                                break;
                            case 6: // Imprimir Personas
                                int op_2_6;
                                do{
                                    System.out.println("MENU: -Imprimir Personas-\n1. Imprimir por ID\n2. Imprimir Estudiantes\n3. Imprimir Profesores\n4. Imprimir Personal de Servicio\n5. Volver");
                                    System.out.print(green+"Ingrese opcion => "+reset);
                                    op_2_6 = read.nextInt();
                                    read.nextLine();
                                    switch(op_2_6){
                                        case 1: // IMPRIMIR POR ID
                                            for(Persona p: personasFacultad){
                                                if(p instanceof Estudiante){
                                                    Estudiante e = (Estudiante) p;
                                                    System.out.println("ID:"+e.getNumeroID()+" ("+e.getClass().getSimpleName()+") "+e.getNombre()+" "+e.getApellido()+" ["+e.getCurso()+"]");
                                                }else if(p instanceof Profesor){
                                                    Profesor pf = (Profesor) p;
                                                    System.out.println("ID:"+pf.getNumeroID()+" ("+pf.getClass().getSimpleName()+") "+pf.getNombre()+" "+pf.getApellido()+" ["+pf.getDepartamento()+"]");
                                                }else if(p instanceof PersonalServicio){
                                                    PersonalServicio ps = (PersonalServicio) p;
                                                    System.out.println("ID:"+ps.getNumeroID()+" ("+ps.getClass().getSimpleName()+") "+ps.getNombre()+" "+ps.getApellido()+" ["+ps.getSeccion()+"]");
                                                }
                                            }   
                                            break;
                                        case 2: // IMPRIMIR ESTUDIANTES
                                            for(Persona p: personasFacultad){
                                                if(p instanceof Estudiante){
                                                    Estudiante e = (Estudiante) p;
                                                    System.out.println("ID:"+e.getNumeroID()+" ("+e.getClass().getSimpleName()+") "+e.getNombre()+" "+e.getApellido()+" ["+e.getCurso()+"]");
                                                }
                                            }
                                            break;
                                        case 3: // IMPRIMIR PROFESORES
                                            for(Persona p: personasFacultad){
                                                if(p instanceof Profesor){
                                                    Profesor pf = (Profesor) p;
                                                    System.out.println("ID:"+pf.getNumeroID()+" ("+pf.getClass().getSimpleName()+") "+pf.getNombre()+" "+pf.getApellido()+" ["+pf.getDepartamento()+"]");
                                                }
                                            }
                                            break;
                                        case 4: // IMPRIMIR PERSONAL DE SERVICIO
                                            for(Persona p: personasFacultad){
                                                if(p instanceof PersonalServicio){
                                                    PersonalServicio ps = (PersonalServicio) p;
                                                    System.out.println("ID:"+ps.getNumeroID()+" ("+ps.getClass().getSimpleName()+") "+ps.getNombre()+" "+ps.getApellido()+" ["+ps.getSeccion()+"]");
                                                }
                                            }
                                            break;
                                        case 5:
                                            System.out.println("Volviendo..");
                                            break;
                                        default:
                                            System.out.println(red+"Opcion invalida"+reset);
                                    }
                                }while(op_2_6!=5);
                                break;
                            case 7:
                                System.out.println("Volviendo..");
                                break;
                            default:
                                System.out.println(red+"Opcion invalida"+reset);
                        }
                    }while(op_2!=7);
                    break;
                case 3:
                    salir = true;
                    System.out.println(red+"Finalizando sistema .."+reset);
                    break;
                default:
                    System.out.println(red+"Opcion invalida"+reset);
            }
        }while(salir!=true);
    }
}
