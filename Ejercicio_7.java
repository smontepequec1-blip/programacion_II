
package Ejercicios;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        ArrayList<String> tareas = new ArrayList<>();

        tareas.add("Hacer tarea");
        tareas.add("Estudiar Java");
        tareas.add("Hacer ejercicio");
        tareas.add("Leer");

        System.out.println("Tareas pendientes:");

        for (int i = 0; i < tareas.size(); i++) {
            System.out.println(i + " - " + tareas.get(i));
        }

        System.out.print("\nIngrese el número de la tarea completada: ");
        int numero = leer.nextInt();

        if (numero >= 0 && numero < tareas.size()) {

            tareas.remove(numero);

            System.out.println("Tarea completada y eliminada.");

        } else {

            System.out.println("Número incorrecto.");

        }

        System.out.println("\nTareas pendientes:");

        for (String tarea : tareas) {
            System.out.println(tarea);
        }

    }
}

