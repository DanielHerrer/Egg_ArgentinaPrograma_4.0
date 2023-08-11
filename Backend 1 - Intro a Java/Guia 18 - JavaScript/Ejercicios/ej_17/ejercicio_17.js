// Guia 18 Ejercicio 17 - Daniel Franco Herrera
// Realizar un programa que elimine los dos últimos elementos de un array. Mostrar el
// resultado

var vector = [1,2,3,4,5,6,7,8,9];

alert("Se eliminarán los últimos dos elementos del array\nArreglo = ["+vector.toString()+"]");

vector.splice(-2);

alert("Se han eliminado los últimos dos elementos del array\nArreglo = ["+vector.toString()+"]");