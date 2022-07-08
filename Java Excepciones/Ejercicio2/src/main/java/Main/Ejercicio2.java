package Main;

public class Ejercicio2 {

    public static void main(String[] args) {

        int[] pruebaInt = new int[4];

        try {

            pruebaInt[7] = 3;

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error: " + e.getMessage());

        }

    }
}
