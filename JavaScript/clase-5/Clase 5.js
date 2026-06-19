// Tipos de Datos en JavaScript
/*
La sintaxis en lo que es comentarios
es muy similar a la de Java
realmente diriamos que es identica
*/

//Tipo STRING (STR)

//Puede usarse "" o ''
var nombre = "Esteban";
var nombre2 = "Esteban";

console.log(nombre);
console.log(nombre2);

//Tipo NUMERICO (Num)

var numero = 3000;
console.log(numero);

//Tipo OBJETO (OBJ)

var objeto = {
    nombre: "Esteban",
    apellido: "Jaque",
    telefono: 2604336061
}

console.log(objeto)


//Para ejecutar codigo JS se usa el SublineText, se genera un html y luego con la opcion "Open in Browser" se ejecuta como una pagina



//Reutilizacion de variables

//En JS las variables son dinamicas
var nombre = "Esteban";
var nombre2 = "Esteban";

console.log(nombre);
console.log(nombre2);

//Al reusar el nombre de la varible, pero cambiando el contenido, obtine el tipo de ese contenido
nombre = 7;
console.log(nombre)

nombre = 12.3;
console.log(typeof nombre)

//Una forma de saber el tipo de variable es con el codigo TypeOf

var nombre = "Esteban";
var nombre2 = "Esteban";

console.log(typeof nombre);
console.log(typeof nombre2);

nombre = 7;
console.log(typeof nombre);

nombre = 12.3;
console.log(typeof nombre);

var objeto = {
    nombre: "Esteban",
    apellido: "Jaque",
    telefono: 2604336061
}

console.log(typeof objeto)


//Con eso demostramos que la variable cambia de tipo segun lo que se le ingrese



//Tipo de Dato Boolean

var bandera = true;
console.log(typeof bandera);

//Tipo de Dato Funcion

function miFuncion(){};
console.log(typeof miFuncion);

//Tipo de Dato Symbol

var simbolo = Symbol("Mi simbolo");
console.log(typeof simbolo);

//Tipo de Dato Clase

class persona{
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}

console.log(typeof persona);

//Tipo de Datos Undefined

var x;
console.log(x);

x = undefined;
console.log(typeof x);

// null: significa ausencia de valor
var y = null; //null no es un tipo de dato, pero si origen es de tipo object
console.log(typeof y);


//Tipos de Datos Array y Empty String

var autos = ['Citroen','Audi','BMW','Ford'];
console.log(autos);  
console.log(typeof autos);

var z = '';
console.log(z); //Esto se refiere a que es una cadena vacia
console.log(typeof z);