package com.mycompany.ejercicio3;

import Entidades.Operacion;
import Servicios.ServiciosOperacion;
import java.util.Scanner;

public class Ejercicio3 {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        ServiciosOperacion ServOp = new ServiciosOperacion();

        Operacion op1 = ServOp.crearOperacion();

        int opcion;

        System.out.println("1.Suma\n"
                + "2.Resta \n"
                + "3.Multiplicación\n"
                + "4.División\n"
                + "5.Salir");

        do {

            System.out.println("Ingrese una opcion");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1 ->
                    System.out.println("La suma de ambos numeros es: " + ServOp.sumar(op1.getN1(), op1.getN2()));
                case 2 ->
                    System.out.println("La resta de ambos numeros es: " + ServOp.restar(op1.getN1(), op1.getN2()));
                case 3 ->
                    System.out.println("La multplicacion de ambos numeros es: " + ServOp.multiplicar(op1.getN1(), op1.getN2()));
                case 4 ->
                    System.out.println("La division de ambos numeros es: " + ServOp.dividir(op1.getN1(), op1.getN2()));
                case 5 ->
                    System.out.println("Usted salió");
                default ->
                    System.out.println("La opción ingresada no es valida");
            }

        } while (opcion != 5);

    }
}
