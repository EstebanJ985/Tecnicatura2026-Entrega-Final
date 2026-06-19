//Operador OR
let variable1 = false, variable2 = false;


if (variable1 || variable2){
    console.log("Resultado FALSE");
}
else{
    console.log("Resultado TRUE");
}

//Operador Ternario

let resultado2 = 3 > 2 ? "Verdadero" : "Falso";
console.log(resultado2);

//Funcion NUMBER
//Al aplicar la funcion number, cambia el tipo de la variable a NUMBER

let miNumero = "21"; //Es una cadena
console.log(typeof miNumero)

let edad = Number(miNumero); //esta en una funcion
console.log(typeof edad);