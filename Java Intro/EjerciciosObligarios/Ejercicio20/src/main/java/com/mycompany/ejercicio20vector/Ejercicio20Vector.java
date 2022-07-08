package com.mycompany.ejercicio20vector;

/**
 *
 * @author ags
 */
public class Ejercicio20Vector {

    public static void main(String[] args) {

        int[] vector = new int[100];
        for (int i = 0; i < 100; i++) {
            vector[i] = i + 1;
        }
        for (int i = 99; i > -1; i--) {
            System.out.println(vector[i] + " ");
        }
    }
}
