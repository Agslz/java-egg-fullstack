package com.mycompany.ejercicio3extra;

import java.util.Scanner;

public class Ejercicio3Extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String letra;
        System.out.println("Ingrese una letra");
        letra = leer.next();
        while (letra.length() > 1) {
            System.out.println(" ");
            System.out.println("Ingrese una sola letra");
            System.out.println("Ingrese una letra");
            letra = leer.next();
        }
        if (letra.toUpperCase().equals("A") || letra.toUpperCase().equals("E") || letra.toUpperCase().equals("I") || letra.toUpperCase().equals("O") || letra.toUpperCase().equals("U")) {
            System.out.println("Es vocal");
        } else {
            System.out.println("No es vocal");
        }
    }
}
