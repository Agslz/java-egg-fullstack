package com.mycompany.ejercicio21vectorn;

import java.util.Scanner;

/**
 *
 * @author ags
 */
public class Ejercicio21VectorN {

    public static void Rellenar(int n, int vector[]) {

        for (int i = 0; i < n; i++) {

            vector[i] = (int) (Math.random() * 11);

            System.out.println(vector[i]);

        }

    }

    public static void Mostrar(int n, int n2, int vector[]) {

        int cont = 0;

        for (int i = 0; i < n; i++) {

            if (vector[i] == n2) {

                cont++;

                System.out.println("El numero ingresado se encuentra " + cont + " veces dentro del array y se encuentra en la posicion " + i);

            }

        }
    }

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int n;

        System.out.println("Ingrese el tamaño del vector");

        n = leer.nextInt();

        while (n <= 0) {

            System.out.println("Ingrese valores mayores a 0");

            n = leer.nextInt();

        }

        System.out.println("Los numeros dentro del vector son: ");

        int[] vector = new int[n];

        Rellenar(n, vector);

        System.out.println("Ingrese un numero a buscar");

        int n2 = leer.nextInt();

        Mostrar(n, n2, vector);

    }
}
