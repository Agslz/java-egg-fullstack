package Servicios;

import Entidades.Operacion;
import java.util.Scanner;

public class ServiciosOperacion {

    private final Scanner leer = new Scanner(System.in);

    public Operacion crearOperacion() {

        Operacion numeros = new Operacion();

        System.out.println("Ingrese el primero numero");
        numeros.setN1(leer.nextInt());
        System.out.println("Ingrese el segundo numero");
        numeros.setN2(leer.nextInt());

        return numeros;

    }

    public int sumar(int n1, int n2) {

        return n1 + n2;

    }

    public int restar(int n1, int n2) {

        return n1 - n2;

    }

    public int multiplicar(int n1, int n2) {

        if (n1 == 0 || n2 == 0) {

            System.out.println("Error: Se ha ingresado un cero");

        }

        return n1 * n2;

    }

    public float dividir(int n1, int n2) {

        if (n2 == 0) {

            System.out.println("Error: Se ha ingresado un cero");

            return 0;
        }

        return n1 / n2;

    }

}
