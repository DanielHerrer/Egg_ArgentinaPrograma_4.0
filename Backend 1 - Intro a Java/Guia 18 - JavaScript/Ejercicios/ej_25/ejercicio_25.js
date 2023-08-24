// Guia 18 Ejercicio 25 - Daniel Franco Herrera
// Escriba una función de JavaScript para obtener los valores de Nombre y Apellido del
// siguiente formulario.

const formulario = document.getElementById("form1");

class Persona {
    constructor(nombre, apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
}

formulario.onsubmit = (event) => {
    event.preventDefault();
    let nombre = formulario["nombre"].value; // form name="nombre"
    let apellido = formulario["apellido"].value; 
    let persona = new Persona(nombre,apellido);
    nombrePersona.textContent = persona.nombre;
    apellidoPersona.textContent = persona.apellido;
};

/**function getFormValores() {
    var form = document.getElementById("form1");
    var nombre = form.elements["nombre"].value; // form name="nombre"
    var apellido = form["apellido"].value; // form apellido="apellido"
    console.log("Nombre: " + nombre);
    console.log("Apellido: " + apellido);
    event.preventDefault(); // evita que al hacer submit se recargue la pagina
}*/