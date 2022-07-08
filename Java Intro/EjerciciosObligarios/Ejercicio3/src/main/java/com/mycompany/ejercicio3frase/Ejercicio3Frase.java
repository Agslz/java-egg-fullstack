package com.mycompany.ejercicio3frase;

import java.util.Scanner;

/**
 *
 * @author Ags
 */

public class Ejercicio3Frase {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String frase = leer.nextLine();
        System.out.println("Su frase en mayúsculas es: " + frase.toUpperCase());
        System.out.println("Su frase en minuscilas es: " + frase.toLowerCase());
    }
}
