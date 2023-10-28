// Construir un programa que simule un menú de opciones para realizar las cuatro
// operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
// numéricos enteros. El usuario, además, debe especificar la operación con el primer
// carácter de la operación que desea realizar: ‘S' o ‘s’ para la suma, ‘R’ o ‘r’ para la resta, ‘M’
// o ‘m’ para la multiplicación y ‘D’ o ‘d’ para la división.

var v1 = parseInt(prompt("Ingrese el valor 1"));

var v2 = parseInt(prompt("Ingrese el valor 2"));

var operacion = prompt("Ingrese una operacion (S,R,M,D)");

operacion = operacion.toUpperCase().charAt(0);

switch(operacion) {

    case 'S':
        alert("La suma entre "+v1+" y "+v2+" es igual a "+ (v1+v2));
        break;
    case 'R':
        alert("La resta entre "+v1+" y "+v2+" es igual a "+ (v1-v2));
        break;
    case 'M':
        alert("La multiplicacion entre "+v1+" y "+v2+" es igual a "+ (v1*v2));
        break;
    case 'D':
        alert("La division entre "+v1+" y "+v2+" es igual a "+ (v1/v2));
        break;
    default:
        alert("Cualquier, re flasheaste");
        
}