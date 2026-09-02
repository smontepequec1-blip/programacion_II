
package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_1 {
    
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        ArrayList<String> elementos = new ArrayList<>();
        
        String dato;
        
        System.out.println("Ingrese ekemento.");
        System.out.println("escriba fin para terminar.");
        
        do{
            System.out.print("Ingrese un elemento: ");
            dato = leer.nextLine();
            
            if (!dato.equals("fin")){
                elementos.add(dato);
            }           
        }while (!dato.equals("fin"));
        
        System.out.println("\nElementos Ingresados:");
        for (String elemento : elementos){
            System.out.println(elemento);
            
        }
    }
}
