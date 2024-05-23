import {palabrasClave} from './palabrasalerta'
import {run} from './app';

document.getElementById("send-button").addEventListener("click", function guardadodetexto() {
    var textoIngresado = document.getElementById("textoEntrada").value;

    if (typeof textoIngresado === undefined || typeof textoIngresado === null || textoIngresado === "" || textoIngresado === " ") {
        console.log("Por favor, escriba algo antes de enviar el mensaje");
    } else if (textoIngresado.includes(palabrasClave)) {
        
        console.log("Lamento escuchar eso, la depresión no debe arruinar tu vida. Si estas pensando en suicidarte o crees que puedes lastimarte, necesitas ayuda de un profesional. En caso de necesitar ayuda inmediata le sugerimos visitar el siguiente sitio web: pi.findahelpine.com");
        console.log("Fui creado con el fin de proteger la salud mental de mis usuarios, busca ayuda y no te des por vencido, tu vida vale mucho.")
    } else {
      run(textoIngresado);
    } 

    // Acá se guarda el texto
});// esto lo voy a mover a otro archivo