/// EJERCICIO EXTRA 12
// Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 
// al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
// 0-0-0
// 0-0-1
// 0-0-2
// 0-0-E
// 0-0-4
// 0-1-2
// 0-1-E
// Nota: investigar función equals() y como convertir números a String.

public class EjercicioExtra12 {
    
    public static void main(String[]args){

        for(int i=0;i<10;i++){
            
            for(int j=0;j<10;j++){
                
                for(int k=0;k<10;k++){
                    if(i==3){
                        System.out.print("E");
                    }else{
                        System.out.print(i);
                    }
                    ///////////////////////////////////////
                    System.out.print("-");
                    if(j==3){
                        System.out.print("E");
                    }else{
                        System.out.print(j);
                    }
                    ///////////////////////////////////////
                    System.out.print("-");
                    if(k==3){
                        System.out.print("E");
                    }else{
                        System.out.print(k);
                    }
                    ///////////////////////////////////////
                    System.out.println("");
                }
            }
        }
    }
}
