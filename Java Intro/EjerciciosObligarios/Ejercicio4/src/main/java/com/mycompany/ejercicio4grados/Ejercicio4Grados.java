package com.mycompany.ejercicio4grados;

import java.util.Scanner;

/**
 *
 * @author Ags
 */

public class Ejercicio4Grados {

    public static void main(String[] args) {
        
        double gradosF, gradosC;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de grados centigrados");
        gradosC = leer.nextDouble();
        gradosF = 32 + (9*gradosC/5);
        System.out.println("La conversion de grados centigrados a Farenheit es: "+gradosF);
    }
}
