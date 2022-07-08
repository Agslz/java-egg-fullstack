
package com.mycompany.ejercicio19extra;

import java.util.Scanner;


public class Ejercicio19Extra {

    public static void main(String[] args) {

        int n;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector 1");

        n = leer.nextInt();

        System.out.println("Ingrese el tamaño del vector 2");

        n = leer.nextInt();

        int[] vector = new int[n];
        int[] vector2 = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Ingrese el valor n° " + (i + 1) + " del vector 1");

            vector[i] = leer.nextInt();

            System.out.println("Ingrese el valor n° " + (i + 1) + " del vector 2");

            vector2[i] = leer.nextInt();

            if (vector[i] != vector2[i]) {

                System.out.println("Son distintos");

                break;

            } else {

                System.out.println("Son iguales");

            }

        }

    }

}

