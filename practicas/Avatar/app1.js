

let botonPersonajeJugador = document.getElementById('boton-personaje');

botonPersonajeJugador.addEventListener('click', seleccionarPersonajeJugador);

function seleccionarPersonajeJugador(){ //tarea agregar activad a la funcion al alegior el personaje
    const radioPersonajes = document.querySelectorAll('input[name="personaje"]');
    for (let index = 0; index < radioPersonajes.length; index++) {
        if (radioPersonajes[index].checked) {
            const personajeSeleccionado = radioPersonajes[index].id;
            alert('SELECCIONASTE EL PERSONAJE: ' + personajeSeleccionado)
        }
    }
}


