package com.mycompany.ejercicio6mayormenor;

import java.util.Scanner;

/**
 *
 * @author ags
 */
public class Ejercicio6MayorMenor {

    public static void main(String[] args) {

        int n1, n2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        n1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        n2 = leer.nextInt();
        if(n1 > n2 ){
            System.out.println(n1 + " Es mayor que " + n2);
        }
        else if(n2 > n1){
            System.out.println(n2 + " Es mayor que " + n1);
        }
        else{
            System.out.println("Los números son iguales");
        }
        /// System.out.println("El numero mayor es: "+Math.max(n1, n2)); Tambien se puede utilizar la clase Math.max()
    }
}
