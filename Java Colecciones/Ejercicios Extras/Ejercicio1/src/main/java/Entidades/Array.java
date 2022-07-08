package Entidades;

import java.util.ArrayList;

public class Array {

    private ArrayList<Integer> numeros;

    public Array() {
    }

    public Array(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }

    public ArrayList<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }

    @Override
    public String toString() {
        return "Array{" + "numeros=" + numeros + '}';
    }

}
