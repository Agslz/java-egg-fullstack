package com.mycompany.ejercicio24antisimetrica;

import java.util.Scanner;

/**
 *
 * @author ags
 */

public class Ejercicio24AntiSimetrica {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int A[][] = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int AT[][] = new int[3][3];
        boolean band2 = true;
        System.out.println("Ingrese valores a la matriz");
        System.out.println(" ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese un numero el la posicion" + "[ " + (i + 1) + "]" + "[ " + (j + 1) + "]" + " = ");
                A[i][j] = leer.nextInt();
            }
        }
        System.out.println("La matriz es:");
        System.out.println(" ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[j][i] = (-1) * A[j][i];
                AT[i][j] = A[j][i];
                A[j][i] = (-1) * A[j][i];
                if (AT[i][j] != A[i][j]) {
                    band2 = false;
                    i = 3;
                    break;
                }
            }
        }
        if (band2) {
            System.out.println("La matriz es antisimetrica");
        } else {
            System.out.println("La matriz no es antisimetrica");
        }

    }
}
