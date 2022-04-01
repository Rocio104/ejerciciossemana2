
package developer;


public class ejem3 {
    public static void main(String[] args) {
        double cantidadPrestada, tiempo, tasaDeIntereses;
        cantidadPrestada = 1500.00;
        tiempo =0.75; //9 meses equivalen a 9/12 años = 2/4 ó 0,75
        tasaDeIntereses = 0.08;
        
        double valorInteresSimple = calcularInteresSimple(cantidadPrestada, tiempo, tasaDeIntereses);
        System.out.println("El interes es: $" + valorInteresSimple);
    }
    public static double calcularInteresSimple(double cantidadPrestada, double tiempo, double tasaDeInteres) {
        double interesSimple;
        interesSimple = cantidadPrestada * tiempo * tasaDeInteres;
        return interesSimple;
    }
    
}
    


