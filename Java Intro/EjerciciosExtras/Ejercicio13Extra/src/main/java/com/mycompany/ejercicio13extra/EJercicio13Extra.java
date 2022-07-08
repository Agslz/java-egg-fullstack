
package com.mycompany.ejercicio13extra;

import java.util.Scanner;


public class EJercicio13Extra {
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int n;
        System.out.print("Ingrese los valores");
        System.out.println(" ");
        n = leer.nextInt();
        int[][] escalera = new int[n][n];
        while (n >= 0) {
            n--;
            for (int j = 0; j < n + 1; j++) {
                escalera[n][j] = j + 1;
            }
        }
        for (int j = 0; j < escalera.length; j++) {
            for (int z = 0; z < escalera[0].length; z++) {
                if (escalera[j][z] != 0) {
                    System.out.print(escalera[j][z]);
                }
            }
            System.out.println();
        }
    }
}
