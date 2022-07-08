package com.mycompany.ejercicio11web;

import java.util.Scanner;

/**
 *
 * @author ags
 */
public class Ejercicio11Web {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int TipoMotor;
        System.out.println("Ingrese el tipo de motor");
        TipoMotor = leer.nextInt();
        if (TipoMotor == 1) {
            System.out.println("La bomba es una bomba de agua");
        } else {
            if (TipoMotor == 2) {
                System.out.println("La bomba es una bomba de gasolina");
            } else {
                if (TipoMotor == 3) {
                    System.out.println("La bomba es una bomba de hormigon");
                } else {
                    if (TipoMotor == 4) {
                        System.out.println("La bomba es una bomba de pasta alimenticia");
                    } else {
                        System.out.println("No existe un valor valido para el tipo de bomba");
                    }
                }
            }
        }
    }
}
