// Guia 18 Ejercicio 18 - Daniel Franco Herrera
// A partir del siguiente array: var valores = [true, 5, false, "hola", "adios", 2]:
// a) Determinar cual de los dos elementos de texto es mayor
// b) Utilizando exclusivamente los dos valores booleanos del array, determinar los
// operadores necesarios para obtener un resultado true y otro resultado false
// c) Determinar el resultado de las cinco operaciones matemáticas realizadas con los
// dos elementos numéricos

var valores = [true, 5, false, "hola", "adios", 2];

alert("Valores: ["+valores.toString()+"]");

var booleanos = [];
var strings = [];
var numeros = [];

for(let i=0; i<valores.length; i++){
    if(typeof valores[i] === "boolean"){
        booleanos.push(valores[i]);
    }else if(typeof valores[i] === "number"){
        numeros.push(valores[i]);
    }else if(typeof valores[i] === "string"){
        strings.push(valores[i]);
    }
}

// ---------------------------------------------------------------------

var cadenaLarga = "";
for(cadena of strings){
    if(cadena.length > cadenaLarga.length){
        cadenaLarga = cadena;
    }
}

alert("a) Cadenas:\n["+strings.toString()+"]\nCadena más larga:\n"+cadenaLarga);

// ---------------------------------------------------------------------

alert("b) Booleanos:\n["+booleanos.toString()+"]");

// ---------------------------------------------------------------------

var suma = numeros[0], resta = numeros[0], multi = numeros[0], div = numeros[0], resto = numeros[0];

for(let i=1; i<numeros.length; i++){
    suma += numeros[i];
    resta -= numeros[i];
    div /= numeros[i];
    multi *= numeros[i];
    resto %= numeros[i];
}

alert("c) Numeros: \n["+numeros.toString()+"]\nSuma = "+suma+"\nResta = "+resta+"\nDivision = "+div+"\nMultiplicacion = "+multi+"\nResto = "+resto);