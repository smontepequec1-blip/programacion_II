
package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio_3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        ArrayList<String> nombres = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            System.out.print("Ingrese un nombre: ");
            String nombre = leer.nextLine();

            nombres.add(nombre);
        }

        System.out.println("\nLista de nombres:");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

    }
}
