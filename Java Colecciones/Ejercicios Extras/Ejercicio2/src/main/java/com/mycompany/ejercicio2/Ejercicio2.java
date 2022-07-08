package com.mycompany.ejercicio2;

import Servicios.ServiciosCantanteFamoso;
import java.util.Scanner;

public class Ejercicio2 {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        ServiciosCantanteFamoso ServC = new ServiciosCantanteFamoso();

        int opc2;

        ServC.menu();

        do {

            System.out.println("Ingrese una opción");

            opc2 = leer.nextInt();

            switch (opc2) {
                case 1 -> {
                    String opc = "SI";

                    while (!opc.equalsIgnoreCase("NO")) {

                        ServC.crearCantante();

                        System.out.println("Desea ingresar otro cantante (SI/NO)");

                        opc = leer.next();
                    }
                }
                case 2 -> {
                    ServC.mostrarDatos();
                }
                case 3 -> {
                    ServC.eliminarCantante();
                }
                case 4 -> {
                    ServC.menu();
                }
                case 5 -> {
                    break;
                }
                default ->
                    System.out.println("Opción ingresada invalida");
            }
        } while (opc2 != 5);
    }
}
