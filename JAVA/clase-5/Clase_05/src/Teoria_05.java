
public class Teoria_05 {
    public static void main(String[] args) {
        //Inferencia de tipos var y primitivos
        
        var numEntero = 20; //Las literales sin punto automaticamente son INT
        System.out.println("numEntero = " + numEntero);
        
        var numFloat = 10.0F; //Con el punto automaticamente se vuelve DOUBLE
        System.out.println("numFloat = " + numFloat);
        
        var numDoble = 10.0;
        System.out.println("numDoble = " + numDoble);
        
        /*
            ========================================
                        TIPO DE DATO CHAR
            ========================================

            ¿Qué es un char?

            El tipo char se utiliza para almacenar
            un único carácter.

            Ocupa 16 bits y utiliza el estándar
            Unicode, por lo que puede representar
            letras, números y símbolos de muchos idiomas.

            DECLARACIÓN
            -----------

            char letra = 'A';

            Importante:
            Los valores char se escriben entre comillas simples (' ').

            Correcto:

                char inicial = 'E';

            Incorrecto:

                char inicial = "E"; // Esto es String

            EJEMPLOS
            --------
            */
        
            char letra = 'A';
            char numero = '5';
            char simbolo = '$';
            char espacio = ' ';
            
            /*

            CHAR Y UNICODE
            --------------
           
            Cada carácter tiene un código numérico.

            Ejemplo:
            
            */

            char letraA1 = 65;

            System.out.println(letraA1);
            
            /*
            
            Salida: A

            Porque 65 corresponde al carácter 'A' en Unicode.

            OPERACIONES CON CHAR
            --------------------

            Los caracteres pueden participar en operaciones matemáticas.

            Ejemplo:
            
            */
            
            char letraA2 = 'A';

            System.out.println(letraA2 + 1);
            
            /*
            
            Salida: 66

            Si queremos obtener el siguiente carácter:
            */
            
            char letraA3 = 'A';
            char siguiente = (char)(letraA3 + 1);

            System.out.println(siguiente);
            
            /*
            Salida: B


            DIFERENCIA ENTRE CHAR Y STRING
            ------------------------------

            char: almacena un solo carácter.
            
            */
            
            char letraA = 'A';
            
            /*
            
            String: Almacena texto completo.
            
            */
            
            String nombre = "Esteban";

            /*

            CARACTERES ESPECIALES
            ---------------------
            */
            
            char saltoLinea = '\n';
            char tabulacion = '\t';
            char comillaSimple = '\'';
            
            /*
            
            Estos se conocen como caracteres de escape.

            RESUMEN
            -------

            - char almacena un único carácter.
            - Se escribe entre comillas simples.
            - Ocupa 16 bits.
            - Utiliza Unicode.
            - Puede almacenar letras, números y símbolos.
            - Es diferente de String.
        */
    }
}
