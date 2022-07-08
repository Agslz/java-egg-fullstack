package com.mycompany.ejercicio11extra;

import java.util.Scanner;

public class Ejercicio11Extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int n, cifras;
        String car;
        do {
            System.out.print("Introduce un número entero: ");
            n = leer.nextInt();
            cifras = 0;
            while (n != 0) {
                n = n / 10;
                cifras++;
            }
            System.out.println("El número tiene " + cifras + " cifras");
            System.out.println("Desea continuar? S/N");
            car = leer.next();
        } while (car.toUpperCase().equals("S"));
    }
}
