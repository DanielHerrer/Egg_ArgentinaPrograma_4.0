// Guia 18 Ejercicio 16 - Daniel Franco Herrera
// Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios
// y los muestre por pantalla.

var vector1 = [];
var vector2 = [];

alert("Rellenando vectores..");

for(let i=0; i<5; i++) {
    vector1.push(Math.round((Math.random()*8)+1)); // 1 al 9
    vector2.push(Math.round((Math.random()*8)+1)); // 1 al 9
}

alert("Vector 1 = ["+vector1.toString()+"]\nVector 2 = ["+vector2.toString()+"]");