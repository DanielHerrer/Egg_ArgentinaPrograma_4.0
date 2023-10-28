// Conocido el número en matemática PI π, pedir al usuario que ingrese el valor del radio
// de una circunferencia y calcular y mostrar por pantalla el área y perímetro. Recuerde que
// para calcular el área y el perímetro se utilizan las siguientes fórmulas:
// area = PI * radio2
// perimetro = 2 * PI * radio

var radio = parseFloat(prompt("Ingrese el radio de una circunferencia: "));

alert("El radio brindado es '"+radio+"'\nEl area es "+ Math.round(Math.PI * (radio**2)) +"\nEl perimetro es "+ Math.round(2 * Math.PI * radio));
