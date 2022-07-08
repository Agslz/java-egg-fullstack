package Entidades;

import java.util.ArrayList;

public class Alumnos {

    private String nombre;
    private String apellido;
    private ArrayList<Integer> notas;

    public Alumnos() {
        this.notas = new ArrayList<>();
    }

    public Alumnos(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

}
