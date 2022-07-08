package com.mycompany.ejercicio3;

import Entidades.Libreria;
import Servicios.ServiciosLibreria;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio3 {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        HashSet<Libreria> Libro = new HashSet();

        ServiciosLibreria ServL = new ServiciosLibreria();

        int opcion2;

        String opcion = "SI";

        ServL.menu();

        do {

            System.out.println("Ingrese una opción");

            opcion2 = leer.nextInt();

            switch (opcion2) {
                case 1 -> {
                    while (!opcion.equalsIgnoreCase("NO")) {

                        Libro.add(ServL.crearLibro());

                        System.out.println("Desea ingresar otro libro? (SI/NO)");

                        opcion = leer.next();

                    }
                }
                case 2 ->
                    ServL.prestamos(Libro);
                case 3 ->
                    ServL.devolucion(Libro);
                case 4 ->
                    ServL.mostrarLibro(Libro);
                case 5 ->
                    ServL.menu();
                case 6 ->
                    System.out.println("Vuelva pronto");
                default -> {
                    System.out.println("La opción ingresada es invalida");
                }
            }

        } while (opcion2 != 6);

    }

}
