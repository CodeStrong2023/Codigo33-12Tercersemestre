let ataqueJugador
let ataqueEnemigo

function inicioJuego(params) {
    //Eleccion del jugador
    let botonPersonajeJugador = document.getElementById('boton-personaje');
    botonPersonajeJugador.addEventListener('click', seleccionarPersonajeJugador);
    //eleccion de ataque
    let botonPunio = document.getElementById('boton-punio') 
    botonPunio.addEventListener('click', ataquePunio())

    let botonPatada = document.getElementById('boton-patada')
    botonPatada.addEventListener('click', ataquePatada())

    let botonBarrida = document.getElementById('boton-barrida')
    botonBarrida.addEventListener('click', ataqueBarrida())
}




//Funcion para obtener numeros random 
function numRandom (max,min){
    return Math.floor(Math.random()*(max - min + 1) + min)
}

function seleccionarPersonajeJugador(){ //tarea agregar activad a la funcion al alegior el personaje
    const radioPersonajes = document.querySelectorAll('input[name="personaje"]');
    for (let index = 0; index < radioPersonajes.length; index++) {
        if (radioPersonajes[index].checked) {
            const personajeSeleccionado = radioPersonajes[index].id;
            alert('SELECCIONASTE EL PERSONAJE: ' + personajeSeleccionado)
        }
    }
    eleccionEnemigo();
}

//Funcion para que se elija un personaje aleatorio como oponente
function eleccionEnemigo(){
    enemigo = numRandom(4,1)
    if (enemigo == 1) {
        alert('El enemigo selecciono a zuko')
    } else if(enemigo == 2){
        alert('El enemigo selecciono a katara')
    }else if (enemigo == 3) {
        alert('El enemigo selecciono a aang')
    } else {
        alert('El enemigo selecciono a toph')
    }
}

//Ataque del jugador

function ataquePunio(){ 
    ataqueJugador = 'Punio'
    ataqueAleatorio()
}

function ataquePatada(){ 
    ataqueJugador = 'Patada'
    ataqueAleatorio()
}

function ataqueBarrida(){ 
    ataqueJugador = 'Barrida'
    ataqueAleatorio()
}


//Funcion de ataque aleatorio del enemigo
function ataqueAleatorio() {
    ataqueEnemigo = numRandom(3,1)
    if (condition) {
        alert('El enemigo selecciono Ataque de Punio')
    } else if (condition) {
        alert('El enemigo selecciono Ataque de Patada')
    } else {
        alert('El enemigo selecciono Ataque de Barrida')
    }
}
window.addEventListener('load', inicioJuego)