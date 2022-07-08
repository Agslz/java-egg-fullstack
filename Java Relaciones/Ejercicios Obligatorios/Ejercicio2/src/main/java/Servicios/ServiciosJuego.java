package Servicios;

import Constantes.Constantes;
import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiciosJuego {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final ServiciosJugador ServJ = new ServiciosJugador();
    private final ServiciosRevolver ServR = new ServiciosRevolver();

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r) {

        System.out.println(Constantes.INICO_JUEGO);

        ServR.llenarRevolver(r);

        System.out.println(Constantes.ELEGIR_CANTIDAD);

        String opc = leer.next();

        cargarJugadores(jugadores, opc);

    }

    public void cargarJugadores(ArrayList<Jugador> jugadores, String opc) {

        int cantidadJugadores = 6;

        if (opc.equalsIgnoreCase("S")) {

            System.out.println(Constantes.CANTIDAD_JUGADORES);

            cantidadJugadores = leer.nextInt();

        }

        for (int i = 0; i < cantidadJugadores; i++) {

            System.out.println("Jugadores ingresados " + (i + 1) + " de " + cantidadJugadores);

            jugadores.add(ServJ.crearJugador());
        }
    }

    public void mostrarResultados(ArrayList<Jugador> jugadores) {

        for (Jugador jugador : jugadores) {

            String seHaMojado = " se ha mojado";

            if (!jugador.isMojado()) {

                seHaMojado = " no" + seHaMojado;

            }

            System.out.println(jugador.getNombre() + seHaMojado);
        }
    }

    public boolean todosMojados(ArrayList<Jugador> jugadores) {

        for (Jugador jugador : jugadores) {

            if (!jugador.isMojado()) {

                return false;
            }
        }
        return true;
    }

    public void siguienteRonda(Jugador jugadorActual, Revolver revolver) {

        System.out.println(Constantes.TURNO_JUGADOR + jugadorActual.getNombre());

        if (ServJ.disparo(revolver, jugadorActual)) {

            System.out.println(Constantes.JUGADOR_MOJADO);

            System.out.println(Constantes.RECARGAR);

            ServR.llenarRevolver(revolver);

        } else {

            System.out.println(Constantes.JUGADOR_SALVADO);

        }
    }

    public void juego() {

        Juego partidaActual = new Juego();

        int numeroJugador = 0;

        String opc = "Y";

        ArrayList<Jugador> listaJugadores = partidaActual.getListaJugadores();

        Revolver revolver = partidaActual.getRevolver();

        llenarJuego(listaJugadores, revolver);

        Jugador jugadorActual;

        int cantidadJugadores = listaJugadores.size();

        do {

            jugadorActual = listaJugadores.get(numeroJugador);

            numeroJugador++;

            if (numeroJugador >= cantidadJugadores) {

                numeroJugador = 0;
            }

            if (jugadorActual.isMojado()) {
                continue;
            }

            siguienteRonda(jugadorActual, revolver);

            System.out.print("\n" + Constantes.SEGUIR_JUGANDO);

            opc = leer.next().substring(0, 1).toUpperCase();

        } while (!todosMojados(listaJugadores) && !opc.equals("N"));

        System.out.println(Constantes.RESULTADOS);

        mostrarResultados(listaJugadores);
    }
}
