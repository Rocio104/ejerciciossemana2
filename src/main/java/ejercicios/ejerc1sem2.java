
package ejercicios;
import java.util.Scanner;


public class ejerc1sem2 {
    public static void main(String[] args) {
        double rebaja = 0.15;
        double iva = 0.13;
        double precioT = 0.0;
        double precioI;
        double precioF;
        double total;
        Scanner leer = new Scanner(System.in);
       
        System.out.println("Imgrese el precio de la computadora");
        double n = leer.nextDouble();
        
        precioT = n * iva;
        precioI = n + precioT;
        precioF = precioI * rebaja;
        total = precioI - precioF;
        
        System.out.println("El precio total es: $" + total);
        
        
    }
    
}
