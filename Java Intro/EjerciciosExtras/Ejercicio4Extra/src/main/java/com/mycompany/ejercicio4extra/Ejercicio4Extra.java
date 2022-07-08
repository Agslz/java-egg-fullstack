package com.mycompany.ejercicio4extra;

import java.util.Scanner;

public class Ejercicio4Extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int num;
        System.out.println("Ingrese numero entre 1 y 10");
        System.out.println("Ingrese numero a convertir");
        num = leer.nextInt();
        while (num <= 1 || num >= 10) {
            System.out.println("Ingrese numeros entre 1 y 10!!!");
            System.out.println("Ingrese numero a convertir");
            num = leer.nextInt();
        }
        switch (num) {
            case 1 -> System.out.println("I");
            case 2 -> System.out.println("II");
            case 3 -> System.out.println("III");
            case 4 -> System.out.println("IV");
            case 5 -> System.out.println("V");
            case 6 -> System.out.println("VI");
            case 7 -> System.out.println("VII");
            case 8 -> System.out.println("VIII");
            case 9 -> System.out.println("IX");
            case 10 -> System.out.println("X");

        }

    }
}
