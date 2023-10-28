// Escribir una función que reciba un String y devuelva la palabra más larga.
// String Ejemplo: “Guia de JavaScript”
// Resultado esperado : “JavaScript”

function palabraLarga(frase) {
    let palabraLarga = "";
    let palabras = frase.split(" ");
    palabras.forEach(function(palabra) {
        if(palabra.length > palabraLarga.length){
            palabraLarga = palabra;
        }
    });
    return palabraLarga;
}

var input = prompt("Ingrese una frase, se devolverá la palabra más larga");

alert(palabraLarga(input));