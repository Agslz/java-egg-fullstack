package com.mycompany.ejercicio2;

import Entidades.Puntos;
import Servicios.ServicioPuntos;

public class Ejercicio2 {

    public static void main(String[] args) {

        ServicioPuntos p2 = new ServicioPuntos();

        Puntos p = p2.cargarPuntos();

        System.out.println(" La distancia entre los puntos es de: " + p2.devolverPuntos(p));

    }
}
