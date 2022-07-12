package Utils;

import java.util.Scanner;
import Entidades.*;
import Constantes.Constantes;
import java.util.ArrayList;

public class Orquestador {

    private final static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    static ArrayList<Alquiler> listaAlquiler = new ArrayList<>();

    public static void crearOrquestador() {

        int opc;

        System.out.println(Constantes.OPCIONES_INGRESAR);

        do {

            System.out.println(Constantes.OPCIONES);

            opc = leer.nextInt();

            Alquiler newAlquiler = new Alquiler();

            switch (opc) {
                case 1 -> {
                    Veleros newVeleros = new Veleros();
                    newVeleros.crearVeleros();
                    newAlquiler.crearAlquiler();
                    newAlquiler.setBarco(newVeleros);
                    listaAlquiler.add(newAlquiler);
                    System.out.println(Constantes.CANTIDAD_DIAS_TRANSCURRIDOS + newAlquiler.calcularDias(newAlquiler.getFechaAlquiler(), newAlquiler.getFechaDevolucion()));
                    newVeleros.calcularPrecio(newAlquiler.calcularDias(newAlquiler.getFechaAlquiler(), newAlquiler.getFechaDevolucion()));
                    mostrarListaAlquiler(listaAlquiler);
                }
                case 2 -> {
                    BarcoMotor newBarcoMotor = new BarcoMotor();
                    newBarcoMotor.crearBarcoMotor();
                    newAlquiler.crearAlquiler();
                    newAlquiler.setBarco(newBarcoMotor);
                    listaAlquiler.add(newAlquiler);
                    System.out.println(Constantes.CANTIDAD_DIAS_TRANSCURRIDOS + newAlquiler.calcularDias(newAlquiler.getFechaAlquiler(), newAlquiler.getFechaDevolucion()));
                    newBarcoMotor.calcularPrecio(newAlquiler.calcularDias(newAlquiler.getFechaAlquiler(), newAlquiler.getFechaDevolucion()));
                    mostrarListaAlquiler(listaAlquiler);
                }
                case 3 -> {
                    YateDeLujo newYateDeLujo = new YateDeLujo();
                    newYateDeLujo.crearYate();
                    newAlquiler.crearAlquiler();
                    newAlquiler.setBarco(newYateDeLujo);
                    listaAlquiler.add(newAlquiler);
                    System.out.println(Constantes.CANTIDAD_DIAS_TRANSCURRIDOS + newAlquiler.calcularDias(newAlquiler.getFechaAlquiler(), newAlquiler.getFechaDevolucion()));
                    newYateDeLujo.calcularPrecio(newAlquiler.calcularDias(newAlquiler.getFechaAlquiler(), newAlquiler.getFechaDevolucion()));
                    mostrarListaAlquiler(listaAlquiler);

                }
                case 4 ->
                    System.out.println(Constantes.OPCIONES_INGRESAR);
                case 5 -> {
                }
                default ->
                    System.out.println(Constantes.OPCION_INVALIDA);
            }

        } while (opc != 5);

    }

    public static void mostrarListaAlquiler(ArrayList<Alquiler> listaAlquiler) { 
        
        listaAlquiler.forEach((Alquiler aux ) -> System.out.println(aux));

    }

}
