import java.util.Scanner;
public class EJERCICIO_Detalles_Libro {
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
    
        System.out.println("Digite el nombre del libro:");
        
        var nombreLibro = entrada.nextLine();
        System.out.println("nombreLibre = " + nombreLibro);
        
        System.out.println("Digite el nombre del autor");
        
        var nombreAutor = entrada.nextLine();
        System.out.println("nombreAutor = " + nombreAutor);
        
        System.out.println(nombreLibro + " fue escrito por " + nombreAutor);
    
    }
}
