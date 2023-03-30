package entities;

import java.util.ArrayList;

public class Receta {

    private String nombre;
    private ArrayList<String> ingredientes = new ArrayList<>();

    public Receta() {
    }

    public Receta(String nombre, ArrayList<String> ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Receta [nombre=" + nombre + ", ingredientes=" + ingredientes + "]";
    }

}
