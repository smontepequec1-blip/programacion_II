
package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();

        int opcion;

        do {

            System.out.println("\n--- MENU ---");
            System.out.println("1. Agregar");
            System.out.println("2. Mostrar");
            System.out.println("3. Eliminar");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese un elemento: ");
                    String elemento = leer.nextLine();
                    lista.add(elemento);
                    System.out.println("Elemento agregado.");
                    break;

                case 2:
                    System.out.println("\nElementos:");

                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(i + " - " + lista.get(i));
                    }

                    break;

                case 3:
                    System.out.print("Ingrese el índice que desea eliminar: ");
                    int indice = leer.nextInt();

                    if (indice >= 0 && indice < lista.size()) {
                        lista.remove(indice);
                        System.out.println("Elemento eliminado.");
                    } else {
                        System.out.println("Índice incorrecto.");
                    }

                    break;

                case 4:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 4);

    }
}

