/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicio_5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Maria");
        nombres.add("Carlos");
        nombres.add("Ana");

        System.out.print("Ingrese un nombre para buscar: ");
        String nombre = leer.nextLine();

        if (nombres.contains(nombre)) {
            System.out.println("El nombre existe en la lista.");
        } else {
            System.out.println("El nombre no existe.");
        }

    }
}
