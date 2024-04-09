let contador = 0;
while (contador < 3) {
    console.log(contador);
    contador ++;
}
console.log("Fin del ciclo");

let conteo = 0;
do {
    console.log(conteo);
    conteo ++;
} while (conteo <3);
console.log("Termina el ciclo DO WHILE");

for (let contando = 0; contando < 3; contando++) {
    console.log(contando);
}
console.log("Termina ciclo FOR")

for (let index = 0; index <= 10; index++) {
    if (index % 2 == 0) {
        console.log(index)
        break;
    }
    
}
console.log("Termina ciclo FOR de primer número par")

inicio:
for (let index = 0; index <= 10; index++) {
    if (index % 2 !== 0) {
        continue inicio;
    }
    console.log(index)
}
console.log("FIN")
