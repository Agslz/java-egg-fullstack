package com.mycompany.ejercicio1;

import Entidades.Libro;
import Servicios.ServiciosLibro;

public class Ejercicio1 {

    public static void main(String[] args) {

        ServiciosLibro L = new ServiciosLibro(); 

        Libro M = L.cargarLibro();

        L.mostrarLibro(M);

    }
}
