package com.mycompany.ejercicio8eureka;

import java.util.Scanner;

/**
 *
 * @author ags
 */
public class Ejercicio8Eureka {

    public static void main(String[] args) {

        String frase;
        String pass = "eureka";
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la contraseña");
        frase = leer.nextLine();
        if (frase.equals(pass)) {
            System.out.println("Usted ingresó al sistema");
        } else {
            System.out.println("Contraseña incorrecta");
        }
    }
}
