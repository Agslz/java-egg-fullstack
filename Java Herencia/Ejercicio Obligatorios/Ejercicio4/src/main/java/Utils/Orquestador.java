package Utils;

import Constantes.Constantes;
import Entidades.*;
import java.util.Scanner;

public class Orquestador {

    private static final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private static final Circulo c = new Circulo();

    private static final Rectangulo r = new Rectangulo();

    public static Circulo crearCirculo() {

        System.out.println(Constantes.INGRESE_RADIO_CIRCULO);

        c.setRadio(leer.nextDouble());

        return c;

    }

    public static void mostrarCirculo() {

        System.out.println(Constantes.PERIMETRO_CIRCULO);

        System.out.println(c.calcularPerimetro());

        System.out.println(Constantes.AREA_CIRCULO);

        System.out.println(c.calcularArea());

    }

    public static Rectangulo crearRectangulo() {

        System.out.println(Constantes.INGRESE_BASE_ALTURA);

        r.setAltura(leer.nextDouble());

        r.setBase(leer.nextDouble());

        return r;

    }

    public static void mostrarRectangulo() {

        System.out.println(Constantes.PERIMETRO_RECTANGULO);

        System.out.println(r.calcularPerimetro());

        System.out.println(Constantes.AREA_RECTANGULO);

        System.out.println(r.calcularArea());

    }

}
