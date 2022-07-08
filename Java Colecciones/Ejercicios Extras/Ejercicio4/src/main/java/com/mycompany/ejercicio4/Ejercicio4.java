package com.mycompany.ejercicio4;

import Servicios.ServiciosMapa;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio4 {

    private static final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        ServiciosMapa ServCiud = new ServiciosMapa();

        HashMap<Integer, String> listaCiudades = new HashMap();
        
        int opc;

        do {
            ServCiud.menu();

            System.out.print("Ingrese una opción ");
            
            opc = leer.nextInt();

            if (opc <= 0 || opc >= 5) {

                if (opc != 5) {

                    System.out.println("Opción ingresada invalida");
                }

                continue;
            }

            switch (opc) {
                case 1 ->
                    ServCiud.añadirCiudad(listaCiudades);
                case 2 ->
                    ServCiud.mostrarCiudades(listaCiudades);
                case 3 ->
                    ServCiud.mostrarSegunCodigo(listaCiudades);
                case 4 ->
                    ServCiud.eliminarCiudad(listaCiudades);
            }
        } while (opc != 5);
    }
}
