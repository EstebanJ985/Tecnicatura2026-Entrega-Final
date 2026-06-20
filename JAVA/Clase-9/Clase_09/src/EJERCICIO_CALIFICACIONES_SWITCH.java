
import java.util.Scanner;

public class EJERCICIO_CALIFICACIONES_SWITCH {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la nota del 1 a 10: ");
        
        var nota = Integer.parseInt(entrada.nextLine());
        
        switch(nota){
            case 9: case 10:
                System.out.println("Su calificación es: A");
                break;
            case 8:
                System.out.println("Su calificación es: B");
                break;
            case 7:
                System.out.println("Su calificación es: C");
                break;
            case 6:
                System.out.println("Su calificación es: D");
                break;
            case 0: case 1: case 2: case 3: case 4: case 5:
                System.out.println("Su calificación es: F");
                break;
            default:
                System.out.println("Fuera de rango");
        }
    }
}
