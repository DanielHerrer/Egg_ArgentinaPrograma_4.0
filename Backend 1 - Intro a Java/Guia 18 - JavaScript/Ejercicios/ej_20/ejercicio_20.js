// Guia 18 Ejercicio 20 - Daniel Franco Herrera
// Realizar un programa que obtenga la siguiente matriz [[3], [6], [9], [12], [15]] y devuelve y
// muestre el siguiente array [6, 9, 12, 15, 18].

var matriz_1 = [[3],[6],[9],[12],[15]];

console.log(matriz_1);

var matriz_2 = matriz_1.flat();

console.log(matriz_2);

alert("Mirar en consola:\n matriz_2 = ["+matriz_2+"]");