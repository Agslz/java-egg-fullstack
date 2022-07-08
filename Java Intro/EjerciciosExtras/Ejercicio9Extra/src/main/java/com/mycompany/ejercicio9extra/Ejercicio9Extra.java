package com.mycompany.ejercicio9extra;

import java.util.Scanner;


public class Ejercicio9Extra {

    public static void Division(int dividendo, int divisor, int cont) {

        int resto;
        cont = 0;
        resto = dividendo;
        do {
            resto = resto - divisor;
            System.out.println(resto + divisor + " - " + divisor + " = " + resto);
            cont = cont +1;
        } while (resto - divisor >= 0);
    }

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int dividendo, divisor;
        int cont;
        cont = 0;
        System.out.println("Ingrese el dividendo");
        dividendo = leer.nextInt();
        System.out.println("Ingrese el divisor");
        divisor = leer.nextInt();
        
        Division(dividendo, divisor, cont);
    }
}
