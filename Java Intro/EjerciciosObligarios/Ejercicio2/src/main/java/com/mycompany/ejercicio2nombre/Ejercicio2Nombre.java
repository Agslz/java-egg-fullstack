package com.mycompany.ejercicio2nombre;

import java.util.Scanner;

/**
 *
 * @author Ags
 */

public class Ejercicio2Nombre {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in); 
        String nombre;
        System.out.print("Ingrese su nombre ");
        nombre = leer.next();
        System.out.print("Su nombre es "+nombre);
    }
}
