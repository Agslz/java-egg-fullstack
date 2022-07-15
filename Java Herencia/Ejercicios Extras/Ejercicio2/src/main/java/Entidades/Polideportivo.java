package Entidades;

import Constantes.Constantes;

public final class Polideportivo extends Edificio {

    private String nombre;
    private boolean techo;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean abiero, Double alto, Double ancho, Double largo) {
        super(alto, ancho, largo);
        this.nombre = nombre;
        this.techo = abiero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTecho() {
        return techo;
    }

    public void setTecho(boolean techo) {
        this.techo = techo;
    }

    @Override
    public void calcularSuperficie() {

        double superficie = this.largo * this.ancho;

        System.out.println(Constantes.SUPERFICIE + superficie);

    }

    @Override
    public void calcularVolumen() {

        double volumen = this.largo * this.ancho * this.alto;

        System.out.println(Constantes.SUPERFICIE + volumen);

    }

    public void crearPolideportivo() {

        String isTechadoAux;

        crearEdificio();

        System.out.println(Constantes.INGRESE_NOMBRE_POLIDEPORTIVO);

        this.nombre = leer.next();

        do {

            System.out.println(Constantes.ESTA_TECHADO);

            isTechadoAux = leer.next();

        } while (!isTechadoAux.equalsIgnoreCase("SI") && !isTechadoAux.equalsIgnoreCase("NO"));

        if (isTechadoAux.equalsIgnoreCase("SI")) {

            this.techo = true; //Esta techado

        } else {

            this.techo = false; //No esta techado

        }

    }

    @Override
    public String toString() {
        return "Polideportivo "
                + "\nNombre: " + nombre
                + "\nTecho: " + techo;
    }

}
