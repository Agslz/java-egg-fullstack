package com.mycompany.ejercicio4;

import Entidades.NIF;
import Servicios.ServiciosNIF;

public class Ejercicio4 {

    public static void main(String[] args) {

        ServiciosNIF Servp1 = new ServiciosNIF();

        NIF p1 = Servp1.crearNif();

        Servp1.mostrar(p1);

    }
}
