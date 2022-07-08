package Servicios;

import Entidades.Matematica;
import java.util.Scanner;

public class ServiciosMatematica {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Matematica ingresarNumeros() {

        Matematica mate1 = new Matematica();

        System.out.println("Ingrese el primero numero");

        mate1.setN1(leer.nextFloat());

        System.out.println("Ingrese el segundo numero");

        mate1.setN2(leer.nextFloat());

        return mate1;

    }

    public float devolverMayor(Matematica mate1) {

        return Math.max(mate1.getN1(), mate1.getN2());

    }

    public double calcularPotencia(Matematica mate1) {

        double n1 = mate1.getN1();

        double n2 = mate1.getN2();

        if (n1 < n2) {

            return Math.pow(n2, n1);

        } else {

            return Math.pow(n1, n2);  

        }

    }

    public double calcularRaiz(Matematica mate1) {

        double n1 = Math.abs(mate1.getN1());

        double n2 = Math.abs(mate1.getN2());

        if (n1 < n2) {

            return Math.sqrt(n1);

        } else {

            return Math.sqrt(n2);
        }

    }

}
