// Crear una clase ParDeNumerosService, en el paquete
// Servicios, que deberá además implementar los siguientes métodos:
// a) Método mostrarValores que muestra cuáles son los dos números
// guardados.
// b) Método devolverMayor para retornar cuál de los dos atributos tiene
// el mayor valor
// c) Método calcularPotencia para calcular la potencia del mayor valor de
// la clase elevado al menor número. Previamente se deben redondear
// ambos valores.
// d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
// dos valores. Antes de calcular la raíz cuadrada se debe obtener el
// valor absoluto del número.

package services;

import entities.ParDeNumeros;

public class ParDeNumerosServicios {
    // LOS METODOS SON ESTATICOS 
    
    public static void mostrarValores(ParDeNumeros nums){
        System.out.println("Numero 1 = "+nums.getN1());
        System.out.println("Numero 2 = "+nums.getN2());
    }

    public static double devolverMayor(ParDeNumeros nums){
        if(nums.getN1()>nums.getN2()){
            return nums.getN1();
        }else{
            return nums.getN2();
        }
    }

    public static double devolverMenor(ParDeNumeros nums){
        if(nums.getN1()<nums.getN2()){
            return nums.getN1();
        }else{
            return nums.getN2();
        }
    }

    public static void calcularPotencia(ParDeNumeros nums){
        System.out.println("La potencia de "+Math.round(devolverMayor(nums))+" elevado a "+Math.round(devolverMenor(nums))+" es igual a = "+
            Math.pow(Math.round(devolverMayor(nums)),Math.round(devolverMenor(nums))) );
    }

    public static void calculaRaiz(ParDeNumeros nums){
        System.out.println("La raiz cuadrada de "+String.format("%.3f",Math.abs(devolverMenor(nums)))+" es igual a = "+
            String.format("%.3f", Math.sqrt(Math.abs(devolverMenor(nums)))) );
    }

}
