package com.mycompany.ejercicio7parimpar;

import java.util.Scanner;

/**
 *
 * @author ags
 */
public class Ejercicio7ParImpar {

    public static void main(String[] args) {
        
        int numero;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero = leer.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }
}
