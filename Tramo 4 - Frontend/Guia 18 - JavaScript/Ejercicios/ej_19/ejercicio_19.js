// Guia 18 Ejercicio 19 - Daniel Franco Herrera
// Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
// de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
// programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
// Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
// ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 0.5.
// Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 20.

var arregloA = [];
var arregloB = [];

alert("Inicializando Arreglo A con valores aleatorios..");

for(let i=0; i<50; i++){
    arregloA[i] = Math.round(Math.random()*99); // 0 al 99
}

alert("Arreglo A = ["+arregloA.toString()+"]");

alert("Ordenando Arreglo A..");

function compararNum(a, b) {
    if (a > b) return 1;
    if (a == b) return 0;
    if (a < b) return -1;
}

arregloA.sort(compararNum);

alert("Copiando los 10 primeros valores de arreglo A a arreglo B y rellenando con '0.5'")

let arregloPrimeros = arregloA.slice(0,10);
let arregloCeroCinco = new Array(10).fill(0.5);

arregloB = arregloPrimeros.concat(arregloCeroCinco);

alert("Arreglo A = ["+arregloA.toString()+"]\nArreglo B = ["+arregloB.toString()+"]");

