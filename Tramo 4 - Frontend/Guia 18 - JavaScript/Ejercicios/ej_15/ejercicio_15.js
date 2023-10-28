// Guia 18 Ejercicio 15 - Daniel Franco Herrera
// Escribe un programa JavaScript para calcular el área y el perímetro de un objeto Círculo
// con la propiedad radio. 
// Nota: Cree dos métodos para calcular el área y el perímetro. 
// El radio del círculo lo proporcionará el usuario.

const calcArea = (radio) => (Math.PI * (radio ** 2));

const calcPerimetro = (radio) => (2 * Math.PI * radio);

const crearCirculo = function () {
    let radio;
    do{
        radio = parseInt(prompt("Ingrese radio del Circulo a crear"));
    }while(isNaN(radio));

    let circulo = {
        radio: radio,
        area: calcArea(radio),
        perimetro: calcPerimetro(radio)
    }
    return circulo;
}

var circulo = crearCirculo();

alert("Circulo creado!\nRadio: "+circulo.radio+"\nPerimetro: "+circulo.perimetro+"\nArea: "+circulo.area)