// Nos piden hacer un programa sobre un Cine, que tiene una sala
// con un conjunto de asientos (8 filas por 6 columnas).
// De Cine nos interesa conocer la película que se está reproduciendo, la
// sala con los espectadores y el precio de la entrada.

package entities;

import java.util.Arrays;

public class Cine {

    private Pelicula pelicula;
    private Asiento[][] sala = new Asiento[8][6];   // filas y columnas
    private Float precioEntrada;

    public Cine(){}

    public Cine(Pelicula pelicula, Asiento[][] sala, Float precioEntrada) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.precioEntrada = precioEntrada;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Asiento[][] getSala() {
        return sala;
    }

    public void setSala(Asiento[][] sala) {
        this.sala = sala;
    }

    public int getAsientosDisp(){
        int asientosDisp = 0;
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                if (sala[i][j] == null) {
                    asientosDisp++;
                }
            }
        }
        return asientosDisp;
    }

    public int getAsientosOcup(){
        int asientosOcup = 0;
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                if (sala[i][j] != null) {
                    asientosOcup++;
                }
            }
        }
        return asientosOcup;
    }

    public Float getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(Float precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    @Override
    public String toString() {
        return "Cine [pelicula=" + pelicula + ", sala=" + Arrays.toString(sala) + ", precioEntrada=" + precioEntrada
                + "]";
    }

}