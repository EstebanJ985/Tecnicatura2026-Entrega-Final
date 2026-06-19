public class Teoria_02 {
    //Para evitar tipear todo esto,podemos usar psvm + enter
 public static void main(String[] args) {
     //Para mandar algo por consola es:
     System.out.println("TEXTO QUE SE QUIERA DAR A CONSOLA");
     //Tambien podemos usar sout + enter
        /* 
        ========================================
            TEORÍA: VARIABLES EN JAVA
        ========================================

        Una variable es un espacio en memoria que permite almacenar datos
        durante la ejecución de un programa.
    
        SINTAXIS:
        tipo nombreVariable = valor;
    
        EJEMPLO
        int edadHombre = 20;
    
        ---------------------------------------
                TIPOS DE DATOS EN JAVA
        ---------------------------------------
    
        Existe 2 tipos:
    
        -Primitivos
        -Referencia (Objetos)
    
    
        ---------------------------------------
               TIPOS PRIMITIVOS
        ---------------------------------------
    
                   BITS
        Representan cuanta memoria usa la variable segun el tipo
        
            8 bits = -128 a 127
            16 bits = -32768 a 32767
            32 bits = +- 2.147 Millones
            64 bits = +- 9 quintillones
     
        ENTEROS:
            
            byte = 8 bits
            short = 16 bits
            int = 32 bits
            long = 64 bits
    
        CARACTER:
            
            char = 16 bits (Unicode)
    
        DECIMALES: 
            
            float = 32 bits
            double = 64 bits
    
        LOGICOS:
            
            boolean = True o False (Default es FALSE)
  
        EJEMPLOS
        */
  
            byte numeroPequeno = 100;
            int edad = 25;
            long poblacion = 8000000L;

            float altura = 1.75f;
            double precio = 1599.99;

            char letra = 'A';

            boolean activo = true;
  
        /*
        ----------------------------------------
               STRING (CADENAS DE TEXTO)
        ----------------------------------------

        String es un tipo Object (no es primitivo).

        Ejemplo:
        */
    
        String nombre = "Esteban";
        String apellido = "Jaque";
        
        /*
        A diferencia de otros objetos no es necesario poner
        NEW antes del tipo
    
        ----------------------------------------
                    CONCATENACIÓN
        ----------------------------------------

        El operador + une cadenas de texto.
    
        EJEMPLO:
        */
    
    
        String nombre2 = "Esteban";
        String apellido2 = "Jaque";
    
        String completo = nombre2 + " " + apellido2;

    System.out.println(completo);
    
        /*
        ----------------------------------------
                COMPARACIÓN DE CADENAS
        ----------------------------------------

        Para comparar Strings se utiliza equals().
    
        EJEMPLO
        */
    
        String A = "Hola";
        String B = "HOLA";
    
        A.equals(B);
    
        /*
        ----------------------------------------
                CARACTERES DE ESCAPE
        ----------------------------------------

        \\n  -> Salto de línea
        \\t  -> Tabulación
        \\\" -> Comilla doble
        \\\\  -> Barra invertida

        EJEMPLO:
        */
    
    System.out.println("Hola\nMundo");
    
     System.out.println(" ");
     System.out.println(" ");
     
     
        /*
        ----------------------------------------
              IMPORTANCIA DE LAS VARIABLES
        ----------------------------------------

        - Permiten almacenar información.
        - Hacen que los programas sean dinámicos.
        - Los valores pueden cambiar durante la ejecución.
        - Son la base para crear algoritmos y programas.
        */
        
        
     System.out.println("EJEMPLOS EN PAGINA UTN:\n");
     
     System.out.println("Hola Mundo desde JAVA");
     System.out.println("");
     
     int miVariable = 10;
     System.out.println(miVariable);
     miVariable = 5;
     System.out.println(miVariable);
     System.out.println("");
     
     //Tipo STRING
     
     String miVariableCadena = "Bienvenidos";
     System.out.println(miVariableCadena);
     miVariableCadena = "Sigamos creciendo en programación";
     System.out.println(miVariableCadena);
     System.out.println("");
     
     }
  }
 

