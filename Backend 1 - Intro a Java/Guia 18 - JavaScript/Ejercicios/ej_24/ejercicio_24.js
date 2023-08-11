// Guia 18 Ejercicio 24 - Daniel Franco Herrera
// Escribir un programa de JavaScript que a través de un formulario calcule el 
// radio de un circulo y lo muestre en el HTML.

const valorElegido = document.getElementById("valorElegido");
const input = document.getElementById("input");
const calcularBtn = document.getElementById("calcularBtn");

valorElegido.addEventListener("click", function() {
    const valores = document.querySelectorAll("#valores .dropdown-item");
    valores.forEach(valor => {
        valor.addEventListener("click", function() {
            valorElegido.textContent = `Radio por ${valor.textContent}`;
        });
    });
});

calcularBtn.addEventListener("click", function() {
    const selectedOption = valorElegido.textContent.trim();
    const inputValue = parseFloat(input.value);

    if (selectedOption !== "Radio por Area" && selectedOption !== "Radio por Diametro") {
        alert("Seleccione una opción.");
        return;
    }

    if(isNaN(inputValue)){
        alert("Asegúrese de ingresar un valor numérico correcto.");
        return;
    }

    let radio;
    if (selectedOption === "Radio por Area") {
        radio = calcularRadioDesdeArea(inputValue);
    } else if (selectedOption === "Radio por Diametro") {
        radio = calcularRadioDesdeDiametro(inputValue);
    }

    if (!isNaN(radio)) {
        alert(`El radio del círculo es: ${radio}`);
    }
});

function calcularRadioDesdeDiametro(diametro) {
    return diametro / 2;
}

function calcularRadioDesdeArea(area) {
    return Math.sqrt(area / Math.PI);
}