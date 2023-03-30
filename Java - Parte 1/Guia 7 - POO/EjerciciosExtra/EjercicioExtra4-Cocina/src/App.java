import java.util.ArrayList;
import java.util.Scanner;
import entities.Cocina;
import entities.Receta;

// Receta 1: Tortafritas
// agua harina sal aceite
// Receta 2: Huevo frito
// aceite huevo sal
// Receta 3: Pan
// harina levadura aceite agua sal
// Receta 4: Salsa 
// tomate carne sal cebolla aceite pimienta

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Cocina cocina1 = new Cocina();

        String nombreReceta;
        int cantIngredientes, cantIngredientesCocina;
        ArrayList<String> recetaIngredientes = new ArrayList<>();
        ArrayList<String> totalIngredientes = new ArrayList<>();

        int op = 0;
        do{
            System.out.println("Ingrese un nombre de la receta: ");
            nombreReceta = in.nextLine();
            System.out.println("Cuantos ingredientes lleva?: ");
            cantIngredientes = in.nextInt();
            for(int i=0; i<cantIngredientes; i++){
                System.out.println("Ingrese el ingrediente nº"+(i+1));
                recetaIngredientes.add(in.nextLine());
            }

            Receta recetaAux = new Receta(nombreReceta,recetaIngredientes);
            cocina1.añadirReceta(recetaAux);

            System.out.println("Desea seguir añadiendo recetas?\n0. No\n1. Si");
        }while(op==1);

        System.out.println("//////////////////////////////////////////////////////////////");

        do{
            System.out.println("Cuantos ingredientes tiene en la cocina?");
            cantIngredientesCocina = in.nextInt();
            for(int i=0; i<cantIngredientesCocina; i++){
                System.out.println("Escriba el ingrediente nº"+(i+1));
                totalIngredientes.add(in.nextLine());
            }
            cocina1.setListIngredients(totalIngredientes);
        }while(op==1);





    }
}
