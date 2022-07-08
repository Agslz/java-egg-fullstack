package com.mycompany.ejercicio10validar;

import java.util.Scanner;

/**
 *
 * @author ags
 */
public class Ejercicio10Validar {

    public static void main(String[] args) {

        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase");
        frase = leer.next();
        if ("A".equals(frase.toUpperCase().substring(0, 1))) {
            System.out.println("Correcto: La primer letra es una A");
        } else {
            System.out.println("Incorrecto: La primer letra no es una A");
        }
    }
}
