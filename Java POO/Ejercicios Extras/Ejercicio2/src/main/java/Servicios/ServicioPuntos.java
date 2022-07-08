package Servicios;

import Entidades.Puntos;
import java.util.Scanner;

public class ServicioPuntos {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Puntos cargarPuntos() {

        Puntos p = new Puntos();

        System.out.println("Ingrese x1");
        p.setX1(leer.nextDouble());

        System.out.println("Ingrese y1");
        p.setX1(leer.nextDouble());

        System.out.println("Ingrese x2");
        p.setX1(leer.nextDouble());

        System.out.println("Ingrese y2");
        p.setX1(leer.nextDouble());

        return p;

    }

    public double devolverPuntos(Puntos p) {

        return Math.sqrt(Math.pow(p.getX2() - p.getX1(), 2) + Math.pow(p.getY2() - p.getY1(), 2));

    }

}
