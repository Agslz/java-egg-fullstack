package Main;

import Entidades.DivisionNumero;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

    private static final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        DivisionNumero divN = new DivisionNumero();

        try {

            System.out.println("Ingres el primer numero");

            divN.setN1(leer.next());

            System.out.println("Ingrese el segundo numero");

            divN.setN2(leer.next());

        } catch (InputMismatchException | ArithmeticException e) {

            System.out.println("Error: " + e.getMessage());

        }

        try {

            int n1Int = Integer.parseInt(divN.getN1());

            int n2Int = Integer.parseInt(divN.getN2());

            int division = n1Int / n2Int;

            System.out.println("La división es: " + division);

        } catch (ArithmeticException e) {

            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

    }

}
