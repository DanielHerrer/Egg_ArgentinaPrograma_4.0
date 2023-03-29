// Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego, crea métodos para agregar 
// nuevas recetas a la lista, para buscar una receta por nombre y para obtener la lista de recetas que 
// se pueden preparar con los ingredientes disponibles en la cocina.

package entities;

import entities.Receta;
import java.util.ArrayList;

public class Cocina {

    private ArrayList<Receta> listRecipes = new ArrayList<Receta>();

    public Cocina(){
    }

    public Cocina(ArrayList<Receta> listRecipes) {
        this.listRecipes = listRecipes;
    }

    public void añadirReceta(Receta receta){
        listRecipes.add(receta);
    }

    public void buscarRecetaPorNombre(String nombre){
        for(Receta recipe: listRecipes){
            if(recipe.getNombre() == nombre){
                recipe.toString();
            }
        }
    }

    public void buscarRecetaPorIngredientes(){

    }

    public ArrayList<Receta> getListRecipes() {
        return listRecipes;
    }

    public void setListRecipes(ArrayList<Receta> listRecipes) {
        this.listRecipes = listRecipes;
    }

    

    



}