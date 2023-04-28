package entities;

import java.util.Arrays;

public class Receta {
    
    private String nombreReceta;
    private String[] ingredientesReceta;

    public Receta(){
        nombreReceta = "-";
        ingredientesReceta = new String[10];
    }

    public Receta(String nombreReceta, String[] ingredientesReceta) {
        this.nombreReceta = nombreReceta;
        this.ingredientesReceta = ingredientesReceta;
    }

////////////////////////////////////////////////////////////////////////////////////////

    public int cantidadIngredientesReceta(){
        int cant=0;
        for(String ing: ingredientesReceta){
            if(!(ing == null)){
                cant++;
            }
        }
        return cant;
    }

////////////////////////////////////////////////////////////////////////////////////////

    public String getNombreReceta() {
        return nombreReceta;
    }

    public void setNombreReceta(String nombreReceta) {
        this.nombreReceta = nombreReceta;
    }

    public String[] getIngredientesReceta() {
        return ingredientesReceta;
    }

    public void setIngredientesReceta(String[] ingredientesReceta) {
        this.ingredientesReceta = ingredientesReceta;
    }

    @Override
    public String toString() {
        return "Receta [ Nombre = " +nombreReceta+ ", Ingredientes = " + Arrays.toString(ingredientesReceta)
                + "]";
    }
    
}
