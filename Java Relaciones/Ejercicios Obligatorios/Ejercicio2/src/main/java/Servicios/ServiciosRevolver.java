package Servicios;

import Entidades.Revolver;

import java.util.Objects;

public class ServiciosRevolver {

    public void llenarRevolver(Revolver r) {

        r.setPosicionActual((int) (Math.random() * 6) + 1);
        r.setPosicionAgua((int) (Math.random() * 6) + 1);
    }

    public boolean mojar(Revolver r) {
        return Objects.equals(r.getPosicionActual(), r.getPosicionAgua());
    }

    public void siguienteChorro(Revolver r) {

        if (r.getPosicionActual() > 6) {

            r.setPosicionActual(1);

        } else {

            r.setPosicionActual(r.getPosicionActual() + 1);
        }
    }

    public String mostrarRevolver(Revolver r) {

        return "La posición actual es: " + r.getPosicionActual() + " y la posición del agua es: " + r.getPosicionAgua();
    }
}
