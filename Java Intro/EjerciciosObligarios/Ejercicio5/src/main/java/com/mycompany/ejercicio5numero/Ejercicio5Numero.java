package com.mycompany.ejercicio5numero;

import java.util.Scanner;

/**
 *
 * @author Ags
 */

public class Ejercicio5Numero {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        int numero;
        System.out.println("Ingrese un numero");
        numero = leer.nextInt();
        double raiz = Math.sqrt(numero);
        System.out.println("El doble del numero es "+numero*2);
        System.out.println("El triple del numero es "+numero*3);
        System.out.println("La raiz cuadra del numero es "+raiz);
    }        
}
