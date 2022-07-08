
package com.mycompany.ejercicio24extra;

import java.util.Scanner;

public class Ejercicio24Extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Serie fibonacci con vectores");
        int[] vecfibbo;
        String fibbonacci = "";
        int tam, esp;

        System.out.println("Ingrese la cantidad de numeros que desea mostrar");

        tam = leer.nextInt();

        vecfibbo = new int[tam];

        esp = vecfibbo.length;
        
        vecfibbo[0] = 0;
        vecfibbo[1] = 1;
        
        for (int i = 2; i <= esp - 1; i++) {
            vecfibbo[i] = vecfibbo[i - 1] + vecfibbo[i - 2];
            fibbonacci = fibbonacci + " " + vecfibbo[i];
        }
        System.out.println(fibbonacci);
    }
}
