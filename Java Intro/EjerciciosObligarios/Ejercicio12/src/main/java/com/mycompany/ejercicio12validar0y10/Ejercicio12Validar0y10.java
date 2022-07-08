package com.mycompany.ejercicio12validar0y10;

import java.util.Scanner;

/**
 *
 * @author ags
 */
public class Ejercicio12Validar0y10 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int nota;
        System.out.println("Ingrese una nota entre 0 y 10");
        nota = leer.nextInt();
        while (nota > 10 || nota < 0) {
            System.out.println("La nota ingresada debe ser entre 0 y 10");
            nota = leer.nextInt();
        }
        System.out.println("La nota ingresada es: " + nota);
    }

}
