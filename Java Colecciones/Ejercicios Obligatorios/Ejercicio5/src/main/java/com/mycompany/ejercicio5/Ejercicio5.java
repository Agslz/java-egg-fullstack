package com.mycompany.ejercicio5;

import Entidades.Pais;
import Servicios.ServiciosPais;
import java.util.Scanner;

public class Ejercicio5 {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        ServiciosPais ServP = new ServiciosPais();

        Pais p1 = ServP.crearPais();

        String buscar;

        int opcion;

        ServP.menu();

        do {

            System.out.println("Ingrese una opción");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1 -> {
                    ServP.crearPais();
                }
                case 2 -> {
                    System.out.println("Los paises son: ");
                    ServP.mostrarPais(p1);
                }
                case 3 -> {
                    System.out.println("Ingrese el país a buscar");
                    buscar = leer.next();
                    ServP.contienePais(p1, buscar);
                }
                case 4 -> {
                    System.out.println("Ingrese el país a eliminar");
                    buscar = leer.next();
                    ServP.buscarYEliminar(p1, buscar);
                }
                case 5 -> {
                    ServP.menu();
                }
                case 6 -> {
                    break;
                }
                default ->
                    System.out.println("Opcion ingresada incorrecta");
            }
        } while (opcion != 6);
    }
}
