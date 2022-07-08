package com.mycompany.ejercicio1;

import Entidades.Array;
import Servicios.ServiciosArray;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        ServiciosArray ServA = new ServiciosArray();
        
        Array p1 = ServA.crearArray();
        
        ServA.tamaño(p1.getNumeros());
        
        ServA.mostrar(p1.getNumeros());
        
        ServA.suma(p1.getNumeros());

    }
}
