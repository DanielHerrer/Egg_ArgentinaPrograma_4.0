package entities;

import java.util.Arrays;

// Receta 1: Tortafritas
// agua harina sal aceite
// Receta 2: Huevo frito
// aceite huevo sal
// Receta 3: Pan
// harina levadura aceite agua sal
// Receta 4: Salsa 
// tomate carne sal cebolla aceite pimienta

public class Receta {

    private String nombre;
    private String[] ingredientes = new String[20];

    public Receta() {
    }

    public Receta(String nombre, String[] ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Receta [nombre=" + nombre + ", ingredientes=" + Arrays.toString(ingredientes) + "]";
    }

}
