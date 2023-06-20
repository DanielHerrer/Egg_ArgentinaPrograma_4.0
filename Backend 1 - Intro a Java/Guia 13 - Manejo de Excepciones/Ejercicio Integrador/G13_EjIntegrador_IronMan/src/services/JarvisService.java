package services;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import entities.Jarvis;
import entities.armadura.Armadura;
import entities.armadura.piezas.dispositivos.*;
import entities.radar.Objetivo;
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
        
        iniciarSimulador(jarvis);
    }

    public void menuJarvis(Jarvis jarvis){
        boolean salir = false;
        do{
            System.out.println("-----------------------------------------------------------");
            jarvis.getArmadura().getCasco().usarConsola("- MENU JARVIS -" +
                                                        "\n1. Mostrar estado de la armadura" +
                                                        "\n2. Mostrar estado de la bateria" +
                                                        "\n3. Informacion del reactor" +
                                                        "\n4. Revisar dispositivos y daños" +
                                                        "\n5. Volver");
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
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }while(!salir);
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
    public void caminar(Jarvis j) {
        j.getArmadura().getCasco().usarSintetizador("Iniciando caminar ..");
        float energiaActual = j.getArmadura().getGenerador().getEnergia();
        float energiaGastada = 0;
        int modo = 0;

        int[] posicionesCam = elegirCoordenadas();
        while(j.getRadar().posicionOcupada(posicionesCam)){
            j.getArmadura().getCasco().usarSintetizador("Las coordenadas indicadas estan ocupadas!");
            posicionesCam = elegirCoordenadas();
        }
        int xViajeCam = Math.abs(posicionesCam[0] - j.getRadar().getPosiciones()[0]);                    
        int yViajeCam = Math.abs(posicionesCam[1] - j.getRadar().getPosiciones()[1]);                    
        int zViajeCam = Math.abs(posicionesCam[2] - j.getRadar().getPosiciones()[2]);                    
        int distanciaKmCam = xViajeCam + yViajeCam + zViajeCam;

        j.getArmadura().getCasco().usarConsola("Preparando sistemas para caminar "+distanciaKmCam+" km");
        float tiempoMin = 0;

        // SI FALLAN LAS 2 BOTAS
        if(j.getArmadura().getBotaDer().isDañado() && j.getArmadura().getBotaIzq().isDañado()){
            j.getArmadura().getCasco().usarSintetizador("Imposible realizar accion.. ambas botas fallan.");
        // SI SOLO FALLA UNA DE LAS 2 BOTAS
        }else if(j.getArmadura().getBotaDer().isDañado() || j.getArmadura().getBotaIzq().isDañado()){
            if(j.getArmadura().getBotaDer().isDañado()){
                modo = 1;
                j.getArmadura().getCasco().usarSintetizador("Bota derecha esta fallando, encendiendo bota izquierda ..");
                tiempoMin = (float) (distanciaKmCam / 0.5); // 0.5km por minuto
                energiaGastada += j.getArmadura().getBotaIzq().usar(2, tiempoMin);
            }else{
                modo = 2;
                j.getArmadura().getCasco().usarSintetizador("Bota izquierda esta fallando, encendiendo bota derecha ..");
                tiempoMin = (float) (distanciaKmCam / 0.5); // 0.5km por minuto
                energiaGastada += j.getArmadura().getBotaDer().usar(2, tiempoMin);
            }
        // SI AMBAS BOTAS ESTAN FUNCIONANDO CORRECTAMENTE
        }else{  
            modo = 3;
            j.getArmadura().getCasco().usarSintetizador("Ambas botas parecen funcionar, encendiendo..");
            tiempoMin = (float) (distanciaKmCam / 1); // 1km por minuto
            energiaGastada += j.getArmadura().getBotaIzq().usar(1, tiempoMin) + j.getArmadura().getBotaDer().usar(1, tiempoMin);
        }
        if(modo != 0){
            // SI LA ENERGIA A GASTAR ES MAYOR QUE LA ENERGIA DISPONIBLE
            if(energiaGastada>energiaActual){
                j.getArmadura().getCasco().usarSintetizador("Imposible completar accion! No queda energia suficiente..");
            // SI LA ENERGIA ES SUFICIENTE, SE CONSUME, Y LOS DISPOSITIVOS PUEDEN DAÑARSE
            }else{
                j.getArmadura().getCasco().usarSintetizador("Caminando ..");
                j.getArmadura().getCasco().usarConsola("Tiempo estimado de viaje =  ["+ tiempoMin +" minutos]");
                j.getArmadura().getGenerador().setEnergia(energiaActual - energiaGastada); // ACTUALIZA ENERGIA RESTANTE
                j.getRadar().setPosiciones(posicionesCam);  //  ACTUALIZA COORDENADAS ACTUALES
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
                j.getArmadura().getCasco().usarConsola("Energia consumida = - %"+Math.round((energiaGastada/j.getArmadura().getGenerador().getEnergiaMax())*100));
            }
        }
    }

// • Al correr la armadura hará un uso normal de las botas y se consumirá el doble de la
//   energía establecida como consumo en la bota por el tiempo en el que se corra. (BOTAS: x2 x2) (x4)
    public void correr(Jarvis j) {
        j.getArmadura().getCasco().usarSintetizador("Iniciando correr ..");
        float energiaActual = j.getArmadura().getGenerador().getEnergia();
        float energiaGastada = 0;
        int modo = 0;

        int[] posicionesCor = elegirCoordenadas();
        while(j.getRadar().posicionOcupada(posicionesCor)){
            j.getArmadura().getCasco().usarSintetizador("Las coordenadas indicadas estan ocupadas!");
            posicionesCor = elegirCoordenadas();
        }
        int xViajeCor = Math.abs(posicionesCor[0] - j.getRadar().getPosiciones()[0]);                    
        int yViajeCor = Math.abs(posicionesCor[1] - j.getRadar().getPosiciones()[1]);                    
        int zViajeCor = Math.abs(posicionesCor[2] - j.getRadar().getPosiciones()[2]);                    
        int distanciaKmCor = xViajeCor + yViajeCor + zViajeCor;

        j.getArmadura().getCasco().usarConsola("Preparando sistemas para correr "+distanciaKmCor+" km");
        float tiempoMin = 0;

        // SI FALLAN LAS 2 BOTAS
        if(j.getArmadura().getBotaDer().isDañado() && j.getArmadura().getBotaIzq().isDañado()){
            j.getArmadura().getCasco().usarSintetizador("Imposible realizar acción.. ambas botas fallan.");
        // SI SOLO FALLA UNA DE LAS 2 BOTAS
        }else if(j.getArmadura().getBotaDer().isDañado() || j.getArmadura().getBotaIzq().isDañado()){
            if(j.getArmadura().getBotaDer().isDañado()){
                modo = 1;
                j.getArmadura().getCasco().usarSintetizador("Bota derecha está fallando, encendiendo bota izquierda ..");
                tiempoMin = distanciaKmCor / 1; // 1km por minuto
                energiaGastada += j.getArmadura().getBotaIzq().usar(4, tiempoMin);
            }else{
                modo = 2;
                j.getArmadura().getCasco().usarSintetizador("Bota izquierda esta fallando, encendiendo bota derecha ..");
                tiempoMin = distanciaKmCor / 1; // 1km por minuto
                energiaGastada += j.getArmadura().getBotaDer().usar(4, tiempoMin);
            }
        // SI AMBAS BOTAS ESTAN FUNCIONANDO CORRECTAMENTE
        }else{  
            modo = 3;
            j.getArmadura().getCasco().usarSintetizador("Ambas botas parecen funcionar, encendiendo..");
            tiempoMin = distanciaKmCor / 2; // 2km por minuto
            energiaGastada += j.getArmadura().getBotaIzq().usar(2, tiempoMin) + j.getArmadura().getBotaDer().usar(2, tiempoMin);
        }
        if(modo != 0){
            // SI LA ENERGIA A GASTAR ES MAYOR QUE LA ENERGIA DISPONIBLE
            if(energiaGastada>energiaActual){
                j.getArmadura().getCasco().usarSintetizador("Imposible completar accion! No queda energia suficiente..");
            }else{
                j.getArmadura().getCasco().usarSintetizador("Corriendo ..");
                j.getArmadura().getCasco().usarConsola("Tiempo estimado de viaje =  ["+ tiempoMin +" minutos]");
                j.getArmadura().getGenerador().setEnergia(energiaActual - energiaGastada);  // ACTUALIZA ENERGIA RESTANTE
                j.getRadar().setPosiciones(posicionesCor); // ACTUALIZA COORDENADAS ACTUALES
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
                j.getArmadura().getCasco().usarConsola("Energia consumida = - %"+Math.round((energiaGastada/j.getArmadura().getGenerador().getEnergiaMax())*100));
            }
        }
    }

// • Al propulsarse la armadura hará un uso intensivo de las botas utilizando el triple de la
//   energía por el tiempo que dure la propulsión. (BOTAS: x3 x3) (x6)
    public void propulsarse(Jarvis j) {
        j.getArmadura().getCasco().usarSintetizador("Inciando propulsar ..");
        float energiaActual = j.getArmadura().getGenerador().getEnergia();
        float energiaGastada = 0;
        int modo = 0;

        int[] posicionesPro = elegirCoordenadas();
        while(j.getRadar().posicionOcupada(posicionesPro)){
            j.getArmadura().getCasco().usarSintetizador("Las coordenadas indicadas estan ocupadas!");
            posicionesPro = elegirCoordenadas();
        }
        int xViajePro = Math.abs(posicionesPro[0] - j.getRadar().getPosiciones()[0]);                    
        int yViajePro = Math.abs(posicionesPro[1] - j.getRadar().getPosiciones()[1]);                    
        int zViajePro = Math.abs(posicionesPro[2] - j.getRadar().getPosiciones()[2]);                    
        int distanciaKmPro = xViajePro + yViajePro + zViajePro;
        
        j.getArmadura().getCasco().usarConsola("Preparando sistemas para propulsarse "+distanciaKmPro+" km/s");
        float tiempoMin = 0;
        
        if(j.getArmadura().getBotaDer().isDañado() && j.getArmadura().getBotaIzq().isDañado()){
            j.getArmadura().getCasco().usarSintetizador("Imposible realizar acción.. ambas botas fallan.");
        }else if(j.getArmadura().getBotaDer().isDañado() || j.getArmadura().getBotaIzq().isDañado()){
            if(j.getArmadura().getBotaDer().isDañado()){
                modo = 1;
                j.getArmadura().getCasco().usarSintetizador("Bota derecha está fallando, encendiendo bota izquierda ..");
                tiempoMin = (float) (distanciaKmPro / 1.5); // 1.5km por minuto
                energiaGastada += j.getArmadura().getBotaIzq().usar(6, tiempoMin);
            }else{
                modo = 2;
                j.getArmadura().getCasco().usarSintetizador("Bota izquierda está fallando, encendiendo bota derecha ..");
                tiempoMin = (float) (distanciaKmPro / 1.5); // 1.5km por minuto
                energiaGastada += j.getArmadura().getBotaDer().usar(6, tiempoMin);
            }
        // SI AMBAS BOTAS ESTAN FUNCIONANDO CORRECTAMENTE
        }else{  
            modo = 3;
            j.getArmadura().getCasco().usarSintetizador("Ambas botas parecen funcionar, encendiendo..");
            tiempoMin = (float) (distanciaKmPro / 3); // 3km por minuto
            energiaGastada += j.getArmadura().getBotaIzq().usar(3, tiempoMin) + j.getArmadura().getBotaDer().usar(3, tiempoMin);
        }
        if(modo != 0){
            // SI LA ENERGIA A GASTAR ES MAYOR QUE LA ENERGIA DISPONIBLE
            if(energiaGastada>energiaActual){
                j.getArmadura().getCasco().usarSintetizador("Imposible completar accion! No queda energia suficiente..");
            // SI LA ENERGIA ES SUFICIENTE, SE CONSUME, Y LOS DISPOSITIVOS PUEDEN DAÑARSE
            }else{
                j.getArmadura().getCasco().usarSintetizador("Propulsandose ..");
                j.getArmadura().getGenerador().setEnergia(energiaActual - energiaGastada); // ACTUALIZA ENERGIA RESTANTE
                j.getArmadura().getCasco().usarConsola("Tiempo estimado de viaje =  ["+ tiempoMin +" minutos]");
                j.getRadar().setPosiciones(posicionesPro); // ACTUALIZA COORDENADAS ACTUALES
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
                j.getArmadura().getCasco().usarConsola("Energia consumida = - %"+Math.round((energiaGastada/j.getArmadura().getGenerador().getEnergiaMax())*100));
            }
        }
    }

// • Al utilizar los guantes como armas el consumo se triplica durante el tiempo del disparo. (GUANTES: x3 x3) (x6)
    public void disparar(Jarvis j) {
        j.getArmadura().getCasco().usarSintetizador("Inciando disparar ..");

        int[] posicionesDis;
        int xViajeDis;                    
        int yViajeDis;                    
        int zViajeDis;
        int distanciaKmDis;
        Objetivo objetivo;

        while(true){
            posicionesDis = elegirCoordenadas();
            if(!j.getRadar().posicionOcupada(posicionesDis)){   // Si la posicion NO está ocupada por nadie
                j.getArmadura().getCasco().usarSintetizador("Las coordenadas indicadas no posee ningun objetivo!"); 
            }else if(!j.getRadar().getMapaCompleto()[posicionesDis[0]][posicionesDis[1]][posicionesDis[2]].isHostil()){ // Sino, Si la posicion contiene un objetivo NO HOSTIL
                j.getArmadura().getCasco().usarSintetizador("El objetivo indicado es aliado!");
            }else{
                objetivo = j.getRadar().getMapaCompleto()[posicionesDis[0]][posicionesDis[1]][posicionesDis[2]];
                j.getArmadura().getCasco().usarSintetizador("Objetivo hostil localizado!");
                j.getArmadura().getCasco().usarConsola("OJETIVO HOSTIL: [Resistencia = "+objetivo.getResistencia()+"]");
                xViajeDis = Math.abs(posicionesDis[0] - j.getRadar().getPosiciones()[0]);                    
                yViajeDis = Math.abs(posicionesDis[1] - j.getRadar().getPosiciones()[1]);                    
                zViajeDis = Math.abs(posicionesDis[2] - j.getRadar().getPosiciones()[2]);                    
                distanciaKmDis = xViajeDis + yViajeDis + zViajeDis;
                break;
            }
        }

        if(distanciaKmDis<=5){
            j.getArmadura().getCasco().usarConsola("Preparando sistemas para disparar a una distancia de "+distanciaKmDis+" km");

            int modo;
            float energiaActual, energiaGastada;
            int resistenciaActual = objetivo.getResistencia();
            do{
                energiaActual = j.getArmadura().getGenerador().getEnergia();
                energiaGastada = 0;
                modo = 0;

                if(j.getArmadura().getGuanteDer().isDañado() && j.getArmadura().getGuanteIzq().isDañado()){
                    j.getArmadura().getCasco().usarSintetizador("Imposible realizar acción.. ambos guantes fallan.");
                }else if(j.getArmadura().getGuanteDer().isDañado() || j.getArmadura().getGuanteIzq().isDañado()){
                    if(j.getArmadura().getGuanteDer().isDañado()){
                        modo = 1;
                        j.getArmadura().getCasco().usarSintetizador("Guante derecho esta fallando, encendiendo guante izquierdo ..");
                        energiaGastada += j.getArmadura().getGuanteIzq().usar(6);
                    }else{
                        modo = 2;
                        j.getArmadura().getCasco().usarSintetizador("Guante izquierdo esta fallando, encendiendo guante derecho ..");
                        energiaGastada += j.getArmadura().getGuanteDer().usar(6);
                    }
                // SI AMBOS GUANTES ESTAN FUNCIONANDO CORRECTAMENTE
                }else{  
                    modo = 3;
                    j.getArmadura().getCasco().usarSintetizador("Ambos guantes parecen funcionar, encendiendo..");
                    energiaGastada += j.getArmadura().getGuanteIzq().usar(3) + j.getArmadura().getGuanteDer().usar(3);
                }
                if(modo != 0){
                    // SI LA ENERGIA A GASTAR ES MAYOR QUE LA ENERGIA DISPONIBLE
                    if(energiaGastada > energiaActual){
                        j.getArmadura().getCasco().usarSintetizador("Imposible completar accion! No queda energia suficiente..");
                    // SI LA ENERGIA ES SUFICIENTE, SE CONSUME, Y LOS DISPOSITIVOS PUEDEN DAÑARSE
                    }else{ 
                        j.getArmadura().getCasco().usarSintetizador("Disparando ..");
                        j.getArmadura().getGenerador().setEnergia(energiaActual - energiaGastada);
                        
                        int danio = 20; // 20 daño maximo // por cada km de distancia -2 daño
                        if(modo == 1 || modo == 2){ // SI se está usando solo el brazo derecho O solo el brazo izquierdo
                            danio -= (distanciaKmDis * 2); // (daño - (distanciaKm * 2))
                        }else if(modo == 3){    // SINO SI se estan usando los dos brazos
                            danio -= (distanciaKmDis * 2);
                            danio *= 2; // se multiplica x2 por que se usan los 2 brazos
                        }

                        
                        resistenciaActual -= danio; // se aplica el danio
                        if(resistenciaActual < 0){  // SI la resistencia queda en menos de 0, que se convierta en 0
                            resistenciaActual = 0;
                        }

                        j.getArmadura().getCasco().usarConsola("OJETIVO HOSTIL: [Resistencia = "+resistenciaActual+"]");
                        // ---------------------------------------------------------------------------------------------------------
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
                        // -----------------------------------------------------------------------------------------------------------
                        j.getArmadura().getCasco().usarConsola("Energia consumida = - %"+Math.round((energiaGastada/j.getArmadura().getGenerador().getEnergiaMax())*100));
                    }
                }
            }while(resistenciaActual > 0 && !(modo == 0) && !(energiaActual < (j.getArmadura().getGenerador().getEnergiaMax() * 0.1))); // MIENTRAS que el objetivo esté con vida Y que los guantes esten activos Y que la energiaActual NO sea menor al 10%
            
            if(resistenciaActual == 0){
                j.getArmadura().getCasco().usarConsola("OJETIVO HOSTIL ELIMINADO");
                j.getRadar().eliminarObjetivo(objetivo);
            }else if(energiaActual < (j.getArmadura().getGenerador().getEnergiaMax() * 0.1)){
                j.getArmadura().getCasco().usarSintetizador("Activando acciones evasivas!! Te queda menos del 10% de bateria!");
                j.getArmadura().getCasco().usarConsola("Alejandose 10km de objetivos hostiles");

                /////////////////////////////////////////////////////////////// TERMINAR

            }else if(modo == 0){
                j.getArmadura().getCasco().usarConsola("Anulando ataque, ambos guantes han quedado dañados");
            }
        }else{
            j.getArmadura().getCasco().usarConsola("Anulando ataque, la distancia de alcance maximo es de 5 km");
        }
    }


// • Al volar la armadura hará un uso intensivo(x3) de las botas y de los guantes un uso normal(x2)
//   consumiendo el triple de la energía establecida para las botas y el doble para los guantes.
                                    // (GUANTES: x2 x2) (x4) (BOTAS: x3 x3) (x6)
    // VOLAR = (ambos guantes y botas) 300km por hora | 5km por minuto 
            // GUANTES 120km x hr [2km x min] | BOTAS 180km x hr [3km x min]
            // GUANTE 60km x hr [1km x min] + BOTA 90km x hr [1.5km x min] = 2.5km x min

    public void volar(Jarvis j) {
        j.getArmadura().getCasco().usarSintetizador("Inciando volar ..");
        float energiaActual = j.getArmadura().getGenerador().getEnergia();
        float energiaConsumida = 0;
        int modoGuantes = 0, modoBotas = 0;

        int[] posicionesVol = elegirCoordenadas();
        while(j.getRadar().posicionOcupada(posicionesVol)){
            j.getArmadura().getCasco().usarSintetizador("Las coordenadas indicadas estan ocupadas!");
            posicionesVol = elegirCoordenadas();
        }
        int xViajeVol = Math.abs(posicionesVol[0] - j.getRadar().getPosiciones()[0]);                    
        int yViajeVol = Math.abs(posicionesVol[1] - j.getRadar().getPosiciones()[1]);                    
        int zViajeVol = Math.abs(posicionesVol[2] - j.getRadar().getPosiciones()[2]);                    
        int distanciaKmVol = xViajeVol + yViajeVol + zViajeVol;
        
        j.getArmadura().getCasco().usarConsola("Preparando sistemas para volar "+distanciaKmVol+" km");
        float tiempoMin = 0;
        
        j.getRadar().setPosiciones(posicionesVol);

        // 5km x min | 3.5km x min | 4km x min | 2.5km x min

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
                    tiempoMin = distanciaKmVol / 1;
                    energiaConsumida += j.getArmadura().getGuanteDer().usar(4, tiempoMin);
                }
                // SI EL GUANTE IZQUIERDO FALLA
                if(j.getArmadura().getGuanteIzq().isDañado()){
                    j.getArmadura().getCasco().usarSintetizador("Guante izquierdo esta fallando..");
                }else{
                    modoGuantes = 1;
                    j.getArmadura().getCasco().usarSintetizador("Guante izquierdo encendido.");
                    tiempoMin = distanciaKmVol / 1;
                    energiaConsumida += j.getArmadura().getGuanteIzq().usar(4, tiempoMin);
                }
            // SI LOS 2 GUANTES FUNCIONAN
            }else{
                modoGuantes = 3;
                j.getArmadura().getCasco().usarSintetizador("Ambos guantes se han encendido.");
                tiempoMin = distanciaKmVol / 2;
                energiaConsumida += j.getArmadura().getGuanteIzq().usar(2, tiempoMin) + j.getArmadura().getGuanteDer().usar(2, tiempoMin);
            }
            // SI ALGUNA DE LAS BOTAS FALLAN
            if(j.getArmadura().getBotaDer().isDañado() || j.getArmadura().getBotaIzq().isDañado()){
                // SI LA BOTA DERECHA FALLA
                if(j.getArmadura().getBotaDer().isDañado()){
                    j.getArmadura().getCasco().usarSintetizador("Bota derecha esta fallando..");
                }else{
                    modoBotas = 2;
                    j.getArmadura().getCasco().usarSintetizador("Bota derecha encendida.");
                    tiempoMin = (float) (distanciaKmVol / 1.5);
                    energiaConsumida += j.getArmadura().getBotaDer().usar(6, tiempoMin);
                }
                // SI LA BOTA IZQUIERDA FALLA
                if(j.getArmadura().getBotaIzq().isDañado()){
                    j.getArmadura().getCasco().usarSintetizador("Bota izquierda esta fallando..");
                }else{
                    modoBotas = 1;
                    j.getArmadura().getCasco().usarSintetizador("Bota izquierda encendida.");
                    tiempoMin = (float) (distanciaKmVol / 1.5);
                    energiaConsumida += j.getArmadura().getBotaIzq().usar(6, tiempoMin);
                }
            // SI LAS 2 BOTAS FUNCIONAN
            }else{
                modoBotas = 3;
                j.getArmadura().getCasco().usarSintetizador("Ambas botas se han encendido.");
                tiempoMin = (float) (distanciaKmVol / 3);
                energiaConsumida += j.getArmadura().getBotaIzq().usar(3, tiempoMin) + j.getArmadura().getBotaDer().usar(3, tiempoMin);
            }
        // SI TODAS LAS PIEZAS ESTAN FUNCIONANDO CORRECTAMENTE
        } else {  
            modoBotas = 3;
            modoGuantes = 3;
            j.getArmadura().getCasco().usarSintetizador("Ambos guantes y botas parecen funcionar, encendiendo..");
            tiempoMin = (float) (distanciaKmVol / 5);
            energiaConsumida += j.getArmadura().getGuanteIzq().usar(2, tiempoMin) + j.getArmadura().getGuanteDer().usar(2, tiempoMin) + j.getArmadura().getBotaIzq().usar(3, tiempoMin) + j.getArmadura().getBotaDer().usar(3, tiempoMin);
        }

        boolean botaIzqRota = false, botaDerRota = false;
        boolean guanteIzqRoto = false, guanteDerRoto = false;
        // SI AL MENOS 1 GUANTE Y 1 BOTA ESTAN ENCENDIDOS
        if(modoBotas != 0 && modoGuantes != 0){
            // SI LA ENERGIA A GASTAR ES MAYOR QUE LA ENERGIA DISPONIBLE
            if(energiaConsumida > energiaActual){
                j.getArmadura().getCasco().usarSintetizador("Imposible completar accion! No queda energia suficiente..");
            // SI LA ENERGIA ES SUFICIENTE, SE CONSUME, Y LOS DISPOSITIVOS PUEDEN DAÑARSE
            }else{
                j.getArmadura().getCasco().usarSintetizador("Volando ..");
                j.getArmadura().getCasco().usarConsola("Tiempo estimado de viaje =  ["+ tiempoMin +" minutos]");

                j.getArmadura().getGenerador().setEnergia(energiaActual - energiaConsumida);
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
                j.getArmadura().getCasco().usarConsola("Energia consumida = - %"+Math.round((energiaConsumida/j.getArmadura().getGenerador().getEnergiaMax())*100));
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
        j.getArmadura().getCasco().usarConsola("-Estado de la Batería-\nEnergía del reactor = "+Math.round((j.getArmadura().getGenerador().getEnergia()/j.getArmadura().getGenerador().getEnergiaMax())*100)+"%");
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

        // SI ALGUNA PIEZA ESTA DAÑADA
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
            // if(a.getGuanteDer().isDestruido() && a.getGuanteIzq().isDestruido()){
            //     j.getArmadura().getCasco().usarConsola("- GUANTES => [DERECHO] [IZQUIERDO] DESTRUIDOS");
            // }
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

            // -----------------------------------------------------------------------------------------------------------------------

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
                        j.getArmadura().getGuanteDer().getRepulsor().setDañado(false);
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
                        j.getArmadura().getGuanteIzq().getRepulsor().setDañado(false);
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
                            j.getArmadura().getGuanteDer().getRepulsor().setDañado(false);
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
                            j.getArmadura().getGuanteIzq().getRepulsor().setDañado(false);
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
                        j.getArmadura().getBotaDer().getPropulsor().setDañado(false);
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
                        j.getArmadura().getBotaIzq().getPropulsor().setDañado(false);
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
                            j.getArmadura().getBotaDer().getPropulsor().setDañado(false);
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
                            j.getArmadura().getBotaIzq().getPropulsor().setDañado(false);
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

        int cantEnemy;
        do {
            try {
                System.out.print("Ingrese cantidad de objetivos hostiles => ");
                cantEnemy = read.nextInt();
                read.nextLine();
                if(cantEnemy>50){
                    System.out.println("Cantidad de objetivos mayor al soportado por el simulador. (50)");
                }else{
                    break;
                }
            } catch(InputMismatchException e){
                System.out.println("Error: La entrada debe ser un número entero válido.");
                read.nextLine();
            }
        }while(true);
       
        for(int i=0; i<cantEnemy; i++){ 
            // mientras que la posicion asignada al objetivo ya este ocupada en el mapa
            int x,y,z;
            do{
                x = (int) (Math.random()*50);
                y = (int) (Math.random()*50);
                z = (int) (Math.random()*50);
            }while(j.getRadar().posicionOcupada(x,y,z));
            int resistencia = (int) ((Math.random() * 50) + 51);
            j.getRadar().insertarObjetivo(new Objetivo(x, y, z, resistencia, true)); // el enemigo se aloja en el mapa del radar
        }

        int cantAlly = cantEnemy/2;
        for(int i=0; i<cantAlly; i++){
            // mientras que la posicion asignada al objetivo ya este ocupada en el mapa
            int x,y,z;
            do{
                x = (int) (Math.random()*50);
                y = (int) (Math.random()*50);
                z = (int) (Math.random()*50);
            }while(j.getRadar().posicionOcupada(x,y,z));
            int resistencia = (int) ((Math.random() * 50) + 51);
            j.getRadar().insertarObjetivo(new Objetivo(x, y, z, resistencia, false)); // el aliado se aloja en el mapa del radar
        }

        j.getArmadura().getCasco().usarConsola("Mapa listo");

        boolean salir = false;
        do{
            System.out.println("-----------------------------------------------------------");
            System.out.println("OBJETIVOS : [\u001B[31mHOSTILES\u001B[0m = "+j.getRadar().getCantObjetivosHostiles()+" | \u001B[32mALIADOS\u001B[0m = "+j.getRadar().getCantObjetivosAliados()+"]\n");
            System.out.println("\u001B[31mLista objetivos hostiles:\u001B[0m\n"+j.getRadar().getListaObjetivosHostiles());
            System.out.println("\u001B[32mLista objetivos aliados:\u001B[0m\n"+j.getRadar().getListaObjetivosAliados());
            System.out.println(j.getRadar().vista());
            System.out.println("POSICION ACTUAL = [X:"+j.getRadar().getX()+" | Y:"+j.getRadar().getY()+" | Z:"+j.getRadar().getZ()+"]");
            System.out.println("-----------------------------------------------------------");
            j.getArmadura().getCasco().usarConsola("- MENU SIMULADOR DE COMBATE -" +
                                                        "\n1. Menu Jarvis" +
                                                        "\n2. Disparar" +
                                                        "\n3. Caminar" +
                                                        "\n4. Correr" +
                                                        "\n5. Propulsarse" +
                                                        "\n6. Volar" +
                                                        "\n7. Finalizar");
            System.out.print("Ingrese opcion => ");
            int menu_op = read.nextInt();
            read.nextLine();
            switch(menu_op){
                case 1: 
                    menuJarvis(j);
                    break;
                case 2:
                    disparar(j);         
                    break;
                case 3:
                    caminar(j);
                    break;
                case 4:
                    correr(j); 
                    break;
                case 5:
                    propulsarse(j);
                    break;
                case 6:
                    volar(j); 
                    break;
                case 7:
                    System.out.println("\u001B[31mFinalizando Jarvis..\u001B[0m");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }while(j.getArmadura().isFuncional() && !salir);
        
        if(!j.getArmadura().isFuncional()){
            System.out.println("\u001B[31mLa armadura ha dejado de ser funcional!" +
                                            "\nFinalizando Jarvis..\u001B[0m");
        }
    }

    public int[] elegirCoordenadas(){
        int x,y,z;
        do {
            try{
                do{
                    System.out.print("Ingrese coordenada X => ");
                    x = read.nextInt();
                    read.nextLine();
                    System.out.print("Ingrese coordenada Y => ");
                    y = read.nextInt();
                    read.nextLine();
                    System.out.print("Ingrese coordenada Z => ");
                    z = read.nextInt();
                    read.nextLine();
                    if(x>49 || x<0 || y>49 || y<0 || z>49 || z<0){
                        System.out.println("\u001B[31mCoordenadas invalidas..\u001B[0m");
                    }else{
                        break;
                    }
                }while(true);
                break; 
            }catch(InputMismatchException e){
                System.out.println("Error: No se ha ingresado un número válido. Intente nuevamente.");
                read.nextLine();
            }
        }while(true);
        int[] posiciones = new int[3];
        posiciones[0] = x;
        posiciones[1] = y;
        posiciones[2] = z;
        return posiciones;
    }

    public int[] atacarCoordenadas(){
        int x,y,z;
        do {
            try{
                do{
                    System.out.print("Ingrese coordenada X => ");
                    x = read.nextInt();
                    read.nextLine();
                    System.out.print("Ingrese coordenada Y => ");
                    y = read.nextInt();
                    read.nextLine();
                    System.out.print("Ingrese coordenada Z => ");
                    z = read.nextInt();
                    read.nextLine();
                    if(x>49 || x<0 || y>49 || y<0 || z>49 || z<0){
                        System.out.println("\u001B[31mCoordenadas invalidas..\u001B[0m");
                    }else{
                        break;
                    }
                }while(true);
                break; 
            }catch(InputMismatchException e){
                System.out.println("Error: No se ha ingresado un número válido. Intente nuevamente.");
                read.nextLine();
            }
        }while(true);
        int[] posiciones = new int[3];
        posiciones[0] = x;
        posiciones[1] = y;
        posiciones[2] = z;
        return posiciones;
    }

}