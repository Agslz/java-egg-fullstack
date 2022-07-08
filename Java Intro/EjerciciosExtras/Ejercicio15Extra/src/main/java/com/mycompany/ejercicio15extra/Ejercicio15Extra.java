package com.mycompany.ejercicio15extra;

import java.util.Scanner;

public class Ejercicio15Extra {

    public static void Suma(int n1, int n2) {

        System.out.println("La suma de " + n1 + " + " + n2 + " es " + (n1 + n2));

    }

    public static void Resta(int n1, int n2) {

        System.out.println("La resta de " + n1 + " - " + n2 + " es " + (n1 - n2));

    }

    public static void Multiplicacion(int n1, int n2) {

        System.out.println("La multiplicacion de " + n1 + " * " + n2 + " es " + (n1 * n2));

    }

    public static void Division(int n1, int n2) {

        System.out.println("La division de " + n1 + " / " + n2 + " es " + (n1 / n2));

    }

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int n1, n2;

        int opc;

        System.out.println("Ingrese el primer numero");

        n1 = leer.nextInt();

        System.out.println("Ingrese el segundo numero");

        n2 = leer.nextInt();

        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Division");

        System.out.println("Ingrese una opcion");

        opc = leer.nextInt();

        switch (opc) {

            case 1 -> Suma(n1, n2);
            case 2 -> Resta(n1, n2);
            case 3 -> Multiplicacion(n1, n2);
            case 4 -> Division(n1, n2);

            default -> System.out.println("La opcion ingresada no es valida");
        }

    }
}
