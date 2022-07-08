package com.mycompany.ejercicio23extra;

import java.util.Scanner;

public class Ejercicio23Extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las dimensiones de la matriz, deben ser mayores a 0:");
        int filas;
        int columnas;
        do {
            filas = leer.nextInt();
            columnas = leer.nextInt();
        } while (filas <= 0 || columnas <= 0);
        int matriz[][] = new int[filas][columnas];
        rellenar_matriz(matriz, columnas);
        imprimir_matriz(matriz, columnas);
    }

    public static void rellenar_matriz(int matriz[][], int columnas) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void imprimir_matriz(int matriz[][], int columnas) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
