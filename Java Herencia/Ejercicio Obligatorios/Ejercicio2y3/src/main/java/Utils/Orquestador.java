package Utils;

import Constantes.Constantes;
import Entidades.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Orquestador {

    private static final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void metodoOrquestador() {

        ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList<>();

        System.out.println(Constantes.CANTIDAD_LAVADORAS);

        int cantLavadoras = leer.nextInt();

        crearLavadora(cantLavadoras, listaElectrodomesticos);

        System.out.println(Constantes.CANTIDAD_TELES);

        int cantidadTelevisores = leer.nextInt();

        crearTelevisor(cantidadTelevisores, listaElectrodomesticos);

        calcularPrecioFinal(listaElectrodomesticos);

    }

    public static void calcularPrecioFinal(ArrayList<Electrodomestico> listaElectrodomesticos) {

        int precioTeles = 0;
        int precioLavadoras = 0;
        int precioTotal;

        for (Electrodomestico aux : listaElectrodomesticos) {

            if (aux instanceof Lavadora) {

                precioLavadoras += aux.getPrecio();

            }

            if (aux instanceof Televisor) {

                precioTeles += aux.getPrecio();

            }

        }

        precioTotal = precioTeles + precioLavadoras;

        System.out.println(Constantes.PRECIO_LAVADORAS + precioLavadoras);

        System.out.println(Constantes.PRECIO_TELES + precioTeles);

        System.out.println(Constantes.PRECIO_TOTAL + precioTotal);

    }

    public static void crearTelevisor(int cantidadTelevisores, ArrayList<Electrodomestico> listaElectrodomesticos) {

        for (int i = 0; i < cantidadTelevisores; i++) {

            Televisor newTelevisor = new Televisor();

            newTelevisor.crearTelevisor();
            newTelevisor.mostrarTelevisor();

            listaElectrodomesticos.add(newTelevisor);
        }
    }

    public static void crearLavadora(int cantLavadoras, ArrayList<Electrodomestico> listaElectrodomesticos) {

        for (int i = 0; i < cantLavadoras; i++) {

            Lavadora newLavadora = new Lavadora();

            newLavadora.crearLavadora();
            newLavadora.mostrarLavadora();

            listaElectrodomesticos.add(newLavadora);

        }

    }

}
