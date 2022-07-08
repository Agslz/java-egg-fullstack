package com.mycompany.ejercicio5;

import Entidades.Meses;
import java.util.Scanner;

public class Ejercicio5 {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        Meses mes = new Meses();

        int cont = 0;

        String mesSecreto = mes.getMesSecreto();

        String intento;

        System.out.println("Intente adivinar el mes: ");

        do {

            System.out.print("Ingrese un mes: ");

            intento = leer.next().toLowerCase();

            if (!intento.equals(mesSecreto)) {

                System.out.println("No ha adivinado, siga intentando\n");

                cont++;
            }

        } while (!intento.equals(mesSecreto));

        System.out.println("Ha adivinado el mes, felicidades, usted lo intentó " + cont + " veces");
    }

}
