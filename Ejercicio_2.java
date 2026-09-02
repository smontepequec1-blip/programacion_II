
package Ejercicios;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            System.out.print("Ingrese un número: ");
            int numero = leer.nextInt();

            numeros.add(numero);
        }

        System.out.println("\nNúmeros ingresados:");

        for (int numero : numeros) {
            System.out.println(numero);
        }

    }
}
