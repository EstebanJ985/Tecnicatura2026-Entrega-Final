import java.util.Scanner;

public class EJERCICIO_CALIFICACIONES_IFELSE {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la nota del 1 a 10: ");
        
        var nota = Integer.parseInt(entrada.nextLine());
        
        if (nota >= 9 && nota <= 10){
            System.out.println("Su calificacion es: A");
        }
        else if (nota >= 8 && nota <= 9){
            System.out.println("Su calificacion es: B");
        }
        else if (nota >= 7 && nota <= 8){
            System.out.println("Su calificacion es: C");
        }
        else if (nota >= 6 && nota <=7 ){
            System.out.println("Su calificacion es: D");
        }
        else if (nota >= 0 && nota < 6){
            System.out.println("Su calificacion es: F");
        }
        else {
            System.out.println("Fuera de rango");
        }
    }
    
}
