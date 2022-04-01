
package demostracion;

import java.util.Scanner;


public class Rdemostracion {
    public static void main(String [] args) {
        String nombre = "";
        Estudiante objeto = new Estudiante();
        //Notas objeto 1 = new notas();
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Digite el carnet: ");
        objeto.setCarnet(Integer.parseInt(leer.nextLine()));
        
        System.out.println("Digite el nombre: ");
        objeto.setNombre(leer.nextLine());
        
        System.out.println("Digite el apellido: ");
        objeto.setApellido(leer.nextLine());
        
        System.out.println("Digite la edad: ");
        objeto.setEdad(leer.nextInt());
        
        System.out.println("Digite la nota 1: ");
        objeto.setNota1(leer.nextDouble());
        
        System.out.println("Digite la nota 2: ");
        objeto.setNota2(leer.nextDouble());
        
        System.out.println("Digite la nota 3: ");
        objeto.setNota3(leer.nextDouble());
        
        System.out.println("Digite la nota 4: ");
        objeto.setNota4(leer.nextDouble());
        
        nombre = objeto.informacion();
        System.out.println("" + nombre);
        System.out.println("La nota final es: " + objeto.promedio());
        System.out.println("observacion: " + objeto.observacion(objeto));
        
    }
    
    
}
