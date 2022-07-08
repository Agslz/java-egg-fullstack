package com.mycompany.ejercicio13valorlimite;

import java.util.Scanner;

/**
 *
 * @author ags
 */
public class Ejercicio13ValorLimite {

    public static void main(String[] args) {

        int suma = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero limite ");
        int n2 = leer.nextInt();
        do {
            System.out.println("Ingrese un numero numero ");
            int n = leer.nextInt();
            suma = suma + n;
        } while (n2 > suma);
        System.out.println("La suma de los numeros es " + suma);
    }
}
