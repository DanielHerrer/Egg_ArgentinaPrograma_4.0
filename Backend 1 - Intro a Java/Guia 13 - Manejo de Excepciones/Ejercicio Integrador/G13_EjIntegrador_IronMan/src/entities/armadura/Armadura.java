// En este trabajo se deberá crear en el proyecto una clase llamada Armadura que modele toda la
// información y las acciones que pueden efectuarse con la Armadura de Iron Man. La armadura de
// Iron Man es un exoesqueleto mecánico ficticio usado por Tony Stark cuando asume la identidad
// de Iron Man. La primera armadura fue creada por Stark y Ho Yinsen, mientras estuvieron prisioneros.

// Las armaduras de Stark se encuentran definidas por un color primario y un color secundario. Se
// encuentran compuestas de dos propulsores, uno en cada bota; y dos repulsores, uno en cada
// guante (los repulsores se utilizan también como armas). Tony los utiliza en su conjunto para volar.
// La armadura tiene un nivel de resistencia, que depende del material con el que está fabricada, y
// se mide con un número entero cuya unidad de medida de dureza es Rockwell (https://es.wikipedia.org/wiki/Dureza_Rockwell).
// Todas las armaduras poseen un nivel de salud el cual se mide de 0 a 100.
// Además, Tony tiene un generador, el cual le sirve para salvarle la vida en
// cada instante de tiempo alejando las metrallas de metal de su corazón y también para alimentar
// de energía a la armadura. La batería a pesar de estar en el pecho de Tony, es considerada como
// parte de la armadura.

package entities.armadura;

import entities.armadura.piezas.*;
import entities.armadura.piezas.dispositivos.Generador;

public class Armadura {
    
    private int salud;
    private String rockwell, resistencia;
    private String color_pri, color_sec;

    private Generador generador;
    private Casco casco;
    private Guante guanteIzq;
    private Guante guanteDer;
    private Bota botaIzq;
    private Bota botaDer;

    public Armadura(){
        salud = 100;
        generador = new Generador();
        casco = new Casco();
        guanteDer = new Guante();
        guanteDer = new Guante();
        botaDer = new Bota();
        botaIzq = new Bota();
    }

    public Armadura(String rockwell, String resistencia, String color_pri, String color_sec) {
        salud = 100;
        this.rockwell = rockwell;
        this.resistencia = resistencia;
        this.color_pri = color_pri;
        this.color_sec = color_sec;
        generador = new Generador();
        casco = new Casco();
        guanteDer = new Guante();
        guanteIzq = new Guante();
        botaDer = new Bota();
        botaIzq = new Bota();
    }

    public Armadura(String rockwell, String resistencia, String color_pri, String color_sec, Generador generador,
            Casco casco, Guante guanteIzq, Guante guanteDer, Bota botaIzq, Bota botaDer) {
        this.salud = 100;
        this.rockwell = rockwell;
        this.resistencia = resistencia;
        this.color_pri = color_pri;
        this.color_sec = color_sec;
        this.generador = generador;
        this.casco = casco;
        this.guanteIzq = guanteIzq;
        this.guanteDer = guanteDer;
        this.botaIzq = botaIzq;
        this.botaDer = botaDer;
    }

