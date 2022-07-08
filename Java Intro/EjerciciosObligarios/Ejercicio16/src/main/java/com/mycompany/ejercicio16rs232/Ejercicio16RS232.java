package com.mycompany.ejercicio16rs232;

import java.util.Scanner;

/**
 *
 * @author ags
 */
public class Ejercicio16RS232 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int corr, incorr;
        String cad = "";
        corr = 0;
        incorr = 0;
        System.out.println("Las cadenas deben ser de longitud 5, que comiencen con X y terminen con O");
        System.out.println("Se solicitaran cadenas hasta que ingrese &&&&&");
        while (!cad.equals("&&&&&")) {
            System.out.println("Ingrese una cadena");
            cad = leer.next();
            if (!cad.equals("&&&&&")) {
                if (cad.length() == 5 && cad.substring(0, 1).toUpperCase().equals("X") && cad.substring(4, 5).toUpperCase().equals("O")) {
                    System.out.println("Correcto");
                    corr++;
                }else{
                    incorr++;
                }
            }
        }
        System.out.println("Se han ingresado " + corr + " cadenas correctas y "+ incorr + " cadenas incorrectas");
    }
}
