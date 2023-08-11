// Guia 18 Ejercicio 25 - Daniel Franco Herrera
// Escriba una función de JavaScript para obtener los valores de Nombre y Apellido del
// siguiente formulario.

function getFormValores() {
    var form = document.getElementById("form1");
    var nombre = form["nombre"].value; // form name="nombre"
    var apellido = form["apellido"].value; // form apellido="apellido"
    
    console.log("Nombre: " + nombre);
    console.log("Apellido: " + apellido);

    event.preventDefault(); // evita que al hacer submit se recargue la pagina
}
