package Entidades;

import java.util.ArrayList;

public class Perro {

    private ArrayList<String> razas;

    private String raza;

    private String eliminar;

    public Perro() {
    }

    public Perro(ArrayList<String> razas, String raza, String eliminar) {
        this.razas = razas;
        this.raza = raza;
        this.eliminar = eliminar;
    }

    public ArrayList<String> getRazas() {
        return razas;
    }

    public void setRazas(ArrayList<String> razas) {
        this.razas = razas;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEliminar() {
        return eliminar;
    }

    public void setEliminar(String eliminar) {
        this.eliminar = eliminar;
    }

}
