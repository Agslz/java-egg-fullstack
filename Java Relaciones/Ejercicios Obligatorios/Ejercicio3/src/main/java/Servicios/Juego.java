package Servicios;

import Constantes.Constantes;
import Entidades.Baraja;
import Entidades.Carta;
import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final ServiciosBaraja ServBar = new ServiciosBaraja();

    public void menu() {
        
        Baraja barajaActual = ServBar.crearBaraja();
        ArrayList<Carta> cartasDisponibles = barajaActual.getCartasDisponibles();
        ArrayList<Carta> cartasUsadas = barajaActual.getCartasUsadas();
        Carta cartaActual;

        System.out.println("¡Que comience el juego!");
        Integer opc, cantidad;
        do {
            System.out.println(Constantes.OPCIONES_DISPONIBLES);
            System.out.print(Constantes.ELEGIR_OPCION);
            opc = leer.nextInt();

            switch (opc) {
                case 1 -> {

                    System.out.println(Constantes.BARAJAR);

                    ServBar.barajar(cartasDisponibles);
                }

                case 2 -> {

                    cartaActual = ServBar.siguienteCarta(barajaActual);

                    if (cartaActual != null) {

                        System.out.println(Constantes.MOSTRAR_CARTA + cartaActual);

                    } else {

                        System.out.println(Constantes.BARAJA_VACIA);
                    }
                }
                case 3 ->
                    ServBar.cartasDisponibles(cartasDisponibles);
                case 4 -> {
                    System.out.print(Constantes.PEDIR_CANTIDAD);

                    cantidad = leer.nextInt();

                    if (cantidad > cartasDisponibles.size()) {

                        System.out.println(Constantes.SIN_CARTAS_DISPONIBLES);

                        break;
                    }

                    System.out.println(Constantes.MOSTRAR_CARTAS);

                    ServBar.darCartas(barajaActual, cantidad);
                }

                case 5 -> {
                    if (cartasUsadas.isEmpty()) {

                        System.out.println(Constantes.SIN_CARTAS_MONTON);
                    }

                    System.out.println(Constantes.MOSTRAR_CARTAS_MONTON);

                    ServBar.mostrarMonton(cartasUsadas);
                }

                case 6 -> {
                    if (cartasDisponibles.isEmpty()) {

                        System.out.println(Constantes.BARAJA_VACIA);

                        break;
                    }

                    System.out.println(Constantes.MOSTRAR_CARTAS_BARAJA);

                    ServBar.mostrarBaraja(cartasDisponibles);
                }
            }
        } while (opc != 7);
    }

}
