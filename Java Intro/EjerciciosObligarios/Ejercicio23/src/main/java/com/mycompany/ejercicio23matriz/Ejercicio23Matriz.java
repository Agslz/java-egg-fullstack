package com.mycompany.ejercicio23matriz;

/**
 *
 * @author ags
 */

public class Ejercicio23Matriz {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        rellenar_matriz(matriz);
        imprimir_matriz(matriz);
        traspuesta(matriz);
    }
public static void rellenar_matriz(int matriz[][]){
    for(int i=0; i<=3; i++){
        for(int j=0; j<=3; j++){
            matriz[i][j] = (int)(Math.random()*10);
        }
    }
}
public static void imprimir_matriz(int matriz[][]){
    for(int i=0; i<=3; i++){
        for(int j=0; j<=3; j++){
            System.out.print("[" + matriz[i][j] + "]");
        }
        System.out.println("");
    }
}
public static void traspuesta(int matriz[][]){
    int[][] matriz_traspuesta = new int[4][4];
    for(int j=0; j<=3; j++){
        for(int i=0; i<=3; i++){
            matriz_traspuesta[j][i] = matriz[i][j]*(-1);
        }
    }
    System.out.println("La matriz traspuesta es:");
    for(int i=0; i<=3; i++){
        for(int j=0; j<=3; j++){
            System.out.print("[" + matriz_traspuesta[i][j] + "]");
        }
        System.out.println("");
    }
}
}