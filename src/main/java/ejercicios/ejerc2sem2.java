
package ejercicios;
import java.util.Scanner;


public class ejerc2sem2 {
    public static void main(String[] args) {
        double DAI;
        double depreciacion = 0.10;
        double total1;
        double total2;
        double total3;
        double mul1 = 0.25;
        double mul2 = 0.10;
        double total;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del vehiculo en USA");
        double valorV = leer.nextDouble();
        
        System.out.println("Ingrse el costo por flete");
        double flete = leer.nextDouble();
        
        System.out.println("Ingrese el valor de seguro");
        double seguro = leer.nextDouble();
        
        DAI = valorV * depreciacion;
        total1 = valorV - DAI;
        total2 = total1 - flete;
        total3 = total2 - seguro;
        total = total3 * mul1;
        
        System.out.println("EL valor por Derecho Arancelario a la importacion de su vehiculo es de: $" + total);
        
        depreciacion = valorV * mul2;
        
        System.out.println("El valor de Depreciacion es de: $" + depreciacion);
        
    }
    
}
