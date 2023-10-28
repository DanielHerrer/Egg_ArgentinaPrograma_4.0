// Guia 18 Ejercicio 22 - Daniel Franco Herrera
// Escribir un programa de JavaScript que al clickear un botón muestre un 
// mensaje a elección.

document.getElementById("botonApagar").addEventListener("click", function() {
    alert("CALMA, SE VA A ESTABILIZAR!");
    document.getElementById("imgOtto").style.display = "block";
});