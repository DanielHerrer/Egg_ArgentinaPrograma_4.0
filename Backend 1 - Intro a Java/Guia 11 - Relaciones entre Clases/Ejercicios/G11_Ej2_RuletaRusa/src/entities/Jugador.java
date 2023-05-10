// Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
// jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
// si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
// debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
// Métodos:
// • disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
// mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
// revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
// devuelve true, sino false.

package entities;

public class Jugador {

    private Integer id;
    private String nombre;
    private boolean mojado;

    public Jugador(){
    }

    public Jugador(String nombre){
        this.nombre = nombre;
        mojado = false;
    }

    public void disparo(Revolver r){
        if(r.mojar()){
            System.out.println("["+id+"] "+nombre+" has sido mojado! Perdiste!!");
            mojado = true;
            r.setPosAgua(null); // Se pierde la bala de agua
            r.siguienteChorro();
        }else{
            System.out.println("["+id+"] "+nombre+" te has salvado! Siguiente jugador..");
            r.siguienteChorro();
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador [id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + "]";
    }
}
