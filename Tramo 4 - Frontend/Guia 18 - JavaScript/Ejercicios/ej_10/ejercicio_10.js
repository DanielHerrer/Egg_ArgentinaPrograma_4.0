// Guia 18 Ejercicio 10 - Daniel Franco Herrera
// Escribir una función flecha que reciba una palabra y la devuelva al revés.

var input = prompt("Ingrese una palabra");

var palabraInv = (palabra) => {  
    let array = palabra.split("");
    array.reverse();
    return array.join("");
}

alert(palabraInv(input));