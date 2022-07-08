package com.mycompany.ejercicio3;

import Entidades.Raices;
import Servicios.ServiciosRaices;
import java.util.Scanner;

public class EJercicio3 {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        ServiciosRaices op1 = new ServiciosRaices();

        Raices r1 = op1.creaRaices();

        System.out.println("""
                           1.Calcular Discriminante 
                           2.Verificar si tiene raices 
                           3.Verificar si tiene raiz 
                           4.Obtiene raices 
                           5.Obtener raiz 
                           6.Calcular 
                           7.Salir""");

        int opcion;

        do {

            System.out.println("Ingrese una opción");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1 ->
                    op1.getDiscriminante(r1);
                case 2 ->
                    op1.tieneRaices(r1);
                case 3 ->
                    op1.tieneRaiz(r1);
                case 4 ->
                    op1.obtenerRaices(r1);
                case 5 ->
                    op1.obtenerRaiz(r1);
                case 6 ->
                    op1.calcular(r1);
                case 7 ->
                    System.out.println("Usted salió");
                default ->
                    System.out.println("La opcion ingresada no es valida");
            }

        } while (opcion != 7);

    }
}
