package Entidades;

public class DivisionNumero {

    private String n1;
    private String n2;

    public DivisionNumero() {
    }

    public DivisionNumero(String a, String b) {
        this.n1 = a;
        this.n2 = b;
    }

    public String getN1() {
        return n1;
    }

    public void setN1(String n1) {
        this.n1 = n1;
    }

    public String getN2() {
        return n2;
    }

    public void setN2(String n2) {
        this.n2 = n2;
    }
    
}
