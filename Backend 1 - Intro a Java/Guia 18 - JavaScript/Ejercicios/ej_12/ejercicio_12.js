// Guia 18 Ejercicio 12 - Daniel Franco Herrera
// Escribir una función flecha de JavaScript que reciba un argumento y retorne el tipo de dato.

var input = prompt("Ingrese un dato, se devolverá el tipo de dicho dato (number,boolean,string)");

var tipoDato = (argumento) => {
    if(argumento == "true" || argumento == "false"){
      argumento = true;
    }else if (!isNaN(argumento)) {    // is Not a Number
      argumento = parseFloat(argumento); // Si es un número, lo convertimos a tipo numérico
    }
    return (typeof argumento);
};

alert(tipoDato(input));