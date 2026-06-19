public class Teoria_07 {
    public static void main(String[] args) {
   
        //OPERADORES ARITMETICOS
        
        //SUMA
        int num1 =5, num2 = 4;
        var solucion = num1 + num2;
        System.out.println("solucion suma= " + solucion);
        
        //RESTA
        solucion = num1 - num2;
        System.out.println("solucion resta= " + solucion);
        
        //MULTIPLICACION
        solucion = num1 * num2;
        System.out.println("solucion multiplicacion=" + solucion);
        
        //DIVISION
        solucion = num1 / num2;
        System.out.println("solucion division= " + solucion);
        
        var solucion2 = 3.4D / num2;
        System.out.println("solucion division 2 = " + solucion2);
        
        //RESIDUO DE DIVISION
        solucion = num1 % num2;
        System.out.println("solucion = " + solucion);
        
        if (num1 % 2 == 0)
            System.out.println("Es par");
        else
            System.out.println("Es impar");
        
        
        //OPERADORES DE ASIGNACION
        
        int varNum1 = 1, varNum2 = 4;
        var varNum3 = varNum1 + 6 - varNum2; 
        System.out.println("varNum3 = " + varNum3);
        
        varNum1 += 1;
        System.out.println("varNum1 = " + varNum1);
        
        // -=  *=  /=  %=
        
        varNum2 -= 2;
        System.out.println("varNum2 = " + varNum2);
        
        varNum1 *= 5;
        System.out.println("varNum1 = " + varNum1);
        
        varNum3 /= 4;
        System.out.println("varNum3 = " + varNum3);
        
        varNum1 %= 6;
        System.out.println("varNum1 = " + varNum1);
        
        //Operadores Unarios: Cambio de Signo
        
        var varA = 7;
        var varB = -varA;
        
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB); //El resultado sera el numero negativo
        
        //Operador de Negacion
        
        var varC = true; //Esta literal por default en Java es de tipo Boolean
        var varD = !varC; //Aque esta imprimiendo el valor
        
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);
        
        //Operadores Unarios de Incremento: Preincremento
        
        var varE = 9; //Se va a modificar su valor
        var varF = ++varE; //Simbolo antes de la variable
        //Primero se incrementa la variable y despues se usa su valor
        System.out.println("varE = " + varE); //Se incrementa en la unidad
        System.out.println("varF = " + varF); //Va a sumar 1
        
        //Postincremento (el simbolo va despues de la variable)
        
        var varG = 3;
        var varH = varG++; //Primero el valor de la variable, luego el incremento
        
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);
        
        //Operadores Unarios de decremento: Predecremento
        
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI); //La variable ya esta con decremento
        System.out.println("varJ = " + varJ);
        
        //Postdecremento
        
        var varK = 8;
        var varL = varK--; //Primero el valor de la variable, luego queda el decremento
        System.out.println("varK = " + varK);
        System.out.println("varL = " + varL);
        
        //Operadores de Igualdad y Relacionales
        
        var aNum = 5;
        var bNum = 4;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);
        
        var dNum = aNum != bNum;
        System.out.println("dNum = " + dNum);
        
        var cadenaA = "Hello";
        var cadenaB = "bye bye";
        var cVar = cadenaA == cadenaB;
        System.out.println("cVar = " + cVar);
        
        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar = " + fVar);
        
        var gVar = aNum != bNum; //> >= < <= == !=
        System.out.println("gVar = " + gVar);
        
        if (aNum % 2 == 0) {
            System.out.println("El numero es Par");
        } else {
            System.out.println("El numero es impar");
        }
          
        var edad = 15;
        var adulto = 18;
        if (edad >= adulto) {
            System.out.println("Es mayor de edad");
        }
        else {
            System.out.println("Es menor de edad");
        }
        
        //Operador Ternario
        
        var resultadoT = (5 > 8) ? "Verdadero" : "Falso";
        System.out.println("resultadoT = " + resultadoT);

        var numeroZ = 4;
        resultadoT = (numeroZ % 2 == 0) ? "Es par" : "Es impar";
        System.out.println("numeroZ = " + numeroZ);
        
        //Prioridad de los Operadores
        
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x); //6
        System.out.println("y = " + y); //9
        System.out.println("z = " + z); //16
        
        var solucionAritmetica = 4 + 5 * 6 / 3; // 4 + ((5 * 6) / 3) = 30 / 3 = 10 + 4 = 14
        System.out.println("solucionAritmetica = " + solucionAritmetica);
    
        solucionAritmetica = (4 + 5) * 6 / 3; //4 + 5 = 9 * 6 = 54 / 3 = 18
        System.out.println("solucionAritmetica = " + solucionAritmetica);
    }       
}
