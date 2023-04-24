package entidades;
import java.util.ArrayList;
import java.util.List;

public class FuncionesMatematicas {

    public Boolean esPrimo(int num){
        if(num <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            Integer numAux = num % i;
            if (numAux.equals(0)) { 
                return false;
            }
        }
        return true;
    }

    public Boolean esPerfecto(int num){
        List<Integer> factoresNum = new ArrayList<>();
        for(int i=1; i<=(num/2); i++){
            if(num%i == 0){
                factoresNum.add(i);
            }
        }
        Integer sumaFactores = 0;
        for(int factorPropio: factoresNum){
            sumaFactores += factorPropio;
        }
        if(sumaFactores.equals(num)){
            return true;
        }else{
            return false;
        }
    }

    public Integer numMaxBits(int num){
        if(num<=0){
            
        }
    }

    
}
