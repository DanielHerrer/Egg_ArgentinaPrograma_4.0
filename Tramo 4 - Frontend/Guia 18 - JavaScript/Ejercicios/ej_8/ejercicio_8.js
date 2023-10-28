// Guia 18 - Ejercicio 8 (Daniel Franco Herrera)
// Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
// programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
// todos ellos.
var num, numMax, numMin, total = 0, cantNum = 0;

alert("Bienvenido, ingrese numeros hasta que teclee el 0 (cero)");

do{
    if(cantNum === 0){
        num = parseInt(prompt("Ingrese un numero"));
        while(num === 0){
            num = parseInt(prompt("Ingrese un numero antes de ingresar 0"));
        }
        numMax = num;
        numMin = num;
        total += num;
        cantNum++;
    }else{
        num = parseInt(prompt("Ingrese un numero"));
        if(num !== 0){
            if(num > numMax){
                numMax = num;
            }else if(num < numMin){
                numMin = num;
            }
            total += num;
            cantNum++;
        }else{
            alert("Finalizando");
        }
    }
}while(num !== 0);

alert("Numero maximo = "+numMax+"\nNumero minimo = "+numMin+"\nCantidad de numeros = "+cantNum+"\nPromedio = "+(total / cantNum));