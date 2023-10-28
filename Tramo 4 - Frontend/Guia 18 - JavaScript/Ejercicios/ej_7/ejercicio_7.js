// (Daniel Franco Herrera)
// Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
// solicite números al usuario hasta que la suma de los números introducidos supere el
// límite inicial.

var limite = parseInt(prompt("Ingrese un numero limite"));

while(limite<1){
    alert("No podes ingresar un limite menor a 1");
    limite = parseInt(prompt("Ingrese un nuevo numero limite"));
};

var suma = 0;
do{
    let aux = parseInt(prompt("e ameo dame un numerito pa la suma'"))
    suma += aux;
}while(suma <= limite);

alert("Se ha superado el limite "+limite+" con "+suma);