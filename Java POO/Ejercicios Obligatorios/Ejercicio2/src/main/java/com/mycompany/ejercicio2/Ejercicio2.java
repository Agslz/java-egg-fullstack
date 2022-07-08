package com.mycompany.ejercicio2;

import Entidades.Circunferencia;
import Servicios.ServiciosCircunferencia;

public class Ejercicio2 {

    public static void main(String[] args) {

        ServiciosCircunferencia Serv = new ServiciosCircunferencia();

        Circunferencia circ = Serv.crearCircunferencia();

        System.out.println("El area es: " + Serv.calcularArea(circ.getRadio()));

        System.out.println("El perimetro es: " + Serv.calcularPerimetro(circ.getRadio()));

    }
}
