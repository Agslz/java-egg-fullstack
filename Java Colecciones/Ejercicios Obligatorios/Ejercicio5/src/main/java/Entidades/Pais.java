package Entidades;

import java.util.TreeSet;

public class Pais {

    private TreeSet<String> pais;

    public Pais() {
    }

    public Pais(TreeSet<String> pais) {
        this.pais = pais;
    }

    public TreeSet<String> getPais() {
        return pais;
    }

    public void setPais(TreeSet<String> pais) {
        this.pais = pais;
    }

}
