
package com.mycompany.ejercicio10extra;

import java.util.Scanner;

public class Ejercicio10Extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int n1, n2, total, resulM;
        String resp = null;
        System.out.println("Generando numeros aleatorios...");
        n1 = (int) (Math.random() * 10);
        n2 = (int) (Math.random() * 110);
        System.out.println("Ingrese el resultado de la multiplicacion");
        resulM = leer.nextInt();
        total = (n1 * n2);
       /// System.out.println(total); Para ver la respuesta
        do {

            System.out.println("Ingrese el resultado de la multiplicacion");
            resulM = leer.nextInt();
            if (resulM == total) {
                System.out.println("¡¡¡Usted ha acertado!!!");
                System.out.println(" ");
                break;
            }
            System.out.println("Desea seguir intentando? S/N");
            resp = leer.next();
        } while (!resp.toUpperCase().equals("N"));
        if (resulM == total) {
            System.out.println("¡¡¡Felicitaciones!!!");
        } else {
            System.out.println("Casi!");
            System.out.println("La respuesta era: " + total);
        }

    }
}