    public boolean isFuncional(){
        // SI TODAS LAS PIEZAS ESTAN DESTRUIDAS, NO ES FUNCIONAL
        if(guanteDer.isDestruido() && guanteIzq.isDestruido() && botaDer.isDestruido() && botaIzq.isDestruido()){
            return false;
        // SI AMBAS BOTAS ESTAN DESTRUIDAS, NO ES FUNCIONAL
        }else if(botaDer.isDestruido() && botaIzq.isDestruido()){
            return false;
        // SI AMBOS GUANTES Y AL MENOS 1 BOTA ESTAN DESTRUIDAS, NO ES FUNCIONAL
        }else if(guanteDer.isDestruido() && guanteIzq.isDestruido() && (botaDer.isDestruido() || botaIzq.isDestruido())){
            return false;
        // CUALQUIER OTRO CASO, SI ES FUNCIONAL
        }else{
            return true;
        }
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public String getRockwell() {
        return rockwell;
    }

    public void setRockwell(String rockwell) {
        this.rockwell = rockwell;
    }

    public String getResistencia() {
        return resistencia;
    }

    public void setResistencia(String resistencia) {
        this.resistencia = resistencia;
    }

    public String getAsciiColor_pri(){
        if(this.color_pri.equalsIgnoreCase("rojo")){
            return "\u001B[31m";
        }else if(this.color_pri.equalsIgnoreCase("verde")){
            return "\u001B[32m";
        }else if(this.color_pri.equalsIgnoreCase("amarillo")){
            return "\u001B[33m";
        }else if(this.color_pri.equalsIgnoreCase("azul")){
            return "\u001B[34m";
        }else if(this.color_pri.equalsIgnoreCase("purpura")){
            return "\u001B[35m";
        }else{
            return "ERROR";
        }
    }

    public String getColor_pri() {
        return color_pri;
    }

    public void setColor_pri(String color_pri) {
        this.color_pri = color_pri;
    }

    public String getColor_sec() {
        return color_sec;
    }

    public void setColor_sec(String color_sec) {
        this.color_sec = color_sec;
    }

    public Generador getGenerador() {
        return generador;
    }

    public void setGenerador(Generador generador) {
        this.generador = generador;
    }

    public Casco getCasco() {
        return casco;
    }

    public void setCasco(Casco casco) {
        this.casco = casco;
    }

    public Guante getGuanteIzq() {
        return guanteIzq;
    }

    public void setGuanteIzq(Guante guanteIzq) {
        this.guanteIzq = guanteIzq;
    }

    public Guante getGuanteDer() {
        return guanteDer;
    }

    public void setGuanteDer(Guante guanteDer) {
        this.guanteDer = guanteDer;
    }

    public Bota getBotaIzq() {
        return botaIzq;
    }

    public void setBotaIzq(Bota botaIzq) {
        this.botaIzq = botaIzq;
    }

    public Bota getBotaDer() {
        return botaDer;
    }

    public void setBotaDer(Bota botaDer) {
        this.botaDer = botaDer;
    }

    @Override
    public String toString() {
        String sintetizador =  (casco.getSintetizador().isDañado()) ? "DANIADO" : "FUNCIONAL";
        String consola = (casco.getConsola().isDañado()) ? "DANIADO" : "FUNCIONAL";
        
        String guaDer;
        if(guanteDer.isDestruido()){
            guaDer = "DESTRUIDO";
        }else if(guanteDer.isDañado()){
            guaDer = "DANIADO";
        }else{
            guaDer = "FUNCIONAL";
        }
        String guaIzq;
        if(guanteIzq.isDestruido()){
            guaIzq = "DESTRUIDO";
        }else if(guanteIzq.isDañado()){
            guaIzq = "DANIADO";
        }else{
            guaIzq = "FUNCIONAL";
        }
        String botDer;
        if(botaDer.isDestruido()){
            botDer = "DESTRUIDO";
        }else if(botaDer.isDañado()){
            botDer = "DANIADO";
        }else{
            botDer = "FUNCIONAL";
        }
        String botIzq;
        if(botaIzq.isDestruido()){
            botIzq = "DESTRUIDO";
        }else if(botaIzq.isDañado()){
            botIzq = "DANIADO";
        }else{
            botIzq = "FUNCIONAL";
        }

        return "----- [Armadura]:"+
                "\nSALUD = " + salud +"%"+
                "\nEnergia del Generador = " + generador.getEnergia() +
                "\nResistencia = " + resistencia + " | Rockwell = " + rockwell +
                "\nColor primario = "+ getColor_pri() +" | Color secundario = "+ getColor_sec() +
                "\n----- (Casco):"+
                "\nSintetizador => " + sintetizador +
                "\nConsola => " + consola +
                "\n----- (Guantes):"+
                "\nDerecho => " + guaDer + " | Consumo = " + guanteIzq.getRepulsor().getConsumo() + 
                "\nIzquierdo => " + guaIzq + " | Consumo = " + guanteIzq.getRepulsor().getConsumo() +
                "\n----- (Botas):"+
                "\nDerecha => " + botDer + " | Consumo = " + botaDer.getPropulsor().getConsumo() +
                "\nIzquierda => " + botIzq + " | Consumo = " + botaIzq.getPropulsor().getConsumo();
    }

}