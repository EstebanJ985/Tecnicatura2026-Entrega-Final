import java.util.Scanner;

public class Teoria_03 {
    public static void main(String[] args) {
   

    /*
    
    VARIBLE DOUBLE = NUMEROS REALES
    
    ----------------------------------------
                  CONSTANTES
    ----------------------------------------

    Una constante es un valor que NO puede cambiar.

    Se utiliza la palabra reservada final.

    Ejemplos:
    */
    
    final int VALOR_INICIAL = 5;

    final double IVA = 0.21;

    /*
    Buenas prácticas:
        - Escribirlas en MAYÚSCULAS.
        - Utilizar guion bajo para separar palabras.

    Ejemplo:
    */

    final double PRECIO_MAXIMO = 1500.0;
    
    /*
    ----------------------------------------
      DIFERENCIA ENTRE VARIABLE Y CONSTANTE
    ----------------------------------------

    Variable:
    Su valor puede modificarse.
    */
    
    int edad = 20;
    edad = 21;
    
    /*
    Constante:
    Su valor no puede modificarse.
    */
    final int DIAS_SEMANA = 7;
 
    //VARIABLES - INFERENCIAS DE TIPOS
    
    var miVariableEntera2 = 10;
    var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        //soutv para completar con la variable
        
    /*
        REGLAS DE DEFINICION DE VARIABLES
        
        1) Usar CAMELCASE
        2) No iniciar con un numero
        3) Se pueden usar caracteres especiales para iniciar ($ y _)
        4) No usar acentos
        
    */
        
    //Clase SCANNER
    
    Scanner entrada = new Scanner(System.in);
    var usuario2 = "Carlos";
        System.out.println("usuario2 = " + usuario2);
    
    
    
    }
    
    
    
}
    
