package com.mycompany.ejercicio5extra;

import java.util.Scanner;

public class Ejercicio5Extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int n;

        String tipo, trata;

        System.out.println("Bienvenido al sistema de OSDE");

        System.out.println("Ingrese su tipo de socio A, B o C");

        tipo = leer.next();

        while (!tipo.toUpperCase().equals("A") && !tipo.toUpperCase().equals("B") && !tipo.toUpperCase().equals("C")) {

            System.out.println("El tipo de usuario ingresado es incorrecto");

            System.out.println("Ingrese A, B o C");

            System.out.println("Ingrese su tipo de socio A, B o C");

            tipo = leer.next();

        }

        switch (tipo.toUpperCase()) {

            case "A" -> {
                System.out.println("Ingrese el tipo de tratamiento a realizar");

                trata = leer.next();

                System.out.println("Ingrese el precio del tratamiento");

                n = leer.nextInt();

                System.out.println("Al ser socio tipo A se le hara un descuento del 50 % por un total de " + n * 50 / 100 + " $ del tratamiento " + trata);
            }

            case "B" -> {
                System.out.println("Ingrese el tipo de tratamiento a realizar");

                trata = leer.next();

                System.out.println("Ingrese el precio del tratamiento");

                n = leer.nextInt();

                System.out.println("Al ser socio tipo B se le hara un descuento del 35 % por un total de " + n * 35 / 100 + " $ del tratamiento " + trata);
            }

            case "C" -> {
                System.out.println("Ingrese el tipo de tratamiento a realizar");

                trata = leer.next();

                System.out.println("Ingrese el precio del tratamiento");

                n = leer.nextInt();

                System.out.println("Al ser socio tipo C no puede acceder a ningun tipo de descuento por lo tanto el precio del tratamiento " + trata + " es de " + n + " $");
            }

        }

    }

}
