miFuncion(7,8); //Esto es hosting

function miFuncion(a, b) {
   // console.log("Sumamos: "+(a+b));
   return a + b;
}

miFuncion(5,6);

let resultado = miFuncion(8, 8);
console.log(resultado)

// function de tipo expresion o anonima
let x = function(a, b){return a + b};
resultado = x(5, 6) 
console.log(resultado);

//function de tipo self e invoking
(function(a, b){
    console.log('Ejecutando la funcion= ' + ( a + b ));
})(9,6);

console.log(typeof miFuncion)

function miFuncionDos(a, b){
    console.log(arguments.length);
}

miFuncionDos(5, 7);

//toString
var miFunciontexto = miFuncionDos.toString();
console.log(miFunciontexto)

//function flecha
const sumarfunctionFlecha = (a, b) => a + b;
resultado = sumarfunctionFlecha(3, 7);
console.log(resultado)

let sumar = function(a,b){
    console.log(arguments[0]);
    console.log(arguments[1]);
    return a + b +arguments[2];
}
resultado = sumar(3, 5, 9);
console.log(resultado);

let respuesta = sumartodo (4, 5, 6, 7, 8);
console.log(respuesta);

//sumar todos los argumentos
function sumartodo(){
    let sumar = 0; 
    for (let index = 0; index < arguments.length; index++) {

        sumar += arguments[index];

    }
    return sumar;
}

//tipos primitivos 
let k = 10;
function cambiarValor(a) {
    a=20
}
cambiarValor(k);
console.log(k)

//Paso por referencia
const persona = {
    nombre: "Juan",
    apellido: "lopez"
}
console.log(persona);

function cambiarValorObjeto(p1){
    p1.nombre = "Ignacio";
    p1.apellido = "Perez";
}
cambiarValorObjeto(persona);
console.log(persona);