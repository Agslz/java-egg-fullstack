package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

public class ServiciosRectangulo {

    private final Scanner leer = new Scanner(System.in);

    public Rectangulo crearRectangulo() {

        Rectangulo n = new Rectangulo();

        System.out.println("Ingrese la base");

        n.setBase(leer.nextDouble());

        System.out.println("Ingrese la altura");

        n.setAltura(leer.nextDouble());

        return n;

    }

    public double calcularSuperficie(double base, double altura) {

        return base * altura;

    }

    public double calcularPerimetro(double base, double altura) {

        return (base + altura) * 2;
    }

    public void dibujarRectangulo(double base, double altura) {

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= base; j++) {

                if ((i > 1 && i < altura) && (j > 1 && j < base)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

    }

}
