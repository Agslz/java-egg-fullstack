
package com.mycompany.ejercicio16extra;

import java.util.Scanner;


public class Ejercicio16Extra {

    public static void Edad(int cantidad, int edad, String nombre, String opc) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de personas");

        cantidad = leer.nextInt();

        do {

            for (int i = 0; i < cantidad; i++) {

                System.out.println("Ingrese su nombre");

                nombre = leer.next();

                System.out.println("Ingrese la edad");

                edad = leer.nextInt();

                if (edad < 18) {

                    System.out.println("Usted " + nombre + " es menor de edad");

                } else {

                    System.out.println("Usted " + nombre + " es mayor de edad");
                }

                System.out.println("Desea seguir ingresando datos?");

                opc = leer.next();
                
                break;

            }

        } while (opc.toUpperCase().equals("SI"));

    }

    public static void main(String[] args) {

        int cantidad = 0, edad = 0;

        String nombre = "", opc = "";

        Edad(cantidad, edad, nombre, opc);

    }
}
