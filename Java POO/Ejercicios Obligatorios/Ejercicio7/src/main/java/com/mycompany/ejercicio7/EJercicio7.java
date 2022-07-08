package com.mycompany.ejercicio7;

import Entidades.Personas;
import Servicios.ServiciosPersonas;

public class EJercicio7 {

    public static void main(String[] args) {

        ServiciosPersonas ServPer = new ServiciosPersonas();

        Personas[] p = new Personas[4];

        for (int i = 0; i < 4; i++) {

            System.out.println("Persona Nº" + (i + 1) + ": ");

            p[i] = ServPer.creaPersona();
        }

        double[] imcs = {ServPer.calcularIMc(p[0]), ServPer.calcularIMc(p[1]), ServPer.calcularIMc(p[2]), ServPer.calcularIMc(p[3])};

        int[] edades = {p[0].getEdad(), p[1].getEdad(), p[2].getEdad(), p[3].getEdad()};

        porcentajeImcs(imcs);

        cantidadesEdad(edades);

    }

    public static void porcentajeImcs(double[] imcs) {

        int low = 0, medium = 0, high = 0;

        for (int i = 0; i < 4; i++) {

            if (imcs[i] == -1) {

                low++;

            } else if (imcs[i] == 0) {

                medium++;

            } else {

                high++;

            }

        }

        System.out.println(low + " están bajo su peso ideal.");

        System.out.println(medium + " están en su peso ideal.");

        System.out.println(high + " están sobre su peso ideal.");

    }

    public static void cantidadesEdad(int[] edades) {

        int menor = 0, mayor = 0;

        for (int i = 0; i < 4; i++) {

            if (edades[i] < 18) {

                menor++;

            } else {

                mayor++;
            }
        }

        System.out.println(menor + " son menores de edad");

        System.out.println(mayor + " son mayores de edad");
    }

}
