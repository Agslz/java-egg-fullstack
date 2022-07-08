package com.mycompany.ejercicio5;

import Entidades.Cuenta;
import Servicios.ServiciosCuenta;

public class Ejercicio5 {

    public static void main(String[] args) {

        ServiciosCuenta c = new ServiciosCuenta();

        Cuenta cta = c.crearCuenta();

        c.ejecutarMenu(c);

    }

}
