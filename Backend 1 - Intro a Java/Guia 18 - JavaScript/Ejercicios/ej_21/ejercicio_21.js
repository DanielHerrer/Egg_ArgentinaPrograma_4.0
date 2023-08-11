// Guia 18 Ejercicio 21 - Daniel Franco Herrera
// Escribir un programa para obtener un array de las propiedades de un objeto Persona.
// Las propiedades son nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura.

var propiedades = [];

const crearPersona = function () {
    alert("Creando Persona");

    // let datosValidos = false;
    let nombre, edad, sexo, peso, altura;
    try {
        nombre = prompt("Ingrese nombre");
        if(nombre.length < 1){
            throw new Error("El nombre no puede estar vacio");
        }
        edad = parseInt(prompt("Ingrese la edad"));
        if(isNaN(edad)){
            throw new Error("La edad debe ser un numero correcto");
        }
        sexo = prompt("Ingrese sexo (H,M,O)");
        if(sexo !== "H" && sexo !== "M" && sexo !== "O"){
            throw new Error("Ingrese uno de los sexos indicados");
        }
        peso = parseInt(prompt("Ingrese peso"));
        if(isNaN(peso)){
            throw new Error("El peso debe ser un numero correcto");
        }
        altura = parseInt(prompt("Ingrese altura"));
        if(isNaN(altura)){
            throw new Error("La altura debe ser un numero correcto");
        }
    }catch(e){
        alert("Error: "+e.message);
        logMyErrors(e);
    }

    let persona = {
        nombre: nombre,
        edad: edad,
        sexo: sexo,
        peso: peso,
        altura: altura
    };

    return persona;
}

var persona1 = crearPersona();

alert("Objeto Persona:\nnombre: "+persona1.nombre+"\nedad: "+persona1.edad+"\nsexo: "+persona1.sexo+"\npeso: "+persona1.peso+"\naltura: "+persona1.altura);

let propiedadesPersona = Object.keys(persona1);

alert("Propiedades de Persona:\n["+propiedadesPersona+"]");

let valoresPersona = Object.values(persona1);

alert("Valores de Persona:\n["+valoresPersona+"]");