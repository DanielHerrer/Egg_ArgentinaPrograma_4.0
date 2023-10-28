// Guia 18 - Ejercicio 1
// Escribir un algoritmo en el cual se consulte al usuario que ingrese ¿cómo está el día de
// hoy? (soleado, nublado, lloviendo). A continuación, mostrar por pantalla un mensaje que
// indique “El día de hoy está ...”, completando el mensaje con el dato que ingresó el usuario.

var clima;

do{

    clima = prompt("Ingrese cómo está el día de hoy?");
    clima = clima.toLowerCase();

} while(clima != "soleado" && clima != "nublado" && clima != "lloviendo");

alert("El dia de hoy está "+clima);