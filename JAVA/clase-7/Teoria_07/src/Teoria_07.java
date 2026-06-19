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
}
}
