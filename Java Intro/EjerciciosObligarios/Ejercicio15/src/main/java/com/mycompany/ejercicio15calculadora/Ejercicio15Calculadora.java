package com.mycompany.ejercicio15calculadora;

import java.util.Scanner;

/**
 *
 * @author ags
 */
public class Ejercicio15Calculadora {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double n1;
        double n2;
        int opcion;
        String opc2 = "N";
        System.out.println("Ingrese el primer numero:");
        n1 = leer.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        n2 = leer.nextDouble();
        System.out.println("A continuación ingrese la operación a realizar con los números");

        while (opc2.equals("N")) {
            System.out.println("Presione (1) Para Sumar");
            System.out.println("Presione (2) Para Restar");
            System.out.println("Presione (3) Para Multiplicar");
            System.out.println("Presione (4) Para Dividir");
            System.out.println("Presione (5) Para Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1 -> System.out.println("La suma de los números es: " + (n1 + n2));
                case 2 -> System.out.println("La resta de los números es: " + (n1 - n2));
                case 3 -> System.out.println("La multiplicación de los números es: " + (n1 * n2));
                case 4 -> {
                    if (n2 != 0) {
                        System.out.println("La división de los números es: " + (n1 / n2));
                    } else {
                        System.out.println("No es posible dividir por 0");
                    }
                }
                case 5 -> {
                    System.out.println("¿Está seguro que desea salir? S/N");
                    leer.nextLine();
                    opc2 = leer.nextLine().toUpperCase();
                    while (!opc2.equals("N") && !opc2.equals("S")) {
                        System.out.println("Ingrese opción válida (S) o (N)");
                        opc2 = leer.nextLine().toUpperCase();
                    }
                }
                default -> System.out.println("Opción no válida");
            }
        }
    }
}
