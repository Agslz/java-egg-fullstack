package com.mycompany.ejercicio1y2;

import Servicios.ServiciosPerro;
import java.util.Scanner;

public class Ejercicio1y2 {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        ServiciosPerro p1 = new ServiciosPerro();

        p1.crearPerro();

    }
}
