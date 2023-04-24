/// EJERCICIO 3
// Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
// cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int num, d1=0, d2=0, d3=0, d4=0, d5=0;

        System.out.println("Ingrese tamaño de VECTOR:");
        num = in.nextInt();

        int[] vector = new int[num];

        for(int i=0; i<vector.length; i++){
            vector[i] = (int) (Math.random()*11110+1); // NUMERO ALEATORIO ENTRE 1 Y 11111
        }

        for(int i=0; i<vector.length; i++){
            System.out.println(vector[i]);
        }

        for(int i=0; i<vector.length; i++){
            if(vector[i]/10 < 1){
                d1++;
            }else{
                if(vector[i]/10 < 10){
                    d2++;
                }else{
                    if((vector[i]/10)/10 <10){
                        d3++;
                    }else{
                        if(((vector[i]/10)/10)/10 <10){
                            d4++;
                        }else{
                            if((((vector[i]/10)/10)/10)/10 <10){
                                d5++;
                            }
                        }
                    }
                }
            }
        }

        System.out.println("El vector posee numeros de 1 digito: "+d1+"\nEl vector posee numeros de 2 digito: "+d2+"\nEl vector posee numeros de 3 digito: "+d3+"\nEl vector posee numeros de 4 digito: "+d4+"\nEl vector posee numeros de 5 digito: "+d5);
        in.close();
    }
}

        // OPCIONAL (MILTON ROMAN)

        // int aux, cont=0;
        // for(int i=0; i<vector.length; i++){
        //     aux = vector[i];
        //     while(aux > 9){
        //         aux = aux / 10;
        //         cont++;
        //     }
        //     switch(cont){
        //         case 0: 
        //             d1++;
        //             break;
        //         case 1:
        //             d2++;
        //             break;
        //         case 2:
        //             d3++;
        //             break;
        //         case 3:
        //             d4++;
        //             break;
        //         case 4:
        //             d5++;
        //             break;
        //     }
        // }
