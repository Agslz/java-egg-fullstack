package com.mycompany.ejercicio14extra;

import java.util.Scanner;

public class Ejercicio14Extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int cantidadF, cantidadH, edadH = 0, promedio = 0, suma = 0;
        System.out.println("Ingrese la cantidad de familias");
        cantidadF = leer.nextInt();
        for (int i = 0; i < cantidadF; i++) {
            System.out.println("Familia N° " + (i + 1));
            System.out.println("Ingrese la cantidad de hijos");
            cantidadH = leer.nextInt();
            for (int j = 0; j < cantidadH; j++) {
                System.out.println("Ingrese la edad de su hijo N° " + (j + 1));
                edadH = leer.nextInt();
                suma = suma + edadH;
            }
            promedio = suma / cantidadH;
            System.out.println("La media de la edad de los hijos de la familia " + (i + 1) + " es " + promedio);
            suma = 0;
        }

    }
}
