package com.mycompany.ejercicio2extra;

public class Ejercicio2Extra {

    public static void main(String[] args) {

        int a = 10, b = 20, c = 30, d = 40, aux;

        System.out.println("Variables antes del cambio");

        System.out.println("A =" + a);
        System.out.println("B =" + b);
        System.out.println("C =" + c);
        System.out.println("D =" + d);
        
        System.out.println("Variables despues del cambio");

        aux = a;
        a = b;
        d = b;
        b = c;
        c = aux;

        System.out.println("A =" + a);
        System.out.println("B =" + b);
        System.out.println("C =" + c);
        System.out.println("D =" + d);

    }
}
