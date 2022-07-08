package com.mycompany.ejercicio9;

import Entidades.Matematica;
import Servicios.ServiciosMatematica;
import java.util.Scanner;

public class EJercicio9 {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        ServiciosMatematica c1 = new ServiciosMatematica();

        Matematica mate1 = c1.ingresarNumeros();

        System.out.println("""
                           1.Devuelve el mayor de los numeros ingresados 
                           2.Calcula la potencia de ambos numeros
                           3.Calcular la raiz de ambos numeros""");

        int opc;

        do {

            System.out.println("Ingrese una opción");
            opc = leer.nextInt();

            switch (opc) {
                case 1 ->
                    System.out.println("El mayor de ambos numeros es :" + c1.devolverMayor(mate1));
                case 2 ->
                    System.out.println("La potencia es:" + c1.calcularPotencia(mate1));
                case 3 ->
                    System.out.println("La raiz es:" + c1.calcularRaiz(mate1));
                case 4 ->
                    System.out.println("Usted salió");
                default ->
                    System.out.println("La opción ingresada es incorrecta");
            }

        } while (opc != 4);

    }
}
