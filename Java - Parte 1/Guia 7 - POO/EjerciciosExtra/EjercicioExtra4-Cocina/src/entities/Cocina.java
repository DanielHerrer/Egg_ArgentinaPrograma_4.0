// Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego, crea métodos para agregar 
// nuevas recetas a la lista, para buscar una receta por nombre y para obtener la lista de recetas que 
// se pueden preparar con los ingredientes disponibles en la cocina.

package entities;
import java.util.ArrayList;

public class Cocina {

    private ArrayList<Receta> listRecipes = new ArrayList<Receta>();
    private ArrayList<String> listIngredients = new ArrayList<String>();

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
            if((recipe.getNombre()).equals(nombre)){
                recipe.toString();
            }
        }
    }

    public ArrayList<Receta> buscarRecetaPorIngredientes(){

        ArrayList<Receta> recetasXingredientes = new ArrayList<Receta>();
        Boolean seguirBuscando = true, ingredienteNoFalta = false;

        // El for recorre la lista de recetas existentes
        for(int i=0; i<listRecipes.size(); i++){

            // El while revisa cada ingrediente de la receta
            int j = 0;
            seguirBuscando = true;
    
            while(seguirBuscando == true && j < listRecipes.get(i).getIngredientes().size()){

                // El while verifica cada ingrediente en la cocina
                int h = 0;

                // AÑADIDO POR MATIAS SEBASTIAN
                ingredienteNoFalta = false;
                
                while(ingredienteNoFalta == false && h < listIngredients.size()){

                    // Si el ingrediente de la cocina es igual al ingrediente de la receta, el ingrediente NO FALTA
                    if(listIngredients.get(h) == listRecipes.get(i).getIngredientes().get(j)){
                        ingredienteNoFalta = true;
                    }

                    h++;
                }

                // Si luego de buscar el ingrediente en la cocina NO HABIA. Entonces que deje de buscar ingredientes de esa receta.
                if(ingredienteNoFalta == true){
                    seguirBuscando = false;
                }

                j++;
            }

            if(seguirBuscando == true){
                recetasXingredientes.add(listRecipes.get(i));
            }

        }

        return recetasXingredientes;
    }

    public ArrayList<Receta> getListRecipes() {
        return listRecipes;
    }

    public void setListRecipes(ArrayList<Receta> listRecipes) {
        this.listRecipes = listRecipes;
    }

    public ArrayList<String> getListIngredients() {
        return listIngredients;
    }

    public void setListIngredients(ArrayList<String> listIngredients) {
        this.listIngredients = listIngredients;
    }

    @Override
    public String toString() {
        return "Cocina [listRecipes=" + listRecipes + ", listIngredients=" + listIngredients + "]";
    }

}