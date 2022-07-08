package Servicios;

import Entidades.Raices;
import java.util.Scanner;

public class ServiciosRaices {

    final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Raices creaRaices() {

        Raices r1 = new Raices();

        System.out.println("Ingrese a");

        r1.setA(leer.nextDouble());

        System.out.println("Ingrese b");

        r1.setB(leer.nextDouble());

        System.out.println("Ingrese c");

        r1.setC(leer.nextDouble());
        return r1;

    }

    public double getDiscriminante(Raices r1) {
        double discriminante = (Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getB());
        return discriminante;
    }

    public boolean tieneRaices(Raices r1) {
        if (getDiscriminante(r1) > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean tieneRaiz(Raices r1) {
        if (getDiscriminante(r1) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void obtenerRaices(Raices r1) {
        double raiz1;
        double raiz2;
        if (tieneRaices(r1)) {
            raiz1 = (-r1.getB() + Math.sqrt(Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC())) / (2 * r1.getA());
            raiz2 = (-r1.getB() - Math.sqrt(Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC())) / (2 * r1.getA());
            System.out.println(raiz1);
            System.out.println(raiz2);
        } else {
            System.out.println("No tiene dos raices");
        }
    }

    public void obtenerRaiz(Raices r1) {
        if (tieneRaiz(r1)) {
            double raiz = (-r1.getB() / (2 * r1.getA()));
            System.out.println(raiz);
        } else {
            System.out.println("No tiene una sola raiz");
        }
    }

    public void calcular(Raices r1) {
        if (tieneRaices(r1)) {
            obtenerRaices(r1);
        } else if (tieneRaiz(r1)) {
            obtenerRaiz(r1);
        } else {
            System.out.println("No tiene ninguna raiz");
        }
    }

}
