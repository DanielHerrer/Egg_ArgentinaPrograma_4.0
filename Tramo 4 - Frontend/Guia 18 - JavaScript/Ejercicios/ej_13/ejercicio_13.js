// Guia 18 Ejercicio 13 - Daniel Franco Herrera
// Crear un objeto persona, con las propiedades nombre, edad, sexo ('H' hombre, 'M' mujer,
// 'O' otro), peso y altura. A continuación, muestre las propiedades del objeto JavaScript.

var strPersona = `{ "nombre": "Lucas", "edad": 19, "sexo": "H", "peso": 70, "altura": 170 }`;

var objPersona = JSON.parse(strPersona);

console.log(objPersona.nombre);
console.log(objPersona.edad);
console.log(objPersona.sexo);
console.log(objPersona.peso);
console.log(objPersona.altura);