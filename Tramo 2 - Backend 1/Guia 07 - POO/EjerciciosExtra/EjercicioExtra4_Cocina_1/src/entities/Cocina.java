package entities;

import java.util.Arrays;

public class Cocina {

    private Receta[] libroDeRecetas; 
    private String[] ingredientesHeladera;

    public Cocina(){
        libroDeRecetas = new Receta[20];
        ingredientesHeladera = new String[40];
    }

    public Cocina(Receta[] libroDeRecetas, String[] ingredientesHeladera) {
        this.libroDeRecetas = libroDeRecetas;
        this.ingredientesHeladera = ingredientesHeladera;
    }

///////////////////////////////////////////////////////////////////////////////////////

    public int cantidadDeRecetas(){
        int cant=0;
        for(Receta receta: libroDeRecetas){
            if(!(receta == null)){
                cant++;
            }
        }
        return cant;
    }
     
    public int cantidadIngredientesHeladera(){
        int cant=0;
        for(String ingrediente: ingredientesHeladera){
            if(!(ingrediente == null)){
                cant++;
            }
        }
        return cant;
    }

    public void añadirReceta(Receta receta){
        int espacioLibre = cantidadDeRecetas();
        if(espacioLibre<20){
            libroDeRecetas[espacioLibre] = receta; 
            System.out.println("-----------------------------");
            System.out.println("Receta añadida! "+(espacioLibre+1)+"/20");
        }else{
            System.out.println("-----------------------------");
            System.out.println("El libro de recetas ya esta lleno. 20 espacios.");
        }
    }

    public void buscarRecetaPorNombre(String nombreBuscado){
        int cantRecetas = cantidadDeRecetas();
        for(int i=0; i<cantRecetas; i++){
            if(nombreBuscado.equalsIgnoreCase(libroDeRecetas[i].getNombreReceta())){
                System.out.println(libroDeRecetas[i].toString());
            }
        }
    }

    public Receta[] buscarRecetaPorHeladera(){
        int index = 0;
        Receta[] listaRecetaHeladera = new Receta[20];
        Boolean ingredienteSiHay, seguirBuscando;

        // El for recorre el libro de recetas
        for(int i=0; i < cantidadDeRecetas(); i++){
            // Se asigna j = 0 para empezar de 0 en la lista de ingredientes de la receta actual
            int j = 0;
            // Se asigna true para activar la busqueda de los ingredientes de la receta actual
            seguirBuscando = true;
            // El while revisa cada ingrediente de la receta
            while(seguirBuscando == true && j < libroDeRecetas[i].cantidadIngredientesReceta()){
                // Se asigna h = 0 para empezar de 0 en la lista de ingredientes de la heladera
                int h = 0;
                // Se asigna false para activar la busqueda del ingrediente actual
                ingredienteSiHay = false;
                // El while verifica cada ingrediente en la heladera
                while(ingredienteSiHay == false && h < cantidadIngredientesHeladera()){
                    // Si el ingrediente actual de la heladera es igual al ingrediente actual de la receta entonces SI HAY INGREDIENTE
                    if(ingredientesHeladera[h].equalsIgnoreCase(libroDeRecetas[i].getIngredientesReceta()[j])){
                        ingredienteSiHay = true;
                    }
                    h++;
                }
                // Si el ingrediente buscado actual nunca se encontro en la heladera entonces que deje de buscar.. 
                if(ingredienteSiHay == false){
                    seguirBuscando = false;
                }
                j++;
            }

            // Si seguirBuscando == true significa que NUNCA hubo un ingrediente que NO estuviera en la heladera 
            // Y Si ya se recorrio TODA la lista de ingredientes de la receta actual entonces se añade la receta disponible
            if(seguirBuscando == true && j == libroDeRecetas[i].getIngredientesReceta().length){
                listaRecetaHeladera[index] = libroDeRecetas[i];
                index++;
            }
        }

        // Devuelve una lista sin valores NULL
        Receta [] listaRecHel = new Receta[index];
        for(int i=0; i<index; i++){
            listaRecHel[i] = listaRecetaHeladera[i];
        }
        return listaRecHel;
    }

    public void añadirIngredienteHeladera(String ingrediente){
        int espacioLibreHeladera = cantidadIngredientesHeladera();
        if(espacioLibreHeladera<40){
            ingredientesHeladera[espacioLibreHeladera] = ingrediente; 
            System.out.println("-----------------------");
            System.out.println("Ingrediente añadido a la heladera! "+(espacioLibreHeladera+1)+"/40");
        }else{
            System.out.println("-----------------------");
            System.out.println("La heladera esta llena. 40 espacios.");
        }
    }

    public String[] mostrarIngredientesHeladera() {
        int cantidadIngHel = cantidadIngredientesHeladera();
        String[] ingHel = new String[cantidadIngHel];
        for(int i=0; i<cantidadIngHel; i++){
            ingHel[i] = ingredientesHeladera[i];
        }
        return ingHel;
    }

///////////////////////////////////////////////////////////////////////////////////////

    public Receta[] getLibroDeRecetas() {
        return libroDeRecetas;
    }

    public void setLibroDeRecetas(Receta[] libroDeRecetas) {
        this.libroDeRecetas = libroDeRecetas;
    }

    public String[] getIngredientesHeladera() {
        return ingredientesHeladera;
    }

    public void setIngredientesHeladera(String[] ingredientesHeladera) {
        this.ingredientesHeladera = ingredientesHeladera;
    }

    @Override
    public String toString() {
        return "Cocina [ Libro de Recetas = " + Arrays.toString(libroDeRecetas) + ", Ingredientes en Heladera = "
                + Arrays.toString(ingredientesHeladera) + "]";
    }

}