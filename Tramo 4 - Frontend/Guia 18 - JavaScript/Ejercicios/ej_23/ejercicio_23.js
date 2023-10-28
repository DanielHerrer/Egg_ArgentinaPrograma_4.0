// Guia 18 Ejercicio 23 - Daniel Franco Herrera
// Resalte todas las palabras de más de 8 caracteres en el texto del párrafo 
//   (con un fondo amarillo, por ejemplo)

const parrafo = document.getElementById("parrafo");

const palabras = parrafo.innerText.split(" "); // separa el parrafo en palabras separadas por " "
    
for (let i=0; i<palabras.length; i++) {
    if (palabras[i].length > 8) {
        palabras[i] = `<span class="bg-warning"> ${palabras[i]} </span>`; // se le añade una clase de bootstrap
    }
}

parrafo.innerHTML = palabras.join(" "); // junta las palabras separadas en un parrafo separadas por " "