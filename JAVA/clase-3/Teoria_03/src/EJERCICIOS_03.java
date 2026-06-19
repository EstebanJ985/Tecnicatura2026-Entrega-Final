import java.util.Scanner;

public class EJERCICIOS_03 {
        
public static void main(String[] args) {
   
        //EJERCICO DE CONCATENACION
        
        var usuario = "Osvaldo";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        
        System.out.println("union = " + union);
        
        var a = 8;
        var b = 4;
        
        System.out.println(usuario + (a+b));
    
        //EJERCICIO CARACTERES ESPECIALES
        
        var nombre = "Natalia";
        System.out.println("\nNueva linea: \n" + nombre); //Diagonal inversa + n
        System.out.println("Tabulador: \t" + nombre); //Tabulador un espacio para centrar
        System.out.println("\t\t.:MENÚ:.");
        System.out.println("Retroseso: \b\b" + nombre); //Caracter de retroseso
        System.out.println("Comillas simples: \'" + nombre + "\'");
        System.out.println("Comillas Dobles: \"" + nombre + "\"");
        
        //EJERCICIO SCANNER
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        
        System.out.println("Resultado: " + titulo2 + " " + usuario2);

}

}
