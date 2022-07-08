package com.mycompany.ejercicio18asteriscos;

import java.util.Scanner;

/**
 *
 * @author ags
 */
public class Ejercicio18Asteriscos {

    public static void main(String[] args) {

        int num1, num2, num3, num4;

        num1 = Llenar(1);
        num2 = Llenar(2);
        num3 = Llenar(3);
        num4 = Llenar(4);
        print(num1);
        print(num2);
        print(num3);
        print(num4);

    }

    public static int Llenar(int i) { 

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el valor " + i + " : ");
        int num = leer.nextInt();
        while (num <= 0 || num > 20) {
            System.out.println("Ingrese valores entre 0 y 20 ");
            num = leer.nextInt();
        }
        return num;
    }

    public static void print(int i) { 

        System.out.print(i + " ");
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }

}
