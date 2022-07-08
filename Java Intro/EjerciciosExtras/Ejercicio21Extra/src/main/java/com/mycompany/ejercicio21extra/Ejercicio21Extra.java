package com.mycompany.ejercicio21extra;

import java.util.Scanner;

public class Ejercicio21Extra {

    public static void main(String[] args) {
        int notas[] = new int[4];
        double promedios[] = new double[10];
        System.out.println("Ingrese las notas de los alumnos en el siguiente orden:");
        System.out.println("1er TP evaluativo, 2do TP evaluativo, Primer integrador, Segundo integrador ");
        calculo_promedios(notas, promedios);
        imprimir(promedios);
        aprobados(promedios);
    }

    public static void calculo_promedios(int notas[], double promedios[]) {
        Scanner leer = new Scanner(System.in);
        double n1;
        double n2;
        double n3;
        double n4;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese las notas del alumno " + (i + 1) + ":");
            for (int j = 0; j < notas.length; j++) {
                notas[j] = leer.nextInt();
            }
            n1 = (double) notas[0] * 0.1;
            n2 = (double) notas[1] * 0.15;
            n3 = (double) notas[2] * 0.25;
            n4 = (double) notas[3] * 0.5;
            promedios[i] = n1 + n2 + n3 + n4;
        }
    }

    public static void imprimir(double promedios[]) {
        for (int i = 0; i < promedios.length; i++) {
            System.out.print("[" + promedios[i] + "]");
        }
        System.out.println("");
    }

    public static void aprobados(double promedios[]) {
        int contador_aprobados = 0;
        for (int i = 0; i < promedios.length; i++) {
            if (promedios[i] >= 7) {
                contador_aprobados = contador_aprobados + 1;
            }
        }
        System.out.println("La cantidad de alumnos aprobados es: " + contador_aprobados);
        System.out.println("La cantidad de alumnos desaprobados es: " + (10 - contador_aprobados));
    }
}
