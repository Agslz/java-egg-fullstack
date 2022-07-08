package com.mycompany.ejercicio6;

import Entidades.Cafetera;
import Servicios.ServiciosCafetera;
import java.util.Scanner;

public class Ejercicio6 {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        ServiciosCafetera ServCaf = new ServiciosCafetera();

        Cafetera cafe = ServCaf.crearCafetera();

        int opcion;

        System.out.println("1.Servir una taza");
        System.out.println("2.Vaciar cafetera");
        System.out.println("3.Agregar Café");
        System.out.println("4.Salir");

        do {
            System.out.println("Ingrese una opcion");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1 ->
                    ServCaf.servirTaza(cafe);
                case 2 ->
                    ServCaf.vaciarCafetera(cafe);
                case 3 ->
                    ServCaf.agregarCafe(cafe);
                case 4 ->
                    System.out.println("Usted ha salido");
                default ->
                    System.out.println("Opción invalida");
            }

        } while (opcion != 4);

    }
}
