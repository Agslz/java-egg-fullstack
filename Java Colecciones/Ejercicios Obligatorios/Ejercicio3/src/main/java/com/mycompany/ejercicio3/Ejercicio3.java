package com.mycompany.ejercicio3;

import Servicios.ServiciosAlumnos;
import java.util.Scanner;

public class Ejercicio3 {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static ServiciosAlumnos ServA = new ServiciosAlumnos();

    public static void main(String[] args) {

        int opc;

        do {
            ServA.menu();

            System.out.println("Ingrese una opción");

            opc = leer.nextInt();

            switch (opc) {
                case 1 -> {
                    ServA.alumnos();
                    System.out.println("Alumnos ingresados correctamente");
                }
                case 2 ->
                    ServA.calcularNota();
                case 3 ->
                    ServA.mostrarAlumnos();
                case 4 ->
                    System.out.println("Usted salió");
                default ->
                    System.out.println("Opción ingresada invalida");
            }
        } while (opc != 4);
    }
}
