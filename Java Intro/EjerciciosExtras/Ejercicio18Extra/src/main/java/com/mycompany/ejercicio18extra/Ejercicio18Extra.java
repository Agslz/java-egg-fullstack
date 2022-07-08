
package com.mycompany.ejercicio18extra;

import java.util.Scanner;

public class Ejercicio18Extra {

    public static void main(String[] args) {
        
        int n, suma = 0;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        
        n = leer.nextInt();
        
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            
            System.out.println("Ingrese el valor n° "+(i+1));
            
            vector[i] = leer.nextInt();
            
            suma = suma + vector[i];
            
        }
        
        System.out.println("La suma de los elementos del vector es: "+suma);
        
        
    }
}
