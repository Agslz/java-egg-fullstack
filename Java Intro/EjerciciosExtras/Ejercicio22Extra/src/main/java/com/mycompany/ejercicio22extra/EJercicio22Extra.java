/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio22extra;

import java.util.Scanner;

/**
 *
 * @author ags
 */
public class EJercicio22Extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int filas, columnas;
        int suma = 0;

        System.out.println("Ingrese las columnas");

        columnas = leer.nextInt();

        System.out.println("Ingrese las filas");

        filas = leer.nextInt();
        
        int matriz[][] = new int[filas][columnas];

        while (filas != columnas) {
            
            System.out.println("¡¡¡La matriz debe ser cuadrada!!!");
            
            System.out.println("Ingrese las columnas");

            columnas = leer.nextInt();

            System.out.println("Ingrese las filas");

            filas = leer.nextInt();

        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                matriz[i][j] = (int) (Math.random() * 11);

                suma = suma + matriz[i][j];

            }

        }

        System.out.println("La matriz es:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                System.out.print(matriz[i][j] + "\t");

            }

            System.out.println(" ");

        }

        System.out.println("La suma de todos sus elementos es: " + suma);

    }

}
