import java.util.Scanner;
public class Teoria_06 {
    public static void main(String[] args) {
   
        var varBool = false;
        System.out.println("varBool = " + varBool);
        
        if(varBool){
            System.out.println("La bandera es verde");
        }
        else{
            System.out.println("La bandera es roja");
        }
        
        
        //Algoritmo ¿Es mayor de edad?
        
        var edad = 30; //Literal tener presente la inferencia de tipos
        var adulto = edad >= 10; //Esta es una expresion booleana
        
        if (adulto){
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("Eres menor de edad");          
        }
        
        
        //Convertir de tipos primitivos
        
        var edad2 = Integer.parseInt("20");
        System.out.println("edad2 = " + (edad2 + 1));
        
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        
        //Pedir un valor
        
        var entrada = new Scanner(System.in);
        System.out.println("Digite su edad:");
        edad = Integer.parseInt(entrada.nextLine());
        System.out.println("entrada = " + edad);
        
        //Conversion de tipos primitivos en Java pt2
        
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var fraseChar = "Programadores".charAt(4);
        System.out.println("fraseChar = " + fraseChar);
        
        System.out.println("Digite un caracter: ");
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);
}
}
