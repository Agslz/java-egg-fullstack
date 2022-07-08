package Main;

import Entidades.Persona;
import Servicios.ServiciosPersonas;

public class Ejercicio1 {

    public static void main(String[] args) {

        ServiciosPersonas ServPer = new ServiciosPersonas();

        Persona p = null;

        try {

            ServPer.esMayorDeEdad(p);

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }

    }

}
