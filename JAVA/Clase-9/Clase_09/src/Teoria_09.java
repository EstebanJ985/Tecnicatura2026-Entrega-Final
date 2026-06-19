import java.util.Scanner;

public class Teoria_09 {
    public static void main(String[] args) {
        
        //IF ELSE
        
        var condicion = false;
        
        if (condicion){
            System.out.println("Condicion Verdadera");
        }
        else{
            System.out.println("Condicion Falsa");
        }
        
        // SWITCH
        
        var valor = 2;
        var salida = "Num desconocido";
        
        switch (valor){
            case 1: //En caso de que valor sea 1
                salida = "Numero UNO"; //Resultado
                break; //Se frena el algoritmo aca por que se resolvio
                
            case 2: 
                salida = "Numero DOS";
                break;
                
           //ASI LAS VECES NECESARIAS
        
        }
        
        //CASO PRACTICO
         
        Scanner entrada = new Scanner(System.in);
        
        var numero = Integer.parseInt(entrada.nextLine());
        var numeroTexto = "Numero Desconocido";
        
        switch (numero){
            case 1:
                numeroTexto = "Numero UNO";
                break;
            case 2:
                numeroTexto = "Numero DOS";
                break;
            case 3:
                numeroTexto = "Numero TRES";
                break;
            case 4:
                numeroTexto = "Numero CUATRO";
                break;
            default:
                numeroTexto = "Caso no encontronado";
        }
        
        System.out.println("numeroTexto = " + numeroTexto);
}
}
