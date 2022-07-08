
package com.mycompany.ejercicio20extra;

import java.util.Scanner;

public class EJercicio20Extra {

    public static int Rellenar(int n, int[] vector) {

        for (int i = 0; i < n; i++) {

            vector[i] = (int) (Math.random() * 11);

        }

        return 0;

    }

    public static void Mostrar(int n, int[] vector) {
        
        System.out.println("Generando vector aleatorio...");
        
        System.out.println(" ");

        for (int i = 0; i < n; i++) {
            
            System.out.print("El valor n°"+(i+1)+" es: ");

            System.out.println(vector[i]);

        }

    }

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int n;

        System.out.println("Ingrese el tamaño del vector");

        n = leer.nextInt();

        int[] vector = new int[n];

        Rellenar(n, vector);

        Mostrar(n, vector);
    }
}
