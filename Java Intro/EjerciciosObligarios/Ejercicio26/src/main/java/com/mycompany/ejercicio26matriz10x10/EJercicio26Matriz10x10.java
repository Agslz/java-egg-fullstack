package com.mycompany.ejercicio26matriz10x10;

import java.util.Scanner;

/**
 *
 * @author ags
 */

public class EJercicio26Matriz10x10 {

    public static void rellenar_matriz_aleatorio(int matriz[][], int fila, int columna) {
        for (int i = 0; i <= fila - 1; i++) {
            for (int j = 0; j <= columna - 1; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void rellenar_matriz(int matriz[][], int fila, int columna) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i <= fila - 1; i++) {
            for (int j = 0; j <= columna - 1; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
    }

    public static void imprimir_matriz(int matriz[][], int fila, int columna) {
        for (int i = 0; i <= fila - 1; i++) {
            for (int j = 0; j <= columna - 1; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public static void buscar_matriz(int matriz[][], int matriz_2[][]) {
        int fila = 0;
        int columna = 0;
        int contador_matriz = 0;
        int contador_elemento_matriz = 0;
        for (int k = 0; k <= 63; k++) {
            System.out.println(k + 1);
            for (int i = 0 + fila; i <= 2 + fila; i++) {
                for (int j = 0 + columna; j <= 2 + columna; j++) {
                    System.out.print("[" + matriz[i][j] + "]");
                    if (matriz[i][j] == matriz_2[i - fila][j - columna]) {
                        contador_elemento_matriz = contador_elemento_matriz + 1;
                        if (contador_elemento_matriz == 9) {
                            System.out.println("");
                            System.out.println("");
                            System.out.println("Se ha encontrado la matriz ingresada!!!");
                            System.out.println("La misma comienza en el elemento " + (i - 2) + "," + (j - 2) + " de la matriz 10x10");
                            k = 63;
                        }
                    }
                }
                System.out.println("");
            }
            contador_matriz = contador_matriz + 1;
            columna = columna + 1;
            if (contador_elemento_matriz != 9) {
                contador_elemento_matriz = 0;
            }
            System.out.println("");
            if (contador_matriz == 8) {
                fila = fila + 1;
                columna = 0;
                contador_matriz = 0;
                System.out.println("============================");
            }
        }
        if (contador_elemento_matriz < 9) {
            System.out.println("No se encontró la matriz ingresada dentro de la matriz 10x10");
        }
    }

    public static void main(String[] args) {
        int fila_1 = 10;
        int columna_1 = 10;
        int fila_2 = 3;
        int columna_2 = 3;
        int[][] matriz = new int[fila_1][columna_1];
        int[][] matriz_2 = new int[fila_2][columna_2];
        rellenar_matriz_aleatorio(matriz, fila_1, columna_1);
        System.out.println("La matriz 10x10 generada es:");
        imprimir_matriz(matriz, fila_1, columna_1);
        System.out.println("Ingrese la matriz 3x3 que desea buscar en la matriz 10x10:");
        rellenar_matriz(matriz_2, fila_2, columna_2);
        System.out.println("La matriz 3x3 ingresada es:");
        imprimir_matriz(matriz_2, fila_2, columna_2);
        System.out.println("============================");
        buscar_matriz(matriz, matriz_2);
    }

}
        
