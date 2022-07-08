package com.mycompany.ejercicio9lenght;

import java.util.Scanner;

/**
 *
 * @author ags
 */
public class Ejercicio9Lenght {

    public static void main(String[] args) {

        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        int longitud = frase.length();
        if (longitud != 8) {
            System.out.println("La frase es de 8 caracteres");
        } else {
            System.out.println("Error: Por favor ingrese una frase de 8 letras");
        }
    }
}
