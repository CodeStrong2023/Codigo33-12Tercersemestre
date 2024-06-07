
        //funcion para numeros random 
        function numRandom (max,min){
            return Math.floor(Math.random()*(max - min + 1) + min)
        }
        let resultado=""

        function eleccion(jugada){
            if(jugada == 1){
                resultado = "Piedra"
            }else if(jugada == 2){
                resultado = "Papel"
            }else if(jugada == 3){
                resultado = "tijera"
            }else{
                resultado = "Opcion invalida"
            }
            return resultado
        }

        let pc = 0
        let jugador = 0
        let triunfo = 0
        let perdidas = 0

        while(triunfo < 3 && perdidas < 3){
            pc=numRandom(3, 1)
            jugador = prompt("Elige: 1 piedra, 2papel, 3 tijera")
            //Jugador elige
            alert("PC elige:" + eleccion(pc))
            alert("Jugador elige:" + eleccion(jugador))


        //combate 
             if (pc == jugador){
            alert("Empataste!")
             }else if((jugador == 1 && pc ==3) || (jugador == 2 && pc == 1) ||(jugador == 3 && pc ==2) ){
            alert("Bien hecho, ganaste!!")
            triunfo ++
             }else{
            alert("Lo siento, perdiste :(")
            perdidas++
            }
        }

        alert("Ganaste: "+ triunfo + ", Perdiste: " + perdidas)