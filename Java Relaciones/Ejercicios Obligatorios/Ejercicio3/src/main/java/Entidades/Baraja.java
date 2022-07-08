package Entidades;

import java.util.ArrayList;

public class Baraja {

    private final ArrayList<Carta> cartasDisponibles;
    private final ArrayList<Carta> cartasUsadas;
    private Carta cartaActual;

    public Baraja(ArrayList<Carta> cartasDisponibles) {
        this.cartasDisponibles =cartasDisponibles;
        this.cartasUsadas = new ArrayList();
    }

    public ArrayList<Carta> getBaraja() {
        return cartasDisponibles;
    }

    public Carta getCartaActual() {
        return cartaActual;
    }

    public void setCartaActual(Carta cartaActual) {
        this.cartaActual = cartaActual;
    }

    public ArrayList<Carta> getCartasDisponibles() {
        return cartasDisponibles;
    }

    public ArrayList<Carta> getCartasUsadas() {
        return cartasUsadas;
    }

}
