package Entidades;

import java.util.ArrayList;

public class Juego {

    private final ArrayList<Jugador> listaJugadores;
    private final Revolver revolver;

    public Juego() {
        this.listaJugadores = new ArrayList();
        this.revolver = new Revolver();
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }
}
