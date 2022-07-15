package Main;

import java.util.Scanner;

public class Ejercicio5 {

    private static final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        int numeroAdivinar = (int) Math.floor(Math.random() * 500 + 1);

        System.out.println(numeroAdivinar);

        int n, cont = 0;

        boolean flag = false;
        
        do {

            try {

                System.out.println("Ingrese el numero a adivinar");

                n = leer.nextInt();

                if (n == numeroAdivinar) {

                    System.out.println("Felicitaciónes, usted adivinó el numero!");

                    System.out.println("Usted lo intentó " + cont + " veces");

                    flag = true;
                    
                } else {

                    if (n > numeroAdivinar) {

                        System.out.println("El numero ingresado es mayor al numero a adivinar");

                    } else {

                        System.out.println("El numero ingresado es menor al numero a adivinar");

                    }
                    cont++;
                }

            } catch (Exception e) {

                System.out.println("Error: " + e.toString());
                
                leer.next();
                
                cont++;

            }

        } while (!flag);
    }
}
