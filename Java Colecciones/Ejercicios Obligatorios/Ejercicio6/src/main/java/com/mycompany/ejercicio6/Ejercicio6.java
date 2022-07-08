package com.mycompany.ejercicio6;

import Servicios.ServiciosMarket;

import java.util.Scanner;

public class Ejercicio6 {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        ServiciosMarket ServM = new ServiciosMarket();

        int opc;

        ServM.menu();

        do {

            System.out.println("Ingrese una opción");

            opc = leer.nextInt();

            switch (opc) {
                case 1 -> {
                    ServM.agregarProducto();
                }
                case 2 -> {
                    ServM.mostrarElemento();
                }
                case 3 -> {
                    ServM.modificarPrecio();
                }
                case 4 -> {
                    ServM.eliminarElemento();
                }
                case 5 -> {
                    ServM.menu();
                }
                case 6 -> {
                    break;
                }
                default -> {
                    System.out.println("Opción ingresada invalida");
                }
            }
        } while (opc != 6);
    }
}
