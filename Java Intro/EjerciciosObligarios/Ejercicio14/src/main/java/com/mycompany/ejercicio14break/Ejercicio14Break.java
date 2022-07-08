package com.mycompany.ejercicio14break;

import java.util.Scanner;

/**
 *
 * @author ags
 */
public class Ejercicio14Break {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numero, suma = 0;
        int cont = 0;
        int cont2 = 0;
        System.out.println("Ingrese numero");
        for (int i = 0; i < 20; i++) {
            numero = leer.nextInt();
            if (numero == 0) {
                System.out.println("Se capturó el numero cero");
                break;
            } else {
                if (numero > 1) {
                    suma = suma + numero;
                    cont += 1;
                } else {
                    cont2 += 1;
                }
            }
        }
        System.out.println(" ");
        System.out.println("La cantidad de numeros negativos ingresados es: " + cont2);
        System.out.println("La cantidad de numeros ingresados posticos ingesados es: " + cont);
        System.out.println("La suma de los numeros ingresados es: " + suma);
    }

}
