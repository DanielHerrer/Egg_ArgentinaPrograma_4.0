package services;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import entities.Jarvis;
import entities.armadura.Armadura;
import entities.armadura.piezas.dispositivos.*;
import entities.radar.Radar;

public class JarvisService {

    private Scanner read = new Scanner(System.in);
    private Consola c = new Consola();
    private Sintetizador s = new Sintetizador();

    public void inicioJarvis(){
        s.susurrar("Bienvenido al Sistema de Jarvis!");
        s.susurrar("Vamos a crear su armadura!");
        Armadura exoesqueleto = crearArmadura();
        Jarvis jarvis = new Jarvis(exoesqueleto);
        System.out.println(jarvis.getAsciiHelmet());
        jarvis.getArmadura().getCasco().usarSintetizador("La armadura se incorpora a su cuerpo pilotx. El exoesqueleto esta listo!");        
        jarvis.getArmadura().getCasco().usarConsola("-- Iniciando simulador de combate --");
        do{
            System.out.println("-----------------------------------------------------------");
            jarvis.getArmadura().getCasco().usarConsola("- MENU -" +
                                                        "\n1. Mostrar estado de la armadura" +
                                                        "\n2. Mostrar estado de la bateria" +
                                                        "\n3. Informacion del reactor" +
                                                        "\n4. Revisar dispositivos y daños");
            System.out.print("Ingrese opcion => ");
            int menu_op = read.nextInt();
            read.nextLine();
            switch(menu_op){
                case 1: 
                    mostrarEstado(jarvis);
                    break;
                case 2:
                    estadoBateria(jarvis);
                    break;
                case 3:
                    informacionReactor(jarvis);
                    break;
                case 4:
                    revisandoDispositivos(jarvis);
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }while(jarvis.getArmadura().isFuncional());
       jarvis.getArmadura().getCasco().usarConsola("Finalizando..");
    }

    public Armadura crearArmadura(){
        s.susurrar("Elija un color primario..");
        String color_pri = elegirColor();
        s.susurrar("Elija un color secundario..");
        String color_seg = elegirColor();
        s.susurrar("Elija un material..");
        String resistencia = elegirMaterial();
        s.susurrar("Elija un tipo..");
        String rockwell = elegirResistencia(resistencia);

        return new Armadura(rockwell, resistencia, color_pri, color_seg);
    }

    public String elegirColor(){ 
        do {
            try {
                int op;
                System.out.print("1. \u001B[31mRojo\u001B[0m \n2. \u001B[33mAmarillo\u001B[0m \n3. \u001B[34mAzul\u001B[0m \n4. \u001B[32mVerde\u001B[0m \n5. \u001B[35mPurpura\u001B[0m \nIngrese su opción => ");
                op = Integer.parseInt(read.nextLine());
                switch (op) {
                    // case 1:
                    //     return "\u001B[31m Rojo \u001B[0m";
                    // case 2:
                    //     return "\u001B[33m Amarillo \u001B[0m";
                    // case 3:
                    //     return "\u001B[34m Azul \u001B[0m";
                    // case 4:
                    //     return "\u001B[32m Verde \u001B[0m";
                    // case 5:
                    //     return "\u001B[35m Purpura \u001B[0m";
                    case 1:
                        return "Rojo";
                    case 2:
                        return "Amarillo";
                    case 3:
                        return "Azul";
                    case 4:
                        return "Verde";
                    case 5:
                        return "Purpura";
                    default:
                        throw new NumberFormatException("Error: Opción inválida");
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    public String elegirMaterial(){
        do {
            try {
                int op;
                System.out.print("1. Titanio \n2. Acero de Alta Resistencia \n3. Aluminio Litio\nIngrese su opción => ");
                op = Integer.parseInt(read.nextLine());
                switch (op) {
                    case 1:
                        return "Titanio";
                    case 2:
                        return "Acero de alta resistencia";
                    case 3:
                        return "Aluminio-Litio";
                    default:
                        throw new NumberFormatException("Error: Opción inválida");
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    public String elegirResistencia(String material){
        int op_res;
        switch(material){
            case "Titanio":
                do {
                    try {
                        System.out.print("1. Rockwell B \n2. Rockwell C \nIngrese su opción => ");
                        op_res = Integer.parseInt(read.nextLine());
                        switch (op_res) {
                            case 1:
                                return "HRB (90-95)";
                            case 2:
                                return "HRC (35-40)";
                            default:
                                throw new NumberFormatException("Opción inválida");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(e.getMessage());
                    }
                } while (true);
            case "Acero de alta resistencia":
                do {
                    try {
                        System.out.print("1. Rockwell B \n2. Rockwell C \nIngrese su opción => ");
                        op_res = Integer.parseInt(read.nextLine());
                        switch (op_res) {
                            case 1:
                                return "HRB (95-100)";
                            case 2:
                                return "HRC (50-55)";
                            default:
                                throw new NumberFormatException("Opción inválida");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(e.getMessage());
                    }
                } while (true);
            case "Aluminio-Litio":
                do {
                    try {
                        System.out.print("1. Rockwell B \n2. Rockwell E \nIngrese su opción => ");
                        op_res = Integer.parseInt(read.nextLine());
                        switch (op_res) {
                            case 1:
                                return "HRB (60-70)";
                            case 2:
                                return "HRE (25-30)";
                            default:
                                throw new NumberFormatException("Opción inválida");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(e.getMessage());
                    }
                } while (true);
            default:
                System.out.println("Error: Opcion incorrecta");
                return "error";
        }

    }

// • Al caminar la armadura hará un uso básico de las botas y se consumirá la energía
//   establecida como consumo en la bota por el tiempo en el que se camine (BOTAS x1 x1) (x2)
    public void caminar(Jarvis j, int tiempo) {
        j.getArmadura().getCasco().usarSintetizador("Iniciando caminar ..");
        float energiaGastada = 0;
        int modo = 0;
        // SI FALLAN LAS 2 BOTAS
        if(j.getArmadura().getBotaDer().isDañado() && j.getArmadura().getBotaIzq().isDañado()){
            j.getArmadura().getCasco().usarSintetizador("Imposible realizar accion.. ambas botas fallan.");
        // SI SOLO FALLA UNA DE LAS 2 BOTAS
        }else if(j.getArmadura().getBotaDer().isDañado() || j.getArmadura().getBotaIzq().isDañado()){
            if(j.getArmadura().getBotaDer().isDañado()){
                modo = 1;
                j.getArmadura().getCasco().usarSintetizador("Bota derecha esta fallando, encendiendo bota izquierda ..");
                energiaGastada += j.getArmadura().getBotaIzq().usar(2, tiempo);
            }else{
                modo = 2;
                j.getArmadura().getCasco().usarSintetizador("Bota izquierda esta fallando, encendiendo bota derecha ..");
                energiaGastada += j.getArmadura().getBotaDer().usar(2, tiempo);
            }
        // SI AMBAS BOTAS ESTAN FUNCIONANDO CORRECTAMENTE
        }else{  
            modo = 3;
            j.getArmadura().getCasco().usarSintetizador("Ambas botas parecen funcionar, encendiendo..");
            energiaGastada += j.getArmadura().getBotaIzq().usar(1, tiempo) + j.getArmadura().getBotaDer().usar(1, tiempo);
        }
        if(modo != 0){
            // SI LA ENERGIA A GASTAR ES MAYOR QUE LA ENERGIA DISPONIBLE
            if(energiaGastada>j.getArmadura().getGenerador().getEnergia()){
                j.getArmadura().getCasco().usarSintetizador("Imposible completar accion! No queda energia suficiente..");
            // SI LA ENERGIA ES SUFICIENTE, SE CONSUME, Y LOS DISPOSITIVOS PUEDEN DAÑARSE
            }else{
                j.getArmadura().getCasco().usarSintetizador("Caminando ..");
                j.getArmadura().getGenerador().setEnergia(j.getArmadura().getGenerador().getEnergia() - energiaGastada);
                boolean botaIzqRota = false, botaDerRota = false;
                switch(modo){
                    case 1:
                        botaIzqRota = j.getArmadura().getBotaIzq().dañarse();
                        break;
                    case 2:
                        botaDerRota = j.getArmadura().getBotaDer().dañarse();
                        break;
                    case 3:
                        botaIzqRota = j.getArmadura().getBotaIzq().dañarse();
                        botaDerRota = j.getArmadura().getBotaDer().dañarse();
                        break;
                }
                if(botaDerRota && botaIzqRota){
                    j.getArmadura().getCasco().usarSintetizador("Ambas botas han quedado dañadas!");
                }else if(botaDerRota || botaIzqRota){
                    if(botaIzqRota){
                        j.getArmadura().getCasco().usarSintetizador("Bota izquierda ha quedado dañada!");
                    }
                    if(botaDerRota){
                        j.getArmadura().getCasco().usarSintetizador("Bota derecha ha quedado dañada!");
                    }
                }
                j.getArmadura().getCasco().usarConsola("Energia consumida = - %"+(energiaGastada/j.getArmadura().getGenerador().getEnergiaMax())*100);
            }
        }
    }

// • Al correr la armadura hará un uso normal de las botas y se consumirá el doble de la
//   energía establecida como consumo en la bota por el tiempo en el que se corra. (BOTAS: x2 x2) (x4)
    public void correr(Jarvis j, int tiempo) {
        j.getArmadura().getCasco().usarSintetizador("Iniciando correr ..");
        float energiaGastada = 0;
        int modo = 0;
        // SI FALLAN LAS 2 BOTAS
        if(j.getArmadura().getBotaDer().isDañado() && j.getArmadura().getBotaIzq().isDañado()){
            j.getArmadura().getCasco().usarSintetizador("Imposible realizar acción.. ambas botas fallan.");
        // SI SOLO FALLA UNA DE LAS 2 BOTAS
        }else if(j.getArmadura().getBotaDer().isDañado() || j.getArmadura().getBotaIzq().isDañado()){
            if(j.getArmadura().getBotaDer().isDañado()){
                modo = 1;
                j.getArmadura().getCasco().usarSintetizador("Bota derecha está fallando, encendiendo bota izquierda ..");
                energiaGastada += j.getArmadura().getBotaIzq().usar(4, tiempo);
            }else{
                modo = 2;
                j.getArmadura().getCasco().usarSintetizador("Bota izquierda esta fallando, encendiendo bota derecha ..");
                energiaGastada += j.getArmadura().getBotaDer().usar(4, tiempo);
            }
        // SI AMBAS BOTAS ESTAN FUNCIONANDO CORRECTAMENTE
        }else{  
            modo = 3;
            j.getArmadura().getCasco().usarSintetizador("Ambas botas parecen funcionar, encendiendo..");
            energiaGastada += j.getArmadura().getBotaIzq().usar(2, tiempo) + j.getArmadura().getBotaDer().usar(2, tiempo);
        }
        if(modo != 0){
            // SI LA ENERGIA A GASTAR ES MAYOR QUE LA ENERGIA DISPONIBLE
            if(energiaGastada>j.getArmadura().getGenerador().getEnergia()){
                j.getArmadura().getCasco().usarSintetizador("Imposible completar accion! No queda energia suficiente..");
            }else{
                j.getArmadura().getCasco().usarSintetizador("Corriendo ..");
                j.getArmadura().getGenerador().setEnergia(j.getArmadura().getGenerador().getEnergia() - energiaGastada);
                boolean botaIzqRota = false, botaDerRota = false;
                switch(modo){
                    case 1:
                        botaIzqRota = j.getArmadura().getBotaIzq().dañarse();
                        break;
                    case 2:
                        botaDerRota = j.getArmadura().getBotaDer().dañarse();
                        break;
                    case 3:
                        botaIzqRota = j.getArmadura().getBotaIzq().dañarse();
                        botaDerRota = j.getArmadura().getBotaDer().dañarse();
                        break;
                }
                if(botaDerRota && botaIzqRota){
                    j.getArmadura().getCasco().usarSintetizador("Ambas botas han quedado dañadas!");
                }else if(botaDerRota || botaIzqRota){
                    if(botaIzqRota){
                        j.getArmadura().getCasco().usarSintetizador("Bota izquierda ha quedado dañada!");
                    }
                    if(botaDerRota){
                        j.getArmadura().getCasco().usarSintetizador("Bota derecha ha quedado dañada!");
                    }
                }
                j.getArmadura().getCasco().usarConsola("Energia consumida = - %"+(energiaGastada/j.getArmadura().getGenerador().getEnergiaMax())*100);
            }
        }
    }

// • Al propulsarse la armadura hará un uso intensivo de las botas utilizando el triple de la
//   energía por el tiempo que dure la propulsión. (BOTAS: x3 x3) (x6)
    public void propulsarse(Jarvis j, int tiempo) {
        j.getArmadura().getCasco().usarSintetizador("Inciando propulsar ..");
        float energiaGastada = 0;
        int modo = 0;
        if(j.getArmadura().getBotaDer().isDañado() && j.getArmadura().getBotaIzq().isDañado()){
            j.getArmadura().getCasco().usarSintetizador("Imposible realizar acción.. ambas botas fallan.");
        }else if(j.getArmadura().getBotaDer().isDañado() || j.getArmadura().getBotaIzq().isDañado()){
            if(j.getArmadura().getBotaDer().isDañado()){
                modo = 1;
                j.getArmadura().getCasco().usarSintetizador("Bota derecha está fallando, encendiendo bota izquierda ..");
                energiaGastada += j.getArmadura().getBotaIzq().usar(6, tiempo);
            }else{
                modo = 2;
                j.getArmadura().getCasco().usarSintetizador("Bota izquierda está fallando, encendiendo bota derecha ..");
                energiaGastada += j.getArmadura().getBotaDer().usar(6, tiempo);
            }
        // SI AMBAS BOTAS ESTAN FUNCIONANDO CORRECTAMENTE
        }else{  
            modo = 3;
            j.getArmadura().getCasco().usarSintetizador("Ambas botas parecen funcionar, encendiendo..");
            energiaGastada += j.getArmadura().getBotaIzq().usar(3, tiempo) + j.getArmadura().getBotaDer().usar(3, tiempo);
        }
        if(modo != 0){
            // SI LA ENERGIA A GASTAR ES MAYOR QUE LA ENERGIA DISPONIBLE
            if(energiaGastada>j.getArmadura().getGenerador().getEnergia()){
                j.getArmadura().getCasco().usarSintetizador("Imposible completar accion! No queda energia suficiente..");
            // SI LA ENERGIA ES SUFICIENTE, SE CONSUME, Y LOS DISPOSITIVOS PUEDEN DAÑARSE
            }else{
                j.getArmadura().getCasco().usarSintetizador("Propulsandose ..");
                j.getArmadura().getGenerador().setEnergia(j.getArmadura().getGenerador().getEnergia() - energiaGastada);
                boolean botaIzqRota = false, botaDerRota = false;
                switch(modo){
                    case 1:
                        botaIzqRota = j.getArmadura().getBotaIzq().dañarse();
                        break;
                    case 2:
                        botaDerRota = j.getArmadura().getBotaDer().dañarse();
                        break;
                    case 3:
                        botaIzqRota = j.getArmadura().getBotaIzq().dañarse();
                        botaDerRota = j.getArmadura().getBotaDer().dañarse();
                        break;
                }
                if(botaDerRota && botaIzqRota){
                    j.getArmadura().getCasco().usarSintetizador("Ambas botas han quedado dañadas!");
                }else if(botaDerRota || botaIzqRota){
                    if(botaIzqRota){
                        j.getArmadura().getCasco().usarSintetizador("Bota izquierda ha quedado dañada!");
                    }
                    if(botaDerRota){
                        j.getArmadura().getCasco().usarSintetizador("Bota derecha ha quedado dañada!");
                    }
                }
                j.getArmadura().getCasco().usarConsola("Energia consumida = - %"+(energiaGastada/j.getArmadura().getGenerador().getEnergiaMax())*100);
            }
        }
    }

// • Al utilizar los guantes como armas el consumo se triplica durante el tiempo del disparo. (GUANTES: x3 x3) (x6)
    public void disparar(Jarvis j, int tiempo) {
        j.getArmadura().getCasco().usarSintetizador("Inciando disparar ..");
        float energiaGastada = 0;
        int modo = 0;
        if(j.getArmadura().getGuanteDer().isDañado() && j.getArmadura().getGuanteIzq().isDañado()){
            j.getArmadura().getCasco().usarSintetizador("Imposible realizar acción.. ambos guantes fallan.");
        }else if(j.getArmadura().getGuanteDer().isDañado() || j.getArmadura().getGuanteIzq().isDañado()){
            if(j.getArmadura().getGuanteDer().isDañado()){
                modo = 1;
                j.getArmadura().getCasco().usarSintetizador("Guante derecho esta fallando, encendiendo guante izquierdo ..");
                energiaGastada += j.getArmadura().getGuanteIzq().usar(6, tiempo);
            }else{
                modo = 2;
                j.getArmadura().getCasco().usarSintetizador("Guante izquierdo esta fallando, encendiendo guante derecho ..");
                energiaGastada += j.getArmadura().getGuanteDer().usar(6, tiempo);
            }
        // SI AMBOS GUANTES ESTAN FUNCIONANDO CORRECTAMENTE
        }else{  
            modo = 3;
            j.getArmadura().getCasco().usarSintetizador("Ambos guantes parecen funcionar, encendiendo..");
            energiaGastada += j.getArmadura().getGuanteIzq().usar(3, tiempo) + j.getArmadura().getGuanteDer().usar(3, tiempo);
        }
        if(modo != 0){
            // SI LA ENERGIA A GASTAR ES MAYOR QUE LA ENERGIA DISPONIBLE
            if(energiaGastada>j.getArmadura().getGenerador().getEnergia()){
                j.getArmadura().getCasco().usarSintetizador("Imposible completar accion! No queda energia suficiente..");
            // SI LA ENERGIA ES SUFICIENTE, SE CONSUME, Y LOS DISPOSITIVOS PUEDEN DAÑARSE
            }else{
                j.getArmadura().getCasco().usarSintetizador("Disparando ..");
                j.getArmadura().getGenerador().setEnergia(j.getArmadura().getGenerador().getEnergia() - energiaGastada);
                boolean guanteIzqRoto = false, guanteDerRoto = false;
                switch(modo){
                    case 1:
                        guanteIzqRoto = j.getArmadura().getGuanteIzq().dañarse();
                        break;
                    case 2:
                        guanteDerRoto = j.getArmadura().getGuanteDer().dañarse();
                        break;
                    case 3:
                        guanteIzqRoto = j.getArmadura().getGuanteIzq().dañarse();
                        guanteDerRoto = j.getArmadura().getGuanteDer().dañarse();
                        break;
                }
                if(guanteDerRoto && guanteIzqRoto){
                    j.getArmadura().getCasco().usarSintetizador("Ambos guantes han quedado dañados!");
                }else if(guanteDerRoto || guanteIzqRoto){
                    if(guanteIzqRoto){
                        j.getArmadura().getCasco().usarSintetizador("Guante izquierdo ha quedado dañado!");
                    }
                    if(guanteDerRoto){
                        j.getArmadura().getCasco().usarSintetizador("Guante derecho ha quedado dañado!");
                    }
                }
                j.getArmadura().getCasco().usarConsola("Energia consumida = - %"+(energiaGastada/j.getArmadura().getGenerador().getEnergiaMax())*100);
            }
        }
    }


// • Al volar la armadura hará un uso intensivo(x3) de las botas y de los guantes un uso normal(x2)
//   consumiendo el triple de la energía establecida para las botas y el doble para los guantes.
                                    // (GUANTES: x2 x2) (x4) (BOTAS: x3 x3) (x6)
    public void volar(Jarvis j, int tiempo) {
        j.getArmadura().getCasco().usarSintetizador("Inciando volar ..");
        float energiaConsumida = 0;
        int modoGuantes = 0, modoBotas = 0;
        // SI TODAS LAS PIEZAS ESTAN DAÑADAS
        if(j.getArmadura().getGuanteDer().isDañado() && j.getArmadura().getGuanteIzq().isDañado() && j.getArmadura().getBotaDer().isDañado() && j.getArmadura().getBotaIzq().isDañado()){ 
            j.getArmadura().getCasco().usarSintetizador("Imposible realizar accion.. ambos guantes y botas fallan.");
        // SI ALGUNA DE LAS 4 PIEZAS ESTA DAÑADA
        }else if(j.getArmadura().getGuanteDer().isDañado() || j.getArmadura().getGuanteIzq().isDañado() || j.getArmadura().getBotaDer().isDañado() || j.getArmadura().getBotaIzq().isDañado()){
            // SI ALGUNO DE LOS GUANTES FALLAN
            if(j.getArmadura().getGuanteDer().isDañado() || j.getArmadura().getGuanteIzq().isDañado()){
                // SI EL GUANTE DERECHO FALLA
                if(j.getArmadura().getGuanteDer().isDañado()){
                    j.getArmadura().getCasco().usarSintetizador("Guante derecho está fallando..");
                }else{
                    modoGuantes = 2;
                    j.getArmadura().getCasco().usarSintetizador("Guante derecho encendido.");
                    energiaConsumida += j.getArmadura().getGuanteDer().usar(4, tiempo);
                }
                // SI EL GUANTE IZQUIERDO FALLA
                if(j.getArmadura().getGuanteIzq().isDañado()){
                    j.getArmadura().getCasco().usarSintetizador("Guante izquierdo esta fallando..");
                }else{
                    modoGuantes = 1;
                    j.getArmadura().getCasco().usarSintetizador("Guante izquierdo encendido.");
                    energiaConsumida += j.getArmadura().getGuanteIzq().usar(4, tiempo);
                }
            // SI LOS 2 GUANTES FUNCIONAN
            }else{
                modoGuantes = 3;
                j.getArmadura().getCasco().usarSintetizador("Ambos guantes se han encendido.");
                energiaConsumida += j.getArmadura().getGuanteIzq().usar(2, tiempo) + j.getArmadura().getGuanteDer().usar(2, tiempo);
            }
            // SI ALGUNA DE LAS BOTAS FALLAN
            if(j.getArmadura().getBotaDer().isDañado() || j.getArmadura().getBotaIzq().isDañado()){
                // SI LA BOTA DERECHA FALLA
                if(j.getArmadura().getBotaDer().isDañado()){
                    j.getArmadura().getCasco().usarSintetizador("Bota derecha esta fallando..");
                }else{
                    modoBotas = 2;
                    j.getArmadura().getCasco().usarSintetizador("Bota derecha encendida.");
                    energiaConsumida += j.getArmadura().getBotaDer().usar(6, tiempo);
                }
                // SI LA BOTA IZQUIERDA FALLA
                if(j.getArmadura().getBotaIzq().isDañado()){
                    j.getArmadura().getCasco().usarSintetizador("Bota izquierda esta fallando..");
                }else{
                    modoBotas = 1;
                    j.getArmadura().getCasco().usarSintetizador("Bota izquierda encendida.");
                    energiaConsumida += j.getArmadura().getBotaIzq().usar(6, tiempo);
                }
            // SI LAS 2 BOTAS FUNCIONAN
            }else{
                modoBotas = 3;
                j.getArmadura().getCasco().usarSintetizador("Ambas botas se han encendido.");
                energiaConsumida += j.getArmadura().getBotaIzq().usar(3, tiempo) + j.getArmadura().getBotaDer().usar(3, tiempo);
            }
        // SI TODAS LAS PIEZAS ESTAN FUNCIONANDO CORRECTAMENTE
        } else {  
            j.getArmadura().getCasco().usarSintetizador("Ambos guantes y botas parecen funcionar, encendiendo..");
            energiaConsumida += j.getArmadura().getGuanteIzq().usar(2, tiempo) + j.getArmadura().getGuanteDer().usar(2, tiempo) + j.getArmadura().getBotaIzq().usar(3, tiempo) + j.getArmadura().getBotaDer().usar(3, tiempo);
        }

        boolean botaIzqRota = false, botaDerRota = false;
        boolean guanteIzqRoto = false, guanteDerRoto = false;
        // SI AL MENOS 1 GUANTE Y 1 BOTA ESTAN ENCENDIDOS
        if(modoBotas != 0 && modoGuantes != 0){
            // SI LA ENERGIA A GASTAR ES MAYOR QUE LA ENERGIA DISPONIBLE
            if(energiaConsumida>j.getArmadura().getGenerador().getEnergia()){
                j.getArmadura().getCasco().usarSintetizador("Imposible completar accion! No queda energia suficiente..");
            // SI LA ENERGIA ES SUFICIENTE, SE CONSUME, Y LOS DISPOSITIVOS PUEDEN DAÑARSE
            }else{
                j.getArmadura().getCasco().usarSintetizador("Volando ..");
                j.getArmadura().getGenerador().setEnergia(j.getArmadura().getGenerador().getEnergia() - energiaConsumida);
                switch(modoGuantes){
                    case 1:
                        guanteIzqRoto = j.getArmadura().getGuanteIzq().dañarse();
                        break;
                    case 2:
                        guanteDerRoto = j.getArmadura().getGuanteDer().dañarse();
                        break;
                    case 3:
                        guanteIzqRoto = j.getArmadura().getGuanteIzq().dañarse();
                        guanteDerRoto = j.getArmadura().getGuanteDer().dañarse();
                        break;
                }
                if(guanteDerRoto && guanteIzqRoto){ 
                    j.getArmadura().getCasco().usarSintetizador("Ambos guantes han quedado dañados!");
                }else if(guanteDerRoto || guanteIzqRoto){ 
                    if(guanteIzqRoto){  
                        j.getArmadura().getCasco().usarSintetizador("Guante izquierdo ha quedado dañado!");
                    }
                    if(guanteDerRoto){
                        j.getArmadura().getCasco().usarSintetizador("Guante derecho ha quedado dañado!");
                    }
                }
                switch(modoBotas){ 
                    case 1:
                        botaIzqRota = j.getArmadura().getBotaIzq().dañarse();
                        break;
                    case 2:
                        botaDerRota = j.getArmadura().getBotaDer().dañarse();
                        break;
                    case 3:
                        botaIzqRota = j.getArmadura().getBotaIzq().dañarse();
                        botaDerRota = j.getArmadura().getBotaDer().dañarse();
                        break;
                }
                if(botaDerRota && botaIzqRota){
                    j.getArmadura().getCasco().usarSintetizador("Ambas botas han quedado dañadas!");
                }else if(botaDerRota || botaIzqRota){ 
                    if(botaIzqRota){    
                        j.getArmadura().getCasco().usarSintetizador("Bota izquierda ha quedado dañada!");
                    }
                    if(botaDerRota){
                        j.getArmadura().getCasco().usarSintetizador("Bota derecha ha quedado dañada!");
                    }
                }
                j.getArmadura().getCasco().usarConsola("Energia consumida = - %"+(energiaConsumida/j.getArmadura().getGenerador().getEnergiaMax())*100);
            }
        // SI 2 BOTAS FALLAN O 2 GUANTES FALLAN
        }else{
            j.getArmadura().getCasco().usarSintetizador("Imposible iniciar vuelo! Requiere al menos 1 guante y 1 bota funcional ..");
        }
    }

// Mostrando Estado
// Hacer un método que JARVIS muestre el estado de todos los dispositivos y toda la información de
// la Armadura.

    public void mostrarEstado(Jarvis j){
        j.getArmadura().getCasco().usarConsola("-Mostrando Estado-\n"+j.getArmadura().toString());
    }

// Estado de la Batería
// Hacer un método para que JARVIS informe el estado de la batería en porcentaje a través de la
// consola. Ejecutar varias acciones y mostrar el estado de la misma.

    public void estadoBateria(Jarvis j){
        j.getArmadura().getCasco().usarConsola("-Estado de la Batería-\nEnergía del reactor = "+(j.getArmadura().getGenerador().getEnergia()/Float.MAX_VALUE)*100+"%");
    }

// Mostrar Información del Reactor
// Hacer un método para que JARVIS informe el estado del reactor en otras dos unidades de
// medida. Hay veces en las que Tony tiene pretensiones extrañas. Buscar en Wikipedia la tabla de
// transformaciones.

    public void informacionReactor(Jarvis j){
        float joules = j.getArmadura().getGenerador().getEnergia();
        float ergios = joules * (float) Math.pow(10, 7);
        j.getArmadura().getCasco().usarConsola("-Mostrar información del Reactor-\nEnergía del reactor en Joules = "+joules+" J.\nEnergia del reactor en Ergios = "+ergios+" erg.");
    }

// Revisando Dispositivos
// Los dispositivos son revisados por JARVIS para ver si se encuentran dañados. En caso de
// encontrar un dispositivo dañado se debe intentar arreglarlo de manera insistente. Para esos
// intentos hay un 30% de posibilidades de que el dispositivo quede destruido, pero se deberá
// intentar arreglarlo hasta que lo repare, o bien hasta que quede destruido.
// Hacer un método llamado revisarDispositivos() que efectúe lo anteriormente descrito, el
// mecanismo insistente debe efectuarlo con un bucle do while.

    // Reparando Daños
    // Hay veces que se puede reparar los daños de un dispositivo, en general es el 40% de las veces
    // que se puede hacer. Utilizar la clase Random para modelar este comportamiento. En caso de estar
    // dentro de la probabilidad (es decir probabilidad menor o igual al 40%) marcar el dispositivo como
    // sano. Si no dejarlo dañado.

    public void revisandoDispositivos(Jarvis j){
        Armadura a = j.getArmadura();
        j.getArmadura().getCasco().usarConsola("-Revisando dispositivos-");
        boolean consolaDañada = false, sintetizadorDañado = false;
        boolean guanteDerDañado = false, guanteIzqDañado = false;
        boolean botaDerDañada = false, botaIzqDañada = false;
        if(a.getCasco().isDañado() || a.getBotaDer().isDañado() || a.getBotaIzq().isDañado() || a.getGuanteDer().isDañado() || a.getGuanteIzq().isDañado()){
            j.getArmadura().getCasco().usarSintetizador("Se han detectado piezas daniadas...");
            // SI LA CONSOLA Y EL SINTETIZADOR ESTAN DAÑADOS
            if(a.getCasco().getConsola().isDañado() && a.getCasco().getSintetizador().isDañado()){
                j.getArmadura().getCasco().usarConsola("- CASCO => [CONSOLA] [SINTETIZADOR] DANIADOS");
                consolaDañada = true;
                sintetizadorDañado = true;
            // SINO, SI LA CONSOLA O EL SINTETIZADOR ESTA DAÑADO
            }else if(a.getCasco().getConsola().isDañado() || a.getCasco().getSintetizador().isDañado()){
                if(a.getCasco().getConsola().isDañado()){
                    j.getArmadura().getCasco().usarConsola("- CASCO => [CONSOLA] DANIADO");
                    consolaDañada = true;
                }else{
                    j.getArmadura().getCasco().usarConsola("- CASCO => [SINTETIZADOR] DANIADO");
                    sintetizadorDañado = true;
                }
            }
            if(a.getGuanteDer().isDañado() && a.getGuanteIzq().isDañado()){
                j.getArmadura().getCasco().usarConsola("- GUANTES => [DERECHO] [IZQUIERDO] DANIADOS");
                guanteDerDañado = true;
                guanteIzqDañado = true;
            }else if(a.getGuanteDer().isDañado() || a.getGuanteIzq().isDañado()){
                if(a.getGuanteDer().isDañado()){
                    j.getArmadura().getCasco().usarConsola("- GUANTE => [DERECHO] DANIADO");
                    guanteDerDañado = true;
                }else{
                    j.getArmadura().getCasco().usarConsola("- GUANTE => [IZQUIERDO] DANIADO");
                    guanteIzqDañado = true;
                }
            }
            if(a.getBotaDer().isDañado() && a.getBotaIzq().isDañado()){
                j.getArmadura().getCasco().usarConsola("- BOTAS => [DERECHA] [IZQUIERDA] DANIADAS");
                botaDerDañada = true;
                botaIzqDañada = true;
            }else if(a.getBotaDer().isDañado() || a.getBotaIzq().isDañado()){
                if(a.getBotaDer().isDañado()){
                    j.getArmadura().getCasco().usarConsola("- BOTA => [DERECHA] DANIADA");
                    botaDerDañada = true;
                }else{
                    j.getArmadura().getCasco().usarConsola("- BOTA => [IZQUIERDA] DANIADA");
                    botaIzqDañada = true;
                }
            }
            // --------------------------------------------------------------------------
            if(consolaDañada){
                j.getArmadura().getCasco().usarConsola("- Reparando [Consola]");
                // MIENTRAS LA CONSOLA ESTE DAÑADA PERO NO DESTRUIDA
                do{
                    int probabilidad = new Random().nextInt(100)+1; // 1 - 100 
                    if(probabilidad >= 61){ // SE REPARA
                        j.getArmadura().getCasco().getConsola().setDañado(false);
                        j.getArmadura().getCasco().usarSintetizador("La Consola ha sido reparada!");
                    // }else if(probabilidad <= 30){   // SE DESTRUYE
                    //     j.getArmadura().getCasco().getConsola().setDestruido(true);
                    //     j.getArmadura().getCasco().usarSintetizador("La Consola ha quedado destruida!");
                    }else{
                        j.getArmadura().getCasco().usarConsola("Reintentando..");
                    }
                }while(j.getArmadura().getCasco().getConsola().isDañado() && !j.getArmadura().getCasco().getConsola().isDestruido());
            }
            if(sintetizadorDañado){
                c.mostrar("- Reparando [Sintetizador]");
                // MIENTRAS EL SINTETIZADOR ESTE DAÑADO PERO NO DESTRUIDO
                do{
                    int probabilidad = new Random().nextInt(100)+1; // 1 - 100 
                    if(probabilidad >= 61){ // SE REPARA
                        j.getArmadura().getCasco().getSintetizador().setDañado(false);
                        s.susurrar("El Sintetizador ha sido reparado!");
                    // }else if(probabilidad <= 30){   // SE DESTRUYE
                    //     j.getArmadura().getCasco().getConsola().setDestruido(true);
                    //     j.getArmadura().getCasco().usarSintetizador("La Consola ha quedado destruida!");
                    }else{
                        c.mostrar("Reintentando..");
                    }
                }while(j.getArmadura().getCasco().getSintetizador().isDañado() && !j.getArmadura().getCasco().getSintetizador().isDestruido());
            }
            // SI AMBOS GUANTES ESTAN DAÑADOS
            if(guanteDerDañado && guanteIzqDañado){ 
                c.mostrar("- Reparando [Guantes]");
                // MIENTRAS EL GUANTE DER ESTE DAÑADO PERO NO DESTRUIDO
                do{
                    int probabilidad = new Random().nextInt(100)+1; // 1 - 100 
                    if(probabilidad >= 61){ // SE REPARA
                        j.getArmadura().getGuanteDer().getRepulsor().setDañado(false);
                        s.susurrar("El guante derecho ha sido reparado!");
                    }else if(probabilidad <= 30){   // SE DESTRUYE
                        j.getArmadura().getGuanteDer().getRepulsor().setDestruido(true);
                        s.susurrar("Error grave! El guante derecho se ha destruido!");
                    }else{
                        c.mostrar("Reintentando..");
                    }
                }while(j.getArmadura().getGuanteDer().isDañado() && !j.getArmadura().getGuanteDer().isDestruido());
                // MIENTRAS EL GUANTE IZQ ESTE DAÑADO PERO NO DESTRUIDO
                do{
                    int probabilidad = new Random().nextInt(100)+1; // 1 - 100 
                    if(probabilidad >= 61){ // SE REPARA
                        j.getArmadura().getGuanteIzq().getRepulsor().setDañado(false);
                        s.susurrar("El guante izquierdo ha sido reparado!");
                    }else if(probabilidad <= 30){   // SE DESTRUYE
                        j.getArmadura().getGuanteIzq().getRepulsor().setDestruido(true);
                        s.susurrar("Error grave! El guante izquierdo se ha destruido!");
                    }else{
                        c.mostrar("Reintentando..");
                    }
                }while(j.getArmadura().getGuanteIzq().isDañado() && !j.getArmadura().getGuanteIzq().isDestruido());
            // SINO, SI ALGUNO DE LOS GUANTES ESTA DAÑADO
            }else if(guanteDerDañado || guanteIzqDañado){ 
                // GUANTE DER
                if(guanteDerDañado){
                    c.mostrar("- Reparando [Guante Derecho]"); 
                    do{
                        int probabilidad = new Random().nextInt(100)+1; // 1 - 100 
                        if(probabilidad >= 61){ // SE REPARA
                            j.getArmadura().getGuanteDer().getRepulsor().setDañado(false);
                            s.susurrar("El guante derecho ha sido reparado!");
                        }else if(probabilidad <= 30){   // SE DESTRUYE
                            j.getArmadura().getGuanteDer().getRepulsor().setDestruido(true);
                            s.susurrar("Error grave! El guante derecho se ha destruido!");
                        }else{
                            c.mostrar("Reintentando..");
                        }
                    }while(j.getArmadura().getGuanteDer().isDañado() && !j.getArmadura().getGuanteDer().isDestruido());
                // GUANTE IZQ
                }else{
                    c.mostrar("- Reparando [Guante Izquierdo]");
                    do{
                        int probabilidad = new Random().nextInt(100)+1; // 1 - 100 
                        if(probabilidad >= 61){ // SE REPARA
                            j.getArmadura().getGuanteIzq().getRepulsor().setDañado(false);
                            s.susurrar("El guante izquierdo ha sido reparado!");
                        }else if(probabilidad <= 30){   // SE DESTRUYE
                            j.getArmadura().getGuanteIzq().getRepulsor().setDestruido(true);
                            s.susurrar("Error grave! El guante izquierdo se ha destruido!");
                        }else{
                            c.mostrar("Reintentando..");
                        }
                    }while(j.getArmadura().getGuanteIzq().isDañado() && !j.getArmadura().getGuanteIzq().isDestruido());
                }
            }
            // SI AMBAS BOTAS ESTAN DAÑADAS
            if(botaDerDañada && botaIzqDañada){
                c.mostrar("- Reparando [Botas]");
                // MIENTRAS LA BOTA DER. ESTE DAÑADA PERO NO DESTRUIDA
                do{
                    int probabilidad = new Random().nextInt(100)+1; // 1 - 100 
                    if(probabilidad >= 61){ // SE REPARA
                        j.getArmadura().getBotaDer().getPropulsor().setDañado(false);
                        s.susurrar("La bota derecha ha sido reparada!");
                    }else if(probabilidad <= 30){   // SE DESTRUYE
                        j.getArmadura().getBotaDer().getPropulsor().setDestruido(true);
                        s.susurrar("Error grave! La bota derecha se ha destruido!");
                    }else{
                        c.mostrar("Reintentando..");
                    }
                }while(j.getArmadura().getBotaDer().isDañado() && !j.getArmadura().getBotaDer().isDestruido());
                // MIENTRAS LA BOTA IZQ. ESTE DAÑADA PERO NO DESTRUIDA
                do{
                    int probabilidad = new Random().nextInt(100)+1; // 1 - 100 
                    if(probabilidad >= 61){ // SE REPARA
                        j.getArmadura().getBotaIzq().getPropulsor().setDañado(false);
                        s.susurrar("La bota izquierda ha sido reparada!");
                    }else if(probabilidad <= 30){   // SE DESTRUYE
                        j.getArmadura().getBotaIzq().getPropulsor().setDestruido(true);
                        s.susurrar("Error grave! La bota izquierda se ha destruido!");
                    }else{
                        c.mostrar("Reintentando..");
                    }
                }while(j.getArmadura().getBotaIzq().isDañado() && !j.getArmadura().getBotaIzq().isDestruido());
            // SINO, SI ALGUNAS DE LAS BOTAS ESTA DAÑADA
            }else if(botaDerDañada || botaIzqDañada){
                if(botaDerDañada){
                    c.mostrar("- Reparando [Bota Derecha]");
                    // MIENTRAS LA BOTA DER. ESTE DAÑADA PERO NO DESTRUIDA
                    do{
                        int probabilidad = new Random().nextInt(100)+1; // 1 - 100 
                        if(probabilidad >= 61){ // SE REPARA
                            j.getArmadura().getBotaDer().getPropulsor().setDañado(false);
                            s.susurrar("La bota derecha ha sido reparada!");
                        }else if(probabilidad <= 30){   // SE DESTRUYE
                            j.getArmadura().getBotaDer().getPropulsor().setDestruido(true);
                            s.susurrar("Error grave! La bota derecha se ha destruido!");
                        }else{
                            c.mostrar("Reintentando..");
                        }
                    }while(j.getArmadura().getBotaDer().isDañado() && !j.getArmadura().getBotaDer().isDestruido());
                }else{
                    c.mostrar("- Reparando [Bota Izquierda]");
                    // MIENTRAS LA BOTA IZQ. ESTE DAÑADA PERO NO DESTRUIDA
                    do{
                        int probabilidad = new Random().nextInt(100)+1; // 1 - 100 
                        if(probabilidad >= 61){ // SE REPARA
                            j.getArmadura().getBotaIzq().getPropulsor().setDañado(false);
                            s.susurrar("La bota izquierda ha sido reparada!");
                        }else if(probabilidad <= 30){   // SE DESTRUYE
                            j.getArmadura().getBotaIzq().getPropulsor().setDestruido(true);
                            s.susurrar("Error grave! La bota izquierda se ha destruido!");
                        }else{
                            c.mostrar("Reintentando..");
                        }
                    }while(j.getArmadura().getBotaIzq().isDañado() && !j.getArmadura().getBotaIzq().isDestruido());
                }
            }
            c.mostrar("-Reparacion Finalizada-");
        }else{
            s.susurrar("Todas las piezas de la armadura parecen estar funcionando correctamente!");
        }
    }

// Simulador
// Hacer un método en JARVIS que agregue en radar objetos, hacer que la resistencia, las
// coordenadas y la hostilidad sean aleatorios utilizando la clase random. Utilizar la clase Random.
    // -- ¿Qué ocurre si quiero añadir más de 10 objetos?
    // -- ¿Qué ocurre si cuando llevo 8 enemigos aumento la capacidad del vector?

    public void iniciarSimulador(Jarvis j){

        j.setRadar(new Radar());

        j.getArmadura().getCasco().usarConsola("- Inciando simulador de combate -");
        int cantObj;
        do {
            try {
                System.out.print("Ingrese cantidad de objetivos hostiles => ");
                cantObj = read.nextInt();
                read.nextLine();
                if(cantObj>499999){
                    System.out.println("Cantidad de objetivos mayor al soportado por el simulador.");
                }else{
                    break;
                }
            } catch(InputMismatchException e){
                System.out.println("Error: La entrada debe ser un número entero válido.");
                read.nextLine();
            }
        }while(true);
        int cantAmi = cantObj / 2;
        
        
        /////////////////////////////////////////////////////////////////////////////////////

    }

}